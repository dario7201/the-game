package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Collision.DirectionType;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemy extends Alive implements Hitable {
    private Picture picture;
    private DirectionType directionType;
    private int movement = 10;


    public Enemy(int health, int damage, Rectangle hitbox, int x) {
        super(health, damage, hitbox);
        this.picture = new Picture(x, 780, "untitled/Utils/Pictures/Characters/enemy_up.png");
        this.picture.grow(3,3);
        this.picture.draw();
    }


    @Override
    public void hit() {

    }

    public void deletePic() {
        this.picture.delete();
    }

    public void enemyMove() {
        int randomPos = ((int) Math.abs(Math.random()*4));
        System.out.println(randomPos);
        switch (randomPos) {
            case 0:
                if (!(super.getCollisionDetector().isCrashed(this, DirectionType.RIGHT))) {
                    picture.translate(movement, 0); //RIGHT
                    getHitbox().translate(movement, 0);
                    deletePic();
                    picture = new Picture(getX(),getY(),"untitled/Utils/Pictures/Characters/enemy_right.png");//DARIO FALTA COLLISION DETECTOR AQUI COMO NO PLAYER
                    picture.grow(4,4);
                    picture.draw();
                }
                break;
            case 1:

                if (!(super.getCollisionDetector().isCrashed(this, DirectionType.DOWN))) {
                    picture.translate(0, movement); //DOWN
                    getHitbox().translate(0,movement);
                    deletePic();
                    picture = new Picture(getX(),getY(),"untitled/Utils/Pictures/Characters/enemy_down.png");//DARIO FALTA COLLISION DETECTOR AQUI COMO NO PLAYER
                    picture.grow(4,4);
                    picture.draw();
                }
                break;
            case 2:

                if (!(super.getCollisionDetector().isCrashed(this, DirectionType.UP))) {
                    picture.translate(0, -movement); //UP
                    getHitbox().translate(0,-movement);
                    deletePic();
                    picture = new Picture(getX(),getY(),"untitled/Utils/Pictures/Characters/enemy_up.png");//DARIO FALTA COLLISION DETECTOR AQUI COMO NO PLAYER
                    picture.grow(4,4);
                    picture.draw();
                }
                break;
            case 3:
                if (!(super.getCollisionDetector().isCrashed(this, DirectionType.LEFT))) {
                    picture.translate(-movement, 0); //LEFT
                    getHitbox().translate(-movement,0);
                    deletePic();
                    picture = new Picture(getX(),getY(),"untitled/Utils/Pictures/Characters/enemy_left.png");//DARIO FALTA COLLISION DETECTOR AQUI COMO NO PLAYER
                    picture.grow(4,4);
                    System.out.println(picture.getX());
                    picture.draw();
                }
                break;
        }
    }


    public void moveUpEnemy() {
        picture.translate(0, -10);
        getHitbox().translate(0, -10);
    }

}

