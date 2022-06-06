package org.academiadecodigo.cunnilinux.Props;

import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Sword extends Props {
    private final int damage = 1;
    Picture weaponDisplay;
    Picture weaponEquipped;

    public Sword(int v,int v1,String s) {
        this.weaponDisplay = new Picture(v,v1,s);
    }

    public int getDamage() {
        return damage;
    }

    public Picture getWeaponEquipped() {
        return weaponEquipped;
    }
}
