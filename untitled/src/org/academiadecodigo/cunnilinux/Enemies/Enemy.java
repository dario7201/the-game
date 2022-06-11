package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Interfaces.Hitable;
//import org.academiadecodigo.cunnilinux.Player.Spawn;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Enemy extends Alive implements Hitable {

    Picture picture1;

    private int pos;
    public Enemy(int health, Rectangle hitbox, int x) {
        super(3,hitbox);
        this.picture1 = new Picture(x, 780, "untitled/Utils/FrontEnemy.png");
        picture1.draw();

    }

    public static int getRandom(int max){
        int rand = 0;
        rand = (int)(Math.random() * max) ;

        return rand;
    }

    public void moveUpEnemy(){
        picture1.translate(0,-10);
    }
    public void enemyMove(){
        pos = getRandom(4);

        int DISTANCE = 10;
        switch (pos){
            case 0:
                picture1.translate(DISTANCE, 0); //RIGHT
                picture1.load("untitled/Utils/RightEnemy.png");//DARIO FALTA COLLISION DETECTOR AQUI COMO NO PLAYER
                break;
            case 1:
                picture1.translate(0, DISTANCE); //DOWN
                picture1.load("untitled/Utils/BackEnemy.png");
                break;
            case 2:
                picture1.translate(0,-DISTANCE); //UP
                picture1.load("untitled/Utils/FrontEnemy.png");
                break;
            case 3:
                picture1.translate(-DISTANCE, 0); //LEFT
                picture1.load("untitled/Utils/LeftEnemy.png");
                break;
        }
    }

    public void setPos(Integer pos){
        this.pos = pos;
    }

    public Picture getPictureEnemy(){ return picture1;}
    @Override
    public void hit(int damage) {
        setHealth(getHealth() - damage);
    }
}
