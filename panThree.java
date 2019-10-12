import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.*;

// public class panThree extends CustomPanel implements MyObserver
    // {
        // private JTextField goldSell = new JTextField(10);
        // private JTextField regSell = new JTextField(10);
        // private Cinema cinema;
        // private int gold,regular,id;
        // private panOne panone;
        
        // public panThree(Cinema cinema, panOne panone)
        // {
            // this.panone = panone;
            // this.cinema = cinema;
            // setup();
            // build();
        // }
        
        // private void setup()
        // {
                        // cinema.attach(this);
            // cinema.movies().attach(this);
            // cinema.theatres().attach(this);
            // cinema.sess().attach(this);
        // }
        
        // private void build()
        // {
            // addPair("Sell Gold", goldSell);
            // addPair("sell Regular", regSell);
            // addButton("Sell", new SellListener());
        // }
        
        // public void update()
        // {
            // id = panone.getID();
            // if(cinema.sessions(id) == null)
            // {
             // //JOptionPane.showMessageDialog(null, "Id Not found");
            // }else{
                // gold = Integer.parseInt(goldSell.getText());
                // regular = Integer.parseInt(regSell.getText());
                
            // }
        // }
        
        // private class SellListener implements ActionListener 
        // {
        
            // public void actionPerformed(ActionEvent e)
            // {
                // if(cinema.sessions(id) != null)
                // {
                    // id = panone.getID();
                    // Sessions session = cinema.sess();
                    // session.sellTickets(id, gold, regular);
                // }else
                // {
                    // JOptionPane.showMessageDialog(null, "Id Not found");
                // }
            // }
        // }
    // }