/*
*   
*   Author: Max Delaney | 18100368
*   Date 01/12/2020
*
*/
package com.mycompany.movieapi.databases;

import com.mycompany.movieapi.models.Account;
import com.mycompany.movieapi.models.Movie;
import com.mycompany.movieapi.models.Customer;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static ArrayList<Customer> customerDB = new ArrayList<>();
    public static ArrayList<Account> accountDB = new ArrayList<>();
    public static ArrayList<Account> accountDB1 = new ArrayList<>();
    public static ArrayList<Account> accountDB2 = new ArrayList<>();
    public static ArrayList<Account> accountDB3 = new ArrayList<>();
    public static ArrayList<Movie> movieDB = new ArrayList<>();
    public static boolean init = true;
    
    public Database(){
        if(init) {
            Movie m1= new Movie("tod","shit",true,false);
            Movie m2= new Movie("tod 2"," worse shit",true,false);
            Movie m3= new Movie("tod 3","worser shit",true,false);
            Movie m4= new Movie("tod 4","why are these still being made",false,false);
            Movie m5= new Movie("fuck the police","shit",true,false);
            Movie m6= new Movie("tod 6","supprisingly good",true,true);
            movieDB.add(m1);
            movieDB.add(m2);
            movieDB.add(m3);
            movieDB.add(m4);
            movieDB.add(m5);
            movieDB.add(m6);
            Account acc1 = new Account(1, "JackF005", "Jackie123",movieDB);
            Account acc2 = new Account(2, "Alfie", "Alfie123");
            Account acc3 = new Account(3, "Xav", "Xav555");
            Account acc4 = new Account(4, "Amy", "Amy123");
            Account acc5 = new Account(5, "Larry", "Larry4569");
            Account acc6 = new Account(6, "Liff", "Liff051");
            
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
            
            Customer cus1 = new Customer(1, "Jack Furgerson", "2 Bonville Drive", "Jack015@gmail.com", accountDB1);
            Customer cus2 = new Customer(2, "Kelly Smith", "44 Bonville Drive", "Kelly55@gmail.com", accountDB2);
            Customer cus3 = new Customer(3, "Daryl Nixon", "35 Carrik Ave", "DarylNixon5595@outlook.co.uk", accountDB3);
            
            //Customer cus1 = new Customer(1, "Jack Furgerson", "2 Bonville Drive", "Jack015@gmail.com", accountDB1);
            //Customer cus2 = new Customer(2, "Kelly Smith", "44 Bonville Drive", "Kelly55@gmail.com", accountDB2);
            //Customer cus3 = new Customer(3, "Daryl Nixon", "35 Carrik Ave", "DarylNixon5595@outlook.co.uk", accountDB3);
            
            customerDB.add(cus1);
            customerDB.add(cus2);
            customerDB.add(cus3);
            
            init = false;
        }
    }
    public ArrayList<Movie> geMoviesDB(){
        return movieDB;
    }
    
    public ArrayList<Customer> getCustomersDB(){
        return customerDB;
    }
    
    public ArrayList<Account> getAccountDB(){
        return accountDB;
    }
}