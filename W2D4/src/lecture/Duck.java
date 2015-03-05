/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture;

/**
 *
 * @author mzijlstra
 */
public class Duck extends Animal {

    private int size;
    private double weight;
    private double airspeed;

    public Duck() {
        this("Donald", 34);
    }
    
    public Duck(String name, int size) {
        this(name, size, 7);
    }
    
    public Duck(String name, int size, double weight) {
        this(name, size, weight, 22);
    }
    
    public Duck(String name, int size, double weight, double airspeed) {
        super(name);
        this.size = size;
        this.weight = weight;
        this.airspeed = airspeed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
}
