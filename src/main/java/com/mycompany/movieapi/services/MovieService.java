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
 * @author Dean
 */

public class MovieService {
    private List<Movie> movieList = new Database().geMoviesDB();
    
    
  

    public List<Movie> getAllMovies() {
        return movieList;
    }
    
  
}
