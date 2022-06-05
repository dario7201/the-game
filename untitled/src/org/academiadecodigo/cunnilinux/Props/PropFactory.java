package org.academiadecodigo.cunnilinux.Props;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class PropFactory {
    public static Rectangle getNewProp(int padding, int padding2, int width, int height){
        return new Rectangle(padding,padding2,width,height);

    }
}
