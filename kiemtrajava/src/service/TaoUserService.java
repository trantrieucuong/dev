/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.util.ArrayList;
import kiemtrajava.Jdbculti;
import model.TaoUser;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Login;
        

/**
 *
 * @author Legion 5
 */
public class TaoUserService implements TaoUserImterface{
    PreparedStatement ps = null;
   

    @Override
    public boolean add(TaoUser s) {
        Connection conn=Jdbculti.getConnection();
        String sql="INSERT INTO USERS (username,password,role,Email)VALUES(?,?,?,?)";
        try{
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, s.getUser());
            ps.setString(2, s.getPass());
            ps.setInt(3, s.getRole());
            ps.setString(4, s.getEmail());
            ps.executeUpdate();
            return  true;
        }catch(SQLException e){
            if (e.getSQLState().equals("23000")) {
                System.out.println("User already exists.");
            } else {
                e.printStackTrace();
            }
        }
        return false;
    }

    
      public static boolean isValidEmail(String email) {
        // Định dạng regex cho địa chỉ email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
      public  boolean  checkUser(String user){
          ArrayList<TaoUser>list=new ArrayList<>();
          for(TaoUser u:list){
              if(u.getUser().equalsIgnoreCase(user)){
                  System.out.println("user da ton tai");
                  return false;
              }
              add(u);
              return true;
          }
          return false;
      }

    
}
   

