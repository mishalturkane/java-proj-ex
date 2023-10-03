/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.gui;

import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author misha
 */
 class MyFrame2 extends Frame {
    public MyFrame2(){
        setTitle("Java App");
        setBounds(300,300,400,400);
        setBackground(Color.PINK);
        setVisible(true);
    }
}
public class  PracEx2 {
     public static void main(String [] arsg){
      MyFrame2 mf=new MyFrame2();
     }
}

