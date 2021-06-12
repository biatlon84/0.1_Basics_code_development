/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scan;

/**
 *
 * @author Комп
 */
public class outM {
    public static void pri(double[][] a){
      int i = 0;
        while (i < a[1].length) {

            System.out.print(a[1][i]);
            System.out.print(" >> ");
            System.out.print(a[0][i]);
            System.out.println("-");
            i++;
        }  
    }
    
}
