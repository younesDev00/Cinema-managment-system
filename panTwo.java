import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.*;

 
// public class panTwo extends CustomPanel implements MyObserver {
        

        // private JTextField avGold = new JTextField(5);
        // private JTextField avRegular = new JTextField(5);
        // private JTextField goldPrice = new JTextField(5);
        // private JTextField regularPrice = new JTextField(5);
        // private JTextField soldGold = new JTextField(5);
        // private JTextField soldRegular = new JTextField(5);
        // private Cinema cinema;
        // private panOne panone;
        // private int ID;
        // public panTwo(Cinema cinema, panOne panone)
        // {
            // this.cinema = cinema;
            // this.panone = panone;
            
            // setup();
            // build();
            
            
        // }
        
        // public void setup()
        // {
            // //setLayout(new GridLayout(3,6));
            // cinema.attach(this);
            // cinema.movies().attach(this);
            // cinema.theatres().attach(this);
            // cinema.sess().attach(this);
            
        // }
        
        // public void update()
        // {
            // ID = panone.getID();
            // if(cinema.sessions(ID) == null)
            // {
                // avGold.setText("0");
                // avRegular.setText("0");
            // }else{
                // avGold.setText(cinema.getGld(ID));
                // avRegular.setText("" +cinema.sessions(ID).getReg());
                // goldPrice.setText("" +cinema.sessions(ID).getGoldPrice());
                // regularPrice.setText("" +cinema.sessions(ID).getRegPrice());
                // soldGold.setText("" +cinema.sessions(ID).getGoldSold());
                // soldRegular.setText("" +cinema.sessions(ID).getRegSold());
            // }
        // }
        
        // private void build()
        // {
            // addPair("Gold Class: ", avGold);
            // addPair("Regular Class: ", avRegular);
            // addPair("Gold Price: ", goldPrice);
            // addPair("Regular Price: ", regularPrice);
            // addPair("Sold Gold: ", soldGold);
            // addPair("Sold Regular: ", soldRegular);
            // //addButton("Find", new FindListener());
        // }
        
        // private class FindListener implements ActionListener 
        // {
        
            // public void actionPerformed(ActionEvent e)
            // {
                // update();
            // }
        // }
    // }