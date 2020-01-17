package dbconnection;

import java.sql.*;
import java.util.Scanner;

public class ConnectionEx {

   // static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/details";

    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter student Id : ");
        String st_id=scanner.nextLine();

        System.out.println("enter student Name : ");
        String fname=scanner.nextLine();

        System.out.println("enter student Address : ");
        String address=scanner.nextLine();

        System.out.println("enter student age : ");
        Integer st_age=scanner.nextInt();

        System.out.println("enter student Marks : ");
        Integer st_marks=scanner.nextInt();


        try{
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);


            PreparedStatement statement = null;

            System.out.println("Creating statement...");
           String sql1 = "INSERT INTO studentdetail (id,stName,stAddress,age,marks) VALUES (?,?,?,?,?)";
           statement=conn.prepareStatement(sql1);
            //stmt = conn.prepareStatement(sql1);

            // set param values
            statement.setString(1,st_id);
            statement.setString(2,fname);
            statement.setString(3,address);
            statement.setInt(4, st_age);
            statement.setInt(5, st_marks);



            statement.executeUpdate();
        /*    sql1 = "INSERT INTO studentdetail " +
                    "VALUES (3, 'Krush', 'h-321,usmanpura', 25,88)";
            stmt.executeUpdate(sql1);

            sql1 = "INSERT INTO studentdetail " +
                    "VALUES (4, 'Kushal', 'e-9,venus parkland', 23,65)";
            stmt.executeUpdate(sql1);

            String sql = "UPDATE studentdetail " +
                    "SET age = 30 WHERE id = 2";
            stmt.executeUpdate(sql);
*/


       //     String sql;
            sql1 = "SELECT id,stName,stAddress,age,marks FROM studentdetail";
            ResultSet rs = stmt.executeQuery(sql1);


            while(rs.next()){

                int id  = rs.getInt("id");

                String stName = rs.getString("stName");
                String stAddress = rs.getString("stAddress");
                int age = rs.getInt("age");
                long marks=rs.getLong("marks");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", Name: " + stName);
                System.out.println(", Address: " + stAddress);
                System.out.println(", Marks: " + marks);
            }

            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){

            se.printStackTrace();
        }catch(Exception e){

            e.printStackTrace();
        }finally{

            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
