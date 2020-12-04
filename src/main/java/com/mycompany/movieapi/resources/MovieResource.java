/*
*   
*   Author: Max Delaney | 18100368
*   Date 01/12/2020
*
*/
package com.mycompany.movieapi.resources;

import com.mycompany.movieapi.models.Account;
import com.mycompany.movieapi.models.Movie;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.mycompany.movieapi.services.AccountService;
import com.mycompany.movieapi.services.MovieService;

@Path("/movies")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

//@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
//@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})

public class MovieResource {

    private MovieService MovieService = new MovieService();
    
    /*
        GET http://127.0.0.1:49000/api/customers/1/accounts
    */
    

    
    @GET

    public List<Movie> getAccounts(@PathParam("MovieID") int c_id) {
	return MovieService.getAllMovies();
    }
    /*
        POST http://127.0.0.1:49000/api/movies
        JSON BODY:
        {
            "movieName" : "tod",
            "recommended" : "false",
            "summary": "shit",
            "watched" : "true",
        }
    */
    

    
}
