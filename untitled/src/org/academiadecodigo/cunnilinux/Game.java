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
import org.academiadecodigo.cunnilinux.Props.PropFactory;
import org.academiadecodigo.cunnilinux.Props.Prop;
import org.academiadecodigo.cunnilinux.Props.Wall;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;
import java.util.LinkedList;

public class Game {

    int maxNumberRounds;
    int currentRound;
    LinkedList<GameObjects> objects;

    public void init() {
        FieldFactory.getNewField();

        //CRIAR LISTA
        objects = new LinkedList<>();


        // CRIAR UM DETECTOR E ATRIBUIR A REFNERENCIA DA LISTA
        CollisionDetector collisionDetector = new CollisionDetector(objects);

        Player player = PlayerFactory.getNewPlayer();
        Enemy enemy = EnemyFactory.getNewEnemy();
        Boss boss = EnemyFactory.getNewBoss();
        Prop mari = PropFactory.getNewMC();

        Prop fieldUp = PropFactory.getNewProp(-10, 10, 1500, 60);
        Prop fieldDown = PropFactory.getNewProp(-10, 800, 1500, 10);
        Prop fieldLeft = PropFactory.getNewProp(0, 200, 10, 500);
        Prop fieldRight = PropFactory.getNewProp(1460, 10, 10, 800);
        Prop build1 = PropFactory.getNewProp(10, 10, 340, 350);
        Prop build2 = PropFactory.getNewProp(10, 490, 90, 320);
        Prop build3 = PropFactory.getNewProp(210, 490, 140, 320);
        Prop build4 = PropFactory.getNewProp(460, 490, 190, 320);
//
//
//
//
//
        Prop build5 = PropFactory.getNewProp(760, 490, 220, 320);
        Prop build6 = PropFactory.getNewProp(1050, 490, 160, 320);
        Prop build7 = PropFactory.getNewProp(1270, 540, 200, 270);
        Prop build8 = PropFactory.getNewProp(1040, 70, 150, 290);
//
//
//
//
        Prop build9 = PropFactory.getNewProp(760, 70, 210, 290);
        Prop build10 = PropFactory.getNewProp(460, 150, 190, 210);

        //ATRIBUIR A REFERENCIA DO DETECTOR AO PLAYER
        player.setCollisionDetector(collisionDetector);

        //ADICIONAR PLAYER A LISTA
        objects.add(player);

        //ADICIONAR ENEMY A LISTA
        objects.add(enemy);
        objects.add(boss);

        //ATRIBUIR REFERENCIA DO DETECTOR A WALL


        //ATRIBUIR REFERENCIA DO DETECTOR A ENEMY
        enemy.setCollisionDetector(collisionDetector);
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


    public void start() {
        init();

        {
//
//
//        for (int i = 0; i < maxNumberRounds; i++) {
//
//            while (!allEnemyIsDead || !player.isDead()) {
//                // createEnemies(i+1); //AQUI DENTRO TEM DE CRIAR OS INIMIGOS PARA A RONDA EM QUESTAO SE QUISEREM UM BOSS NA RONDA TRES QUANDO RECEBEREM O 3 no CREATE ENEMIES CRIAM UM BOSS E N NORMAIS -> dica a cada ronda reviver os inimigos e acrescentar mais
//                //createEnemies2(i+2);
//                //createEnemies3(i+3);
//                //  moveEnemies();
//                checkIfEnemiesAreDead(); //PERCORRER OS GAMEOBJECTS E INSTANCE OF ENEMY && IS DEAD
//
//            }
//        }
//
//    }
//
//
//    }

        }
    }
}

