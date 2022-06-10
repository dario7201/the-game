package org.academiadecodigo.cunnilinux.Player;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Collision.DirectionType;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Player extends Alive {
    private final int MOVEMENT_SIZE = 10;
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
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.RIGHT))) {
            getPicture().translate(MOVEMENT_SIZE, 0);
            getHitbox().translate(MOVEMENT_SIZE, 0);
        }
    }

    public void moveLeft() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.LEFT))) {
            getPicture().translate(-MOVEMENT_SIZE, 0);
            getHitbox().translate(-MOVEMENT_SIZE, 0);
        }
    }

    public void moveUp() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.UP))) {
            getPicture().translate(0, -MOVEMENT_SIZE);
            getHitbox().translate(0, -MOVEMENT_SIZE);
        }
    }

    public void moveDown() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.DOWN))) {
            getPicture().translate(0, MOVEMENT_SIZE);
            getHitbox().translate(0, MOVEMENT_SIZE);
        }
    }


}
