package practice.jdbc;

import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;

public class Jdbc1 extends Frame {
    public static void main(String[] args) {
        Connection conn=null;
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("connection connect succesfully");
            Statement st= conn.createStatement();
            ResultSet rs=st.executeQuery("Select * from books");


            while(rs.next()){

               String name=rs.getString(2);
                Jdbc1 jd=new Jdbc1();
                jd.setTitle(name);
                jd.setBackground(Color.CYAN);
                jd.setBounds(300,300,400,400);
                jd.setVisible(true);
            }


            conn.close();
            System.out.println("Disconnected with the DB");
        }catch(SQLException ex){
            System.out.println("Error is:"+ex.getMessage());
        }

    }
}
