package dao;

import static dao.dao.con;
import data.cart;
import data.product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class cartdb extends dao{
    public void insert(String user ,String pro,int quan,String img, float price, float total){
        String query= "insert into cart(user,product,quantity,image,price,total) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pro);
            ps.setInt(3, quan);
            ps.setString(4, img);
            ps.setFloat(5, price);
            ps.setFloat(6, total);
           ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public List<cart> getcartbyid(String name) {
        List<cart> list = new ArrayList<>();
        String q = "select * from cart where user=? ";
        try{
        PreparedStatement ps = con.prepareStatement(q);           
        ps.setString(1, name);
        
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
             list.add(new cart(
                        rs.getInt(1),
                        rs.getString(2),                     
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getFloat(6),
                        rs.getFloat(7)));
        }
        }catch(SQLException e){
           
        }
        return list;
    }
    public List<cart> getcart(){
        List<cart> list = new ArrayList<>();
        String query = "select * from cart";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while(rs.next()){
                list.add(new cart(
                        rs.getInt(1),
                        rs.getString(2),                     
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getFloat(6),
                        rs.getFloat(7)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public void deletebyid(String name) {
       
        String q = "delete from cart where user=? ";
        try{
        PreparedStatement ps = con.prepareStatement(q);           
        ps.setString(1, name);
        ps.executeUpdate();        
        }catch(SQLException e){
           
        }
     
    }
}
