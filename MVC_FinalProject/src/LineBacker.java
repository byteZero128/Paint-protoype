
import java.awt.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy
 */
public class LineBacker extends Rectangle {
   
        private int xposition;
    private int yposition;
    private int LinebackerSize; 
    private int LinebackerSpeed; 
    private String LinebackerName; 
    LineBacker(int x, int y, int Rsize, int speed, String name){
        this.setLocation(x,y);
        this.setSize(Rsize,Rsize); 
        
       xposition =x; 
       yposition = y; 
       LinebackerSize = Rsize; 
       LinebackerSpeed  = speed; 
       LinebackerName = name; 
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
     * @return the LinebackerSize
     */
    public int getLinebackerSize() {
        return LinebackerSize;
    }

    /**
     * @param LinebackerSize the LinebackerSize to set
     */
    public void setLinebackerSize(int LinebackerSize) {
        this.LinebackerSize = LinebackerSize;
    }

    /**
     * @return the LinebackerSpeed
     */
    public int getLinebackerSpeed() {
        return LinebackerSpeed;
    }

    /**
     * @param LinebackerSpeed the LinebackerSpeed to set
     */
    public void setLinebackerSpeed(int LinebackerSpeed) {
        this.LinebackerSpeed = LinebackerSpeed;
    }

    /**
     * @return the LinebackerName
     */
    public String getLinebackerName() {
        return LinebackerName;
    }

    /**
     * @param LinebackerName the LinebackerName to set
     */
    public void setLinebackerName(String LinebackerName) {
        this.LinebackerName = LinebackerName;
    }

   
}

       
        
    
    

