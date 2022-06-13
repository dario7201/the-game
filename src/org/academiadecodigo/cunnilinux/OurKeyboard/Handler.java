package org.academiadecodigo.cunnilinux.OurKeyboard;

import org.academiadecodigo.cunnilinux.GameObjects.GameObjects;
import org.academiadecodigo.cunnilinux.MainMenu;
import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Handler implements KeyboardHandler {

    private Player player;
    private MainMenu mainMenu;

    public void setPlayer(Player player) {
        this.player = player;
    }
    public void setBackGround(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                if(player.getiswithSword()){
                    player.moveLeftS();
                    break;
                }
                player.moveLeft();
                break;
            case KeyboardEvent.KEY_UP:
                if(player.getiswithSword()){
                    player.moveUpS();
                    break;
                }
                player.moveUp();
                break;
            case KeyboardEvent.KEY_RIGHT:
                if (player.getiswithSword()){
                    player.moveRightS();
                    break;
                }
                player.moveRight();
                break;
            case KeyboardEvent.KEY_DOWN:
                if ( player.getiswithSword()){
                    player.moveDownS();
                    break;
                }
                player.moveDown();
                break;
            case KeyboardEvent.KEY_X:
                player.hit();

                break;
            case KeyboardEvent.KEY_Z:
                player.interact();
                break;
            case KeyboardEvent.KEY_SPACE:
                try {
                    mainMenu.interactSpace();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
