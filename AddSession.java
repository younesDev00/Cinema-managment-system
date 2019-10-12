import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.*;

public class AddSession extends CustomPanel implements MyObserver
{
    private Cinema cinema;
    private JLabel nmLab = new JLabel("Session Name: ");
    private JTextField nmText = new JTextField(15);
    private JLabel theatreLab = new JLabel("Theatre id: ");
    private JTextField theatreText = new JTextField(15);
    private JLabel movieLab = new JLabel("Movie id: ");
    private JTextField movieText = new JTextField(5);
    private JLabel timeLab = new JLabel("Time: ");
    private JTextField timeText = new JTextField(5);
    private JLabel regularLab = new JLabel("Regular cost: ");
    private JTextField regularText = new JTextField(5);
    private JLabel goldLab = new JLabel("gold cost: ");
    private JTextField goldText = new JTextField(5);
    private JButton set = new JButton("Add Session");
    private JLabel show = new JLabel(" ");
    
    public void update()
    {
    }
    
    public AddSession(Cinema cinema)
    {
        this.cinema = cinema;
        setup();
        build();
    }

    private void setup()
    {
        set.addActionListener(new SetListener());
    }
   
    private void build()
    {
        add(nmLab );
        add(nmText );
        add(theatreLab );
        add(theatreText );
        add(movieLab );
        add(movieText );
        add(timeLab);
        add( timeText);
        add(regularLab );
        add(regularText );
        add(goldLab );
        add(goldText );
        add(set );
        add(show );
    }
    
    private class SetListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e)
        {
            String mName = theatreText.getText();
            int movieId = Integer.parseInt(movieText.getText());
            if(cinema.findMov(movieId) == false){
                JOptionPane.showMessageDialog(null, "error with Movies id");
            }
            
            int theatreId = Integer.parseInt(theatreText.getText());
            if(cinema.findThe(theatreId) == false){
                JOptionPane.showMessageDialog(null, "error with theatre id");
            }
            
            int time = Integer.parseInt(timeText.getText());
            int regular = Integer.parseInt(regularText.getText());
            int gold = Integer.parseInt(goldText.getText());
            boolean nmId = cinema.addSession(mName, movieId, theatreId,  time,  gold,  regular);
            if(nmId)
            {
                JOptionPane.showMessageDialog(null, "session added");
                show.setText("The Theatre " + mName + " Has been added ");
            }else
            {
                JOptionPane.showMessageDialog(null, "Not vacant");
                show.setText("Not vacant");
            }
            
        }
    }
}
