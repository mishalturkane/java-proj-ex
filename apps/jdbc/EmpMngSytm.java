package apps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class EmpMngSytm extends Methods{



    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        Connection conn=null;
         try{
             conn= DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
             System.out.println("Connected sucsesfully:");
             System.out.println("Select the operation:");
             System.out.println(" 1.Create  \n 2.Drop  \n 3.Alter  \n 4.Truncate \n 5.Insert  \n 6.Update \n 7.Delete \n 8.Select");
             int choice=kb.nextInt();
             switch(choice){
                 case 1:
                     EmpMngSytm.create_tabel();
                     break;
                 case 2:
                     EmpMngSytm.drop_tabel();
                     break;
                 case 3:
                     EmpMngSytm.alter_tabel();
                     break;
                 case 4:
                     EmpMngSytm.truncate_tabel();
                     break;
                 case 5:
                     EmpMngSytm.insert_tabel();
                     break;
                 case 6:
                     EmpMngSytm.update_tabel();
                     break;
                 case 7:
                     EmpMngSytm.delete_tabel();
                     break;
                 case 8:
                     EmpMngSytm.select_tabel();
                     break;
                 default:
                     System.out.println("Please select the given options");
             }

         }catch(ArithmeticException ex){
             System.out.println("Error in:"+ex.getMessage());
         } catch (SQLException e) {
             System.out.println("Exeption is;"+e.getMessage());
         } finally {
             try{
                 if(conn!=null){
                     conn.close();
                     System.out.println("Error in conecting with DB");
                 }

             }catch ( SQLException ex){
                 System.out.println("Disconected with DB");
             }
         }
    }
}
