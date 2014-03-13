package union.codebreakers.controller;

import java.util.Observable;
import java.util.Observer;
import union.codebreakers.gui.FsmPanel;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.AutomatonPart;

/**
 *  Observer watching over models and handling repainting view (graphical)
 */
public class ObserverView implements Observer{
    
    private FsmPanel view;
    
    /**
     * This method sets view for this observer
     * 
     * @param   newView     Instance of panel where this observer draws all changes
     */
    public void setView( FsmPanel newView ){
        this.view = newView;
    }
    
    /**
     * This method responds to notification from observables
     * 
     * @param obj   Observable element
     * @param arg   Arguments from observable element
     */
    @Override
    public void update(Observable obj, Object arg) {
        Boolean doRepaint = (Boolean)arg;
        if( doRepaint ){
            this.view.repaint();
        }
   }    
}
