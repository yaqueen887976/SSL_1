package com.yaqin.OOP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConnection implements DatabaseConnection {
    @Override
    public void getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/database1","root","root");

            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from Employee");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

}


