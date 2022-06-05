package org.academiadecodigo.cunnilinux.Enemies;

import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class EnemyFactory {
    public static Enemy getNewEnemy() {
        return new Enemy(2);
    }
    public static Boss getNewBoss() {
        return new Boss(20);
    }
}
