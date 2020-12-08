
package com.mycompany.movieapi.services;
import com.mycompany.movieapi.databases.Database;
import com.mycompany.movieapi.models.Account;
import com.mycompany.movieapi.models.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bellal
 */
public class MovieService {
    private List<Customer> customerlist = new Database().getCustomersDB();
    private List<Movie> movielist = new Database().getMovieDB(); 
    
    public List<Movie> getAllMoviesByCustomer(int CustomerID) {
        return customerlist.get(CustomerID-1).getCustomerMovies();
    }
    
    public Movie getMovieByID(int CustomerID, int MovieID) {
        return customerlist.get(CustomerID-1).getCustomerMovies().get(MovieID-1);
    }

    public List<Movie> getAllAccounts() {
        return movielist;
    }
    
    public Movie createMovie(Movie m, int c_id){
    
        
        Customer cus = customerlist.get(c_id-1);
        m.setID(cus.getCustomerMovies().size() + 1);
	cus.addMovieToCustomer(m);
        
        
	System.out.println("201 - resource created with path: /customers/" + String.valueOf(cus.getId())+"/accounts/"+String.valueOf(m.getID()));
        System.out.println("Updated Customer:"+m.printMovie());
	return m;
    }
    
    
     public void deleteeMovie(int CustomerID, int MovieID){
         movielist.remove(MovieID);
         
    }
}
