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
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;
import java.util.LinkedList;

public class Game {
    LinkedList<GameObjects> objects;
    boolean allEnemyIsDead;
    boolean bossDead;
    Player player;
    Enemy enemy;

    public void init() {
        FieldFactory.getNewField();

        //CRIAR LISTA
        objects = new LinkedList<>();

        // CRIAR UM DETECTOR E ATRIBUIR A REFERENCIA DA LISTA
        CollisionDetector collisionDetector = new CollisionDetector(objects);

        player = PlayerFactory.getNewPlayer();
        enemy = EnemyFactory.getNewEnemy();
        Prop wall = PropFactory.getNewProp(200, 1, 400, 500);
        Rectangle rectangle = new Rectangle(200, 1, 400, 500);
        rectangle.setColor(Color.BLUE);
        rectangle.fill();

        //ATRIBUIR A REFERENCIA DO DETECTOR AO PLAYER
        player.setCollisionDetector(collisionDetector);
        enemy.setCollisionDetector(collisionDetector);

        //ADICIONAR PLAYER A LISTA
        objects.add(player);
        objects.add(enemy);
        //ATRIBUIR REFERENCIA DO DETECTOR A WALL
        wall.setCollisionDetector(collisionDetector);

        //ADICIONAR WALL A LISTa
        objects.add(wall);

        OurKeyboard keyboard = new OurKeyboard(player);
        keyboard.playerKeyboard();
    }




    public void start() {
        init();

        for (int i = 0; i < 3; i++) {
            while (!allEnemyIsDead || !player.isDead()) {
                // createEnemies(i+1); //AQUI DENTRO TEM DE CRIAR OS INIMIGOS PARA A RONDA EM QUESTAO SE QUISEREM UM BOSS NA RONDA TRES QUANDO RECEBEREM O 3 no CREATE ENEMIES CRIAM UM BOSS E N NORMAIS -> dica a cada ronda reviver os inimigos e acrescentar mais
                //createEnemies2(i+2);
                //createEnemies3(i+3);
                //  moveEnemies();
                checkIfEnemiesAreDead(); //PERCORRER OS GAMEOBJECTS E INSTANCE OF ENEMY && IS DEAD

            }
        }

    }

    private void checkIfEnemiesAreDead() {
        allEnemyIsDead = true;
    }

}
}