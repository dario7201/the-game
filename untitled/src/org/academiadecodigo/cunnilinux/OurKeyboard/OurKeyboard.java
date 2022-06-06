package org.academiadecodigo.cunnilinux.OurKeyboard;

import org.academiadecodigo.cunnilinux.Player.Player;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

public class OurKeyboard {

    Player player;
    Handler handler = new Handler();
    KeyboardEvent keyboardEventPlayerRight = new KeyboardEvent();
    KeyboardEvent keyboardEventPlayerLeft = new KeyboardEvent();
    KeyboardEvent keyboardEventPlayerUp = new KeyboardEvent();
    KeyboardEvent keyboardEventPlayerDown = new KeyboardEvent();
    KeyboardEvent keyboardEventPlayerInteract = new KeyboardEvent();
    KeyboardEvent keyboardEventPlayerAttack = new KeyboardEvent();
    Keyboard keyboard = new Keyboard(handler);
    public OurKeyboard(Player player) {
        this.player = player;
    }

    public void playerKeyboard() {
        handler.setPlayer(player);

        keyboardEventPlayerRight.setKey(KeyboardEvent.KEY_RIGHT);
        keyboardEventPlayerRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventPlayerRight);

        keyboardEventPlayerLeft.setKey(KeyboardEvent.KEY_LEFT);
        keyboardEventPlayerLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventPlayerLeft);

        keyboardEventPlayerUp.setKey(KeyboardEvent.KEY_UP);
        keyboardEventPlayerUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventPlayerUp);

        keyboardEventPlayerDown.setKey(KeyboardEvent.KEY_DOWN);
        keyboardEventPlayerDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventPlayerDown);

        keyboardEventPlayerInteract.setKey(KeyboardEvent.KEY_X);
        keyboardEventPlayerInteract.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventPlayerInteract);

        keyboardEventPlayerAttack.setKey(KeyboardEvent.KEY_SPACE);
        keyboardEventPlayerAttack.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventPlayerAttack);
    }
}
