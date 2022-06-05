package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemy extends Alive implements Hitable {
    public Enemy(int health) {
        super(health);
        Picture enemysprite = new Picture();
        enemysprite.draw();

    }

    @Override
    public void hit(int damage) {
        setHealth(getHealth() - damage);
    }
}
