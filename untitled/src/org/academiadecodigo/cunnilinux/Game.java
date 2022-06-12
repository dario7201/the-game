package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.cunnilinux.Collision.CollisionDetector;
import org.academiadecodigo.cunnilinux.Enemies.Boss;
import org.academiadecodigo.cunnilinux.Enemies.Enemy;
import org.academiadecodigo.cunnilinux.Enemies.EnemyFactory;
import org.academiadecodigo.cunnilinux.Field.FieldFactory;
import org.academiadecodigo.cunnilinux.GameObjects.GameObjects;
import org.academiadecodigo.cunnilinux.OurKeyboard.OurKeyboard;
import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.cunnilinux.Player.PlayerFactory;
import org.academiadecodigo.cunnilinux.Props.Chest;
import org.academiadecodigo.cunnilinux.Props.PropFactory;
import org.academiadecodigo.cunnilinux.Props.Prop;
import org.academiadecodigo.cunnilinux.Props.Wall;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;
import java.util.LinkedList;

public class Game {
    LinkedList<GameObjects> objects;
    public static final int maxRound = 3;
    public static final int currentRound = 0;
    private boolean gameOver;
    private boolean allEnemiesDead;

    public void init() {

        FieldFactory.getNewField();

        //CRIAR LISTA
        objects = new LinkedList<>();


        // CRIAR UM DETECTOR E ATRIBUIR A REFNERENCIA DA LISTA
        CollisionDetector collisionDetector = new CollisionDetector(objects);

        Player player = PlayerFactory.getNewPlayer();
        Enemy enemy1 = EnemyFactory.getNewEnemy(380,40,10);
        Enemy enemy2 = EnemyFactory.getNewEnemy(680,40,10);
        Enemy enemy3 = EnemyFactory.getNewEnemy(990,40,10);
        Enemy enemy4 = EnemyFactory.getNewEnemy(1220,40, 10);
        Boss boss = EnemyFactory.getNewBoss(900);
        Chest mari = PropFactory.getNewMC();

        Prop fieldUp = PropFactory.getNewProp(-10, 10, 1500, 60);
        Prop fieldDown = PropFactory.getNewProp(-10, 800, 1500, 10);
        Prop fieldLeft = PropFactory.getNewProp(0, 200, 10, 500);
        Prop fieldRight = PropFactory.getNewProp(1460, 10, 10, 800);
        Prop build1 = PropFactory.getNewProp(10, 10, 340, 350);
        Prop build2 = PropFactory.getNewProp(10, 490, 90, 320);
        Prop build3 = PropFactory.getNewProp(210, 490, 140, 320);
        Prop build4 = PropFactory.getNewProp(460, 490, 190, 320);
        Prop build5 = PropFactory.getNewProp(760, 490, 220, 320);
        Prop build6 = PropFactory.getNewProp(1050, 490, 160, 320);
        Prop build7 = PropFactory.getNewProp(1270, 540, 200, 270);
        Prop build8 = PropFactory.getNewProp(1040, 70, 150, 290);
        Prop build9 = PropFactory.getNewProp(760, 70, 210, 290);
        Prop build10 = PropFactory.getNewProp(460, 150, 190, 210);

        //ATRIBUIR A REFERENCIA DO DETECTOR AO PLAYER
        player.setCollisionDetector(collisionDetector);

        //ADICIONAR PLAYER A LISTA
        objects.add(player);

        //ADICIONAR ENEMY A LISTA
        objects.add(enemy1);
        objects.add(enemy2);
        objects.add(enemy3);
        objects.add(enemy4);
        objects.add(boss);

        //ATRIBUIR REFERENCIA DO DETECTOR A WALL


        //ATRIBUIR REFERENCIA DO DETECTOR A ENEMY
        enemy1.setCollisionDetector(collisionDetector);
        enemy2.setCollisionDetector(collisionDetector);
        enemy3.setCollisionDetector(collisionDetector);
        enemy4.setCollisionDetector(collisionDetector);
        boss.setCollisionDetector(collisionDetector);

        //ADICIONAR WALL A LISTa
        objects.add(mari);
        objects.add(fieldDown);
        objects.add(fieldLeft);
        objects.add(fieldRight);
        objects.add(fieldUp);
        objects.add(build1);
        objects.add(build2);
        objects.add(build3);
        objects.add(build4);
        objects.add(build5);
        objects.add(build6);
        objects.add(build7);
        objects.add(build8);
        objects.add(build9);
        objects.add(build10);
        OurKeyboard keyboard = new OurKeyboard(player);
        keyboard.playerKeyboard();
    }


    public void start() throws InterruptedException {
        init();
        for (int i = 0; i < 4000; i++) {
            if(i == 0){
                leaveSpawn();
                Thread.sleep(50);
            }
            moveEnemies();
            moveBoss();
            Thread.sleep(250);
        }

        }
        //rounds
    public void verifyGameOver(){
//        while(!)
    }



    public void leaveSpawn() throws InterruptedException {
        for (GameObjects object : objects) {
            if (object instanceof Enemy) {
                for (int i = 0; i < 30; i++) {
                    Thread.sleep(50);
                    ((Enemy) object).moveUpEnemy();
                }
            }
        }
    }

    public void moveEnemies() {
        for (GameObjects object : objects) {
            if (object instanceof Enemy && !((Enemy) object).isDead()) {
                ((Enemy) object).enemyMove();
            }
        }

    }
    public void moveBoss() {
        for (GameObjects object : objects) {
            if (object instanceof Boss && !((Boss) object).isDead()) {
                ((Boss) object).bossMove();
            }
        }

    }


//        public void moveRandomEnemy() throws InterruptedException{
//        int iUp= 0;
//        int maxUp = 40;
//        int i = 0;
//        int maxRandom = 1000;
//        while(iUp < maxUp){
//
//            enemy2.moveUpEnemy();
//            enemy3.moveUpEnemy();
//            enemy4.moveUpEnemy();
//            iUp++;
//            Thread.sleep(300);
//            if(iUp == maxUp) {
//                while (i < maxRandom) {
//                    enemy1.enemyMove();
//                    enemy2.enemyMove();
//                    enemy3.enemyMove();
//                    enemy4.enemyMove();
//                    i++;
//                    Thread.sleep(400);
//                }
//            }
//        }
}

