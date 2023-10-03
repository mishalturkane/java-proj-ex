package doughts.jdbc;

import java.sql.*;

public class InsertCommand {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        try{
           conn=DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected sucsesfully:");
            PreparedStatement ps=null;




               int number=7;

                ps=conn.prepareStatement("insert into mylove values(?)");

               ps.setInt(1,number);

               int ans= ps.executeUpdate();





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
