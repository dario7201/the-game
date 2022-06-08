package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.cunnilinux.GameObjects.GameObjects;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public abstract class Alive extends GameObjects {
    private int health;
    private boolean isDead;
    private String message;
    public Alive(int health, Rectangle hitbox) {
        super(hitbox);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth (int health){
    this.health = health;
    }
    public String getMessage() {
        return message;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead() {
        isDead = true;
    }
}
