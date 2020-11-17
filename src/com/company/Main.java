package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("testtestt02222000est");
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://34.83.219.17:3306/connect","root","root");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            //sql = "INSERT INTO `testtables` VALUES (1000, 'lool', 'lool', 'FT-EXPRESS', '9015 Shaughnessy St', 'VANCOUVER', 'BC', 'CANADA', 49.2032212, -123.1280547, '9:00-12:00,13:30-17:45,18:00-21:00', 'NORMAL');";
            //stmt.executeUpdate(sql);

            ResultSet rs=stmt.executeQuery("select * from testtable");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }



}
