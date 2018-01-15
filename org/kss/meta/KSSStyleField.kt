package org.kss.meta

import org.kss.KSSEvent
import org.kss.KSSNode
import org.kss.KSSStyler
import org.kss.NumberTypes


open class KSSStyleField : KSSNode {

    override var kss_parent: KSSNode? = null
    override var kss_id: String = ""
    override var kss_name: String = ""
    override val kss_children = ArrayList<KSSNode>()
    override val kss_eventList = HashMap<String, KSSEvent>()
    override val kss_tags = HashMap<String, Any?>()

    val context : KSSParser.StyleDeclarationContext

    val attributes = HashMap<String,Any?>()//attributyes/style_modifiers
    val attributes_m = HashMap<String, ArrayList<Any?>>() //attributes/style modifiers that are multiple in the same statement. Ex. use: templateA + templateB
    val variables = HashMap<String, Any?>() //variable declarations/setters
    val tag_attributes = HashMap<String,Any?>() //tag declarations/setters
    val methodCalls = ArrayList<String>() //calls to binded functions
    val functionCalls = ArrayList<String>() //calls to in-file functions
    val connections = ArrayList<String>()
    val disconnections = ArrayList<String>()

    val affected = ArrayList<KSSNode>()

    val selector : KSSDescendantSelector

    constructor(ctx : KSSParser.StyleDeclarationContext){
        context = ctx
        selector = KSSDescendantSelector(ctx.stylingHeader().stylingDescendantList())
        populateChildren()
    }

    fun run(styler : KSSStyler){
        getAffected(styler.variables,styler.affected)

        for(variable in variables){
            styler.variables.put(variable.key,variable.value)
            styler.setVariable(variable.key,variable.value)
        }

        for(node in affected){
            for(tag in tag_attributes){
                node.kss_tags.put(tag.key,tag.value)
            }
            for(attribute in attributes){
                val value = attribute.value
                var numberType = NumberTypes.NUMBER
                if(value is KSSValue){
                    numberType = value.numberType
                }
                styler.setAttributeTo(node,attribute.key,attribute.value,numberType,true)
            }
            for(attribute in attributes_m){
                var c = 0
                for(subAttribute in attribute.value){
                    c++
                    val value = subAttribute
                    var numberType = NumberTypes.NUMBER
                    if(value is KSSValue){
                        numberType = value.numberType
                    }
                    styler.setAttributeTo(node,attribute.key,subAttribute, numberType,c == attribute.value.size)
                }
            }
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

    fun getAffected(vars : HashMap<String,Any?>,nodes : ArrayList<KSSNode>) {
        val aff = selector.getAllThatApply(vars, nodes)
        affected.clear()
        affected.addAll(aff)
    }

    fun populateChildren(){
        for(style in context.styleField().style()) {
            if (style.style_modifier() != null) {
                val name = style.style_modifier().multiName().text
                if (style.style_modifier().multiValue() != null) {
                    attributes_m.put(name, ArrayList<Any?>())
                    val aL = attributes_m.get(name)!!
                    for (value in style.style_modifier().multiValue().value()) {
                        aL.add(KSSValue.getValueFromContext(value))
                    }
                } else if (style.style_modifier().value() != null) {
                    attributes.put(style.style_modifier().multiName().text, KSSValue.getValueFromContext(style.style_modifier().value()))
                }
            } else if (style.variable() != null) {
                variables.put(style.variable().name().text, KSSValue.getValueFromContext(style.variable().value()))
            } else if (style.tag_modifier() != null) {
                tag_attributes.put(style.tag_modifier().name().text, KSSValue.getValueFromContext(style.tag_modifier().value()))
            } else if (style.function_call() != null) {
                functionCalls.add(style.function_call().name().text)
            } else if (style.ref_call() != null) {
                methodCalls.add(style.ref_call().function_call().name().text)
            } else if(style.connection()!=null){
                connections.add(style.connection().name().text)
            } else if(style.disconnection()!=null){
                disconnections.add(style.disconnection().name().text)
            }
        }
    }
}