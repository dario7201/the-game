package org.academiadecodigo.cunnilinux.Collision;


import org.academiadecodigo.cunnilinux.GameObjects.GameObjects;
import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.cunnilinux.Props.Prop;

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
            boolean x = object instanceof Player;

            if (!x) {
                System.out.println("HITBOX PLAYER W: " + (objectToCompare.getHitbox().getX() + objectToCompare.getHitbox().getWidth()));
                System.out.println("HITBOX PLAYER H: " + (objectToCompare.getHitbox().getY() + objectToCompare.getHitbox().getHeight()));
                System.out.println("HITBOX OBJECT W" + (object.getHitbox().getX() + object.getHitbox().getWidth()));
                System.out.println("HITBOX OBJECT H" + (object.getHitbox().getY() + object.getHitbox().getHeight()));
                if ((objectToCompare.getHitbox().getX() + objectToCompare.getHitbox().getWidth()) == (object.getHitbox().getX() + object.getHitbox().getWidth())
                        || (objectToCompare.getHitbox().getY() + objectToCompare.getHitbox().getHeight()) == (object.getHitbox().getY() + object.getHitbox().getHeight())-1) { //debaixo para cima
                    System.out.println("debaixo para cima");


                }
                if (objectToCompare.getX() + objectToCompare.getWidth() <= object.getX() + object.getHeight() && objectToCompare.getY() == object.getY() + object.getHeight()) { // cima para baixo
                    System.out.println("cima para baixo");
                }

            }
        }return false;
    }
}



