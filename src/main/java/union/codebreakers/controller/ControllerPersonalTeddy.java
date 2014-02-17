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
     * Runs personalised code
     */
    @Override
    public void run() {
        
        
        Automata fsm = new ModelAutomata();
        
        ModelFormatterVisitor formatter = new ModelFormatterVisitor();
        
        ModelState firstState = new ModelState(StateType.eStart, new Point(0,0), new ModelLabel());
        
        fsm.addState(firstState);
        FormattableAutomata myFormattable = new FormattableAutomata(fsm);
        
        String myPrintOut = formatter.visitElement(myFormattable, FormatterType.eReadable);
        System.out.println(myPrintOut);
        
        
        
        
        System.out.println("TESTING BITCHES");
        
        
    }
}
