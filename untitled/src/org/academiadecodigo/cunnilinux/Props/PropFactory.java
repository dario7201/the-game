package org.academiadecodigo.cunnilinux.Props;


public class PropFactory {
    public static Props getNewProp(int number) {
        switch (number) {
            case 1:
        return new Chest();
            case 2:
                return new Sword();
        }return null;
    }
}
