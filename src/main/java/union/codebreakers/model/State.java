package union.codebreakers.model;

import union.codebreakers.helper.StateType;
import java.awt.Point;

/**
 * Interface for state model
 */
public  interface State 
{
    
    /**
     * Returns the state's type
     * 
     * @return StateType of the state
    */
    public StateType getType();
    
    /**
     * Sets the state's type
     * 
     * @param newType New type of the state
    */
    public void setType(StateType newType);
    
    /**
    * Gets the number of outgoing paths that this state has
    * 
    * @return number of outgoing paths
    */
    public int getPathNum();
        
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
    * Sets the position of the state
    *
    * @param x desired x postion
    * @param y desired y position
    */
    public void setPos(int x, int y);
    
    /**
    * Gets the label of the state
    *
    * @return Label for the state
    */
    public Label getLabel();
    
    /**
    * Sets the name of the state
    *
    * @param newLabel New label for this state
    */
    public void setLabel(Label newLabel);
    
    /**
     * Gets all outgoing paths from this state
     * 
     * @return Iterable set of all outgoing paths from this state
     */
    public Iterable<Path> getPaths();
    
    /**
     * Returns radius of state
     * 
     * @return radius of state
     */
    public int getRadius();
}

