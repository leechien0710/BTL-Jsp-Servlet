/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import data.product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class productdb extends dao{
    public List<product> getallproduct(){
        List<product> list = new ArrayList<>();
        String query = "select * from products ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while(rs.next()){
                list.add(new product(
                        rs.getInt(1),
                        rs.getString(2),                        
                        rs.getString(4),
                        rs.getFloat(3),
                        rs.getString(5)
                       
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<product> getproduct(){
        List<product> list = new ArrayList<>();
        String query = "select * from products where isshow= 1";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while(rs.next()){
                list.add(new product(
                        rs.getInt(1),
                        rs.getString(2),                        
                        rs.getString(4),
                        rs.getFloat(3),
                        rs.getString(5)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
   public product getproductbyname(String tk) {
        String q = "select * from products where name=? ";
        try{
        PreparedStatement ps = con.prepareStatement(q);           
        ps.setString(1, tk);
      
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
             return  new product(
                        rs.getInt(1),
                        rs.getString(2),                        
                        rs.getString(4),
                        rs.getFloat(3),
                        rs.getString(5));
        }
        }catch(SQLException e){
           
        }
        return null;
    }
    public void insert(String name,String image,String price,String desc,String isshow){
        String query= "insert into products(name,price,image,description,isshow) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, price);
            ps.setString(3, image);
            ps.setString(4, desc);
            ps.setString(5, isshow);
           ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void update(int id,String name,String image,String price,String desc,String isshow){
        String query= "update products set name = ?, price = ?, image = ?, description = ?, isshow=? where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, price);
            ps.setString(3, image);
            ps.setString(4, desc);
            ps.setString(5, isshow);
            ps.setInt(6, id);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }
    public void delete(String id){
        String query= "delete from products where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }
    public List<product> searchproductbyname(String name) {
        List<product> list = new ArrayList<>();
        String q = "select * from products where name like ? and isshow='1'";
        try{
        PreparedStatement ps = con.prepareStatement(q);           
        ps.setString(1, "%"+name+"%");
      
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
             list.add(new product(
                        rs.getInt(1),
                        rs.getString(2),                        
                        rs.getString(4),
                        rs.getFloat(3),
                        rs.getString(5)));
        }
        }catch(SQLException e){
           
        }
        return list;
    }
    public List<product> searchproductbyprice(float price1, float price2) {
        List<product> list = new ArrayList<>();
        String q = "select * from products where price > ? and price < ? and isshow='1'";
        try{
        PreparedStatement ps = con.prepareStatement(q);           
        ps.setFloat(1, price1);
        ps.setFloat(2, price2);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
             list.add(new product(
                        rs.getInt(1),
                        rs.getString(2),                        
                        rs.getString(4),
                        rs.getFloat(3),
                        rs.getString(5)));
        }
        }catch(SQLException e){
           
        }
        return list;
    }
    
}
