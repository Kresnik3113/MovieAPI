/*
*   
*   Author: Max Delaney | 18100368
*   Date 01/12/2020
*
*/
package com.mycompany.movieapi.databases;

import com.mycompany.movieapi.models.Account;
import com.mycompany.movieapi.models.Customer;
import com.mycompany.movieapi.models.Movie;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private static ArrayList<Customer> customerDB = new ArrayList<>();
    private static ArrayList<Account> accountDB = new ArrayList<>();
    private static ArrayList<Account> accountDB1 = new ArrayList<>();
    private static ArrayList<Account> accountDB2 = new ArrayList<>();
    private static ArrayList<Account> accountDB3 = new ArrayList<>();
    private static ArrayList<Movie> movieDB = new ArrayList<>();
    private static ArrayList<Movie> movieDB1 = new ArrayList<>();
    private static ArrayList<Movie> movieDB2 = new ArrayList<>();
    private static boolean init = true;
    
    public Database(){
        if(init) {
            
            Movie m1 = new Movie (1,"The Dark Knight","Check the summery section",Boolean.TRUE,Boolean.TRUE);  
            Movie m2 = new Movie (2,"Inception","Check the summery section",Boolean.TRUE,Boolean.TRUE);
            Movie m3 = new Movie (3,"Fight Club","Check the summery section",Boolean.FALSE,Boolean.FALSE);
            Movie m4 = new Movie (1,"Ted1","Check the summery section",Boolean.FALSE,Boolean.FALSE);
            Movie m5 = new Movie (2,"Ted2","Check the summery section",Boolean.FALSE,Boolean.FALSE);
            Movie m6 = new Movie (3,"Ted3","Check the summery section",Boolean.FALSE,Boolean.FALSE);
            Movie m7 = new Movie (1,"Bob","Check the summery section",Boolean.FALSE,Boolean.FALSE);
            Movie m8 = new Movie (2,"Bob2","Check the summery section",Boolean.FALSE,Boolean.FALSE);
            Movie m9 = new Movie (3,"Bob3","Check the summery section",Boolean.FALSE,Boolean.FALSE);

            movieDB.add(m1);
            movieDB.add(m2);
            movieDB.add(m3);
            movieDB1.add(m4);
            movieDB1.add(m5);
            movieDB1.add(m6);
            movieDB2.add(m7);
            movieDB2.add(m8);
            movieDB2.add(m9);
            
            Account acc1 = new Account(1, "JackF005", "Jackie123",movieDB);
            Account acc2 = new Account(2, "Alfie", "Alfie123",movieDB1);
            Account acc3 = new Account(3, "Xav", "Xav555",movieDB2);
            Account acc4 = new Account(4, "Amy", "Amy123",movieDB);
            Account acc5 = new Account(5, "Larry", "Larry4569",movieDB);
            Account acc6 = new Account(6, "Liff", "Liff051",movieDB);
            
            accountDB.add(acc1);
            accountDB.add(acc2);
            accountDB.add(acc3);
            accountDB.add(acc4);
            accountDB.add(acc5);
            accountDB.add(acc6);
            
            accountDB1.add(acc1);
            accountDB1.add(acc2);
            accountDB2.add(acc3);
            accountDB2.add(acc4);
            accountDB3.add(acc5);
            accountDB3.add(acc6);
            

            
            Customer cus1 = new Customer(1, "Jack Furgerson", "2 Bonville Drive", "Jack015@gmail.com", accountDB);
            Customer cus2 = new Customer(2, "Kelly Smith", "44 Bonville Drive", "Kelly55@gmail.com", accountDB);
            Customer cus3 = new Customer(3, "Daryl Nixon", "35 Carrik Ave", "DarylNixon5595@outlook.co.uk", accountDB);
            
            //Customer cus1 = new Customer(1, "Jack Furgerson", "2 Bonville Drive", "Jack015@gmail.com", accountDB1);
            //Customer cus2 = new Customer(2, "Kelly Smith", "44 Bonville Drive", "Kelly55@gmail.com", accountDB2);
            //Customer cus3 = new Customer(3, "Daryl Nixon", "35 Carrik Ave", "DarylNixon5595@outlook.co.uk", accountDB3);
            
            customerDB.add(cus1);
            customerDB.add(cus2);
            customerDB.add(cus3);
            
            init = false;
        }
    }
    
    public ArrayList<Customer> getCustomersDB(){
        return customerDB;
    }
    
    public ArrayList<Account> getAccountDB(){
        return accountDB;
    }
    public ArrayList<Movie> getMovieDB(){
        return movieDB;
    }
    
}
