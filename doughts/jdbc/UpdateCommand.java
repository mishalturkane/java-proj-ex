package doughts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateCommand {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        try{
           conn=DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected sucsesfully:");
            PreparedStatement ps=null;

            Scanner kb=new Scanner(System.in);
            System.out.println("Enter the id ");
            int id=kb.nextInt();

            System.out.println("Enter job profile:");
            kb.nextLine();
            String job=kb.nextLine();

                ps=conn.prepareStatement("update employee set job=? where id=?");
             ps.setString(1,job);
             ps.setInt(2,id);


               int ans= ps.executeUpdate();
            System.out.println("Row affected:"+ans);
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
