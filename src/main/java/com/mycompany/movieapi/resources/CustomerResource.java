/*
*   
*   Author: Max Delaney | 18100368
*   Date 01/12/2020
*
*/
package com.mycompany.movieapi.resources;

import com.mycompany.movieapi.models.Customer;
import com.mycompany.movieapi.models.Account;
import com.mycompany.movieapi.services.CustomerService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;




@Path("/customers")

public class CustomerResource {
    
    CustomerService customerService = new CustomerService();
    
    /*
        Example Postman GET: http://127.0.0.1:49000/api/customers/?name=Kelly Smith&address=44 Bonville Drive
    */
    @GET 
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_XML)
    public List<Customer> getFilteredCustomers(@QueryParam("name") String name, @QueryParam("address") String address) 
    { 
        if ((name != null) || (address != null)) 
        {        
            return customerService.getSearchCustomers(name, address); 
        } 
        return customerService.getAllCustomers();    
    }
    
    /*
        Example Postman GET: http://127.0.0.1:49000/api/customers/
    */
    @GET
    @Path("/{customerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customer getCustomerJSON(@PathParam("customerId") int id) {
        return customerService.getCustomer(id);
    }
    
    /*
        Example Postman POST: http://127.0.0.1:49000/api/customers
        JSON BODY:
        {
            "name": "Jurial",
            "address": "49 Lindin Drive",
            "email": "Jurial5959@gmail.com",
            "customerAccounts": {
            "id": 1,
            "nickName": "Lolster",
            "password":"ABC123"
            }
        }
    */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Customer postAccount(Customer a) {
        return customerService.createCustomerAccount(a);
    }
    
    @Path("/{customerID}/accounts")
    public AccountResource getAccountsResource() {
	System.out.println("Getting accounts subresoruces...");
	return new AccountResource();
    }
} 
    
    