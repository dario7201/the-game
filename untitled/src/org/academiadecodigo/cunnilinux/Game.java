package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.cunnilinux.Enemies.Boss;
import org.academiadecodigo.cunnilinux.Enemies.Enemy;
import org.academiadecodigo.cunnilinux.Enemies.EnemyFactory;
import org.academiadecodigo.cunnilinux.Field.Field;
import org.academiadecodigo.cunnilinux.Field.FieldFactory;
import org.academiadecodigo.cunnilinux.OurKeyboard.OurKeyboard;
import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.cunnilinux.Player.PlayerFactory;
import org.academiadecodigo.simplegraphics.pictures.Picture;

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
