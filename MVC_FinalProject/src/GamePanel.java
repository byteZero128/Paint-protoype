import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy
 */
public class GamePanel extends JPanel{
    JButton RunningButton; 
    JButton LineButton; 
    JButton LineButtontwo; 
    NavModel nv;
    GamePanel(){
        
         super();
         setBackground(Color.green);
         
         //RunningButton.setBounds(nv.getRb().getXposition(),nv.getRb().getYposition(), nv.getRb().getRunningsize(),nv.getRb().getRunningsize());  
         setLayout(null); 
       RunningButton = new JButton("penn state"); 
       LineButton = new JButton("Ohio"); 
       LineButtontwo = new JButton("Ohio"); 
       add(RunningButton); 
       add(LineButton); 
       add(LineButtontwo); 
         setFocusable(true); 
        requestFocusInWindow(); 
        
     
       
    }
    public void positionRBButton(Rectangle rb){
        RunningButton.setBounds(rb); 
        
    }
     public void positionLbButton(Rectangle lbOne){
        LineButton.setBounds(lbOne); 
    }
     public void positionLbtwoButton(Rectangle lbTwo){
        LineButtontwo.setBounds(lbTwo); 
    }
}
