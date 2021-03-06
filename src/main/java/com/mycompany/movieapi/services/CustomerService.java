/*
*   
*   Author: Max Delaney | 18100368
*   Date 01/12/2020
*
*/
package com.mycompany.movieapi.services;

import com.mycompany.movieapi.models.Customer;
import com.mycompany.movieapi.models.Account;
import com.mycompany.movieapi.databases.Database;
import com.mycompany.movieapi.models.Movie;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    
    Database d = new Database();
    public ArrayList<Customer> customerList = d.getCustomersDB();
    ArrayList<Movie> m=new ArrayList<Movie>();
    
    public Customer createCustomerAccount(Customer c){
        c.setId(customerList.size() + 1);
	customerList.add(c);
	System.out.println("201 - resource created with path: /customers/" + String.valueOf(c.getId()));
        System.out.println("Updated Customer:"+c.printCustomer());
	return c;
    }
    
     public Customer createCustomerMovie(Customer c1){
        c1.setId(customerList.size() + 1);
	customerList.add(c1);
	System.out.println("201 - resource created with path: /customers/" + String.valueOf(c1.getId()));
        System.out.println("Updated Customer:"+c1.printCustomer());
	return c1;
    }
    
    public ArrayList<Customer> getAllCustomers() {
        return customerList;
    }
    
    public Customer getCustomer(int id) {
        return customerList.get(id-1);
    }
    
//    public List<Movie> getMovies(int id) {
//        int p=0;
//        for(int i=0;i<customerList.get(id-1).getCustomerAccounts().get(p).getAccountMovies().size();i++){
//            m.add(customerList.get(id-1).getCustomerAccounts().get(p).getAccountMovies().get(i));
//            if(m.size()==customerList.get(id-1).getCustomerAccounts().get(p).getAccountMovies().size()){
//                i=0;
//                p++;
//            }
//            if(p==customerList.get(id-1).getCustomerAccounts().size()){
//                break;
//            }
//        }
//        return m;
//    }
    
    public ArrayList<Customer> getSearchCustomers(String name, String address) {
        ArrayList<Customer> matcheslist = new ArrayList<>();
        
        for (Customer q: getAllCustomers()) {
            if ((name == null || q.getName().equals(name)) 
                   && (address == null || q.getAddress().equals(address))) {
               matcheslist.add(q);
            }
        }
        return matcheslist;
    }
}
