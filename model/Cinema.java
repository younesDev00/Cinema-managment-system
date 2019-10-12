package model;
import java.util.*;
/**
 * class Cinema 
*/
public class Cinema extends Updater 
{
    private final String NAME = "MyCinema";
    private double balance = 100000.00;
    private double profit = 0.0;
    private Movies movies = new Movies();
    private Theatres theatres = new Theatres();
    private Sessions sessions = new Sessions();
    public Cinema()
    {
        
    }
    public boolean addSession(String name, int movieId, int theatreId, int time, int gold, int regular)
    {   
        
        //System.out.println("Add a Session");

        Movie movie = movies.find(movieId);
        Theatre theatre = theatres.find(theatreId);  
        if(theatre.vacant(time) == false)
            return false;
        if(isValid(movie, theatre))
        {
            sessions.setupSession(movie, theatre, name, time, gold, regular);
            //System.out.println("Session Added");
                    updateViews();
            return true;
        }else
         {   return false;}
        
        
    }
    public boolean isValid(Movie movie, Theatre theatre)
    {
        return movie != null && theatre != null;
    }
    
    public Movie getSesMovie(int id)
    {
        Session ses = sessions.find(id);
        return ses.movie();
    }
    
    public void hireTheatre(Theatre theatre, int time, double amount)
    { 
        System.out.println("Hire a Theatre");
        if(theatre.vacant(time))
        {
            balance += amount;
            System.out.println("Theatre hired");
            updateViews();
        }
    }  
    public double income()
    {
        return sessions.income();
    }
    public double cost()
    {
        return sessions.cost();
    }
    public void profit()
    { 
        profit = income() - cost();
        updateViews();
    }
    public double balance()
    { 
        return balance + profit;
    }
    public void cinemaReport()
    {   
        movies.show();
        theatres.show();
        sessions.show();
        System.out.println(toString());
        updateViews();
    } 
    public Session sessions(int id)
    {
       return sessions.find(id);
    }
    public Sessions sess()
    {
       return sessions;
    }
    public Theatres theatres()
    {
       return theatres;
    }
    
    public void addTheatre(String name, int gold, int regular)
    {
        theatres.add(name,gold,regular);
        updateViews();
    }
    
    public boolean findThe(int id)
    {
        if(theatres.find(id) != null)
            return true;
        else
            return false;
    }    
    
    public Movies movies()
    {
       return movies;
    }
    
    public void addMovie(String name, double cost)
    {
        movies.add(name,cost);
        updateViews();
    }
    
    public boolean findMov(int id)
    {
        if(movies.find(id) != null)
            return true;
        else
            return false;
    }
    
    public String getGld(int ID)
    {
        return Integer.toString(sessions(ID).getGold());
    }
    
    public void show()
    {   
        System.out.println(toString()); 
        updateViews();
    }                
    public String toString()
    {   String s = "Cinema:";
        s += " cost = $" + cost();
        s += " income = $" + income();
        s += " profit = $" + profit;
        s+= " balance = $" + balance();
        return s;   
        
    }
    
}