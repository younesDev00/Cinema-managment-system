package model;
import java.util.*;
/**
 * class Session 
 */
public class Session extends Record
{
    private Movie movie;
    private Theatre theatre;
    private LinkedList<Seat> seats = new LinkedList<Seat>();
    private double profit = 0.0;

    
    public Session(int id, String name, Movie movie, Theatre theatre)
    {
        super(id, name);
        this.movie = movie; 
        this.theatre = theatre;
        seats.add(new Seat("Gold Class", theatre.goldSeats()));
        seats.add(new Seat("Regular", theatre.regularSeats()));   
    }
    public LinkedList<Seat> seats()
    {   
        return seats;   
    }
    public int groups()
    {   
        return seats.size();   
    }
    public String getName()
    {
        return name;
    }
    public Movie movie()
    {
        return movie;
    }
    public Theatre theatre()
    {
        return theatre;
    }
    public double cost()
    {
        return movie.cost();
    }
    public double profit()
    {
        double income = income();
        profit = income - cost();
        return profit;
    }
     public void sellTickets(int gold, int regular)
    {   
        int sold[] = {gold, regular};
        sellSeats(sold);
        updateViews();
    }
    public boolean canSell(int gold, int regular)
    {
        int sell[] = {gold, regular};
        int i = 0;
       for(Seat seat : seats)
        {
            if (seat.left() < sell[i] )
                return false;
            i++;
        }
        return true;
    }
    public double income()
    {   
        double income = 0;
        for(Seat seat : seats)
            income += seat.income();
        return income;  
    }
    public void setPrices(double[] prices)
    {
       int i = 0;
       for(Seat seat : seats)
        {
            seat.setPrice(prices[i++]);
        }
        updateViews();
    }
    public void sellSeats(int[] sold)
    {
        int i = 0;
        for(Seat seat : seats)
        {
            seat.addSold(sold[i++]);
        }
        getReg();
        getGold();
        updateViews();
    }
    
    public int getGold()
    {
        int gold = seats.getFirst().left();
        return gold;
    }
    
    public int getReg()
    {
        int regular = seats.getLast().left();
        return regular;
    }
    
    public double getGoldPrice()
    {
        double gold = seats.getFirst().getPrice();
        return gold;
    }
    
    public double getRegPrice()
    {
        double regular = seats.getLast().getPrice();
        return regular;
    }
    
     public double getGoldSold()
    {
        double gold = seats.getFirst().getSold();
        return gold;
    }
    
    public double getRegSold()
    {
        double regular = seats.getLast().getSold();
        return regular;
    }
    
    public void show()
    {   
        System.out.println(toString()); 
        
    }                
    public String toString()
    {   String s = "Session: " + id;
        s += " cost = $" + cost();
        s += " income = $" + income();
        s += " profit = $" + profit();
        return s;   
    }

}