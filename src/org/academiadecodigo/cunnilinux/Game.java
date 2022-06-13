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
import org.academiadecodigo.cunnilinux.Props.Prop;
import org.academiadecodigo.cunnilinux.Props.PropFactory;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;

public class Game {
    LinkedList<GameObjects> objects;
    public static final int maxRound = 2;
    private int enemycounter = 4;
    private boolean allEnemiesDead;
    private Picture mainMenuBG;
    private Picture instructionsBG;
    private Picture victoryBG;
    private Picture gameOverBG;
    private CollisionDetector collisionDetector;

    public void init() {


        FieldFactory.getNewField();

        //CRIAR LISTA
        objects = new LinkedList<>();


        // CRIAR UM DETECTOR E ATRIBUIR A REFNERENCIA DA LISTA
        collisionDetector = new CollisionDetector(objects);

        Player player = PlayerFactory.getNewPlayer();
        Enemy enemy1 = EnemyFactory.getNewEnemy(380, 40, 10);
        Enemy enemy2 = EnemyFactory.getNewEnemy(680, 40, 10);
        Enemy enemy3 = EnemyFactory.getNewEnemy(990, 40, 10);
        Enemy enemy4 = EnemyFactory.getNewEnemy(1220, 40, 10);
        Chest mary = PropFactory.getNewMary();

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

        //ATRIBUIR REFERENCIA DO DETECTOR A WALL


        //ATRIBUIR REFERENCIA DO DETECTOR A ENEMY
        enemy1.setCollisionDetector(collisionDetector);
        enemy2.setCollisionDetector(collisionDetector);
        enemy3.setCollisionDetector(collisionDetector);
        enemy4.setCollisionDetector(collisionDetector);


        //ADICIONAR WALL A LISTa
        objects.add(mary);
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
        gameStart();

    }


    public void leaveSpawn() throws InterruptedException {
        for (GameObjects object : objects) {
            if (object instanceof Enemy) {
                if (!((Enemy) object).isDead()) {
                    for (int i = 0; i < 33; i++) {
                        Thread.sleep(50);
                        ((Enemy) object).moveUpEnemy();
                    }
                }
            }
        }
    }


    public void moveEnemies() {
        for (GameObjects object : objects) {
            if (object instanceof Enemy && !(((Enemy) object).isDead())) {
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

    public void gameStart() throws InterruptedException {
        GameMusic gameMusic = new GameMusic();
        gameMusic.playMusic("Utils/Sounds/duel_of_fates.wav");
        leaveSpawn();
        while (!allEnemiesDead) {
            moveEnemies();
            Thread.sleep(300);
            this.enemycounter = 4;
            for (GameObjects object : objects) {

                if (object instanceof Player) {
                    ((Player) object).checkHealth();
                    if (((Player) object).isDead()) {
                        gameMusic.stopMusic();
                        gameMusic.playMusic("Utils/Sounds/badgameover.wav");
                        badGameOver();
                        return;
                    }
                }
                if (object instanceof Enemy) {
                    if (((Enemy) object).isDead()) {
                        enemycounter -= 1;

                        System.out.println(enemycounter);
                        if (enemycounter == 0) {
                            allEnemiesDead = true;
                        }
                    }
                }

            }
        }
        allEnemiesDead = false;
        Enemy enemy5 = EnemyFactory.getNewEnemy(1220, 40, 10);
        Enemy enemy6 = EnemyFactory.getNewEnemy(990, 40, 10);
        Enemy enemy7 = EnemyFactory.getNewEnemy(680, 40, 10);
        Enemy enemy8 = EnemyFactory.getNewEnemy(380, 40, 10);
        objects.add(enemy5);
        objects.add(enemy6);
        objects.add(enemy7);
        objects.add(enemy8);
        enemy5.setCollisionDetector(collisionDetector);
        enemy6.setCollisionDetector(collisionDetector);
        enemy7.setCollisionDetector(collisionDetector);
        enemy8.setCollisionDetector(collisionDetector);
        leaveSpawn();
        while (!allEnemiesDead) {
            moveEnemies();
            Thread.sleep(300);
            this.enemycounter = 8;
            for (GameObjects object : objects) {
                if (object instanceof Player) {
                    ((Player) object).checkHealth();
                    if (((Player) object).isDead()) {
                        gameMusic.stopMusic();
                        gameMusic.playMusic("Utils/Sounds/badgameover.wav");
                        badGameOver();
                        return;
                    }
                }
                if (object instanceof Enemy) {
                    if (((Enemy) object).isDead()) {
                        enemycounter -= 1;

                        if (enemycounter == 0) {
                            allEnemiesDead = true;
                        }
                    }
                }

            }
        }
        gameMusic.stopMusic();
        Boss boss = EnemyFactory.getNewBoss(1200);
        boss.setCollisionDetector(collisionDetector);
        objects.add(boss);
        gameMusic.playMusic("Utils/Sounds/VaderAwakens-YoutubeConvert.cc.wav");

        while (!bossDead()) {
            for (GameObjects object : objects) {
                if (object instanceof Player) {
                    ((Player) object).checkHealth();
                    if (((Player) object).isDead()) {
                        gameMusic.stopMusic();
                        gameMusic.playMusic("Utils/Sounds/badgameover.wav");
                        badGameOver();
                        return;
                    }
                }
            }
            moveBoss();
            Thread.sleep(300);

        }
        gameMusic.stopMusic();
        gameMusic.playMusic("Utils/Sounds/cantina.wav");
        goodGameOver();

    }


    private void goodGameOver() {
        Picture picture = new Picture(10,10,"Utils/Pictures/BackGrounds/VictoryBG.png");
        picture.draw();
    }

    public void badGameOver() {

        Picture picture = new Picture(10,10,"Utils/Pictures/BackGrounds/GameOverBG.png");
        picture.draw();
    }

    public boolean bossDead() {
        for (GameObjects object : objects) {
            if (object instanceof Boss) {
                if (((Boss) object).isDead()) {
                    return true;
                }
            }
        }
        return false;
    }
}
