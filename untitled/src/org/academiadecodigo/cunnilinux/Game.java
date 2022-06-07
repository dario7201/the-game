package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.cunnilinux.Collision.CollisionDetector;
import org.academiadecodigo.cunnilinux.Field.FieldFactory;
import org.academiadecodigo.cunnilinux.OurKeyboard.OurKeyboard;
import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.cunnilinux.Player.PlayerFactory;
import org.academiadecodigo.cunnilinux.Props.PropFactory;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Game {

    public void init() {
        FieldFactory.getNewField();

        Player player = PlayerFactory.getNewPlayer();
        OurKeyboard keyboard = new OurKeyboard(player);
        keyboard.playerKeyboard();






    }

    private void playerKeyboard() {

    }

    public void start() {
        init();
    }
}
