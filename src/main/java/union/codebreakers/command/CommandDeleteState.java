package union.codebreakers.command;

import union.codebreakers.helper.Container;
import union.codebreakers.model.State;

/**
 * This command takes care of adding a new state to a FSM
 */
public class CommandDeleteState implements Command{
    
    private Container container;
    private State state;
    
    
    public CommandDeleteState(Container c, State s){
        this.state = s;
        this.container = c;
    }
    
    /**
    * This method executes command
    * 
    * @return Whether the execution was successful or not
    */
    @Override
    public boolean execute() {
        this.container.getMainController().getAutomaton().removeState(this.container.getCollisionHandler().getSelectedState());
        this.container.getCollisionHandler().setSelectedState(null);
        
        return true;
    }
    
}
