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
    private ArrayList<Movie> movieList = new ArrayList();
    public Account(){}
    
    public Account(int id, String nickName, String password){
        this.id = id;
        this.nickName = nickName;
        this.password = password;
    }
    public Account(int id, String nickName, String password,ArrayList<Movie> movieList ){
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.movieList=movieList;
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<Movie> movieList) {
        this.movieList = movieList;
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
    
    public String printAccount(){
        String str = this.getId()+" "+this.getNickName()+" "+this.getPassword();
        return str;
    }
}
