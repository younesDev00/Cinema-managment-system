package model;

import java.util.*;
/**
 * class Movies 
 */
public class Movies extends Records
{
    public Movies()
    {
    }
    public void add(Movie movie)
    {
        super.add(movie);
        updateViews();
    }
    public void add(String name, double cost)
    { 
        //System.out.println("Setup a Movie"); no longer needed with gui
        Movie movie = new Movie(++id, name, cost); 
        add(movie);
        updateViews();
        //System.out.print(" " + name + cost); testing purposes
    }
    public Movie find(int id)
    {   
        return (Movie) super.find(id);
    }
}
