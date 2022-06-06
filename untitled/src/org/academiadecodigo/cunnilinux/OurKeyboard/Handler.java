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
                player.getSword().getPicture().translate(-10,0);
                break;
            case KeyboardEvent.KEY_UP:
                player.getPicture().translate(0, -10); //UP
                player.getSword().getPicture().translate(0,-10);
                break;
            case KeyboardEvent.KEY_RIGHT:
                player.getPicture().translate(10, 0);//RIGHT
                player.getSword().getPicture().translate(10,0);
                break;
            case KeyboardEvent.KEY_DOWN:
                player.getPicture().translate(0, 10);//DOWN
                player.getSword().getPicture().translate(0,10);
                break;
            case KeyboardEvent.KEY_X:
                player.interact();
                break;
            case KeyboardEvent.KEY_SPACE:
                player.hit(1);
                break;
            default:
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
