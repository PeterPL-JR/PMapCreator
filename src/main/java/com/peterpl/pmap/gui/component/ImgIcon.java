package com.peterpl.pmap.gui.component;

import javax.swing.*;
import java.awt.*;

public class ImgIcon extends ImageIcon {
    public ImgIcon(String path) {
        super(ImgIcon.class.getResource(path));
    }

    private ImgIcon(Image image) {
        super(image);
    }

    public ImgIcon getScaled(int width, int height) {
        return new ImgIcon(getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }
}
