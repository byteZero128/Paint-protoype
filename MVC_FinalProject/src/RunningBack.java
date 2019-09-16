
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy
 */
public class RunningBack extends Rectangle {
    private int xposition;
    private int yposition;
    private int Runningsize; 
    private int Runningspeed; 
    private String Runningname; 
    RunningBack(int x, int y, int Rsize, int speed, String name){
        
        this.setLocation(x,y);
        this.setSize(Rsize,Rsize); 
        
       xposition =x; 
       yposition = y; 
       Runningsize = Rsize; 
       Runningspeed = speed; 
       Runningname = name; 
    }

    /**
     * @return the xposition
     */
    public int getXposition() {
        return xposition;
    }

    /**
     * @param xposition the xposition to set
     */
    public void setXposition(int xposition) {
        this.xposition = xposition;
    }

    /**
     * @return the yposition
     */
    public int getYposition() {
        return yposition;
    }

    /**
     * @param yposition the yposition to set
     */
    public void setYposition(int yposition) {
        this.yposition = yposition;
    }

    /**
     * @return the Runningsize
     */
    public int getRunningsize() {
        return Runningsize;
    }

    /**
     * @param Runningsize the Runningsize to set
     */
    public void setRunningsize(int Runningsize) {
        this.Runningsize = Runningsize;
    }

    /**
     * @return the Runningspeed
     */
    public int getRunningspeed() {
        return Runningspeed;
    }

    /**
     * @param Runningspeed the Runningspeed to set
     */
    public void setRunningspeed(int Runningspeed) {
        this.Runningspeed = Runningspeed;
    }

    /**
     * @return the Runningname
     */
    public String getRunningname() {
        return Runningname;
    }

    /**
     * @param Runningname the Runningname to set
     */
    public void setRunningname(String Runningname) {
        this.Runningname = Runningname;
    }
}
