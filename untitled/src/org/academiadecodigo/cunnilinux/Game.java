package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.cunnilinux.Collision.CollisionDetector;
import org.academiadecodigo.cunnilinux.Enemies.Enemy;
import org.academiadecodigo.cunnilinux.Enemies.EnemyFactory;
import org.academiadecodigo.cunnilinux.Field.FieldFactory;
import org.academiadecodigo.cunnilinux.GameObjects.GameObjects;
import org.academiadecodigo.cunnilinux.OurKeyboard.OurKeyboard;
import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.cunnilinux.Player.PlayerFactory;
//import org.academiadecodigo.cunnilinux.Player.Spawn;

import java.util.LinkedList;

public class Game {
    LinkedList<GameObjects> objects;
    private int currentRound;
    private int maxRounds = 4;


    Enemy enemy1 = null;
    Enemy enemy2 = null;
    Enemy enemy3 = null;
    Enemy enemy4 = null;

    public void init() throws InterruptedException {
        FieldFactory.getNewField();
        //CRIAR LISTA
        objects = new LinkedList<>();

        // CRIAR UM DETECTOR E ATRIBUIR A REFNERENCIA DA LISTA
        CollisionDetector collisionDetector = new CollisionDetector(objects);

        Player player = PlayerFactory.getNewPlayer();

        //ATRIBUIR A REFERENCIA DO DETECTOR AO PLAYER
        player.setCollisionDetector(collisionDetector);

        //ADICIONAR PLAYER A LISTA
        objects.add(player);

        OurKeyboard keyboard = new OurKeyboard(player);
        keyboard.playerKeyboard();

        //CRIAR ENEMYs
        Enemy[] enemyArray = {enemy1, enemy2, enemy3, enemy4};
        createEnemy();
        System.out.println(objects);
        //moveRandomEnemy();

    }

    public void createEnemy() throws InterruptedException {
        Enemy[] enemyArray = new Enemy[4];
        int[] spawn = {380, 680, 990, 1220};

        for (int i = 0; i < enemyArray.length; i++) {
            enemyArray[i] = EnemyFactory.getNewEnemy(spawn[i]);
            objects.add(enemyArray[i]);
        }
        moveRandomEnemy();
    }

   public void moveRandomEnemy() throws InterruptedException{
       int iUp= 0;
       int maxUp = 40;
       int i = 0;
       int maxRandom = 1000;
       while(iUp < maxUp){
           enemy1.moveUpEnemy();
           enemy2.moveUpEnemy();
           enemy3.moveUpEnemy();
           enemy4.moveUpEnemy();
           iUp++;
           Thread.sleep(300);
           if(iUp == maxUp) {
               while (i < maxRandom) {
                   enemy1.enemyMove();
                   enemy2.enemyMove();
                   enemy3.enemyMove();
                   enemy4.enemyMove();
                   i++;
                   Thread.sleep(400);
               }
           }
       }
   }


    public void start() throws InterruptedException {
        init();
    }
}

