package com.peterpl.pmap.menu;

import com.peterpl.pmap.gui.menu.FileMenu;

import javax.swing.*;

public class MainMenuBar extends JMenuBar {
    public static final String MENU_FILE = "file";

    public MainMenuBar() {
        FileMenu fileMenu = new FileMenu();
        add(fileMenu);
    }
}
