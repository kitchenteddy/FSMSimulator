package union.codebreakers.controller;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import union.codebreakers.gui.MainFrame;
import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.model.ModelAutomaton;
import union.codebreakers.view.ViewText;

/**
 * Controller handling manipulation with menu
 */
public class ToolbarController implements ActionListener{
    
    private MainFrame mainFrame = null;
    private Container container;
    
    /**
     * Sets container for this controller
     * 
     * @param c Instance of container
     */
    public void setContainer(Container c){
        this.container = c;
    }

    /**
     * Sets pointer to main frame
     * 
     * @param frame 
     */
    public void setMainFrame(MainFrame frame){
        this.mainFrame = frame;
    }

    /**
     * Handles events which occur in menu
     * 
     * @param e Event that occurred
     */
    @Override
    public void actionPerformed(ActionEvent e){
        if( e.getSource() instanceof JButton ) {
            JButton item = (JButton)e.getSource();
            if( item.getName().equals("buttonNew") ){
                this.doNew();
            } else if(item.getName().equals("buttonOpen") ){
                this.doOpen();
            } else if(item.getName().equals("buttonSave")){
                this.doSave();
            } else if(item.getName().equals("buttonSaveAs")){
                this.doSaveAs();
            } else if(item.getName().equals("buttonQuit")){
                this.doQuit();
            }
        }
        this.mainFrame.getDrawingPlace().repaint();
    }

    private void doNew(){
//        this.mainFrame.update(this.mainFrame.getGraphicsPainting());
        ModelAutomaton newFsm = new ModelAutomaton();
        this.mainFrame.getMainController().setAutomaton(newFsm);
        this.mainFrame.getDrawingPlace().repaint();        
    }

    private void doOpen(){
    }

    private void doSave(){
        ViewText view = new ViewText( this.mainFrame.getMainController().getAutomaton());
        PrintWriter out;
        try{
            out = new PrintWriter("automaton.read");
            view.setTypeOutput(FormatterType.eReadable);
            out.println(view.getOutput());
            out.flush();
            out.close();
        } catch (Exception e){
        }
    }

    private void doSaveAs(){
//        this.mainFrame.getGraphicsPainting()
        BufferedImage bImg = new BufferedImage(this.mainFrame.getDrawingPlace().getWidth(), this.mainFrame.getDrawingPlace().getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D cg = bImg.createGraphics();
        this.mainFrame.getMainController().getViewImage().setOutput(cg);
        this.mainFrame.getMainController().getViewImage().drawOutput();
        try {
                if (ImageIO.write(bImg, "png", new File("./automaton.png")))
                {
                    System.out.println("-- saved");
                }
        } catch (IOException e) {
            //TODO catch this exception
        }
        finally{
        this.mainFrame.getMainController().getViewImage().setOutput(this.mainFrame.getGraphicsPainting());            
        }
    }
    
    private void doQuit(){
        System.exit(0);
    }
}
