package union.codebreakers.controller;

import union.codebreakers.gui.MainFrame;

/**
 * Interface for personalized controllers to run our code separately
 */
public interface ControllerPersonalGeneric {

    /**
     * Gives you currently displayed frame
     * @return Instance of the grame
    */
    public MainFrame getFrame();

    /**
     * Sets currently displayed frame
     * @param f Instance of the grame
    */
    public void setFrame(MainFrame f);

    /**
     * Runs personalised code
     */
    public void run();
}
