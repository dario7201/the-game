package org.academiadecodigo.cunnilinux.Field;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.graphics.Shape;

import javax.swing.*;

public class Field {
    public Field() {
        Rectangle field = new Rectangle(10, 10, 1280, 720);
        field.setColor(Color.BLACK);
        field.draw();
    }

}
