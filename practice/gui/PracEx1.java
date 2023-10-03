package practice.gui;

import java.awt.*;
import java.util.*;
public class PracEx1  extends Frame{
   PracEx1(String s){
       Date today=new Date();
       setTitle(today+"");
       setBackground(Color.gray);
       setBounds(800,400,400,400);
       Button bt=new Button("Login");
       FlowLayout fl=new FlowLayout();
       setLayout(fl);
       add(bt);
       setVisible(true);
   }

}
class MyFrame {

    public static void main(String[] args) {
       PracEx1 pr=new PracEx1("Mishal;s fram");
       Button bt1=new Button("Login main ka");
       FlowLayout fl1=new FlowLayout();
       pr.setLayout(fl1);
       pr.add(bt1);
    }

}
