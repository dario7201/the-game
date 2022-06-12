package org.academiadecodigo.cunnilinux.OurKeyboard;

import org.academiadecodigo.cunnilinux.GameObjects.GameObjects;
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
                if(!player.isDead()){
                player.moveLeft();}
                break;
            case KeyboardEvent.KEY_UP:
                if(!player.isDead()){
                player.moveUp();}
                break;
            case KeyboardEvent.KEY_RIGHT:
                if(!player.isDead()){
                player.moveRight();}
                break;
            case KeyboardEvent.KEY_DOWN:
                if(!player.isDead()){
                player.moveDown();}
                break;
            case KeyboardEvent.KEY_X:
               player.hit();

                break;
            case KeyboardEvent.KEY_Z:
                player.interact();
                break;
            default:
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
