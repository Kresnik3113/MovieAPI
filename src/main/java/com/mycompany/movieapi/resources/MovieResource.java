/*
*   
*   Author: Max Delaney | 18100368
*   Date 01/12/2020
*
*/
package com.mycompany.movieapi.resources;


import com.mycompany.movieapi.models.Movie;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.mycompany.movieapi.servicesMovieService;

@Path("/movies")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class MovieResource {
    
    private MovieService MovieService = new MovieService();
    
    /*
        GET http://127.0.0.1:49000/api/customers/1/movies
    */
     @GET
    public List<Movie> getMovies(@PathParam("customerID") int c_id) {
        System.out.println("getAllMoviesForCustomer..."+c_id);
	return MovieService.getAllMoviesByCustomer(c_id);
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Movie postMovie(@PathParam("customerID") int c_id, Movie m) {
	return MovieService.createMovie(m, c_id);
    }
    @GET
    @Path("/{movieID}")
    public Movie getMovie(@PathParam("movieID") int m_id,@PathParam("customerID") int c_id ) {
    	System.out.println("getmovieByID..."+m_id +" for CustomerID "+c_id);
	return MovieService.getMovieByID(c_id,m_id);
    }
    
     @DELETE
    @Path("/{movieID}")
    public void deleteMovie(@PathParam("movieID") int m_id,@PathParam("customerID") int c_id ) {
    
	MovieService.deleteeMovie(m_id,c_id);
    }
    
}
