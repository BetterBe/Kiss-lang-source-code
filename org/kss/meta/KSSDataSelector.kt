package org.kss.meta

import org.kss.KSSNode

class KSSDataSelector {

    val context : KSSParser.DataDecoratorContext

    val variables = HashMap<String,Any?>()
    val variablesDebounce = HashMap<String,Boolean>()//This is for checking if a variable is equal to its value.
    val tags = HashMap<String,Any?>()
    val tagsDebounce = HashMap<String,Boolean>()//This is for checking if a tag is equal to its value.

    constructor(ctx : KSSParser.DataDecoratorContext){
        context = ctx
        populateVariables()
        populateTags()
    }

    fun populateVariables(){
        for(variable in context.variableData()){
            variables.put(variable.name().text, KSSValue.getValueFromContext(variable.value()))
            var b = true
            if(variable.ASSIGNCHECK()!=null) b = false
            variablesDebounce.put(variable.name().text,b)
        }
    }
    fun populateTags(){
        for(tag in context.tagData()){
            tags.put(tag.tag().name().text, KSSValue.getValueFromContext(tag.value()))
            var b = true
            if(tag.ASSIGNCHECK()!=null) b = false
            tagsDebounce.put(tag.tag().name().text,b)
        }
    }

    fun getPasses(node : KSSNode, variableList : HashMap<String,Any?>):Boolean{
        for(variableEntry in variables.entries){
            val v = variableList.get(variableEntry.key)
            val d = variablesDebounce.get(variableEntry.key)!!
            //println(variableEntry.value)
            val b = d==(v == variableEntry.value)
            if(!b){
                return@getPasses false
            }
        }

        for(tagEntry in tags.entries){
            val v = node.kss_tags.get(tagEntry.key)
            val d = tagsDebounce.get(tagEntry.key)!!
            //println(v)
            //println(tagEntry.value)
            val b = d== (v == tagEntry.value)
            if(!b){
                return@getPasses false
            }
        }
        return true
    }

}