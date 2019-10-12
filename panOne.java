    // import javax.swing.*;
    // import java.awt.*;
    // import java.awt.event.*;
    // import model.*;
    
    // public class panOne extends CustomPanel implements MyObserver {
        
        // private JLabel sessionIdLab = new JLabel("Session Id: ");
        // private JLabel movNameLab = new JLabel("");
        // private JTextField sessionIdText = new JTextField(5);
        // public static int sesID;
        // private Cinema cinema;
        
        // public panOne(Cinema cinema)
        // {
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
            // add(sessionIdLab);
            // add(sessionIdText);
            // addButton("Find", new FindListener());
            // add(movNameLab);
        // }
        
        // public void update()
        // {
            // if(sessionIdText.getText().equals(""))//addddd to sheeeet
            // {
                
            // }else
            // {
                // sesID = Integer.parseInt(sessionIdText.getText());
            // }
        // }
        
        // private class FindListener implements ActionListener 
        // {
        
        // public void actionPerformed(ActionEvent e)
        // {   
            
            // if(sessionIdText.getText().equals(""))
            // {
                // JOptionPane.showMessageDialog(null, "Please enter id");
                
            // }else{
                // sesID = Integer.parseInt(sessionIdText.getText());//add to sheet    
                // Movie movie = cinema.getSesMovie(sesID);
                // movNameLab.setText(movie.getName());
                // cinema.updateViews();
                // }
        // }
      // }
      
      // public int getID()
      // {
        // return sesID;
        // }
      
 // }