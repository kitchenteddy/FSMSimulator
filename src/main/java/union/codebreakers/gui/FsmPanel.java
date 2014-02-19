package union.codebreakers.gui;

import javax.swing.JPanel;
import union.codebreakers.view.ViewImage;

/**
 * Panel to draw FSM on
 */
public class FsmPanel extends JPanel{
    
    private ViewImage view = null;
    
    /**
     * Sets view used to paint FSM to this panel
     * 
     * @param v Instance of view
     */
    public void setVew(ViewImage v){
        this.view = v;
        this.view.setOutput(this.getGraphics());
    }
    
    /**
     * Handles painting of FSM
     */
    @Override
    public void repaint(){
        if( this.view != null ){
            this.view.setOutput(this.getGraphics());
            this.view.drawOutput();
        }
    }
}