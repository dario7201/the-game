package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Boss extends Alive implements Hitable {
    private Picture picture;
    public Boss(int health, int damage, Rectangle hitbox, int x) {
        super(health, damage, hitbox);
        this.picture = new Picture(x,400,"untitled/Utils/Pictures/Characters/boss_down.png");
        this.picture.grow(3,3);
        picture.draw();
    }


    @Override
    public void hit() {

    }
    public void deletePic() {
        this.picture.delete();
    }
}
