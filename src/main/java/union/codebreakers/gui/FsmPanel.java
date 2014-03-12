package union.codebreakers.gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
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
            this.deleteCanvas();
            BufferedImage bImg = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D newGraphics = bImg.createGraphics();
            
            this.view.setOutput(newGraphics);
            this.view.drawOutput();
            this.getGraphics().drawImage(bImg, 0, 0, null);
        }
    }
    
    /**
     * Prepares canvas for drawing
     */
    private void deleteCanvas(){
        this.getGraphics().fillRect(-1, -1, this.getWidth() + 2, this.getHeight() + 2);
    }
}