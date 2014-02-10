/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller;

import union.codebreakers.gui.MainFrame;

/**
 * Base class for personalized controller
 */
public class ControllerPersonal implements ControllerPersonalGeneric{
    
    /**
     * Pointer to the actual frame
     */
    protected MainFrame frame;

    /**
     * Constructor
     * @param f Actual frame
     */
    ControllerPersonal(MainFrame f){
        this.frame = f;
    }
    
    /**
     * Gives you currently displayed frame
     * @return Instance of the frame
    */
    @Override
    public MainFrame getFrame(){
        return this.frame;
    }
    
    /**
     * Sets currently displayed frame
     * @param f Instance of the frame
    */
    @Override
    public void setFrame(MainFrame f){
        this.frame = f;
    }

    /**
     * Runs personalised code
     */
    @Override
    public void run() {
    }
}
