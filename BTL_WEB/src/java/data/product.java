/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class product implements Serializable{
    private int id;
    private String name;
    private String image;
    private float price;
    private String Des;
    public product() {
    }

    public product(int id, String name, String image, float price, String Des) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.Des = Des;
    }

    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String Des) {
        this.Des = Des;
    }
  

    
    
}
