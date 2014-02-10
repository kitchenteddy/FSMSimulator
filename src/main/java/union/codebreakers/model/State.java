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
    
    /*
    returns the state's type
    @return StateType of the state
    */
    public StateType getType();
    
    /*
    * sets the state's type
    @param StateType of the state
    */
    public void setType(StateType newType);
    
    /*
    * gets the number of outgoing paths that this state has
    * @return number of outgoing paths
    */
    public int getPathNum();
        
    /*
    * gets a point representing the position of a state
    * @return point for position of state
    */
    public Point getPos();
    
    /*
    *
    * sets the position of the state
    *
    * @param desired position point
    */
    public void setPos(Point position);
    
    /*
    *
    * sets the position of the state
    *
    * @param desired x postion
    * @param desired y position
    */
    public void setPos(int x, int y);
    
    /*
    *
    * gets the name of the state as a string
    *
    * @return string for the name of state
    */
    public String getName();
    
    /*
    *
    * sets the name of the state
    *
    * @param String for desired name
    */
    public void setName(String newName);
    
    /*
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
}

