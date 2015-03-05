/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwreview;

import java.util.ArrayList;

/**
 *
 * @author mzijlstra
 */
public class VehicleTestDriver {

    public static void main(String args[]) {

        ArrayList<Asset> assets = new ArrayList<Asset>();
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        ArrayList<Object> objects = new ArrayList<Object>();

        CorporateCar car = new CorporateCar();

        car.move(3);

        assets.add(car);
        vehicles.add(car);
        objects.add(car);

        for (Vehicle v : vehicles) {
            System.out.println(v.getSpeed());
            v.accelerate();
            System.out.println(v.getSpeed());
            v.brake();
            System.out.println(v.getSpeed());
        }
        for (Asset a : assets) {

            System.out.println(a.getPurchasePrice());

        }
        for (Object o : objects) {
            System.out.println(o.toString());
        }
        
        car.accelerate();
        car.setDirection(45);
        car.move(1);
        System.out.println(car.getX() + " " + car.getY());
        System.out.println(car);
    }

}
