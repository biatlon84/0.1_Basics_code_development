/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scan;

import java.util.Scanner;

/**
 *
 * @author Комп
 */
public class sc {

    Scanner sc;

    public double getD() {
        double doub = 0;
        System.out.print("plese type value like 4,2\n>>");
        sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            
            System.out.print("\""+sc.next()+"\" is not int\n");
            System.out.print(">>");
        }
        return sc.nextDouble();
    }

}
