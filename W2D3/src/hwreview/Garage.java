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
public class Garage {
    private Automobile a;
    private ArrayList<Item> items = new ArrayList<>();
    
    public void store(Automobile a) {
        this.a = a;
    }
    
    public Automobile retrieve() {
        return a;
    }
    
    public void store(Item item) {
        items.add(item);
    }
    
    public Item retrieve(int i) {
        return items.get(i);
    }
    
    public int getItemCount() {
        return items.size();
    }
}
