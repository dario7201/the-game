package org.academiadecodigo.cunnilinux.Enemies;

public class EnemyFactory {
    public static Enemy getEnemy(Grid grid) {

        int random = (int) (Math.random() * CarType.values().length);
        CarType carType = CarType.values()[random];

        Car car;

        switch (carType) {
            case FIAT:
                car = new Fiat(grid.makeGridPosition());
                break;
            case MUSTANG:
                car = new Mustang(grid.makeGridPosition());
                break;
            default:
                car = new Fiat(grid.makeGridPosition());
        }

        return car;

    }

}
