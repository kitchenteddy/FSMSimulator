package union.codebreakers.controller;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import union.codebreakers.gui.MainFrame;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.ModelAutomaton;
import union.codebreakers.view.ViewImage;

/**
 * The main controller
 */
public class MainController{

    private Automaton fsm = null;
    private MainFrame myFrame = null;
    private ControllerPersonal personalController = null;
    
    private ViewImage view = null;

    /**
     * Main function of the application
     * @param args
     */	
    public static void main(String [] args)
    {
        MainController controller = new MainController();
        controller.runController();
    }

    /**
     * Decides what code to run
     */	
    public void runController(){
        boolean runAppCode = true;
        int customCode = 0;
        // get config from file
        try{
            File f = new File( "config.lssd" );
            if( f.exists() ) {

                FileReader fileReader = new FileReader(f);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line1 = bufferedReader.readLine();
                String line2 = bufferedReader.readLine();
                fileReader.close();                
                runAppCode = Integer.parseInt(line1) == 1;
                customCode = Integer.parseInt(line2) % 4;

                switch( customCode ) {
                    case 1: // Lukas controller
                        this.personalController = new ControllerPersonalLukas();
                        break;
                    case 2: // Josh controller
                        this.personalController = new ControllerPersonalJosh();
                        break;
                    case 3: // Teddy controller
                        this.personalController = new ControllerPersonalTeddy();
                        break;
                }
            }
        }
        catch(Exception e){
            this.runAppCode();
        }
        if( runAppCode ) {
            this.runAppCode();
        } else if( customCode > 0 ) { // only for simple stuff
            this.personalController.run();
        }
    }

    /**
     * Runs main application code
     */	
    public void runAppCode(){
        ModelAutomaton newFsm = new ModelAutomaton();
        this.view = new ViewImage();
        this.setAutomaton(newFsm);
        this.myFrame = new MainFrame();
        if( this.personalController != null ) {
            this.personalController.setFrame(this.myFrame);            
        }
        this.myFrame.setMainController(this);

        this.myFrame.init();
        this.myFrame.run();
    }

    /**
     * Gets instance of ControllerPersonal
     * 
     * @return instance of ControllerPersonal
     */
    public ControllerPersonal getPersonalController(){
        return this.personalController;
    }
    
    /**
     * Gets pointer to instance of connected ViewImage
     * 
     * @return Instance of connected ViewImage
     */
    public ViewImage getViewImage(){
        return this.view;
    }
    
    /**
     * Gets pointer to the current Automaton
     * 
     * @return instance of Automaton
     */
    public Automaton getAutomaton(){
        return this.fsm;
    }
    
    /**
     * Sets currently handled automaton
     * 
     * @param newFsm Instance of automaton
     */
    public void setAutomaton(Automaton newFsm){
        this.fsm = newFsm;
        this.view.setAutomaton(newFsm);
    }
}
