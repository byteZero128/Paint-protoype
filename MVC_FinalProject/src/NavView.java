/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy
 */
public class NavView {
    private InitialFrame iframe;
    private NavModel model;
    private TopPanel tp; 
    NavView(NavModel model) 
    {
        this.model = model;
        iframe = new InitialFrame();
        
    }

    public InitialFrame getIframe() {
        return iframe;
    }

    public void setIframe(InitialFrame iframe) {
        this.iframe = iframe;
    }

    public NavModel getModel() {
        return model;
    }

    public void setModel(NavModel model) {
        this.model = model;
    } 

    /**
     * @return the tp
     */
    public TopPanel getTp() {
        return tp;
    }

    /**
     * @param tp the tp to set
     */
    public void setTp(TopPanel tp) {
        this.tp = tp;
    }
}
