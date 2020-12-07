
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
    
    private List<Customer> list = new Database().getCustomersDB();
    private List<Movie> movietslist = new Database().getMovieDB(); 
    
    public List<Movie> getAllMoviesByCustomer(int CustomerID) {
        return list.get(CustomerID-1).getMovies();
    }
    
    public Movie getMovieByID(int CustomerID, int MovieID) {
        return list.get(CustomerID-1).getMovies().get(MovieID-1);
    }

    public List<Movie> getAllMovies() {
        return movieslist;
    }
    
    public Movie createMovie(Movie m, int m_id){
    
        
        Customer cus = list.get(m_id-1);
        c.setId(cus.getMovies().size() + 1);
	cus.addMovieToCus(m);
        
        
	System.out.println("201 - resource created with path: /movies/" + String.valueOf(cus.getId())+"/movies/"+String.valueOf(m.getId()));
        System.out.println("Updated Coustomersinfo:"+m.printMovie());
	return c;
    }
    
    /* public Movie deleteMovie(Movie m, int m_id){
    
        
        Message msg = list.get(m_id-1);
	list.remove(msg);
         return null;
     }*/
    
    
    
}
