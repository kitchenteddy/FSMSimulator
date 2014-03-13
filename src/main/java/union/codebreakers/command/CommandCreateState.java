package union.codebreakers.command;

import java.awt.Point;
import union.codebreakers.helper.CollisionHandler;
import union.codebreakers.helper.enums.LabelType;
import union.codebreakers.helper.enums.StateType;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelState;
import union.codebreakers.view.drawer.stateDrawer.StateDrawer;
import javax.swing.JOptionPane;
import union.codebreakers.helper.Container;
/**
 * This command takes care of adding a new state to a FSM
 */
public class CommandCreateState implements Command{

    private Point pos;
    private CollisionHandler handler;
    private Container container;
    
    /**
     * Constructor
     * 
     * @param position      Position of state
     * @param newContainer  Shared Container
     */
    public CommandCreateState(Point position, Container newContainer){
        this.pos = position;
        this.handler = null;
        this.container = newContainer;
    }
    
    /**
     * Sets up collision handler to be updated
     * 
     * @param newHandler Instance of CollisionHandler to update selected state for
     */
    public void setUpdateSelected(CollisionHandler newHandler){
        this.handler = newHandler;
    }
    
    /**
    * This method executes command
    * 
    * @return Whether the execution was successful or not
    */
    @Override
    public boolean execute() {
        boolean res = false;
        int size = this.container.getMainController().getAutomaton().getCollectionStates().size();
        ModelLabel ml = new ModelLabel();
        String myName = JOptionPane.showInputDialog("input state name");
        
        //TBK
        // THIS keeps the app from crashing if cancel is selected by user in dailog box
        // Also makes cancel no longer still create a state
        if (myName == null)
        {
            return res;
        }
        else
        {
            
            ml.setName(myName);
        }
                
        ml.setType(LabelType.eState);
        StateType type = size == 0 ? StateType.eStart : StateType.eNormal;                

        if( this.checkWithinBoundaries(this.pos, type)){
            ModelState ms = new ModelState(type, this.pos, ml, this.container.getMainController().getAutomaton());
            ml.addObserver(this.container.getObserverView());
            ms.addObserver(this.container.getObserverView());
            ml.setParent(ms);
            if( this.handler != null ){
                this.handler.setSelectedState(ms);                
            }
            this.container.getMainController().getAutomaton().addState(ms);
            res = true;
        }
        return res;
    }
    
    /**
     * Checks, if the state can be drawn at that position
     * 
     * @param where
     * @param type
     * @return 
     */
    private boolean checkWithinBoundaries(Point where, StateType type){
        boolean result = true;
        Point dim = StateDrawer.getDimensions(type);
        
        if( 
            ( where.x - dim.x/2 < 0 ) ||
            ( where.x + dim.x/2 > this.container.getDrawingArea().getWidth() ) ||
            ( where.y - dim.y/2 < 0 ) ||
            ( where.y - dim.y/2 > this.container.getDrawingArea().getHeight() )
          ){
            result = false;
        }
        return result;
    }
}