package com.peterpl.pmap.gui.component.menu;

import com.peterpl.pmap.gui.MainWindow;
import com.peterpl.pmap.gui.component.ImgIcon;
import com.peterpl.pmap.gui.component.Shortcut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;

public class PMenuItem extends JMenuItem {
    private static final int ICON_SIZE = 16;

    public PMenuItem(String title, ImgIcon icon, Consumer<ActionEvent> action) {
        super(title);
        if(icon != null) {
            setIcon(icon.getScaled(ICON_SIZE, ICON_SIZE));
        }
        setFont(new Font(MainWindow.FONT, Font.PLAIN, 15));
        addActionListener(action::accept);
    }

    public PMenuItem setShortcut(Shortcut shortcut) {
        PMenuItem item = this;
        item.setAccelerator(KeyStroke.getKeyStroke(shortcut.key(), shortcut.modifiers()));
        return item;
    }
}
