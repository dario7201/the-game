package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.cunnilinux.Props.PropFactory;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Main {
    public static void main(String[] args) {
       Game game = new Game();
        Rectangle rectangle = (Rectangle) PropFactory.getNewProp(50,10,400,500);
        rectangle.setColor(Color.BLUE);
        rectangle.fill();



       game.start();

    }
}
