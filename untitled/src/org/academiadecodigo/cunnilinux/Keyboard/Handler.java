package org.academiadecodigo.cunnilinux.Keyboard;

import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Handler implements KeyboardHandler {
    Ellipse player;
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_A:
                player.translate(-10, 0);//LEFT
                break;
            case KeyboardEvent.KEY_W:
                player.translate(0, -10); //UP
                break;
            case KeyboardEvent.KEY_D:
                player.translate(10, 0);//RIGHT
                break;
            case KeyboardEvent.KEY_S:
                player.translate(0, 10);//DOWN
                break;
        }
    }

}
