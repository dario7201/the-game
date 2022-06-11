package org.academiadecodigo.cunnilinux.Player;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Player extends Alive {
    Picture picture;
    public boolean isCrashed = false;

    public Player(int health, Rectangle hitbox) {
        super(health, hitbox);
        this.picture = new Picture(10, 10, "untitled/Utils/player_forward.png");
        this.picture.draw();
    }

    public Picture getPicture() {
        return picture;
    }


    public void moveRight() {
      //  super.getCollisionDetector().isCrashed(this);
        getPicture().translate(10, 0);
    }

    public void moveLeft() {
        getPicture().translate(-10, 0);
       // super.getCollisionDetector().isCrashed(this);
    }

    public void moveUp() {
        getPicture().translate(0, -10);
       // super.getCollisionDetector().isCrashed(this);
    }

    public void moveDown() {
        getPicture().translate(0, 10);
        //super.getCollisionDetector().isCrashed(this);
    }


}
