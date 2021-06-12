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
public class sort {

    public double sor(double array2[][]) {

        boolean a = true;
        double st, fin = 0x7fffffff, st1;

        while (a) { //sorting for max
            a = false;
            int o = 1;
            while (o < array2[1].length) {
                if (array2[1][o] > array2[1][o - 1]) {
                    st = array2[1][o];
                    st1 = array2[0][o];
                    array2[1][o] = array2[1][o - 1];
                    array2[0][o] = array2[0][o - 1];
                    array2[1][o - 1] = st;
                    array2[0][o - 1] = st1;
                    a = true;

                }
                o++;
            }
            //looking for min
            o = 0;
            while (o < array2[1].length) {
                if (array2[1][o] == array2[1][0]) {
                    fin = array2[0][o] < fin ? array2[0][o] : fin;
                }
                o++;
            }
        }
        return fin;
    }
    
        
    

}
