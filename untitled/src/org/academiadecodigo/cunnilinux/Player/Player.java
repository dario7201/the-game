package org.academiadecodigo.cunnilinux.Player;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player extends Alive {
    public Player(int health) {
        super(health);
        Ellipse player = new Ellipse(10,10,30,30);
        player.setColor(Color.DARK_GRAY);
        player.fill();
    }
}
