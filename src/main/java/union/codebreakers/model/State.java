package union.codebreakers.model;

import union.codebreakers.helper.enums.StateType;
import java.awt.Point;
import java.util.List;

/**
 * Interface for state model
 */
public  interface State 
{
    
   /**
    * Removes an outgoing path from the state
    * 
    * @param toRemove
    */   
    public void removePath(Path toRemove);
    
    
    
    
    
   /**
    * Adds an outgoing path to the state
    * 
    * @param destination  destination of the path;
    */   
    public void addPath(State destination);
    
   /**
    * Returns the state's type
    * 
    * @return StateType of the state
    */
    public StateType getType();
    
   /**
    * Sets the state's type
    * 
    * @param newType StateType of the state
    */
    public void setType(StateType newType);
        
   /**
    * Gets a point representing the position of a state
    * 
    * @return point for position of state
    */
    public Point getPos();
    
   /**
    * Sets the position of the state
    *
    * @param position desired position point
    */
    public void setPos(Point position);
    
    /**
    * Gets the label of the state
    *
    * @return Label for the state
    */
    public Label getLabel();
    
   /**
    * Sets the Label of the state
    *
    * @param newLabel New label for this state
    */
    public void setLabel(Label newLabel);
    
    /**
    * Gets an list collection of the outgoing paths
    *
    * @return outgoing paths in list collection
    */
    public List<Path> getPaths();
    
    /**
     * 
     * @return list of incoming paths
     */
    public List<Path> getIncomingPaths();
    
    
    /**
     * adds an incoming path
     * @param incoming 
     */
    public void addIncomingPath(Path incoming);
    
    
    /**
     * Returns the path going to the destination State
     * 
     * @param destination Gets path between these two states
     * 
     * @return Path
     */
    public Path getPathTo(State destination);
}

