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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import union.codebreakers.command.CommandSaveFile;
import union.codebreakers.controller.simulator.SimulatorManager;
import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.helper.enums.KeyboardBehaviorType;
import union.codebreakers.model.ModelAutomaton;
import union.codebreakers.view.ViewText;

/**
 * Controller handling manipulation with menu
 */
public class ToolbarController implements ActionListener{
    
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
            } else if(item.getName().equals("buttonPathPrompt")) {
                this.doPrompt();
            } else if(item.getName().equals("buttonStart")) {                
                this.doStart();
            }    
        }
        this.container.getDrawingArea().grabFocus();
        this.container.getDrawingArea().repaint();
    }

    private void doNew(){
        ModelAutomaton newFsm = new ModelAutomaton();
        this.container.getMainController().setAutomaton(newFsm);
        this.container.getDrawingArea().repaint();        
    }

    private void doOpen(){
        
        JFileChooser browser = new JFileChooser();
        File myFile = new File("/Users/joshualoew/NetBeansProjects/FiniteStateMachine/");
        
        browser.setCurrentDirectory(myFile);
        browser.showOpenDialog(null);
        
    }

    private void doSave(){
        CommandSaveFile commandSaveFile = new CommandSaveFile(this.container);
        this.container.getCommandCenter().execute(commandSaveFile);
    }

    private void doSaveAs(){
        
//        this.mainFrame.getGraphicsPainting()
        BufferedImage bImg = new BufferedImage(this.container.getDrawingArea().getWidth(), this.container.getDrawingArea().getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D cg = bImg.createGraphics();
        this.container.getMainController().getViewImage().setOutput(cg);
        this.container.getMainController().getViewImage().drawOutput();
        try {
                if (ImageIO.write(bImg, "png", new File("./automaton.png")))
                {
                    System.out.println("-- saved");
                }
        } catch (IOException e) {
            //TODO catch this exception
        }
        finally{
        this.container.getMainController().getViewImage().setOutput(this.container.getDrawingArea().getGraphics());            
        }
    }
    
    private void doQuit(){
        System.exit(0);
    }
    
    private void doPrompt() {
        
        String myName = JOptionPane.showInputDialog("input path to simulate");
        this.container.setSimulatorManager(new SimulatorManager(this.container));
        this.container.getSimulatorManager().setInputString(myName);
        
        
    }
    
    private void doStart() {
        
        System.out.println("doStartCalled");
        
        if (this.container.getSimulatorManager() != null){
            System.out.println("simulator manager is not null");
            this.container.getSimulatorManager().Simulate();
            System.out.println("got through");
        }
        //this.container.getKeyboardBehaviorManager().setKeyboardBehavior(KeyboardBehaviorType.eInitial, true);

        //let the simulator take over drawing etc
        
    }
}
