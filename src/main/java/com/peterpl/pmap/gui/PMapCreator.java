package com.peterpl.pmap.gui;

import com.formdev.flatlaf.FlatDarkLaf;
import com.peterpl.pmap.lang.Lang;

public class PMapCreator {
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        Lang.init();
        new MainWindow();
    }
}