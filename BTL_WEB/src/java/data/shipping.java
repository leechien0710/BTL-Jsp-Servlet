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
public class shipping implements Serializable{
    private int id;
    private String phone,adr,bank;
    private cart c;
    public shipping() {
    }

    public shipping(int id, String phone, String adr, String bank, cart c) {
        this.id = id;
        this.phone = phone;
        this.adr = adr;
        this.bank = bank;
        this.c = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public cart getC() {
        return c;
    }

    public void setC(cart c) {
        this.c = c;
    }
    
    
    
            
}
