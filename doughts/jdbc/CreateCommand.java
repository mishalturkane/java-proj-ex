package doughts.jdbc;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class CreateCommand {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        try{
           conn=DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected sucsesfully:");
            Statement st=conn.createStatement();
            int ans =st.executeUpdate("create table mylove (love number(10))");

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
