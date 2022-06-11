package org.academiadecodigo.cunnilinux.Player;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Collision.DirectionType;
import org.academiadecodigo.cunnilinux.Enemies.Boss;
import org.academiadecodigo.cunnilinux.Enemies.Enemy;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Player extends Alive implements Hitable {
    private final int MOVEMENT_SIZE = 10;
    private Picture picture;
    private int damage = 10;
    public boolean isCrashed = false;

    public Player(int health, int damage, Rectangle hitbox) {
        super(health, damage, hitbox);
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void interact() {

    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    @Override
    public void hit() {

        Enemy enemy = getCollisionDetector().enemyInRange(this);
        Boss boss = getCollisionDetector().bossInRange(this);
        if (enemy != null) {
            if (enemy.getHealth() > 0) {
                enemy.setHealth(enemy.getHealth() - damage);
                System.out.println("ENEMY HAS " + enemy.getHealth() + " HP");
                if (enemy.getHealth() <= 0) {
                    enemy.deletePic();
                    enemy.deleteHitbox();
                    enemy.setDead();
                    System.out.println("ENEMY IS DEAD: " + enemy.isDead());
                }
            }
        }

        if (boss != null) {
            if (boss.getHealth() > 0) {
                boss.setHealth(boss.getHealth() - damage);
                System.out.println("BOSS HAS " + boss.getHealth() + " HP");
                if (boss.getHealth() <= 0) {
                    boss.deletePic();
                    boss.deleteHitbox();
                    boss.setDead();

                    System.out.println("BOSS IS DEAD: " + boss.isDead());
                }
            }
        }

    }

}
