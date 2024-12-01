package com.peterpl.pmap.gui.component.menu;

import com.peterpl.pmap.gui.MainWindow;
import com.peterpl.pmap.gui.component.ImgIcon;
import com.peterpl.pmap.lang.Lang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.function.Consumer;

public class PMenu extends JMenu {
    private final String name, text;

    public PMenu(String name, String title) {
        super(title);
        this.name = name;
        this.text = title;
        setFont(new Font(MainWindow.FONT, Font.PLAIN, 17));
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    protected PMenuItem addItem(String itemName, ImgIcon icon, Consumer<ActionEvent> action) {
        PMenuItem menuItem = new PMenuItem(Lang.get("menu." + name + "." + itemName), icon, action);
        add(menuItem);
        return menuItem;
    }

    protected PMenuItem addItem(String itemName, Consumer<ActionEvent> action) {
        return addItem(itemName, null, action);
    }

    protected ImgIcon createImgIcon(String iconName) {
        return new ImgIcon("/img/icon/icon_" + name + "_" + iconName + ".png");
    }
}
