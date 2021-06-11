/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scan;

import java.math.BigInteger;

/**
 *
 * @author Комп
 */
public class start {

    public static void main(String[] args) {
        double array[] = new double[]{-0.001, 5, 5, 5, 234545, -456.3, 5, 7.6};
        int z = 0;
        double sum = 0;
        for (int i = 0; array.length > i; i++) {
            int ii = i - 1;
            z = 0;
            while (ii > 2) {
                ii--;
                z = (i % ii) == 0 ? z + 1 : z;

            }
            if ((z < 1) && (i > 1)) {
                sum += array[i];
                System.out.print(">>");
            }
            System.out.println(i);
        }
        System.err.println("sum = " + sum + "  " + z);
        int i = 0;
        while (i < array.length) {
            if (i < array[i]) {
                //System.out.println(array[i]);
            }
            i++;
        }
    }

}
