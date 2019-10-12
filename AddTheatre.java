import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.*;

public class AddTheatre extends CustomPanel implements MyObserver
{
    private Cinema cinema;
    private JLabel theatreLab = new JLabel("Theatre Name: ");
    private JTextField theatreText = new JTextField(15);
    private JLabel regularLab = new JLabel("Regular Seats: ");
    private JTextField regularText = new JTextField(5);
    private JLabel goldLab = new JLabel("gold Seats: ");
    private JTextField goldText = new JTextField(5);
    private JButton set = new JButton("Add Theatre");
    private JLabel show = new JLabel(" ");
    
    public AddTheatre(Cinema cinema)
    {  
        this.cinema = cinema;
        setup();
        build();
    }
    public void update()
    {
    }
    
    public void setup()
    {
        set.addActionListener(new SetListener());
    }   
    
    public void build()
    {   
        add(theatreLab);
        add(theatreText);
        add(regularLab);
        add(regularText);
        add(goldLab);
        add(goldText);
        add(set);
        add(show);
    }
    
    private class SetListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e)
        {
            String mName = theatreText.getText();
            int regular = Integer.parseInt(regularText.getText());
            int gold = Integer.parseInt(goldText.getText());
            cinema.addTheatre(mName,gold,regular);
            JOptionPane.showMessageDialog(null, "theatre added");
            show.setText("The Theatre " + mName + " Has been added ");
        }
    }
}
