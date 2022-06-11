package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class EnemyFactory {
    public static Enemy getNewEnemy() {
        return new Enemy(5, 1,new Rectangle(500, 600, 20,20));
    }
    public static Boss getNewBoss() {
        return new Boss(20,2, new Rectangle(500, 600,20,  20));
    }
}
