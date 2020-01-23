package com.irregularrhomboid.themeeditor.renderer.elements


abstract class Element() {
    var x : Double? = null
    var y : Double? = null
    var enabled : Boolean = false

    var name : String = ""

    abstract fun draw()
}