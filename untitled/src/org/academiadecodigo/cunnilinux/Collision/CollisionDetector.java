package org.academiadecodigo.cunnilinux.Collision;


import org.academiadecodigo.cunnilinux.GameObjects.GameObjects;
import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;


public class CollisionDetector {

    private LinkedList<GameObjects> objects;

    public CollisionDetector(LinkedList<GameObjects> objects) {
        this.objects = objects;
    }

    // ISTO CHECKA SE O PLAYER ESTA A BATER EM ALGO
    //sempre que o player anda isto tem de ser checked, meter o movement no player em vez de handler
    public boolean isCrashed(GameObjects objectToCompare) {
        for (GameObjects object : objects) {

            if (objectToCompare.getX() + objectToCompare.getWidth() <= object.getX() + object.getWidth() && objectToCompare.getY() == object.getY() + object.getHeight()) { //debaixo para cima
                System.out.println("debaixo para cima");


            }
            if (objectToCompare.getX() + objectToCompare.getWidth() <= object.getX() + object.getHeight() && objectToCompare.getY() == object.getY() + object.getHeight()) { // cima para baixo
                System.out.println("cima para baixo");
            }

        }
        return false;
    }

}
