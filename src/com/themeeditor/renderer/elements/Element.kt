package com.irregularrhomboid.themeeditor


abstract class Element(var x : Double? = null, var y : Double? = null, var name : String = "", var enabled : Boolean = false) {

    abstract fun draw()
}