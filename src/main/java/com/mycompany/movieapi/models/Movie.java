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
    private boolean watched;
    private boolean recommended;
    private String summary,movieName;


    
    public Movie(){}
    
    public Movie(String movieName,String summary, boolean watched, boolean recommended){
        this.movieName=movieName;
        this.summary = summary;
        this.watched = watched;
        this.recommended = recommended;
    }
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
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
    
    
}
