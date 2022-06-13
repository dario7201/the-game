package org.academiadecodigo.cunnilinux.Props;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PropFactory {
    private Picture picture;
    public static Prop getNewProp(int x, int y, int width, int height){
        return new Prop(new Rectangle(x,y,width,height)) {

        };

    }
    public static Chest getNewMary() {
        return new Chest(new Rectangle(350,200, 20,20), new Picture(350, 200, "Utils/Pictures/Characters/mary_before.png"));


    }
    public static Chest getNewSopas() {
        return new Chest(new Rectangle(350,200, 20,20), new Picture(600, 600, "Utils/Pictures/Characters/sopas.png"));
    }
}
