/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kiemtrajava;

import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author Legion 5
 */
public class Jdbculti {

    /**
     * @param args the command line arguments
     */
    public static Connection getConnection() {
        Connection conn=null;
        try{
        String sql="jdbc:sqlserver://localhost:1433;databaseName=FPL_DaoTaoooo;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
        conn=DriverManager.getConnection(sql);
            System.out.println("haha");
                
                
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return conn;
    }
    public static void close(Connection conn) {
        try{
            if(conn!=null){
                conn.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
