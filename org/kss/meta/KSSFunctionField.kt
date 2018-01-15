package org.kss.meta

import org.kss.KSSEvent
import org.kss.KSSNode
import org.kss.KSSStyler


class KSSFunctionField : KSSNode {
    override var kss_parent: KSSNode? = null
    override var kss_id: String = ""
    override var kss_name: String = ""
    override val kss_children = ArrayList<KSSNode>()
    override val kss_eventList = HashMap<String, KSSEvent>()
    override val kss_tags = HashMap<String, Any?>()

    val styles = ArrayList<KSSStyleField>()
    val event_styles = HashMap<KSSParser.EventDeclarationContext, KSSEventStyle>()
    val methodCalls = ArrayList<String>() //calls to binded functions
    val functionCalls = ArrayList<String>() //calls to in-file functions
    val connections = ArrayList<String>()
    val disconnections = ArrayList<String>()
    val variables = HashMap<String,Any?>()
    val context : KSSParser.FunctionContext

    constructor(ctx : KSSParser.FunctionContext){
        context = ctx
        populateChildren()
    }

    fun run(styler : KSSStyler){
        for(variable in variables){
            styler.variables.put(variable.key,variable.value)
            styler.setVariable(variable.key,variable.value)
        }

        for(event in event_styles){
            val ctx = event.key
            val value = event.value
            if(ctx.eventHeader().eventAssign()!=null){
                for(name in ctx.eventHeader().eventAssign().name()){
                    styler.variables.put(name.text, value)
                }
            }else{
                value.run(styler)
            }
        }
        for(style in styles){
            style.run(styler)
        }

        for(functionCall in functionCalls){
            styler.functions.get(functionCall)?.run(styler)
        }

        for(methodCall in methodCalls){
            styler.methodBinds.get(methodCall)?.call()
        }

        for(connection in connections){
            val event = styler.variables.get(connection)
            if(event!=null && event is KSSEventStyle){
                event.run(styler)
            }
        }

        for(disconnection in disconnections){
            val event = styler.variables.get(disconnection)
            if(event!=null && event is KSSEventStyle){
                for(s in event.signals){
                    s.disconnect()
                }
            }
        }
    }

    fun populateChildren(){
        for(variable in context.variable()){
            variables.put(variable.name().text, KSSValue.getValueFromContext(variable.value()))
        }
        for(event in context.eventDeclaration()){
            event_styles.put(event, KSSEventStyle(event))
        }
        for(style in context.styleDeclaration()){
            styles.add(KSSStyleField(style))
        }
        for(methodCall in context.ref_call()){
            methodCalls.add(methodCall.function_call().name().text)
        }
        for(functionCall in context.function_call()){
            functionCalls.add(functionCall.name().text)
        }
        for(connection in context.connection()){
            connections.add(connection.name().text)
        }
        for(disconnection in context.disconnection()){
            disconnections.add(disconnection.name().text)
        }
    }
}