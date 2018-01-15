package org.kss
class Packaging {
    companion object {
        val iDirectory = System.getProperty("user.dir")
        fun get(name: String) = iDirectory + name
    }
}