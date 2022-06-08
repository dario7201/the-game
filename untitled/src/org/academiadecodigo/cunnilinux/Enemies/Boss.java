package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Boss extends Alive implements Hitable {
    public Boss(int health, Rectangle hitbox) {
        super(health, hitbox);
        Picture boss_sprite = new Picture();
        boss_sprite.draw();

    }

    @Override
    public void hit(int damage) {
        setHealth(getHealth() - damage);
    }
}
