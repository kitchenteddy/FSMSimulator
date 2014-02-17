package union.codebreakers.controller;
import union.codebreakers.model.*;
import union.codebreakers.gui.MainFrame;
import union.codebreakers.view.formatter.*;
import union.codebreakers.helper.*;
import java.awt.Point;
/**
 *
 */
public class ControllerPersonalTeddy extends ControllerPersonal{

    /**
     * Constructor
     * @param f Actual frame
     */
    public ControllerPersonalTeddy(MainFrame f) {
        super(f);
    }
    
    /**
     * Runs personalised code
     */
    @Override
    public void run() {
        
        
        ModelAutomata fsm = new ModelAutomata();
        
        ModelFormatterVisitor formatter = new ModelFormatterVisitor();
        
        ModelState firstState = new ModelState(StateType.eStart, new Point(0,0), new ModelLabel());
        
        fsm.addState(firstState);
        
        String myPrintOut = formatter.visitElement(firstState);
        System.out.println(myPrintOut);
        
        
        
        
        System.out.println("TESTING BITCHES");
        
        
    }
}
