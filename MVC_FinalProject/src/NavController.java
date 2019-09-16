
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy
 */
public class NavController {
    
   Timer tim; 
   int delay; 
    NavModel model;
    NavView view; 
     NavController(NavModel model, NavView iview){
         System.out.println("ASD");
         this.model = model; 
         this.view = iview; 
         view.getIframe().getCp().getGp().positionRBButton(model.getRb()); 
         view.getIframe().getCp().getGp().positionLbButton(model.getLb());
         view.getIframe().getCp().getGp().positionLbtwoButton(model.getLbtwo());
         
         
         
         
          int delay =200; 
           tim = new Timer(delay,new ActionListener ()
           {
               public void actionPerformed(ActionEvent e) {
                   Object obj = e.getSource();
                    if(obj == tim){
                     
                       // if(getFieldpan().getXx() > getFieldpan().getX1() && isGameover() != true)
                        if(model.getRb().getXposition()> model.getLb().getXposition()){
                            model.LbLeft();
                            view.getIframe().getCp().getGp().repaint();
                        }
                    }
               }
           }); 
           
              tim.start(); 
              view.getIframe().getCp().getGp().setFocusable(true);
              view.getIframe().getCp().getGp().requestFocusInWindow();
              
           view.getIframe().getCp().getGp().addKeyListener(new KeyAdapter()                           
                {
                   
            //==========================================================================
                    @Override
                    public void keyPressed(KeyEvent e) 
                    {
                        
                         //int pdiff = getSp().getPlayers().getValue();
       int k = e.getKeyCode(); 
       
       if(k == e.VK_LEFT ){
            model.rbLeft();
            
                    }
       
       if(k == e.VK_RIGHT ){
           // getFieldpan().setX1(getFieldpan().getX1() + pdiff); 
    }
       if(k == e.VK_DOWN ){
            //getFieldpan().setY1(getFieldpan().getY1() + pdiff); 
       }
       if(k== e.VK_UP ){
            //getFieldpan().setY1(getFieldpan().getY1() - pdiff);
       }
       
           //getFieldpan().getPlay().setBounds(getFieldpan().getX1(), getFieldpan().getY1(),getFieldpan().getW1()+getSiz(),getFieldpan().getH1()+getSiz());
           //getFieldpan().getPlayr().setBounds(getFieldpan().getX1(), getFieldpan().getY1(),getFieldpan().getW1()+getSiz(),getFieldpan().getH1()+getSiz());
          
                    }
            //============================================================================
                 }            
                );
    }
}

