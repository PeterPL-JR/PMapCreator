package com.peterpl.pmap.gui;

import com.peterpl.pmap.gui.component.ImgIcon;
import com.peterpl.pmap.menu.MainMenuBar;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public static final ImgIcon ICON = new ImgIcon("/img/mapicon.png");
    public static final String FONT = "Helvetica";

    public MainWindow() {
        setSize(800, 600);
        setTitle("PMapCreator");
        setIconImage(ICON.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setJMenuBar(new MainMenuBar());

        getRootPane().putClientProperty("JRootPane.titleBarBackground", Color.BLACK);
        getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.white);
        UIManager.put("TitlePane.font", new Font(FONT, Font.PLAIN, 17));
        getContentPane().setBackground(new Color(0x2f2f2f));

        setVisible(true);
    }
}
