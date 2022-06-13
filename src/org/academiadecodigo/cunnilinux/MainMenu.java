package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.cunnilinux.OurKeyboard.OurKeyboard;
import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class MainMenu {

    private Game game;
    private Picture mainMenuBG;
    private boolean isInstructions;


    public MainMenu() {
        game = new Game();
        mainMenuInput();
        mainMenuBG = new Picture(10, 10, "Utils/Pictures/BackGrounds/StartScreenBG.png");
    }

    public void start() throws InterruptedException {
        mainMenuBG.draw();
    }




    private void mainMenuInput() {
        OurKeyboard keyboardMainMenu = new OurKeyboard(this);
        keyboardMainMenu.menuKeyboard();

    }


    public void interactSpace() throws InterruptedException {
        if (!isInstructions) {
            mainMenuBG.delete();
            mainMenuBG = new Picture(10,10,"Utils/Pictures/BackGrounds/InstructionsBG.png");
            mainMenuBG.draw();
            isInstructions = true;
            return;
        }

        mainMenuBG.delete();
        Thread.sleep(1000);
        game.start();
    }


}