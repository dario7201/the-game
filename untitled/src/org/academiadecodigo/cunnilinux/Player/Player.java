package org.academiadecodigo.cunnilinux.Player;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Collision.DirectionType;
import org.academiadecodigo.cunnilinux.Enemies.Boss;
import org.academiadecodigo.cunnilinux.Enemies.Enemy;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.cunnilinux.Props.Chest;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Player extends Alive implements Hitable {
    private final int MOVEMENT_SIZE = 10;
    private Picture picture;
    private Picture pictureup;
    private Picture noweapondown;
    private Picture noweaponleft;
    private Picture noweaponright;
    private Picture swordup;
    private Picture sworddown;
    private Picture swordleft;
    private Picture swordright;
    private int damage = 10;
    public boolean isCrashed = false;

    public Player(int health, int damage, Rectangle hitbox) {
        super(health, damage, hitbox);
        this.picture = new Picture(10, 410, "untitled/Utils/Pictures/Characters/player_forward.png");
        this.picture.draw();
    }

    public Picture getPicture() {
        return picture;
    }


    public void moveRight() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.RIGHT))) {
            picture.delete();
            picture = new Picture(getX(),getY(),"untitled/Utils/Pictures/Characters/player_right_sword.png");
            picture.draw();
            getPicture().translate(MOVEMENT_SIZE, 0);
            getHitbox().translate(MOVEMENT_SIZE, 0);
        }
    }

    public void moveLeft() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.LEFT))) {
            picture.delete();
            picture = new Picture(getX(),getY(),"untitled/Utils/Pictures/Characters/player_left_sword.png");
            picture.draw();
            getPicture().translate(-MOVEMENT_SIZE, 0);
            getHitbox().translate(-MOVEMENT_SIZE, 0);
        }
    }

    public void moveUp() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.UP))) {
            picture.delete();
            picture = new Picture(getX(),getY(),"untitled/Utils/Pictures/Characters/player_up_sword.png");
            picture.draw();
            getPicture().translate(0, -MOVEMENT_SIZE);
            getHitbox().translate(0, -MOVEMENT_SIZE);
        }
    }

    public void moveDown() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.DOWN))) {
            picture.delete();
            picture = new Picture(getX(),getY(),"untitled/Utils/Pictures/Characters/player_down_sword.png");
            picture.draw();
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
        Chest chest = getCollisionDetector().chestInRange(this);
        if(chest != null) {
            if(!chest.isInteracted()){
                picture.delete();
                setPicture(new Picture(getX(), getY(), "untitled/Utils/cock_up.png"));
                picture.draw();
                damage = 20;
                chest.setInteracted();//receber pics dos mcs
            }
        }
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
