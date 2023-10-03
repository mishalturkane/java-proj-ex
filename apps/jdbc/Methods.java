package apps.jdbc;

import java.sql.*;
import java.util.Scanner;

public class Methods {
    public static void create_tabel(){
        Connection conn=null;
        try{
            conn= DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected sucsesfully:");


            Scanner kb=new Scanner(System.in);
            System.out.println("Enter the table name");
            String name=kb.next();

            PreparedStatement ps=conn.prepareStatement("create table ? (m_id number(3),m_name varchar2(20) )");

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
    public static void drop_tabel(){

    }
    public static void alter_tabel(){

    }
    public static void truncate_tabel(){

    }
    public static void insert_tabel(){

    }
    public static void update_tabel(){

    }
    public static void delete_tabel(){

    }
    public static void select_tabel(){

    }
}
