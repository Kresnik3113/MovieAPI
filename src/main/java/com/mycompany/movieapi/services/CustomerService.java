/*
*   
*   Author: Max Delaney | 18100368
*   Date 01/12/2020
*
*/
package com.mycompany.movieapi.services;

import com.mycompany.movieapi.models.Customer;
import com.mycompany.movieapi.models.Account;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maxde
 */
public class CustomerService {
    public static ArrayList<Customer> customerList = new ArrayList<>();
    public static ArrayList<Account> customerAccountList1 = new ArrayList<>();
    public static ArrayList<Account> customerAccountList2 = new ArrayList<>();
    public static ArrayList<Account> customerAccountList3 = new ArrayList<>();
    public static boolean init = true;
    
    public CustomerService(){
        if(init) {
            System.out.print("HELLO THERE");
            Account acc1 = new Account(1, "JackF005", "Jackie123");
            Account acc2 = new Account(2, "Alfie", "Alfie123");
            Account acc3 = new Account(3, "Xav", "Xav555");
            Account acc4 = new Account(4, "Amy", "Amy123");
            Account acc5 = new Account(5, "Larry", "Larry4569");
            Account acc6 = new Account(6, "JackF005", "Jackie123");
            
            customerAccountList1.add(acc1);
            customerAccountList1.add(acc2);
            customerAccountList2.add(acc3);
            customerAccountList2.add(acc4);
            customerAccountList2.add(acc5);
            customerAccountList3.add(acc6);
            
            Customer cus1 = new Customer(1, "Jack Furgerson", "2 Bonville Drive", "Jack015@gmail.com", customerAccountList1);
            Customer cus2 = new Customer(2, "Kelly Smith", "44 Bonville Drive", "Kelly55@gmail.com", customerAccountList2);
            
            customerList.add(cus1);
            customerList.add(cus2);
            
            init = false;
        }
    }
    
    public Customer createCustomerAccount(Customer c){
        c.setId(customerList.size() + 1);
	customerList.add(c);
	System.out.println("201 - resource created with path: /messages/" + String.valueOf(c.getId()));
        System.out.println("Updated Message:"+c.printCustomer());
	return c;
    }
    
    public ArrayList<Customer> getAllCustomers() {
        return customerList;
    }
    
    public Customer getCustomer(int id) {
        return customerList.get(id-1);
    }
    
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