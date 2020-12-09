/*
*   
*   Author: Max Delaney | 18100368
*   Date 01/12/2020
*
*/
package com.mycompany.movieapi.models;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maxde
 */
@XmlRootElement
public class Account {
    private int id;
    private String nickName;
    private String password;
    private ArrayList<Movie> accountMovies = new ArrayList();
    public Account(){}
    
    public Account(int id, String nickName, String password){
        this.id = id;
        this.nickName = nickName;
        this.password = password;
    }
    
    public Account(int id, String nickName, String password,ArrayList<Movie> accountMovies){
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.accountMovies=accountMovies;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Movie> getAccountMovies() {
        return accountMovies;
    }

    public void setAccountMovies(ArrayList<Movie> accountMovies) {
        this.accountMovies = accountMovies;
    }
    public void addMovieToAccount(Movie movie) {
        (this.accountMovies).add(movie);
        System.out.println("Added a new movie to customer");
    }
    
    public void deleteMovieOFAccount(Movie movie) {
        (this.accountMovies).remove(movie);
        System.out.println("deleted the movie from customer account");
    }
    
     public void transferMovie(int idAdd,int idRemove,Movie movie){
        
    }
    
    public String printAccount(){
        String str = this.getId()+" "+this.getNickName()+" "+this.getPassword();
        return str;
    }
}
