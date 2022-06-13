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

    Picture healthPicture = new Picture(20, 20, "Utils/Pictures/Life_Bar/life_bar_7.png");
    private Picture picture;

    private int damage = 10;
    public boolean isCrashed = false;
    private boolean withSword = false;

    public Player(int health, int damage, Rectangle hitbox) {
        super(health, damage, hitbox);
        this.picture = new Picture(10, 410, "Utils/Pictures/Characters/player_forward.png");
        this.picture.draw();
        healthPicture.draw();
    }

    public Picture getPicture() {
        return picture;
    }


    public void moveRight() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.RIGHT))) {
            picture.delete();
            picture = new Picture(getX(),getY(),"Utils/Pictures/Characters/player_right.png");
            picture.draw();
            getPicture().translate(MOVEMENT_SIZE, 0);
            getHitbox().translate(MOVEMENT_SIZE, 0);
        }
    }

    public void moveLeft() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.LEFT))) {
            picture.delete();
            picture = new Picture(getX(),getY(),"Utils/Pictures/Characters/player_left.png");
            picture.draw();
            getPicture().translate(-MOVEMENT_SIZE, 0);
            getHitbox().translate(-MOVEMENT_SIZE, 0);
        }
    }

    public void moveUp() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.UP))) {
            picture.delete();
            picture = new Picture(getX(),getY(),"Utils/Pictures/Characters/player_up.png");
            picture.draw();
            getPicture().translate(0, -MOVEMENT_SIZE);
            getHitbox().translate(0, -MOVEMENT_SIZE);
        }
    }

    public void moveDown() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.DOWN))) {
            picture.delete();
            picture = new Picture(getX(),getY(),"Utils/Pictures/Characters/player_forward.png");
            picture.draw();
            getPicture().translate(0, MOVEMENT_SIZE);
            getHitbox().translate(0, MOVEMENT_SIZE);
        }
    }
    public void moveRightS() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.RIGHT))) {
        picture.delete();
        picture = new Picture(getX(), getY(), "Utils/Pictures/Characters/player_right_sword.png");
        picture.grow(2,2);
        picture.draw();
        getPicture().translate(MOVEMENT_SIZE, 0);
        getHitbox().translate(MOVEMENT_SIZE, 0);
        }
    }

    public void moveLeftS() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.LEFT))) {
        picture.delete();
        picture = new Picture(getX(), getY(), "Utils/Pictures/Characters/player_left_sword.png");
        picture.grow(2,2);
        picture.draw();
        getPicture().translate(-MOVEMENT_SIZE, 0);
        getHitbox().translate(-MOVEMENT_SIZE, 0);
        }
    }

    public void moveUpS() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.UP))) {
        picture.delete();
        picture = new Picture(getX(), getY(), "Utils/Pictures/Characters/player_up_sword.png");
        picture.grow(2,2);
        picture.draw();
        getPicture().translate(0, -MOVEMENT_SIZE);
        getHitbox().translate(0, -MOVEMENT_SIZE);
        }
    }

    public void moveDownS() {
        if (!(super.getCollisionDetector().isCrashed(this, DirectionType.DOWN))) {
        picture.delete();
        picture = new Picture(getX(), getY(), "Utils/Pictures/Characters/player_down_sword.png");
        picture.grow(2,2);
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
                setPicture(new Picture(getX(), getY(), "Utils/Pictures/Characters/player_down_sword.png"));
                picture.draw();
                picture.grow(1,2);
                damage = 20;
                chest.setInteracted();
                setwithSword();
                chest.getPicture().delete();
                chest.setPicture(new Picture(chest.getX(),chest.getY(),"Utils/Pictures/Characters/mary_after.png"));
                chest.getPicture().grow(5,5);
                chest.getPicture().draw();
                //receber pics dos mcs
            }
        }
//        if(getHitbox().getX() == && getHitbox().getY())
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
    public void checkHealth() {
        int currenthealth = getHealth();
        switch (currenthealth) {
            case 70:
                healthPicture.delete();
                healthPicture = new Picture(20, 20, "Utils/Pictures/Life_Bar/life_bar_7.png");
                healthPicture.draw();
                break;
            case 60:
                healthPicture.delete();
                healthPicture = new Picture(20, 20, "Utils/Pictures/Life_Bar/life_bar_6.png");
                healthPicture.draw();
                break;
            case 50:
                healthPicture.delete();
                healthPicture = new Picture(20, 20, "Utils/Pictures/Life_Bar/life_bar_5.png");
                healthPicture.draw();
                break;
            case 40:
                healthPicture.delete();
                healthPicture = new Picture(20, 20, "Utils/Pictures/Life_Bar/life_bar_4.png");
                healthPicture.draw();
                break;
            case 30:
                healthPicture.delete();
                healthPicture = new Picture(20, 20, "Utils/Pictures/Life_Bar/life_bar_3.png");
                healthPicture.draw();
                break;
            case 20:
                healthPicture.delete();
                healthPicture = new Picture(20, 20, "Utils/Pictures/Life_Bar/life_bar_2.png");
                healthPicture.draw();
                break;
            case 10:
                healthPicture.delete();
                healthPicture = new Picture(20, 20, "Utils/Pictures/Life_Bar/life_bar_1.png");
                healthPicture.draw();
                break;

        }
}

        public boolean getiswithSword() {
        return withSword;
    }

    public void setwithSword() {
        withSword = true;
    }

}
