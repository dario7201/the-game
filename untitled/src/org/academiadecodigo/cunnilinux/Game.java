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
        Rectangle rectangle = new Rectangle(200,200,200,200);
        rectangle.setColor(Color.BLUE);
        rectangle.fill();

        //ATRIBUIR A REFERENCIA DO DETECTOR AO PLAYER
        player.setCollisionDetector(collisionDetector);

        //ADICIONAR PLAYER A LISTA
        objects.add(player);

        //ATRIBUIR REFERENCIA DO DETECTOR A WALL
        wall.setCollisionDetector(collisionDetector);

        //ADICIONAR WALL A LISTa
        objects.add(wall);
        OurKeyboard keyboard = new OurKeyboard(player);
        keyboard.playerKeyboard();
    }


    public void start() {
        init();
    }
}
