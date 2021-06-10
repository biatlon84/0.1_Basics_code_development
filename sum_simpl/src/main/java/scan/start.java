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
        long arra[] = new long[]{2, 4, 6, 8, 9};
        long x, ss, sum = 0;
        int i = 0;
        ss = 3; //K
        while (arra.length > i) {
            x = arra[i];
            if (x % ss == 0) {
                sum += x;
            }
            i++;
        }

        System.out.println(sum);
    }

}


