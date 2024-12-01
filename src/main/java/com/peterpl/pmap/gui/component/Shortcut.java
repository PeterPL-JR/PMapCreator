package com.peterpl.pmap.gui.component;

import static java.awt.event.KeyEvent.*;

public record Shortcut(int key, int modifiers) {
    public static final Shortcut FILE_NEW = new Shortcut(VK_N, CTRL_DOWN_MASK);
    public static final Shortcut FILE_OPEN = new Shortcut(VK_O, CTRL_DOWN_MASK);
    public static final Shortcut FILE_SAVE = new Shortcut(VK_S, CTRL_DOWN_MASK);
    public static final Shortcut FILE_SAVE_AS = new Shortcut(VK_S, CTRL_DOWN_MASK | ALT_DOWN_MASK);
    public static final Shortcut FILE_CLOSE = new Shortcut(VK_W, CTRL_DOWN_MASK);
}
