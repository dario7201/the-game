package org.academiadecodigo.cunnilinux.Props;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Sword extends Weapons {
    private final int damage = 1;
    Picture sword_sprite;

    public Sword() {
        this.sword_sprite = new Picture(200,150,"untitled/Utils/Pictures/Lazer/Blue/Lazer_Blue_Vertical_Up.png");
        sword_sprite.draw();
    }

    public int getDamage() {
        return damage;
    }

    public Picture getSword_sprite() {
        return sword_sprite;
    }
}
