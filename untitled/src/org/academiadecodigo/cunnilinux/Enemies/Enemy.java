package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemy extends Alive implements Hitable {
    private  Picture picture;

    public Enemy(int health, Rectangle hitbox) {
        super(health, hitbox);
        this.picture = new Picture(500, 600, "untitled/Utils/player_forward.png");
        this.picture.draw();
    }

    @Override
    public void hit(int damage) {

    }
}
