
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy
 */
public class InitialFrame extends JFrame 
    {
    private InitialPanel cp; 
    
    InitialFrame ()
    {
        super("IST 242 Drawing App");
        
        cp = new InitialPanel();
        add(cp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (50000, 50000);
        setVisible(true);
    }

    /**
     * @return the cp
     */
    public InitialPanel getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(InitialPanel cp) {
        this.cp = cp;
    }
}
