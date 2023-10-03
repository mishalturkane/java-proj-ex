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
import oracle.net.aso.f;

/**
 *
 * @author misha
 */
 class MyFrame3 extends Frame {
   
    public MyFrame3(){
        setTitle("Java App");
        setBounds(300,300,400,400);
        setBackground(Color.PINK);
        setVisible(true);
        Button b=new Button("Quit");
        FlowLayout fr=new FlowLayout();
        setLayout(fr);
       // add(b);
    }
}
public class  PracEx3 {
     public static void main(String [] arsg){
      MyFrame3 mf=new MyFrame3();
     }
}

