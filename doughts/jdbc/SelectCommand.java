package doughts.jdbc;

import java.sql.*;

public class SelectCommand {
    public static void main(String[] args) throws SQLException {
        Connection conn=null;
        try{
           conn=DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected sucsesfully:");
            Statement st=conn.createStatement();

            ResultSet rs=st.executeQuery("select * from mylove");
                                        int count=0;
            while(rs.next()){
                String name=rs.getString(1);
                System.out.println(name);
                count++;
            }
            System.out.println(count);


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
