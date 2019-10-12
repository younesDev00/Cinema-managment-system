     import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import model.*;

public class SellPanel extends CustomPanel implements MyObserver
{   
    private Cinema cinema;
    public int ID;
    
    public SellPanel(Cinema cinema)
    {
        this.cinema = cinema;
        setup();
        build();
    }
    
    private void setup()
    {
        setLayout(new GridLayout(3,1));//add to sheet
        cinema.attach(this);
        cinema.movies().attach(this);
        cinema.sess().attach(this);
        cinema.theatres().attach(this);
    }
    
    public void update()
    {
    }
    
    private void build()
    {
        panOne panone = new panOne(cinema);
        add(panone);
        add(new panThree(cinema));
        add(new panTwo(cinema));
    }
    
    public class panOne extends CustomPanel implements MyObserver {
        
        private JLabel sessionIdLab = new JLabel("Session Id: ");
        private JLabel movNameLab = new JLabel("");
        private JTextField sessionIdText = new JTextField(5);

        private Cinema cinema;
        
        public panOne(Cinema cinema)
        {
            this.cinema = cinema;
            setup();
            build();
        }
        
        private void setup()
        { 
            cinema.attach(this);
            cinema.movies().attach(this);
            cinema.theatres().attach(this);
            cinema.sess().attach(this);
        }
        
        private void build()
        {
            add(sessionIdLab);
            add(sessionIdText);
            addButton("Find", new FindListener());
            add(movNameLab);
        }
        
        public void update()
        {
            if(sessionIdText.getText().equals(""))//addddd to sheeeet
            {
                
            }else
            {
                ID = Integer.parseInt(sessionIdText.getText());
            }
        }
        
        private class FindListener implements ActionListener 
        {
        
        public void actionPerformed(ActionEvent e)
        {   
            
            if(sessionIdText.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter id");
                
            }else{
                ID = Integer.parseInt(sessionIdText.getText());//add to sheet    
                Movie movie = cinema.getSesMovie(ID);
                movNameLab.setText(movie.getName());
                cinema.updateViews();
                }
        }
      }
      
      public int getID()
      {
        return ID;
        }
      
 }
 
 public class panTwo extends CustomPanel implements MyObserver {
        

        private JTextField avGold = new JTextField(5);
        private JTextField avRegular = new JTextField(5);
        private JTextField goldPrice = new JTextField(5);
        private JTextField regularPrice = new JTextField(5);
        private JTextField soldGold = new JTextField(5);
        private JTextField soldRegular = new JTextField(5);
        private Cinema cinema;
        //private panOne panone;
        //private int ID;
        public panTwo(Cinema cinema)
        {
            this.cinema = cinema;
            //this.panone = panone;
            
            setup();
            build();
            
            
        }
        
        public void setup()
        {
            //setLayout(new GridLayout(3,6));
            cinema.attach(this);
            cinema.movies().attach(this);
            cinema.theatres().attach(this);
            cinema.sess().attach(this);
            
        }
        
        public void update()
        {
            
            if(cinema.sessions(ID) == null)
            {
                avGold.setText("0");
                avRegular.setText("0");
            }else{
                avGold.setText(cinema.getGld(ID));
                avRegular.setText("" +cinema.sessions(ID).getReg());
                goldPrice.setText("" +cinema.sessions(ID).getGoldPrice());
                regularPrice.setText("" +cinema.sessions(ID).getRegPrice());
                soldGold.setText("" +cinema.sessions(ID).getGoldSold());
                soldRegular.setText("" +cinema.sessions(ID).getRegSold());
            }
        }
        
        private void build()
        {
            addPair("Gold Class: ", avGold);
            addPair("Regular Class: ", avRegular);
            addPair("Gold Price: ", goldPrice);
            addPair("Regular Price: ", regularPrice);
            addPair("Sold Gold: ", soldGold);
            addPair("Sold Regular: ", soldRegular);
            //addButton("Find", new FindListener());
        }
        
        private class FindListener implements ActionListener 
        {
        
            public void actionPerformed(ActionEvent e)
            {
                update();
            }
        }
    }
    
    public class panThree extends CustomPanel implements MyObserver
    {
        private JTextField goldSell = new JTextField(10);
        private JTextField regSell = new JTextField(10);
        private Cinema cinema;
        private int gold,regular,id;
        private panOne panone;
        
        public panThree(Cinema cinema)
        {
            //this.panone = panone;
            this.cinema = cinema;
            setup();
            build();
        }
        
        private void setup()
        {
            cinema.attach(this);
            cinema.movies().attach(this);
            cinema.theatres().attach(this);
            cinema.sess().attach(this);
        }
        
        private void build()
        {
            addPair("Sell Gold", goldSell);
            addPair("sell Regular", regSell);
            addButton("Sell", new SellListener());
        }
        
        public void update()
        {
            
            if(cinema.sessions(ID) == null)
            {
             //JOptionPane.showMessageDialog(null, "Id Not found");
            }else{
                
                
            }
        }
        
        private class SellListener implements ActionListener 
        {
            public void actionPerformed(ActionEvent e)
            {
                if(cinema.sessions(ID) != null)
                {
                    
                    gold = Integer.parseInt(goldSell.getText());
                    regular = Integer.parseInt(regSell.getText());
                    Sessions session = cinema.sess();
                    session.sellTickets(ID, gold, regular);
                }else
                {
                    JOptionPane.showMessageDialog(null, "Id Not found");
                }
            }
        }
    }
    
    

    
}