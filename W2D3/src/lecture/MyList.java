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

// This class uses generics inside it's <>  --> it means a Type will be given
public class MyList<T> {
    private int currentSize = 5;
    private Object[] objects = new Object[currentSize];
    private int pos = 0;
    
    public boolean add(T s) {
        if (pos < currentSize) {
            objects[pos] = s;
            pos = pos + 1;
            return true;
        } else {
            return false;
        }
    }
    
    public T get(int i) {
        if (i <= pos) {
            return (T) objects[i];
        } else {
            return null;
        }
    }
    
    public int getSize() {
        return pos;
    }
}
