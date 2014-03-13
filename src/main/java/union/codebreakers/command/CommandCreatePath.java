package union.codebreakers.command;

import union.codebreakers.helper.Container;
import union.codebreakers.helper.enums.PathType;
import union.codebreakers.model.AutomatonPart;
import union.codebreakers.model.ModelPath;
import union.codebreakers.model.State;

/**
 * This command takes care of adding a new path between two states
 */
public class CommandCreatePath implements Command{

    private State from, to;
    private Container container;
    
    /**
     * Constructor
     * 
     * @param newFrom       Starting point for path
     * @param newTo         Ending point for path
     * @param newContainer  Shared Container
     */
    public CommandCreatePath(State newFrom, State newTo, Container newContainer){
        this.from = newFrom;
        this.to = newTo;
        this.container = newContainer;
    }
    
    /**
    * This method executes command
    * 
    * @return Whether the execution was successful or not
    */
    @Override
    public boolean execute() {  
        ModelPath newPath = new ModelPath(this.from, this.to, ((AutomatonPart)(this.from)).getAutomaton());
        newPath.addObserver(this.container.getObserverView() );
        PathType type;
        if (from == to) {
            newPath.setType(PathType.eSelf);
        } else {
            newPath.setType(PathType.eNormal);
        }
  
        this.from.addPath(newPath);
        // add creating label here
        return true;
    }
}