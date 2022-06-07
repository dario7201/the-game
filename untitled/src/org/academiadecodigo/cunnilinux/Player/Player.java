package org.academiadecodigo.cunnilinux.Player;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.cunnilinux.Interfaces.Interactable;
import org.academiadecodigo.cunnilinux.Props.PropFactory;
import org.academiadecodigo.cunnilinux.Props.Sword;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player extends Alive implements Interactable, Hitable {
    Picture picture;
    Keyboard keyboard;
    Sword sword;
    boolean isEquipped;
    private int col;
    private int row;

    public Player(int health) {
        super(health);
        this.picture = new Picture(180, 300, "untitled/Utils/player_forward.png");
        this.picture.draw();
        this.col = picture.getX();
        this.row = picture.getY();
    }

    public Picture getPicture() {
        return picture;
    }

    @Override
    public void hit(int damage) {
        System.out.println("deals " + damage + " damage");
    }

    @Override
    public void interact() {
        System.out.println("Interacted");
        if (this.picture.getX() == 50) {
            System.out.println("interacted with chest");
            picture.delete();
            setEquipped();
            picture.draw();
        }
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public Sword getSword() {
        return sword;
    }

    public void setEquipped() {
        isEquipped = true;
        this.picture = new Picture(getPicture().getX(), getPicture().getY(), "untitled/Utils/Pictures/PlayerWithBlueWeapon/player_forward.png");
    }

}
