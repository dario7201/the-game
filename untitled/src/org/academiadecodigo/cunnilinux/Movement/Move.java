package org.academiadecodigo.cunnilinux.Movement;

public class Move {
    public void move() {
        int direction = (int) Math.floor(Math.random() * 4);
        if (!isDead()) {
            switch (direction) {
                case 0:
                    moveUp();
                    break;

                case 1:
                    moveDown();
                    break;

                case 2:
                    moveRight();
                    break;

                case 3:
                    moveLeft();
                    break;
            }
        }
    }
}
