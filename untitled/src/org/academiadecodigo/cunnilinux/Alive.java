package org.academiadecodigo.cunnilinux;

public class Alive {
    private int health;
    private boolean isDead;
    private String message;
    public Alive(int health) {
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
