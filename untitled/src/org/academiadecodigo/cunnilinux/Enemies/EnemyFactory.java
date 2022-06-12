package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class EnemyFactory {
    public static Enemy getNewEnemy(int x) {
        return new Enemy(40, 20,new Rectangle(x, 780, 20,20),x);
    }
    public static Boss getNewBoss(int x) {
        return new Boss(200,30, new Rectangle(x, 400,20,  20),x);
    }

}
