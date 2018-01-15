package org.kss.meta

import org.kss.KSSEvent
import org.kss.KSSEventSignal

class MetaSignal : KSSEventSignal {
    override var event: KSSEvent? = null

    val function : (Array<out Any?>) -> Unit

    override fun call(args : Array<out Any?>) {
        function(args)
    }

    constructor(func : (Array<out Any?>)->Unit){
        function = func
    }
}