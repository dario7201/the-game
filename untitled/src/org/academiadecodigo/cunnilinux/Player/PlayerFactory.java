package org.academiadecodigo.cunnilinux.Player;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class PlayerFactory {
    public static Player getNewPlayer(){
        return new Player(70, 10, new Rectangle(10,10,20,20));

    }
}
