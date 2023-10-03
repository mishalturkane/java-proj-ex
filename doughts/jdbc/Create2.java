package doughts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Create2 {
    public static void main(String[] args) {
        Connection conn=null;
        try{
            conn= DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected sucsesfully:");


            Scanner kb=new Scanner(System.in);
            System.out.println("Enter the table name");

            String name=kb.next();

            PreparedStatement ps=conn.prepareStatement("create table ? (id number(2))");

            ps.setString(1,name);

            int ans=ps.executeUpdate();

            System.out.println("Row infected:"+ans);

        }catch(SQLException ex){
            System.out.println("Error is "+ex.getMessage());
        }
        finally {
            try{
                if(conn!=null){
                    conn.close();
                    System.out.println("Discunected with DB");
                }
            }catch(SQLException ex){
                System.out.println("Error in Disconecting with DB"+ex.getMessage());
            }
        }
    }
}
