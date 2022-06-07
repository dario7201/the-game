package org.academiadecodigo.cunnilinux.Collision;


import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class CollisionDetector {


    public boolean isCrashed(Player player, Rectangle rectangle) {
        Picture playerPos = player.getPicture();
        if (playerPos.getX() + playerPos.getWidth() <= rectangle.getX() + rectangle.getWidth() && playerPos.getY() == rectangle.getY() + rectangle.getHeight()){ //debaixo para cima
            System.out.println("debaixo para cima");


        }
        if(playerPos.getX() + playerPos.getWidth() <= rectangle.getX() + rectangle.getHeight() && playerPos.getY() == rectangle.getY() + rectangle.getHeight()){ // cima para baixo
            System.out.println("cima para baixo");
        }
        System.out.println(player.getPicture().getY());
        System.out.println(rectangle.getX());
        return true;

    }


}
