package org.kss.meta

import org.kss.KSSNode
import org.kss.antlr.*
import java.util.*

class KSSDescendantSelector {
    val context : KSSParser.StylingDescendantListContext

    val selectors = ArrayList<List<Any?>>()
    /*
    <IsClassHeader = false, { header-name, data-decorator } >
     */
    val affected = ArrayList<KSSNode>()
    val affectedLeaving = ArrayList<KSSNode>()

    constructor(ctx : KSSParser.StylingDescendantListContext){
        context = ctx
        populateSelectors()
    }

    fun populateSelectors(){
        for(header in context.header()){
            if(header.elementHeader()!=null){
                selectors.add(listOf(false,header.elementHeader().name().text,getDataDecorator(header.elementHeader().dataDecorator())))
            }else if(header.classHeader()!=null){
                selectors.add(listOf(true,header.classHeader().name().text, getDataDecorator(header.classHeader().dataDecorator())))
            }
        }
    }

    fun getDataDecorator(dctx : KSSParser.DataDecoratorContext?) : KSSDataSelector? {
        if(dctx == null){
            return null
        }else{
            return KSSDataSelector(dctx)
        }
    }

    val passSelection = ArrayList<KSSNode>()

    fun passSelector(viable : ArrayList<KSSNode>, selector : List<Any?>, variableList : HashMap<String,Any?>){

        passSelection.clear()

        val isClass = selector[0] as Boolean
        val text = selector[1] as String
        val decorator = selector[2] as KSSDataSelector?

        for(node in viable){
            var met = false
            var dataMet = false
            if((isClass && node.kss_id.equals(text)) || text.equals("any")){
                met = true
            }else if(!isClass && node.kss_name.equals(text)){
                met = true
            }
            if(met){
                if(decorator!=null){
                    dataMet = decorator.getPasses(node,variableList)
                }else{
                    dataMet = true
                }
            }
            if(met && dataMet){
                passSelection.add(node)
            }
        }
    }

    fun getAllThatApply(variableList : HashMap<String,Any?>, nodeList : ArrayList<KSSNode>) : ArrayList<KSSNode>{

        affected.clear()
        affected.addAll(nodeList)

        var c =  0
        val size = selectors.size
        for(entry in selectors){
            c++
            passSelector(affected, entry, variableList)
            affected.clear()
            if(c == size) {
                affected.addAll(passSelection)
            }else{
                for(node in passSelection){
                    affected.addAll(node.kss_children)
                }
            }
        }

/*
        for(entry in selectors){
            val isClass = entry[0] as Boolean
            val text = entry[1] as String
            val decorator = entry[2] as KSSDataSelector?

            for(node in affected){
                var met = false
                var dataMet = false
                if((isClass && node.kss_id.equals(text)) || text.equals("any")){
                    met = true
                }else if(!isClass && node.kss_name.equals(text)){
                    met = true
                }
                if(met){
                    if(decorator!=null){
                        dataMet = decorator.getPasses(node,variableList)
                    }else{
                        dataMet = true
                    }
                }
                if(!(met && dataMet)){
                    affectedLeaving.add(node)
                }
            }

            for(leaving in affectedLeaving){
                affected.remove(leaving)
            }
            affectedLeaving.clear()
        }
*/
        return affected
    }
}