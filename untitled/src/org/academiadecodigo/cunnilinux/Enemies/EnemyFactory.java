package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class EnemyFactory {
    public static Enemy getNewEnemy() {
        return new Enemy(40, 20,new Rectangle(500, 600, 20,20));
    }
    public static Boss getNewBoss() {
        return new Boss(200,30, new Rectangle(1000, 200,20,  20));
    }
}
