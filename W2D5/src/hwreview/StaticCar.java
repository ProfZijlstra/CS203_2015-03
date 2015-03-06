/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwreview;

/**
 *
 * @author mzijlstra
 */
public class StaticCar {

    private int x;
    private int y;

    public StaticCar(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static int getX(StaticCar This) {
        return This.x;
    }

    public static void setX(StaticCar This, int x) {
        This.x = x;
    }

    public static int getY(StaticCar This) {
        return This.y;
    }

    public static void setY(StaticCar This, int y) {
        This.y = y;
    }

    public static void moveUp(StaticCar This) {
        This.y += 1;
    }

    public static void moveDown(StaticCar This) {
        This.y -= 1;
    }

    public static void moveLeft(StaticCar This) {
        This.x += 1;
    }

    public static void moveRight(StaticCar This) {
        This.x -= 1;
    }

}
