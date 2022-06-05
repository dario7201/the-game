package org.academiadecodigo.cunnilinux.Player;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PlayerFactory {
    public static Player getNewPlayer(){
        return new Player(5);

    }
}
