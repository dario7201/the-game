package org.academiadecodigo.cunnilinux.Props;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class PropFactory {
    public static Prop getNewProp(int x, int y, int width, int height){
        return new Prop(new Rectangle(x,y,width,height)) {
        };

    }
}
