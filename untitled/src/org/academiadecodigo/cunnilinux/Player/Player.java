package org.academiadecodigo.cunnilinux.Player;

import org.academiadecodigo.cunnilinux.Alive;
import org.academiadecodigo.cunnilinux.Collision.CollisionDetector;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Ellipse;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player extends Alive {
    Picture picture;
    Keyboard keyboard;
    CollisionDetector collisionDetector;

    public Player(int health) {
        super(health);
        this.picture = new Picture(10, 10, "untitled/Utils/player_forward.png");
        this.picture.draw();
        this.collisionDetector = new CollisionDetector();
    }

    public Picture getPicture() {
        return picture;
    }

    public Object getPos() {
        return getPos();
    }


}
