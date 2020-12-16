/*
*   
*   Author: Max Delaney | 18100368
*   Date 01/12/2020
*
*/
package com.mycompany.movieapi.resources;


import com.mycompany.movieapi.models.Movie;
import com.mycompany.movieapi.services.MovieService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/movies")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class MovieResource {
    
    private MovieService MovieService = new MovieService();
    
    /*
        GET http://127.0.0.1:49000/api/customers/1/movies
    */
     @GET
    public List<Movie> getMovies(@PathParam("customerID") int c_id,@PathParam("accountID") int a_id) {
        System.out.println("getAllMoviesForAccount..."+a_id);
	return MovieService.getAllMoviesByAccount(c_id,a_id);
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Movie postMovie(@PathParam("customerID") int c_id,@PathParam("accountID") int a_id,@PathParam("movieID")Movie m) {
	return MovieService.createMovie(m,c_id,a_id);
    }
    /*
    GET http://127.0.0.1:49000/api/movies/1/1/2
            {
    "ID": 2,
    "movie_name": "Inception",
    "recommended": true,
    "summary": "Check the summery section",
    "watched": true
}
    */
    @GET
    @Path("{customerID}/{accountID}/{movieID}")
    public Movie getMovie(@PathParam("customerID") int c_id,@PathParam("accountID") int a_id,@PathParam("movieID") int m_id) {
    	System.out.println("getmovieByID..."+m_id +" for AccountID "+a_id);
	return MovieService.getMovieByID(c_id,a_id,m_id);
    }
    
     @DELETE
    @Path("{customerID}/{accountID}/{movieID}")
    public void deleteMovie(@PathParam("customerID") int c_id,@PathParam("accountID") int a_id,@PathParam("movieID") int m_id) {
    
	MovieService.deleteeMovie(c_id,a_id,m_id);
    }
    @POST
    @Path("{customerID}/{accountID}/{accountID1}/{movieID}")
    public void transferMovie(@PathParam("customerID") int c_id,@PathParam("accountID") int a_id,@PathParam("accountID1") int a_id1,@PathParam("movieID")int m_id) {
        System.out.println("Transfering movie....");
	MovieService.transferMovie(c_id, a_id, a_id1,m_id);
    }
    
    
}
