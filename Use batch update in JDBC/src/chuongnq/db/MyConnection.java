/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuongnq.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ChươngNguyễnQuốc
 */
public class MyConnection {

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Lab221";
            conn = DriverManager.getConnection(url, "sa", "123456");
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
