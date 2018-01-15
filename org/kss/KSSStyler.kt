package org.kss

import org.kss.meta.*
import org.antlr.v4.runtime.ANTLRFileStream
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CommonTokenStream


open class KSSStyler{
    //Library pipeline dependant items--
    val variables = HashMap<String, Any?>()
    val functions = HashMap<String, KSSFunctionField>()
    val templates = HashMap<String, KSSTemplateField>()
    val styleEvents = ArrayList<KSSEventStyle>()
    val affected = ArrayList<KSSNode>()
    val methodBinds = HashMap<String, KSSMethod>()

    //open var debug : KSSDebug? = null

    open fun runSource(source : String){
        val src : CharStream = org.antlr.v4.runtime.ANTLRInputStream(source)
        val lexer = KSSLexer(src)
        val tokens = CommonTokenStream(lexer)
        val parser = KSSParser(tokens)
        val fileCTX = parser.file()
        examineFileContext(fileCTX)
    }

    open fun runFile(file_path : String){
        val inputStream = ANTLRFileStream(file_path)
        val lexer = KSSLexer(inputStream)
        val tokens = CommonTokenStream(lexer)
        val parser = KSSParser(tokens)
        val fileCTX = parser.file()

        examineFileContext(fileCTX)
    }

    open fun metaImport(file_path : String){
        if(file_path.endsWith(".kss")){
            val d = Packaging.get("\\src\\")
            val nPath = file_path.removeSuffix(".kss").replace(".","\\") + ".kss"
            runFile(d + nPath)
        }
    }

    open fun examineFileContext(fileCTX : KSSParser.FileContext){
        KSSValue.variables = variables

        for(import in fileCTX.imp()){
            if(import.value().STRING()!=null) {
                metaImport(KSSValue.getStringFrom(import.value().text))
            }else{
                //Attempted to import non-string value.
            }
        }

        for(variable in fileCTX.variable()){
            val n = variable.name().text
            val v = KSSValue.getValueFromContext(variable.value())
            variables.put(n, v)
            setVariable(n,v)
        }
        for(template in fileCTX.template()){
            templates.put(template.name().text, KSSTemplateField(template))
        }
        for(function in fileCTX.function()){
            functions.put(function.name().text, KSSFunctionField(function))
        }
        for(style in fileCTX.styleDeclaration()){
            KSSStyleField(style).run(this)
        }
        for(event_style in fileCTX.eventDeclaration()){
            val eStyle = KSSEventStyle(event_style)
            if(event_style.eventHeader().eventAssign()!=null){
                for(event_reference in event_style.eventHeader().eventAssign().name()){
                    variables.put(event_reference.text,eStyle)
                    styleEvents.add(eStyle)
                }
            }else{
                eStyle.run(this)
            }
        }
        for(call in fileCTX.function_call()){
            val function = functions.get(call.name().text)
            function?.run(this)
        }
        for(methodCall in fileCTX.ref_call()){
            val method = methodBinds.get(methodCall.function_call().name().text)
            method?.call()
        }
        for(connection in fileCTX.connection()){
            val event = variables.get(connection.name().text)
            if(event!=null && event is KSSEventStyle){
                event.run(this)
            }
        }
    }

    open fun addAffected(item : KSSNode){
        if(!affected.contains(item)){
            affected.add(item)
        }
    }
    open fun addAffected(vararg items : KSSNode){
        for(item in items) {
            if (!affected.contains(item)) {
                affected.add(item)
            }
        }
    }

    open fun removeAffected(item : KSSNode) = affected.remove(item)
    //--

    open fun setAttributeTo(item : KSSNode, property_name : String, value : Any?, numberType : NumberTypes, isLastValue : Boolean){
        when(value){
            is String -> {
                if(property_name.equals("use")){
                    templateSet(item,value,isLastValue)
                }
                setString(item,property_name,value,isLastValue)
            }
            is Number -> setNumber(item,property_name,value.toFloat(),numberType, isLastValue)
            is Boolean -> setBoolean(item,property_name,value,isLastValue)
            is KSSValue -> {
                when(value.valueType){
                    ValueTypes.NUMBER -> setNumber(item,property_name,value.float0,value.numberType,isLastValue)
                    ValueTypes.VEC2-> setVec2(item, property_name,value.float0, value.float1, isLastValue)
                    ValueTypes.VEC3-> setVec3(item, property_name,value.float0, value.float1, value.float2, isLastValue)
                    ValueTypes.VEC4-> setVec4(item, property_name,value.float0, value.float1, value.float2, value.float3, isLastValue)
                    ValueTypes.RGB-> setRGB(item, property_name,value.float0, value.float1, value.float2, isLastValue)
                    ValueTypes.RGBA-> setRGBA(item, property_name,value.float0, value.float1, value.float2, value.float3, isLastValue)
                    ValueTypes.UDIM2-> setUDim2(item, property_name,value.float0, value.float1, value.float2, value.float3, isLastValue)
                }
            }
            else->{
                setNull(item,property_name,isLastValue)
            }
        }
    }

    open fun applyTemplate(item : KSSNode, templateName : String){
        templates.get(templateName)?.applyToNode(item,this)
    }

    open fun templateSet(item : KSSNode, string : String, isLastValue : Boolean){
        applyTemplate(item,string)
    }

    open fun setString(item : KSSNode, property_name : String, string : String, isLastValue : Boolean){
        //println(property_name)
    }

    open fun setNumber(item : KSSNode, property_name : String, number : Float, number_type : NumberTypes, isLastValue : Boolean){}

    open fun setVec2(item : KSSNode, property_name : String, x : Float, y : Float, isLastValue : Boolean){}

    open fun setVec3(item : KSSNode, property_name : String, x : Float, y : Float, z : Float, isLastValue : Boolean){}
  
    open fun setVec4(item : KSSNode, property_name : String, x : Float, y : Float, z : Float, w : Float, isLastValue : Boolean){}

    open fun setRGB(item : KSSNode, property_name : String, r : Float, g : Float, b : Float, isLastValue : Boolean){}

    open fun setRGBA(item : KSSNode, property_name : String, r : Float, g : Float, b : Float, a : Float, isLastValue : Boolean){}

    open fun setUDim2(item : KSSNode, property_name : String, scaleX : Float, offsetX : Float, scaleY : Float, offsetY : Float, isLastValue : Boolean){}

    open fun setVariable(variable : String, value : Any?){
        //println("setting $variable to $value")
    }

    open fun setBoolean(item : KSSNode, property_name: String, bool : Boolean, isLastValue: Boolean){}

    open fun setNull(item : KSSNode, property_name: String, isLastValue: Boolean){}

    open fun setMethod(methodName : String, method : KSSMethod){
        methodBinds.put(methodName,method)
    }

    open fun getMethod(methodName : String) = methodBinds.get(methodName)

    open fun setVar(variableName : String, value : Any?) = variables.put(variableName, value)

    open fun getVar(variableName : String) = variables.get(variableName)

    open fun getFunction(functionName : String) = functions.get(functionName)

    open fun callFunction(functionName : String){
        functions.get(functionName)?.run(this)
    }

}


class node : KSSNode {
    override var kss_parent: KSSNode? = null
    override var kss_id = "testClass"
    override var kss_name = "testName"
    override val kss_children = ArrayList<KSSNode>()
    override val kss_eventList = HashMap<String, KSSEvent>()
    override val kss_tags = HashMap<String, Any?>()

    override fun toString() = "$kss_name [$kss_id]"

    val testEvent = registerEvent("testEvent", KSSEvent())
}

class method : KSSMethod {

    val function : ()->Any

    override fun call() {
        function()
    }
    constructor(func : ()->Any){
        function = func
    }
}
/*
fun main(arg : Array<String>){
    val styler = KSSStyler()
    val testDir = Packaging.get("\\src\\org\\kss\\testing")

    val node1 = node()
    node1.kss_name = "Node1"
    node1.kss_id = "Node1"
    node1.kss_tags.put("h",1F)

    val node2 = node()
    node2.kss_name = "Node2"
    node2.kss_id = "Node2"

    node1.addChild(node2)

    styler.methodBinds.put("testMethod", method(fun() {
        println("test native call")
    }))

    val s = MetaSignal(fun(args) {
        println("TEST EVENT")
    })

    node1.testEvent.connect(s)

    styler.affected.addAll(listOf(node1,node2))

    styler.runFile("$testDir\\hello.kss");

    node1.testEvent.fire()
    println(styler.variables.get("x"))
    //println(node1.kss_tags.get("y"))
}
*/