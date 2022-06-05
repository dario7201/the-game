package org.academiadecodigo.cunnilinux.OurKeyboard;

import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Handler implements KeyboardHandler {

    private Player player;
    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                player.getPicture().translate(-10, 0);//LEFT
                break;
            case KeyboardEvent.KEY_UP:
                player.getPicture().translate(0, -10); //UP
                break;
            case KeyboardEvent.KEY_RIGHT:
                player.getPicture().translate(10, 0);//RIGHT
                break;
            case KeyboardEvent.KEY_DOWN:
                player.getPicture().translate(0, 10);//DOWN
                break;
            default:
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
