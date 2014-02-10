/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import union.codebreakers.gui.MainFrame;


/**
 *
 * @author 3lf
 */
public class MainController {
        private static MainFrame myFrame = null;
    
        public static void main(String [] args)
	{

            MainController.runController();
	}
        
        public static void runController(){
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
                    
                    switch( customCode ) {
                        case 1: // Lukas controller
                            controller = new ControllerPersonalLukas( MainController.myFrame );
                            break;
                        case 2: // Josh controller
                            controller = new ControllerPersonalJosh( MainController.myFrame );
                            break;
                        case 3: // Teddy controller
                            controller = new ControllerPersonalTeddy( MainController.myFrame );
                            break;
                    }
                }
            }
            catch(IOException e){
                MainController.runAppCode();
            }
            finally{
                if( runAppCode ) {
                    MainController.runAppCode();
                }
            }
            if( customCode > 0 ){
                controller.setFrame(MainController.myFrame);
                controller.run();
            }
        }
                
        public static void runAppCode(){
           MainController.myFrame = new MainFrame();
            MainController.myFrame.setVisible(true);
        }

}
