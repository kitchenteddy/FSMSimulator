package union.codebreakers.model;

import union.codebreakers.helper.StateType;
import java.awt.Point;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
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
    * @param the destination of the path;
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
    * @param StateType of the state
    */
    public void setType(StateType newType);
    
    /**
    * gets the number of outgoing paths that this state has
    * @return number of outgoing paths
    */
    public int getPathNum();
        
    /**
    * gets a point representing the position of a state
    * @return point for position of state
    */
    public Point getPos();
    
    /**
    *
    * sets the position of the state
    *
    * @param desired position point
    */
    public void setPos(Point position);
    
    /**
    *
    * sets the position of the state
    *
    * @param desired x postion
    * @param desired y position
    */
    public void setPos(int x, int y);
    
    /**
    *
    * gets the label of the state
    *
    * @return  Label
    */
    public Label getLabel();
    
    /**
    *
    * sets the name of the state
    *
    * @param String for desired name
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
     * @return radius of state
     */
    public int getRadius();

    
    
    /**
     * Returns the path going to the destination State
     * @return Path
     */
    public Path getPathTo(State destination);






    /**
     * Returns collidable version of state
     * @return Collidable state
     */
    public Collidable getCollidable();

}

