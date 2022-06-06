package org.academiadecodigo.cunnilinux.Props;

import org.academiadecodigo.cunnilinux.Interfaces.Interactable;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Chest extends Props implements Interactable {
    Rectangle rectangle;
    Sword sword;

    public Chest() {
    this.rectangle = new Rectangle(50,50,20,23);
    this.rectangle.setColor(Color.MAGENTA);
    this.rectangle.fill();
    this.sword = new Sword(50,50,"untitled/Utils/Pictures/Lazer_Blue_Vertical_Up_Equipped.png");
    }

    @Override
    public void interact() {
    //set player weapon sword

    }
}
