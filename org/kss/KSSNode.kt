package org.kss

import org.kss.meta.KSSValue

interface KSSNode {
    var kss_parent : KSSNode?
    var kss_id : String
    var kss_name : String
    val kss_children : ArrayList<KSSNode>
    val kss_eventList : HashMap<String, KSSEvent>
    val kss_tags : HashMap<String, Any?>

    fun setTag(name : String, value : Any?) = kss_tags.put(name,value)
    fun getTag(name : String) = kss_tags.get(name)

    fun addChild(child : KSSNode){
        child.unparent()
        child.kss_parent = this
        kss_children.add(child)
    }
    fun removeChild(child: KSSNode){
        kss_children.remove(child)
    }
    fun unparent() {
        kss_parent?.removeChild(this)
        kss_parent = null
    }

    fun registerEvent(event_name : String, event : KSSEvent) : KSSEvent {
        kss_eventList.put(event_name, event)
        return event
    }

    fun getChildrenWithName(list : ArrayList<KSSNode>, name : String){
        for(child in kss_children){
            if(child.kss_name == name){
                list.add(child)
            }
        }
    }

    fun getChildrenWithId(list : ArrayList<KSSNode>, id : String){
        for(child in kss_children){
            if(child.kss_id == id){
                list.add(child)
            }
        }
    }

}