/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author misha
 */
 class MyAssig extends Frame implements ActionListener {
    Button b1,b2,b3;
    int t;
    public MyAssig(){
        setTitle("0");
        setBounds(300,300,400,400);
        setBackground(Color.GRAY);
        setVisible(true);
        b1 =new Button("Increase");
        b2 =new Button("Decrease");
        b3=new Button("Quit");
        FlowLayout fr=new FlowLayout();
        setLayout(fr);
    
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
         if(e.getSource()==b1){
             t++;
             setTitle(""+t);  
         }
         else if(e.getSource()==b2){
             t--;
             setTitle(""+(t));
         }
         else 
             System.exit(0);
    }

   
    
}
public class  Assig{
     public static void main(String [] arsg){
         MyAssig ma=new MyAssig();
     }
}

