/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;



import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import kiemtrajava.Jdbculti;
import model.Login;

/**
 *
 * @author Legion 5
 */
public class LoginService {
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String sql=null;
    
    public  ArrayList<Login>getall(){
        ArrayList<Login>list=new ArrayList<>();
        try{
            sql="SELECT*FROM USERS";
            conn=Jdbculti.getConnection();
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                String tk=rs.getString(1);
                String pass=rs.getString(2);
                boolean role=rs.getBoolean(3);
                Login l=new Login(tk, pass, role);
                list.add(l);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public  boolean checklogin(String tk,String pass){
        ArrayList<Login>list=this.getall();
        for(Login l:list){
            if(l.getTk().equals(tk)&&l.getPass().equals(pass)){
                if(l.isRole()==true){
                    
                    return true;
                }else{
                    
                    return true;
                }
            }
        }
        return  false;
    }
   
}
