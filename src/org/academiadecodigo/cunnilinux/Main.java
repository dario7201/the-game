package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.cunnilinux.Props.Prop;
import org.academiadecodigo.cunnilinux.Props.PropFactory;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
//        MainMenu mainMenu = new MainMenu();
        Picture picture = new Picture(10,10,"Utils/Pictures/BackGrounds/StartScreenBG.png");
        picture.draw();
        Thread.sleep(5000);
        picture.delete();
        picture = new Picture(10,10,"Utils/Pictures/BackGrounds/InstructionsBG.png");
        picture.draw();
        Thread.sleep(5000);
        picture.delete();
        game.start();
//       mainMenu.start();

    }
}
