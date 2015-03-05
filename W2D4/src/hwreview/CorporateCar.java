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
public class CorporateCar extends Vehicle implements Asset {

    public int purchasePrice;
    public int currentValue;
    private int yearPurchased;
    private String employee;

    public void accelerate() {
        if (speed <= 60) {
            this.speed += 5;
        }
    }

    public void brake() {
        if (speed >= 5) {
            this.speed -= 5;
        }
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    @Override
    public int amoritize(int years) {

        int yearsSincePurchased = 2015 - yearPurchased;

        int amountRemaning = purchasePrice - (purchasePrice / years) * yearsSincePurchased;

        if (currentValue >= amountRemaning) {
            return purchasePrice / years;
        } else {
            return (purchasePrice / years) + (amountRemaning - currentValue);
        }

    }

//    public String toString() {
//        return "my fancy car: " + super.toString();
//    }
    @Override
    public String toString() {
        return "CorporateCar{" + "purchasePrice=" + purchasePrice + ", currentValue=" + currentValue + ", yearPurchased=" + yearPurchased + ", employee=" + employee + '}' + super.toString(); 
    }
    
    
}
