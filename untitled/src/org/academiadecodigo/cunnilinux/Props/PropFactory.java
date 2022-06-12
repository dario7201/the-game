package org.academiadecodigo.cunnilinux.Props;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class PropFactory {
    private Picture picture;
    public static Prop getNewProp(int x, int y, int width, int height){
        return new Prop(new Rectangle(x,y,width,height)) {

        };

    }
    public static Chest getNewMC() {
        return new Chest(new Rectangle(350,200, 20,20));


    }
}
