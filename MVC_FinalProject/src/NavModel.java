
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
public class NavModel {
    GamePanel gp;
    private RunningBack rb; 
    private LineBacker lb; 
    private LineBackertwo lbtwo; 
    public NavModel(){
        rb = new RunningBack( 100, 100, 100, 15, "Penn State"); 
        lb = new LineBacker(2000, 100, 100, 15, "Ohio"); 
        lbtwo = new LineBackertwo(1500, 500,100, 15, "Ohio"); 
        
                
    }
    void rbLeft(){
       getRb().setBounds(getRb().getXposition()-getRb().getRunningspeed(),
               getRb().getYposition(),getRb().getRunningsize(),getRb().getRunningsize());
       
       System.out.print("Left"); 
    }
    void LbLeft(){
        getLb().setBounds(getLb().getXposition()-getLb().getLinebackerSpeed(),getLb().getYposition(), getLb().getLinebackerSize(),getLb().getLinebackerSize()); 
        gp.positionLbButton(getLb());
        
    }

    /**
     * @return the rb
     */
    public RunningBack getRb() {
        return rb;
    }

    /**
     * @param rb the rb to set
     */
    public void setRb(RunningBack rb) {
        this.rb = rb;
    }

    /**
     * @return the lb
     */
    public LineBacker getLb() {
        return lb;
    }

    /**
     * @param lb the lb to set
     */
    public void setLb(LineBacker lb) {
        this.lb = lb;
    }

    /**
     * @return the lbtwo
     */
    public LineBackertwo getLbtwo() {
        return lbtwo;
    }

    /**
     * @param lbtwo the lbtwo to set
     */
    public void setLbtwo(LineBackertwo lbtwo) {
        this.lbtwo = lbtwo;
    }

  

 
  
}
