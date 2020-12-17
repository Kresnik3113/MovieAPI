/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movieapi.services;
import com.mycompany.movieapi.databases.Database;
import com.mycompany.movieapi.models.Account;
import com.mycompany.movieapi.models.Customer;
import com.mycompany.movieapi.models.Movie;
import java.util.List;

/**
 *
 * @author maxde
 */

public class AccountService {
    private List<Customer> customerlist = new Database().getCustomersDB();
    private List<Account> accountlist = new Database().getAccountDB(); 
    
    public List<Account> getAllAccountsByCustomer(int CustomerID) {
        return customerlist.get(CustomerID-1).getCustomerAccounts();
    }
    
    public Account getAccountByID(int CustomerID, int AccountID) {
        return customerlist.get(CustomerID-1).getCustomerAccounts().get(AccountID-1);
    }

    public List<Account> getAllAccounts() {
        return accountlist;
    }
    
    public Account createAccount(Account a, int c_id){
    
        
        Customer cus = customerlist.get(c_id-1);
        a.setId(cus.getCustomerAccounts().size() + 1);
	cus.addAccountToCustomer(a);
        
        
	System.out.println("201 - resource created with path: /customers/" + String.valueOf(cus.getId())+"/accounts/"+String.valueOf(a.getId()));
        System.out.println("Updated Customer:"+a.printAccount());
	return a;
    }

}
