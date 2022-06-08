package org.academiadecodigo.cunnilinux.Player;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Collision.CollisionDetector;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Player extends Alive {
    Picture picture;
    Rectangle rectangle;
    Keyboard keyboard;
    public boolean isCrashed = false;

    public Player(int health, Rectangle hitbox) {
        super(health, hitbox);
        this.picture = new Picture(10, 10, "untitled/Utils/player_forward.png");
        this.picture.draw();
        System.out.println(picture.getX());
    }

    public Picture getPicture() {
        return picture;
    }

    public void moveRight() {
        super.getCollisionDetector().isCrashed(this);

    }

    public void moveLeft() {
        super.getCollisionDetector().isCrashed(this);

    }

    public void moveUp() {
        super.getCollisionDetector().isCrashed(this);

    }

    public void moveDown() {
        super.getCollisionDetector().isCrashed(this);

    }


}
