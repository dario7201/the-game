package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Collision.DirectionType;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Boss extends Alive implements Hitable {
    private Picture picture;
    private int movement = 10;
    public Boss(int health, int damage, Rectangle hitbox, int x) {
        super(health, damage, hitbox);
        this.picture = new Picture(x,200,"Utils/Pictures/Characters/boss_down.png");
        this.picture.grow(3,3);
        picture.draw();
    }


    @Override
    public void hit() {
        Player player = super.getCollisionDetector().bossPlayerInRange(this);
        if (player != null && player.getHealth() > 0) {
            player.setHealth(player.getHealth() - getDamage());
        }
        if(player != null && player.getHealth() <= 0){
            player.setDead();
            player.getPicture().delete();
            player.deleteHitbox();
        }
    }

    private int getDamage() {
        return this.damage;
    }
    public void bossMove() {
        int randomPos = ((int) Math.abs(Math.random() * 4));
        switch (randomPos) {
            case 0:
                hit();
                if (!(super.getCollisionDetector().isCrashed(this, DirectionType.RIGHT))) {
                    picture.translate(movement, 0); //RIGHT
                    getHitbox().translate(movement, 0);
                    deletePic();
                    picture = new Picture(getX(), getY(), "Utils/Pictures/Characters/boss_right.png");//DARIO FALTA COLLISION DETECTOR AQUI COMO NO PLAYER
                    picture.grow(4, 4);
                    picture.draw();
                }
                break;
            case 1:
                hit();
                if (!(super.getCollisionDetector().isCrashed(this, DirectionType.DOWN))) {
                    picture.translate(0, movement); //DOWN
                    getHitbox().translate(0, movement);
                    deletePic();
                    picture = new Picture(getX(), getY(), "Utils/Pictures/Characters/boss_down.png");//DARIO FALTA COLLISION DETECTOR AQUI COMO NO PLAYER
                    picture.grow(4, 4);
                    picture.draw();
                }
                break;
            case 2:
                hit();
                if (!(super.getCollisionDetector().isCrashed(this, DirectionType.UP))) {
                    picture.translate(0, -movement); //UP
                    getHitbox().translate(0, -movement);
                    deletePic();
                    picture = new Picture(getX(), getY(), "Utils/Pictures/Characters/boss_up.png");//DARIO FALTA COLLISION DETECTOR AQUI COMO NO PLAYER
                    picture.grow(4, 4);
                    picture.draw();
                }
                break;
            case 3:
                hit();
                if (!(super.getCollisionDetector().isCrashed(this, DirectionType.LEFT))) {
                    picture.translate(-movement, 0); //LEFT
                    getHitbox().translate(-movement, 0);
                    deletePic();
                    picture = new Picture(getX(), getY(), "Utils/Pictures/Characters/boss_left.png");//DARIO FALTA COLLISION DETECTOR AQUI COMO NO PLAYER
                    picture.grow(4, 4);
                    picture.draw();
                }
                break;
        }
    }
    public void deletePic() {
        this.picture.delete();
    }
}
