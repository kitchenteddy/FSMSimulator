package union.codebreakers.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import union.codebreakers.command.CommandLoadFile;
import union.codebreakers.command.CommandSaveFile;
import union.codebreakers.controller.simulator.SimulatorManager;
import union.codebreakers.helper.Container;
import union.codebreakers.model.ModelAutomaton;

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
            } else if(item.getName().equals("buttonQuit")){
                this.doQuit();
            } else if(item.getName().equals("buttonPathPrompt")) {
                this.doPrompt();
            } else if(item.getName().equals("buttonStart")) {                
                this.doStart();
            }    
        }
    }

    private void doNew(){
        ModelAutomaton newFsm = new ModelAutomaton();
        this.container.getMainController().setAutomaton(newFsm);
        this.container.getDrawingArea().repaint();        
    }

    private void doOpen(){
        CommandLoadFile command = new CommandLoadFile( this.container );
        this.container.getCommandCenter().execute(command);
        
    }

    private void doSave(){
        CommandSaveFile commandSaveFile = new CommandSaveFile(this.container);
        this.container.getCommandCenter().execute(commandSaveFile);
    }
    
    private void doQuit(){
        System.exit(0);
    }
    
    private void doPrompt() {
        
        String myName = JOptionPane.showInputDialog("input path to simulate");
        this.container.setSimulatorManager(new SimulatorManager(this.container) );
        this.container.getSimulatorManager().addObserver(this.container.getObserverView());
        this.container.getSimulatorManager().setInputString(myName);
    }
    
    private void doStart() {
        
        System.out.println("doStartCalled");
        
        if (this.container.getSimulatorManager() != null){
            this.container.getSimulatorManager().Simulate();
        }
    }
}
