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
         double x,ss;
         long b=0L;
         String be="1";
         //BigInteger sum = new BigInteger("0")
         sc ttt=new sc();
         //b=(long)ttt.getD("beginning");
         b=1;
         x=ttt.getD("end");
         //ss=ttt.getD("step");
         ss=1;
         while(b<x){
             long s;
             b+=ss;
             s=b*b;
             BigInteger sq=new BigInteger(String.valueOf(s));
             BigInteger mul = sq.multiply(new BigInteger(be) );
             be = mul.toString();
             System.out.println(mul.toString());
         }
       
     }
    
}
