package org.academiadecodigo.cunnilinux.GameObjects;


import org.academiadecodigo.cunnilinux.Collision.CollisionDetector;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public abstract class GameObjects {
    private Rectangle hitbox;
    private CollisionDetector collisionDetector;

    public GameObjects(Rectangle hitbox) {
        this.hitbox = hitbox;
    }

    public int getX(){
        return hitbox.getX();
    }

    public int getY(){
        return hitbox.getY();
    }

    public int getWidth(){
        return hitbox.getWidth();
    }
    public int getHeight(){
        return hitbox.getHeight();
    }

    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }

    public Rectangle getHitbox() {
        return hitbox;
    }
    public void deleteHitbox() {
        hitbox.translate(10000,10000);
    }

    public CollisionDetector getCollisionDetector() {
        return collisionDetector;
    }
}

