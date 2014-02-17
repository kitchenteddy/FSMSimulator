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
public class MainController implements Controller, ActionListener{

    private MainFrame myFrame = null;
    private MenuController menuController = null;
    private AutomatonController automatonController = null;

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
        ControllerPersonal controller = null;
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

                if( runAppCode ) {
                    this.runAppCode();
                }
                switch( customCode ) {
                    case 1: // Lukas controller
                        controller = new ControllerPersonalLukas( this.myFrame );
                        break;
                    case 2: // Josh controller
                        controller = new ControllerPersonalJosh( this.myFrame );
                        break;
                    case 3: // Teddy controller
                        controller = new ControllerPersonalTeddy( this.myFrame );
                        break;
                }
            }
        }
        catch(IOException e){
            this.runAppCode();
        }

        if( customCode > 0 ){
            if( controller != null ) {
                controller.run();                
            }
        }
    }

    /**
     * Runs main application code
     */	
    public void runAppCode(){

        this.menuController = new MenuController();
        this.automatonController = new AutomatonController();
        this.myFrame = new MainFrame(this);
        this.menuController.setMainFrame(this.myFrame);
        this.automatonController.setMainFrame(this.myFrame);
        
        this.myFrame.setVisible(true);
    }
    
    /**
     * Handles events which occur on the frame
     * 
     * @param e Event that occurred
     */
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    
    /**
     * Gets MenuController to work with
     * 
     * @return Instance of MenuController to work with
     */
    public MenuController getMenuController() {
        return this.menuController;
    }

    /**
     * Gets AutomatonController to work with
     * 
     * @return Instance of MenuController to work with
     */
    public AutomatonController getAutomatonController() {
        return this.automatonController;
    }
}
