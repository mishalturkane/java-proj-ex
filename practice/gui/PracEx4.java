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
 class MyFrame4 extends Frame  {
    Button b;
    public MyFrame4(){
        setTitle("Java App");
        setBounds(300,300,400,400);
        setBackground(Color.PINK);
        setVisible(true);
        b =new Button("Quit");
        FlowLayout fr=new FlowLayout();
        setLayout(fr);
        CloseFrame cf=new CloseFrame();
        b.addActionListener(cf);
        add(b);
    }

  class CloseFrame implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           System.exit(0);
        }
      
  }
   
    
}
public class  PracEx4 {
     public static void main(String [] arsg){
      MyFrame4 mf=new MyFrame4();
     }
}

