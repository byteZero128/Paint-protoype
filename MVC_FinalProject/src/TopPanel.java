
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy
 */
public class TopPanel extends JPanel {
    private JSlider slide; 
     private JLabel score; 
     private JButton Mich; 
     private JButton Northw;
     private JButton Tulane; 
     private JButton PennState; 
     private JSlider players; 
     private JSlider siz;
     private JLabel sizelabel;
     private JLabel missed; 
    TopPanel(){
        super(); 
        sizelabel = new JLabel("Player size"); 
        add(sizelabel); 
        siz = new JSlider(-30,30); 
        add(siz); 
        JLabel playerSpeed = new JLabel("Player speed"); 
       add(playerSpeed);
           players = new JSlider(5,15); 
        add(players); 
         Mich = new JButton("MICH"); 
        Mich.setBackground(Color.yellow);
        add(Mich); 
        Northw = new JButton("NORTHW");
        Northw.setBackground(Color.decode("#8A2BE2")); 
        add(Northw); 
        Tulane = new JButton("TULANE"); 
        Tulane.setBackground(Color.green);
        add(Tulane); 
        PennState = new JButton("PENN STATE"); 
        PennState.setBackground(Color.decode("#ADD8E6"));
        add(PennState); 
        
       JLabel Enemyslide = new JLabel("Enemy speed"); 
       add(Enemyslide);
        slide = new JSlider(5,20); 
        add(slide); 
        score = new JLabel("Score: 0");
       add(score); 
       missed = new JLabel("Missed: 0"); 
       add(missed); 
       
       
        
    }

    /**
     * @return the slide
     */
    public JSlider getSlide() {
        return slide;
    }

    /**
     * @param slide the slide to set
     */
    public void setSlide(JSlider slide) {
        this.slide = slide;
    }

    /**
     * @return the score
     */
    public JLabel getScor() {
        return getScore();
    }

    /**
     * @param score the score to set
     */
    public void setScor(JLabel score) {
        this.setScore(score);
    }

    /**
     * @return the Mich
     */
    public JButton getMich() {
        return Mich;
    }

    /**
     * @param Mich the Mich to set
     */
    public void setMich(JButton Mich) {
        this.Mich = Mich;
    }

    /**
     * @return the Northw
     */
    public JButton getNorthw() {
        return Northw;
    }

    /**
     * @param Northw the Northw to set
     */
    public void setNorthw(JButton Northw) {
        this.Northw = Northw;
    }

    /**
     * @return the Tulane
     */
    public JButton getTulane() {
        return Tulane;
    }

    /**
     * @param Tulane the Tulane to set
     */
    public void setTulane(JButton Tulane) {
        this.Tulane = Tulane;
    }

    /**
     * @return the PennState
     */
    public JButton getPennState() {
        return PennState;
    }

    /**
     * @param PennState the PennState to set
     */
    public void setPennState(JButton PennState) {
        this.PennState = PennState;
    }

    /**
     * @return the players
     */
    public JSlider getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(JSlider players) {
        this.players = players;
    }

    /**
     * @return the size
     */
   

    /**
     * @param size the size to set
     */
    

    /**
     * @return the sizelabel
     */
    public JLabel getSizelabel() {
        return sizelabel;
    }

    /**
     * @param sizelabel the sizelabel to set
     */
    public void setSizelabel(JLabel sizelabel) {
        this.sizelabel = sizelabel;
    }

    /**
     * @return the score
     */
    public JLabel getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(JLabel score) {
        this.score = score;
    }

    /**
     * @return the size
     */
    

    /**
     * @param size the size to set
     */
   

    /**
     * @return the missed
     */
    public JLabel getMissed() {
        return missed;
    }

    /**
     * @param missed the missed to set
     */
    public void setMissed(JLabel missed) {
        this.missed = missed;
    }

    /**
     * @return the siz
     */
    public JSlider getSiz() {
        return siz;
    }

    /**
     * @param siz the siz to set
     */
    public void setSiz(JSlider siz) {
        this.siz = siz;
    }
   
}


