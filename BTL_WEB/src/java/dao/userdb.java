/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import data.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class userdb extends dao{
    public void readdb(String tk,String mk,String email){
        try {
            String sql = "insert into user(user,password,email,isadmin) values(?,?,?,'0')";            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,tk);
            ps.setString(2,mk);
            ps.setString(3, email);
            ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public user checklogin(String tk,String mk) {
        String q = "select * from user where user=? and password=?";
        try{
        PreparedStatement ps = con.prepareStatement(q);           
        ps.setString(1, tk);
        ps.setString(2, mk);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
             return new user(rs.getString(2),rs.getString(3));
        }
        }catch(SQLException e){
            
        }
        return null;
    }
    public user checksignup(String tk) {
        String q = "select * from user where user=? ";
        try{
        PreparedStatement ps = con.prepareStatement(q);           
        ps.setString(1, tk);    
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
             return new user(rs.getString(2),rs.getString(3));
        }
        }
        catch(SQLException e){
            
        }
        return null;
    }
    public boolean checkadmin(String tk){
        String q ="select * from user where user=? and isadmin='1' ";
        try{
        PreparedStatement ps = con.prepareStatement(q);           
        ps.setString(1, tk);    
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
             return true;
        }
        }
        catch(SQLException e){
        }
        
        return false;
    }
    
}
