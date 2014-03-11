package union.codebreakers.command;

import java.awt.Point;
import union.codebreakers.gui.FsmPanel;
import union.codebreakers.helper.CollisionHandler;
import union.codebreakers.helper.enums.LabelType;
import union.codebreakers.helper.enums.StateType;
import union.codebreakers.model.Automaton;
import union.codebreakers.model.ModelLabel;
import union.codebreakers.model.ModelState;
import union.codebreakers.view.drawer.stateDrawer.StateDrawer;
import javax.swing.JOptionPane;
/**
 * This command takes care of adding a new state to a FSM
 */
public class CommandCreateState implements Command{

    private Point pos;
    private Automaton fsm;
    private CollisionHandler handler;
    private FsmPanel drawingArea;
    
    /**
     * Constructor
     * 
     * @param newFsm    Automaton to add the new state to
     * @param position  Position of state
     * @param newArea   Drawing area of FSM
     */
    public CommandCreateState(Automaton newFsm, Point position, FsmPanel newArea){
        this.fsm = newFsm;
        this.pos = position;
        this.handler = null;
        this.drawingArea = newArea;
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
        int size = this.fsm.getCollectionStates().size();
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
            ModelState ms = new ModelState(type, this.pos, ml, this.fsm);
            if( this.handler != null ){
                this.handler.setSelectedState(ms);                
            }
            this.fsm.addState(ms);
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
            ( where.x + dim.x/2 > this.drawingArea.getWidth() ) ||
            ( where.y - dim.y/2 < 0 ) ||
            ( where.y - dim.y/2 > this.drawingArea.getHeight() )
          ){
            result = false;
        }
        return result;
    }
}