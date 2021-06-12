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
public class start {

    public static void main(String[] args) {

        double[][] array32 = {{7, 6.001, 5, 5, 5, 7, 7, 7, 234545, 456.3, 5, 7.6},
        {6.001, 5, 5, 5, 234545, 456.3, 5, 7.6, 7, 7, 7, 7}};
        //int i = 0;
        double lk=0;
        sc cl =new sc();
        sort alll=new sort();
                
        lk=alll.sor(cl.getFreq(array32[0]));
        
        outM.pri(cl.Freq);
        
        System.out.println(lk);
    }

}
