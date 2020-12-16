
package com.mycompany.movieapi.services;
import com.mycompany.movieapi.databases.Database;
import com.mycompany.movieapi.models.Account;
import com.mycompany.movieapi.models.Customer;
import com.mycompany.movieapi.models.Movie;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bellal
 */
public class MovieService {
    private List<Customer> customerlist = new Database().getCustomersDB();
    private List<Movie> movielist = new Database().getMovieDB(); 
    
    public List<Movie> getAllMoviesByAccount(int customerID,int accountID) {
        return customerlist.get(customerID-1).getCustomerAccounts().get(accountID-1).getAccountMovies();
    }
    
    public Movie getMovieByID(int customerID,int accountID, int MovieID) {
        return customerlist.get(customerID-1).getCustomerAccounts().get(accountID-1).getAccountMovies().get(MovieID-1);
    }
    
    public void transferMovie(int customerID,int accountIDFrom,int accountIDTo, int MovieID){
        List<Movie> mFrom= customerlist.get(customerID-1).getCustomerAccounts().get(accountIDFrom-1).getAccountMovies();
        List<Movie> mTo= customerlist.get(customerID-1).getCustomerAccounts().get(accountIDTo-1).getAccountMovies();
        mFrom.get(MovieID-1).setID(mTo.size()+1);
        customerlist.get(customerID-1).getCustomerAccounts().get(accountIDTo-1).getAccountMovies().add(mFrom.get(MovieID-1));
        customerlist.get(customerID-1).getCustomerAccounts().get(accountIDFrom-1).getAccountMovies().remove(MovieID-1);
        

    }

    public List<Movie> getAllAccounts() {
        return movielist;
    }
    
    public Movie createMovie(Movie m,int c_id, int a_id){
    
        
        Account act = customerlist.get(c_id-1).getCustomerAccounts().get(a_id);
        m.setID(act.getAccountMovies().size() + 1);
	act.addMovieToAccount(m);
        
        
	System.out.println("201 - resource created with path: /customers/" + String.valueOf(act.getId())+"/accounts/"+String.valueOf(m.getID()));
        System.out.println("Updated Customer:"+m.printMovie());
	return m;
    }
    
    
     public void deleteeMovie(int CustomerID,int AccountID ,int MovieID){
         List<Movie> m= customerlist.get(CustomerID-1).getCustomerAccounts().get(AccountID-1).getAccountMovies();
         for(int i=0;i<m.size();i++){
             if(m.get(i).getID()==MovieID){
                 customerlist.get(CustomerID-1).getCustomerAccounts().get(AccountID-1).getAccountMovies().remove(i);
                 break;
             }
         }
         
    }
}
