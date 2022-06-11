package org.academiadecodigo.cunnilinux.Collision;


import org.academiadecodigo.cunnilinux.Enemies.Boss;
import org.academiadecodigo.cunnilinux.Enemies.Enemy;
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
                        if (!verifyMoveUp(objectToCompare, object)) {
                            continue;
                        }
                        return true;
                    case DOWN:
                        if (!verifyMoveDown(objectToCompare, object)) {
                            continue;
                        }
                        return true;
                    case LEFT:
                        if (!verifyMoveLeft(objectToCompare, object)) {
                            continue;
                        }
                        return true;
                    case RIGHT:
                        if (!verifyMoveRight(objectToCompare, object)) {
                            continue;
                        }
                        return true;
                }
            }
        }return false;
    }

    public Enemy enemyInRange(GameObjects objectToCompare) {
        for (GameObjects object : objects) {
            if (objectToCompare instanceof Player && object instanceof Enemy) {
               if(verifyMoveDown(objectToCompare,object) || verifyMoveLeft(objectToCompare,object) ||
                       verifyMoveRight(objectToCompare,object) || verifyMoveUp(objectToCompare,object)) {
                   return (Enemy) object;
               }
            }
        }

        return null;
    }
    public Boss bossInRange(GameObjects objectToCompare) {
        for (GameObjects object : objects) {
            if (objectToCompare instanceof Player && object instanceof Boss) {
               if(verifyMoveDown(objectToCompare,object) || verifyMoveLeft(objectToCompare,object) ||
                       verifyMoveRight(objectToCompare,object) || verifyMoveUp(objectToCompare,object)) {
                   return (Boss) object;
               }
            }
        }

        return null;
    }


    private boolean verifyMoveRight(GameObjects objectToCompare, GameObjects object) {
        if (objectToCompare.getX() + objectToCompare.getWidth() == object.getX()
                && objectToCompare.getY() + objectToCompare.getHeight() <= object.getY() + object.getHeight() && objectToCompare.getY() >= object.getY()) {
            return true;
        }
        return false;
    }

    private boolean verifyMoveLeft(GameObjects objectToCompare, GameObjects object) {
        if (objectToCompare.getX() == object.getX() + object.getWidth() && objectToCompare.getY() + objectToCompare.getHeight() <= object.getY() + object.getHeight()
                && objectToCompare.getY() >= object.getY()) {
            return true;
        }

        return false;
    }


    private boolean verifyMoveDown(GameObjects objectToCompare, GameObjects object) {
        if (objectToCompare.getHitbox().getX() + objectToCompare.getHitbox().getWidth() <= object.getHitbox().getX() + object.getHitbox().getWidth() &&
                objectToCompare.getHitbox().getX() >= object.getHitbox().getX() &&
                objectToCompare.getHitbox().getY() + objectToCompare.getHitbox().getHeight() == object.getHitbox().getY()) {
            return true;
        }
        return false;
    }

    private boolean verifyMoveUp(GameObjects objectToCompare, GameObjects object) {
        if (objectToCompare.getHitbox().getX() + objectToCompare.getHitbox().getWidth() <= object.getHitbox().getX() + object.getHitbox().getWidth() &&
                objectToCompare.getHitbox().getX() >= object.getHitbox().getX() &&
                objectToCompare.getHitbox().getY() == object.getHitbox().getY() + object.getHitbox().getHeight()) {
            return true;
        }
        return false;
    }
}


