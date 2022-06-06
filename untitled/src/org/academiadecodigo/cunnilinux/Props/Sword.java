package org.academiadecodigo.cunnilinux.Props;

import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Sword extends Props {
    private final int damage = 1;
    Picture weaponDisplay;
    Picture weaponEquipped;

    public Sword(int v,int v1,String s) {
        this.weaponDisplay = new Picture(200,150,"untitled/Utils/Pictures/Lazer/Blue/Lazer_Blue_Vertical_Up.png");
    this.weaponDisplay.draw();

    }

    public int getDamage() {
        return damage;
    }

    public Picture getPicture() {
        return picture;
    }
}
