/*
 
 */
package scan;

import java.util.Scanner;

/**
 *
 * @author Комп
 */
public class sc {

    Scanner sc;
    double[][] Freq;

    public double getD(String st) {
        //double doub = 0;
        System.out.print("plese type value of " + st + "\n>>");
        sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {

            System.out.print("\"" + sc.next() + "\" is not " + st + "\n");
            System.out.print(">>");
        }
        return sc.nextDouble();
    }

    public double[][] getFreq(double arra[]) {
        int i = 0, ii = 0;
        double array[][] = {arra, {6.001, 5, 5, 5, 234545, 456.3, 5, 7.6, 7, 7, 7, 7}};
        while (i < (array[0].length)) {
            ii = i;
            
            while (ii < array[1].length) {
                array[1][ii] = 0;  //initialisation with zeros 
                ii++;
               // 
            }
            
            ii = i;
            //looking for 'how frequent'\/
            while (ii < (array[1].length)) {
                if ((ii != i) && (array[0][ii] == array[0][i])) {

                    array[1][i] = array[1][i] + 1;
                }
                
                ii++;
            }
            //System.out.println(array[1][i]);
            i++;
            
        }
        this.Freq=array;
        
       // outM.pri(array);
        return array;
    }

}
