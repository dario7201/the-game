package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Boss extends Alive implements Hitable {
    private Picture picture;
    public Boss(int health, int damage, Rectangle hitbox) {
        super(health, damage, hitbox);
        this.picture = new Picture(1000,200,"untitled/Utils/Pictures/Characters/boss_down.png");
        picture.draw();
    }


    @Override
    public void hit() {

    }
    public void deletePic() {
        this.picture.delete();
    }
}
