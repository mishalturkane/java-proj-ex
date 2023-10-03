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
 class MyFrame5 extends Frame implements ActionListener {
    Button b1,b2;
    public MyFrame5(){
        setTitle("Java App");
        setBounds(300,300,500,500);
        setBackground(Color.PINK);
        setVisible(true);
        b1 =new Button("Quit");
        b2 =new Button("Change Color");
        FlowLayout fr=new FlowLayout();
        setLayout(fr);
    
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
         if(e.getSource()==b1){
             System.exit(0);
         }
         else
             setBackground(Color.red);
    }

   
    
}
public class  PracEx5 {
     public static void main(String [] arsg){
      MyFrame5 mf=new MyFrame5();
     }
}

