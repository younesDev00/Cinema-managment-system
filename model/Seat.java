package model;

import javax.swing.*;

import java.util.*;
/**
 * class Seat
 */
public class Seat extends Updater
{   
    protected String name;
    protected int number;
    protected double price;
    protected int sold = 0;
    
    public Seat(String name, int number)
    {   
        this.name = name;
        this.number = number;   
    }      

    public void setPrice(double price)
    {   
        this.price = price;
        
        //show();
    }    
    
    public double getPrice()
    {   
        return price;
    }    

    public void addSold(int sell)
    {  
        if (left() >= sell)
        {
            sold += sell;
            show();
        }
        else
        JOptionPane.showMessageDialog(null, "Not enough seats ");
            //System.out.println("Not enough seats available in " + name + ", sale aborted");
            
        }    
    public void reset()
    {  
        sold = 0;
        
    }  
    public int left()
    {   
        return number - sold;   
    }
    public int getSold()
    {
        return sold;
    }
    public double income()
    {  
        return sold * price;    
    } 
    public void show()
    {   
        System.out.println(toString()); 
        
    }                
    public String toString()
    {   String s = name + " seats:";
        s += " n = " + left();;
        s += " price = $" + price;
        s += " sold = " + sold;
        return s;   
    }
}
