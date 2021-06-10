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
         double x,ss,y,b=0;
         sc ttt=new sc();
         b=ttt.getD("beginning");
         x=ttt.getD("end");
         ss=ttt.getD("step");
         while(b<x){
             b+=ss;
             y=b>2?b:-b;
             System.out.println(y);
         }
       
     }
    
}
