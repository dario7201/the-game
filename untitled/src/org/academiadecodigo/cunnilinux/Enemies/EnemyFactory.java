package org.academiadecodigo.cunnilinux.Enemies;

//import org.academiadecodigo.cunnilinux.Player.Spawn;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class EnemyFactory {
    public static Enemy getNewEnemy(int x){
        return new Enemy(5, new Rectangle(), x);
    }

//    public static Enemy getNewEnemySpawn1() {
//        return new Enemy(2, new Rectangle(390, 800,20,20));
//    }
//    public static Enemy getNewEnemySpawn2() {
//        return new Enemy(2, new Rectangle(680, 800,20,20));
//    }
//    public static Enemy getNewEnemySpawn3() {
//        return new Enemy(2, new Rectangle(990, 800,20,20));
//    }
//    public static Enemy getNewEnemySpawn4() {
//        return new Enemy(2, new Rectangle(1220, 800,20,20));
//    }
    public static Boss getNewBossSpawn5() {
        return new Boss(20, new Rectangle());
    }


/*
    public Enemy createEnemies(){
        switch (activeSpawn){
            case SPAWN1:
               getNewEnemySpawn1();
                break;
            case SPAWN2:
                getNewEnemySpawn2();
                break;
            case SPAWN3:
                getNewEnemySpawn3();
                break;
            case SPAWN4:
                getNewEnemySpawn4();
                break;
            case SPAWN5:
                getNewBossSpawn5();
                break;
        }
        return null;
    }
    */

}
