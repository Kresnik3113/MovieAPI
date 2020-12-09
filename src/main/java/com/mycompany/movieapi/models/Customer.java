/*
*   
*   Author: Max Delaney | 18100368
*   Date 01/12/2020
*
*/
package com.mycompany.movieapi.models;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maxde
 */
@XmlRootElement
public class Customer {
    private String name;
    private String address;
    private String email;
    private int id;
    private ArrayList<Account> customerAccounts = new ArrayList();
    
    
    public Customer(){}
    
    public Customer(int id, String name, String address, String email, ArrayList<Account> customerAccounts){
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.customerAccounts = customerAccounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Account> getCustomerAccounts() {
        return customerAccounts;
    }

    public void setCustomerAccounts(ArrayList<Account> customerAccounts) {
        this.customerAccounts = customerAccounts;
    }
    

    
    public void addAccountToCustomer(Account account) {
        (this.customerAccounts).add(account);
        System.out.println("Added a new account to customer");
    }
    

    public void transferMovie(int idAdd,int idRemove,Movie movie){
       
    }
    
    
    public String printCustomer() {
        String str = this.getId()+" "+this.getName()+ " "+this.getAddress()+ " "+this.getEmail();
        return str;
    }
}
