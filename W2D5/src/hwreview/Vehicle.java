/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwreview;

public abstract class Vehicle {

    private int x;
    private int y;
    protected int speed;
    private int direction;
    
    public Vehicle(int x, int y, int direction) {
        super();
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.speed = 0;
    }
    
    public Vehicle(int x, int y) {
        this(x, y, 0);
    }
    
    public Vehicle() {
        this(0,0,0);
    }

    @Override
    public String toString() {
        return "Vehicle{" + "x=" + x + ", y=" + y + ", speed=" + speed + ", direction=" + direction + '}';
    }

    public final int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void move(int seconds) {
        double distance = speed * seconds;
        double dx = Math.cos(Math.toRadians(direction)) * distance;
        double dy = Math.sin(Math.toRadians(direction)) * distance;
        x += dx;
        y += dy;
    }

    public void turn(int amount) {
        this.direction += amount;
        //this.direction = this.direction % 360;
        
        this.direction = this.direction > 360 ? this.direction -= 360 : this.direction;
        
        if (this.direction > 360) {
            this.direction = this.direction - 360;
        } else {
            this.direction = this.direction;
        }
    }

    public abstract void accelerate();

    public abstract void brake();

    
}
