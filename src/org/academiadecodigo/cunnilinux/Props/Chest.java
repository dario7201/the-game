package org.academiadecodigo.cunnilinux.Props;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Chest extends Prop {
    private Picture picture;
    boolean isInteracted;

    public Chest(Rectangle hitbox, Picture picture) {
        super(hitbox);
        this.picture = picture;
        picture.grow(5,5);
        picture.draw();

    }

    public boolean isInteracted() {
        return isInteracted;
    }

    public void setInteracted() {
        isInteracted = true;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Picture getPicture() {
        return picture;
    }
}