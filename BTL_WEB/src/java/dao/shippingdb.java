/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;

/**
 *
 * @author admin
 */
public class shippingdb extends dao{
    public void insert(String name,String adr,String phone){
        String q = "insert into shipping(name,phone,adr) values(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, adr);
           
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
