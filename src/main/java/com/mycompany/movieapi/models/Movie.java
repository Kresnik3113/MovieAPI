/*
*   
*   Author: Max Delaney | 18100368
*   Date 01/12/2020
*
*/
package com.mycompany.movieapi.models;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maxde
 */
@XmlRootElement
public class Movie {
    private String Movie_name;
    private int id;
    private String summary;
    private boolean watched;
    private boolean recommended;
    
    
    public Movie(){}
    
    public Movie(int id,String Movie_name,String summary, boolean watched, boolean recommended){
        this.id=id;
        this.Movie_name=Movie_name;
        this.summary = summary;
        this.watched = watched;
        this.recommended = recommended;
    }
    
    public String getMovie_name(){
       return Movie_name;
    }
    public void setMovie_name(String Movie_name) {
        this.Movie_name = Movie_name;
    }
    public int getID(){
     return id;        
    }
    public void setID(int id){
     this.id=id;   
        
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    
     public String printMovie(){
        String str = this.getID()+" "+this.getMovie_name();
        return str;
    }
    
}
