package union.codebreakers.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import union.codebreakers.gui.MainFrame;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.ModelAutomaton;
import union.codebreakers.view.ViewImage;

/**
 * The main controller
 */
public class MainController{

    private MainFrame myFrame = null;
    private MenuController menuController = null;
    private AutomatonController automatonController = null;
    private ControllerPersonal personalController = null;
    
    private Automaton fsm = null;
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
        catch(IOException e){
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
        this.fsm = new ModelAutomaton();
        this.view = new ViewImage(this.fsm);

        this.menuController = new MenuController();
        this.automatonController = new AutomatonController();
        this.myFrame = new MainFrame();
        this.personalController.setFrame(this.myFrame);
        this.myFrame.setMainController(this);
        
        this.menuController.setMainFrame(this.myFrame);
        this.automatonController.setMainFrame(this.myFrame);

        this.myFrame.init();
        this.myFrame.run();
    }
    
    /**
     * Gets currently handled automaton
     * 
     * @return Instance of automaton
     */
    public Automaton getAutomaton(){
        return this.fsm;
    }
    
    /**
     * Gets instance of MenuController
     * 
     * @return instance of MenuController
     */
    public MenuController getMenuController(){
        return this.menuController;
    }

    /**
     * Gets instance of AutomatonController
     * 
     * @return instance of AutomatonController
     */
    public AutomatonController getAutomatonController(){
        return this.automatonController;
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
}
