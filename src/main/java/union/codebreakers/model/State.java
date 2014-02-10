package union.codebreakers.model;

import union.codebreakers.helper.StateType;
import java.awt.Point;

/**
 * Interface for state model
 */
public  interface State 
{
    
   /**
    * 
    * removes an outgoing path from the state
    * @param toRemove
    */   
    public void removePath(Path toRemove);
    
   /**
    * adds an outgoing path to the state
    * @param destination  destination of the path;
    */   
    public void addPath(State destination);
    
   /**
    * returns the state's type
    * @return StateType of the state
    */
    public StateType getType();
    
   /**
    *
    * sets the state's type
    * @param newType StateType of the state
    */
    public void setType(StateType newType);
    
    /**
    * gets the number of outgoing paths that this state has
    * @return number of outgoing paths
    */
    public int getPathNum();
        
   /**
    * 
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
    * @param x desired x position
    * @param y desired y position
    */
    public void setPos(int x, int y);
    
    /**
     * 
    * Gets the label of the state
    *
    * @return Label for the state
    */
    public Label getLabel();
    
   /**
    * 
    * Sets the Label of the state
    *
    * @param newLabel New label for this state
    */
    public void setLabel(Label newLabel);
    
    /**
    *
    * gets an iterable of the outgoing paths
    *
    * @return outgoing paths iterable
    */
    public Iterable<Path> getPaths();
    
    /**
     * Returns radius of state
     * 
     * @return radius of state
     */
    public int getRadius();
    
    /**
     * Returns the path going to the destination State
     * @param destination Gets path between these two states
     * @return Path
     */
    public Path getPathTo(State destination);

    /**
     * Returns collidable version of state
     * @return Collidable state
     */
    public Collidable getCollidable();

}

