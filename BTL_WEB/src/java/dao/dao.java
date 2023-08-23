/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author admin
 */
public class dao {
    public static Connection con;
	
	public dao(){
		if(con == null){
			String dbUrl = "jdbc:mysql://localhost:3307/sys";
			String dbClass = "com.mysql.jdbc.Driver";

			try {
				Class.forName(dbClass);
				con = DriverManager.getConnection (dbUrl, "root", "b19dccn099");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	}
    
