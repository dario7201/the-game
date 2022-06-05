package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemy extends Alive implements Hitable {
    public Enemy(int health) {
        super(health);
        Picture enemy_sprite = new Picture();
        enemy_sprite.draw();

    }

    @Override
    public void hit(int damage) {

    }
}
