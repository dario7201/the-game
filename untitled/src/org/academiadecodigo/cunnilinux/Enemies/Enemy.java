package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemy extends Alive implements Hitable {
    private  Picture picture;

    public Enemy(int health, int damage, Rectangle hitbox) {
        super(health, damage, hitbox);
        this.picture = new Picture(500, 600, "untitled/Utils/Pictures/Characters/enemy_down.png");
        this.picture.draw();
    }


    @Override
    public void hit() {

    }
    public void deletePic() {
        this.picture.delete();
    }
}
