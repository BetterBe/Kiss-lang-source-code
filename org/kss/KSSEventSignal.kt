package org.kss

interface KSSEventSignal {
    var event : KSSEvent? //null

    fun disconnect(){
        event?.disconnect(this)
    }
    fun reconnect(){
        event?.connect(this)
    }

    fun call(args : Array<out Any?>)
}