package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.cunnilinux.Collision.CollisionDetector;
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
    LinkedList<GameObjects> objects;
    public void init() {
        FieldFactory.getNewField();

        //CRIAR LISTA
        objects = new LinkedList<>();


        // CRIAR UM DETECTOR E ATRIBUIR A REFNERENCIA DA LISTA
        CollisionDetector collisionDetector = new CollisionDetector(objects);

        Player player = PlayerFactory.getNewPlayer();
        Enemy enemy = EnemyFactory.getNewEnemy();

        Prop wall = PropFactory.getNewProp(500,100,340,330);
        Prop wall1 = PropFactory.getNewProp(200,200,200,200);
        Rectangle rectangle = new Rectangle(200,200,200,200);
        Rectangle rectangle1 = new Rectangle(500,100,340,330);
        rectangle.setColor(Color.BLUE);
        rectangle1.setColor(Color.BLUE);
        rectangle.fill();
        rectangle1.fill();

        //ATRIBUIR A REFERENCIA DO DETECTOR AO PLAYER
        player.setCollisionDetector(collisionDetector);

        //ADICIONAR PLAYER A LISTA
        objects.add(player);

        //ADICIONAR ENEMY A LISTA
//        objects.add(enemy);

        //ATRIBUIR REFERENCIA DO DETECTOR A WALL
        wall.setCollisionDetector(collisionDetector);
        wall1.setCollisionDetector(collisionDetector);

        //ATRIBUIR REFERENCIA DO DETECTOR A ENEMY
        enemy.setCollisionDetector(collisionDetector);

        //ADICIONAR WALL A LISTa
        objects.add(enemy);
        objects.add(wall1);
        objects.add(wall);
        OurKeyboard keyboard = new OurKeyboard(player);
        keyboard.playerKeyboard();
    }


    public void start() {
        init();
    }
}
