package union.codebreakers.gui;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Main frame of the application
 */
public class MainFrame extends JFrame{
    
    private JPanel panel;
    
    public MainFrame(){
        this.initElements();
    }
    
    public void initElements(){
        this.setSize(500, 500);
        
        this.panel = new JPanel();
        this.getContentPane().add(this.panel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
    }

    public Graphics getGraphicsPainting(){
        return this.panel.getGraphics();
    }
}
