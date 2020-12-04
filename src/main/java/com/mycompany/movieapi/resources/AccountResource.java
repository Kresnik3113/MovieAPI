/*
*   
*   Author: Max Delaney | 18100368
*   Date 01/12/2020
*
*/
package com.mycompany.movieapi.resources;

import com.mycompany.movieapi.models.Account;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.mycompany.movieapi.services.AccountService;

@Path("/accounts")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

//@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
//@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})

public class AccountResource {

    private AccountService AccountService = new AccountService();
    
    /*
        GET http://127.0.0.1:49000/api/customers/1/accounts
    */
    

    
    @GET
    public List<Account> getAccounts(@PathParam("customerID") int c_id) {
        System.out.println("getAllAccountsForCustomer..."+c_id);
	return AccountService.getAllAccountsByCustomer(c_id);
    }
    /*
        POST http://127.0.0.1:49000/api/customers/1/accounts
        JSON BODY:
        {
            "nickName" : "Jambomb",
            "password" : "MerryChristmas"
        }
    */
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Account postAccount(@PathParam("customerID") int c_id, Account a) {
	return AccountService.createAccount(a, c_id);
    }
    @GET
    @Path("/{accountID}")
    public Account getAccount(@PathParam("accountID") int a_id,@PathParam("customerID") int c_id ) {
    	System.out.println("getAccountByID..."+a_id +" for CustomerID "+c_id);
	return AccountService.getAccountByID(c_id,a_id);
    }
    
}
