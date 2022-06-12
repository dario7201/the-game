package org.academiadecodigo.cunnilinux.Props;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Chest extends Prop {
    private Picture picture;
    boolean isInteracted;

    public Chest(Rectangle hitbox) {
        super(hitbox);
        this.picture = new Picture(350, 200, "untitled/Utils/Pictures/Characters/mary_before.png");
        picture.draw();
    }

    public boolean isInteracted() {
        return isInteracted;
    }

    public void setInteracted() {
        isInteracted = true;
    }
}