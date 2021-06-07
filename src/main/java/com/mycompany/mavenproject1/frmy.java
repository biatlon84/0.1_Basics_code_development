/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Комп
 */
public class frmy extends JFrame{
    public frmy(String a,int e,int u){
        super(a);
        e=400;
        u=450;
        FlowLayout flow1 = new FlowLayout();
        this.setLayout(flow1);
        //this.
        
    }
    public frmy(String a){
        super(a);
        FlowLayout flow1 = new FlowLayout();
        this.setLayout(flow1);
        this.setSize(100, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton t = new JButton("wew");
        JTextField txt = new JTextField("0");
        JTextField txt2 = new JTextField("0");
        Dimension d =new Dimension(30, 200);
        txt.setSize(d);
        txt2.setSize(d);
        this.add(txt);
        this.add(txt2);
        varMy.mmm=txt;
        varMy.mmm2=txt2;
        t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             int m,o;
             m= (int)Float.parseFloat(varMy.mmm.getText());
             o=(int)Float.parseFloat(varMy.mmm2.getText());
             for(int n=o;n<m;n++){
                int us=2;
                System.out.print(n);
                do{
                    if((n%us)==0){
                    System.out.print("->");
                    System.out.print(us);
                    
                    }
                  us++;
                } 
                while(us<n);
                System.out.print("\n");
                        
             }
            }
        } );
        this.add(t);
        
        
        
        
        
    }
    
    
}
