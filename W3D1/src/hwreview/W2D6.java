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
public class W2D6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("Dec Hx Oct Char | Dec Hx Oct Char | Dec Hx Oct Char\n");
        String row = "%3d %<2h %<3o %<4c";
        for (int i = 32; i <= 64; i++) {
            System.out.printf(row + " | " + row + " | " + row + "\n", 
                    i, i + 32, i + 64);
        }
    }
    
}
