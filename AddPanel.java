import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.*;

public class AddPanel extends CustomPanel implements MyObserver
{
    private Cinema cinema;
    private JLabel lab = new JLabel();
    private JButton titleButton = new JButton("add title");
    
    public AddPanel(Cinema cinema)
    {  
        this.cinema = cinema;
        setup();
        build();
    }
    
    public void setup()
    {  
        setLayout(new GridLayout(3,1));
    }   
    
    public void update()
    {
    }
    
    public void build()
    {   
        add(new AddMovie(cinema));
        add(new AddTheatre(cinema));
        add(new AddSession(cinema));
    }
    

}
