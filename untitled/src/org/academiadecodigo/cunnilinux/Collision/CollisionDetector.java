package org.academiadecodigo.cunnilinux.Collision;


import org.academiadecodigo.cunnilinux.GameObjects.GameObjects;
import org.academiadecodigo.cunnilinux.Player.Player;

import java.util.LinkedList;


public class CollisionDetector {

    private LinkedList<GameObjects> objects;

    public CollisionDetector(LinkedList<GameObjects> objects) {
        this.objects = objects;
    }

    // ISTO CHECKA SE O PLAYER ESTA A BATER EM ALGO
    //sempre que o player anda isto tem de ser checked, meter o movement no player em vez de handler
    public boolean isCrashed(GameObjects objectToCompare, DirectionType directionType) {
        for (GameObjects object : objects) {
            if (!(object instanceof Player)) {
                switch (directionType) {
                    case UP:
                        return verifyMoveUp(objectToCompare, object);
                    case DOWN:
                        return verifyMoveDown(objectToCompare, object);
                    case LEFT:
                        return verifyMoveLeft(objectToCompare, object);
                    case RIGHT:
                        return verifyMoveRight(objectToCompare, object);
                }
            }
        }
        return false;
    }

    private boolean verifyMoveRight(GameObjects objectToCompare, GameObjects object) {
        if (objectToCompare.getX() + objectToCompare.getWidth() == object.getX() && objectToCompare.getY() + objectToCompare.getHeight() <= object.getY() + object.getHeight() && objectToCompare.getY() >= object.getY()) {
            System.out.println("esquerda para direita");
            return true;
        }
        return false;
    }

    private boolean verifyMoveLeft(GameObjects objectToCompare, GameObjects object) {
        if (objectToCompare.getX() == object.getX() + object.getWidth() && objectToCompare.getY() + objectToCompare.getHeight() <= object.getY() + object.getHeight()
                && objectToCompare.getY() >= object.getY()
        ) {
            System.out.println("direita para esquerda");
            return true;
        }

        return false;
    }


    private boolean verifyMoveDown(GameObjects objectToCompare, GameObjects object) {
        if (objectToCompare.getHitbox().getX() + objectToCompare.getHitbox().getWidth() <= object.getHitbox().getX() + object.getHitbox().getWidth() &&
                objectToCompare.getHitbox().getX() >= object.getHitbox().getX() &&//CIMA PARA BAIXO
                objectToCompare.getHitbox().getY() + objectToCompare.getHitbox().getHeight() == object.getHitbox().getY()) {
            System.out.println("cima pra baixo");
            return true;
        }
        return false;
    }

    private boolean verifyMoveUp(GameObjects objectToCompare, GameObjects object) {
        if (objectToCompare.getHitbox().getX() + objectToCompare.getHitbox().getWidth() <= object.getHitbox().getX() + object.getHitbox().getWidth() &&
                objectToCompare.getHitbox().getX() >= object.getHitbox().getX() &&//CIMA PARA BAIXO
                objectToCompare.getHitbox().getY() == object.getHitbox().getY() + object.getHitbox().getHeight()) {
            System.out.println("baixo para cima");
            return true;
        }
        return false;
    }
}


