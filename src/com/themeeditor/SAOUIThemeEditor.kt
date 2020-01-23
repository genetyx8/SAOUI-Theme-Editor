package com.themeeditor

import java.awt.EventQueue
import java.awt.event.ActionEvent
import java.awt.event.KeyEvent
import javax.swing.*
import kotlin.system.exitProcess

class SAOUIThemeEditor(title: String) : JFrame() {
    init {
        createUI(title)
    }

    private fun createUI(title: String) {

        setTitle(title)

        createMenuBar()

        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(900, 500)
        setLocationRelativeTo(null)
    }

    private fun createMenuBar() {

        val menubar = JMenuBar()

        val file = JMenu("File")
        val edit = JMenu("Edit")
        val tools = JMenu("Tools")
        val help = JMenu("Help")

        file.mnemonic = KeyEvent.VK_F

        val eMenuItem = JMenuItem("Exit", null)
        eMenuItem.mnemonic = KeyEvent.VK_E
        eMenuItem.toolTipText = "Exit application"
        eMenuItem.addActionListener { _: ActionEvent -> exitProcess(0) }

        file.add(eMenuItem)

        menubar.add(file)
        menubar.add(edit)
        menubar.add(tools)
        menubar.add(help)

        jMenuBar = menubar
    }
}

private fun createAndShowGUI() {
    val frame = SAOUIThemeEditor("SAO UI Theme Editor")
    frame.isVisible = true
}

fun main(args: Array<String>) {
    EventQueue.invokeLater(::createAndShowGUI)
}