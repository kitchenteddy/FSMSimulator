package union.codebreakers.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import union.codebreakers.gui.MainFrame;

/**
 * The main controller
 */
public class MainController implements Controller{

    private MainFrame myFrame = null;
    private MenuController menuController = null;
    private AutomatonController automatonController = null;
    private ControllerPersonal personalController = null;

    /**
     * Assigns actions from user to controller's methods 
     */	
    @Override
    public void InitializeActions(){

    }

    /**
     * Handles saveAsImage action from user
     */	
    @Override
    public void saveAsImage(){

    }

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
}
