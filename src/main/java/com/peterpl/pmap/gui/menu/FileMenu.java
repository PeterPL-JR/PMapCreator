package com.peterpl.pmap.gui.menu;

import com.peterpl.pmap.gui.component.ImgIcon;
import com.peterpl.pmap.gui.component.Shortcut;
import com.peterpl.pmap.gui.component.menu.PMenu;
import com.peterpl.pmap.gui.component.menu.PMenuItem;
import com.peterpl.pmap.lang.Lang;
import com.peterpl.pmap.menu.MainMenuBar;

import java.awt.event.ActionEvent;

public class FileMenu extends PMenu {
    private final ImgIcon ICON_NEW = createImgIcon("new");
    private final ImgIcon ICON_OPEN = createImgIcon("open");
    private final ImgIcon ICON_SAVE = createImgIcon("save");
    private final ImgIcon ICON_SAVE_AS = createImgIcon("save_as");
    private final ImgIcon ICON_CLOSE = createImgIcon("close");
    private final ImgIcon ICON_EXIT = createImgIcon("exit");

    public FileMenu() {
        super(MainMenuBar.MENU_FILE, Lang.get("menu.file"));

        addItem("new", ICON_NEW, this::newMap).setShortcut(Shortcut.FILE_NEW);
        addItem("open", ICON_OPEN, this::openFile).setShortcut(Shortcut.FILE_OPEN);
        addSeparator();
        addItem("save", ICON_SAVE, this::saveFile).setShortcut(Shortcut.FILE_SAVE);
        addItem("save_as", ICON_SAVE_AS, this::saveFileAs).setShortcut(Shortcut.FILE_SAVE_AS);
        addSeparator();
        addItem("close", ICON_CLOSE, this::closeFile).setShortcut(Shortcut.FILE_CLOSE);
        addSeparator();
        addItem("exit", ICON_EXIT, this::exit);
    }

    private void newMap(ActionEvent e) {
    }

    private void openFile(ActionEvent e) {
    }

    private void saveFile(ActionEvent e) {
    }

    private void saveFileAs(ActionEvent e) {
    }

    private void closeFile(ActionEvent e) {
    }

    private void exit(ActionEvent e) {
        System.exit(0);
    }
}
