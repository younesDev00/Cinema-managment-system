import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.*;

public class AddMovie extends CustomPanel implements MyObserver
{
    private Cinema cinema;
    //private JLabel movieLab = new JLabel("Movie Name: ");
    private JTextField movieText = new JTextField(15);
    private JLabel costLab = new JLabel("Movie Cost: ");
    private JTextField costText = new JTextField(5);
    //private JButton set = new JButton("Add Movie");
    private JLabel show = new JLabel(" ");
    
    public AddMovie(Cinema cinema)
    {  
        this.cinema = cinema;
        setup();
        build();
    }
    
    public void setup()
    {
        //set.addActionListener(new SetListener());
    }   
    
    public void build()
    {   
        //add(movieLab);
        addPair("Movie Name: ", movieText);
        add(costLab);
        add(costText);
        addButton("Add Movie", new SetListener());
        add(show);
    }
    
    public void update()
    {
    }
    
    private class SetListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e)
        {
            String mName = movieText.getText();
            int mCost = Integer.parseInt(costText.getText());
            cinema.addMovie(mName,mCost);
            JOptionPane.showMessageDialog(null, "The movie " + mName + " Has been added ");
            show.setText("The movie " + mName + " Has been added ");
        }
    }
}
