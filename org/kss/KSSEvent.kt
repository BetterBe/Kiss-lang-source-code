package org.kss

class KSSEvent {

    var changedE : Boolean =false
    var changedL : Boolean =false

    val signals = ArrayList<KSSEventSignal>()
    val entering = ArrayList<KSSEventSignal>()
    val leaving = ArrayList<KSSEventSignal>()

    fun connect(signal : KSSEventSignal){
        entering.add(signal)
        changedE = true //flag that a signal is entering
    }
    fun disconnect(signal : KSSEventSignal){
        leaving.add(signal)
        changedL = true //flag that a signal is leaving
    }

    fun flush() = signals.clear()

    fun fire(vararg v : Any?){
        //before we fire an event, we add and remove whatever eventSignals are flagged; prevents a TableModificationException
        if(changedE){
            for(signal in entering){
                signals.add(signal)
                signal.event = this
            }
            entering.clear()
            changedE = false
        }
        if(changedL){
            for(signal in leaving){
                signals.remove(signal)
                signal.event = null
            }
            leaving.clear()
            changedL = false
        }
        //fire the event signals
        for(signal in signals){
            //signal.fire(v)
            //fireSignal(signal)
            signal.call(v)
        }
    }

    //fun fireSignal(signal : KSSEventSignal)

}