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

    private static MainFrame myFrame = null;
    private static MenuController menuController = null;
    private static AutomatonController automatonController = null;
    private static ControllerPersonal personalController = null;

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
        MainController.runController();
    }

    /**
     * Decides what code to run
     */	
    public static void runController(){
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
                        MainController.personalController = new ControllerPersonalLukas();
                        break;
                    case 2: // Josh controller
                        MainController.personalController = new ControllerPersonalJosh();
                        break;
                    case 3: // Teddy controller
                        MainController.personalController = new ControllerPersonalTeddy();
                        break;
                }
            }
        }
        catch(IOException e){
            MainController.runAppCode();
        }
        if( runAppCode ) {
            MainController.runAppCode();
        }
    }

    /**
     * Runs main application code
     */	
    public static void runAppCode(){

        MainController.menuController = new MenuController();
        MainController.automatonController = new AutomatonController();
        MainController.myFrame = new MainFrame();
        MainController.personalController.setFrame(MainController.myFrame);
        MainController.myFrame.setPersonalController(MainController.personalController);
        
        MainController.menuController.setMainFrame(MainController.myFrame);
        MainController.automatonController.setMainFrame(MainController.myFrame);
       MainController.myFrame.setAutomatonController(automatonController);
        MainController.myFrame.setMenuController(menuController);

        MainController.myFrame.init();
        MainController.myFrame.run();
    }
}
