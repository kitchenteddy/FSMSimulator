package union.codebreakers.model;
import java.util.ArrayList;
import java.awt.Point;
import union.codebreakers.helper.StateType;


/**
 * Model for state
 */
public class ModelState implements State, Movable, Collidable
{
    /**
     * Type of this state
     */
    private StateType type;

    /**
     * Position of this state
     */
    private Point position;

    /**
     * Iterable set of outgoing paths
     */
    private Iterable<Path> outgoingPaths;

    /**
     * Label of this tate
     */
    private Label stateLabel;

    /**
     * Constructor
     */
    public ModelState(){
            super();
    }

    /**
     * Returns the state's type
     * 
     * @return StateType of the state
    */
    @Override
    public StateType getType(){
        return this.type;
    }

    /**
     * Sets the state's type
     * 
     * @param newType New type of the state
    */
    @Override
    public void setType(StateType newType){
        this.type = newType;
    }

    /**
    * Gets the number of outgoing paths that this state has
    * 
    * @return number of outgoing paths
    */
    @Override
    public int getPathNum()
    {
        return 0;  //IMPLEMENT
    }
        
    /**
    * Gets a point representing the position of a state
    * 
    * @return point for position of state
    */
    @Override
    public Point getPos()
    {
        return new Point();
    }
    
    /**
    * Sets the position of the state
    *
    * @param position desired position point
    */
    @Override
    public void setPos(Point position)
    {
        //IMPLEMENT
    }
    
    /**
    * Sets the position of the state
    *
    * @param x desired x postion
    * @param y desired y position
    */
    @Override
    public void setPos(int x, int y)
    {
        //IMPLEMENT
    }
    
    /**
    * Gets the label of the state
    *
    * @return Label for the state
    */
    @Override
    public Label getLabel()

    {
        return null; //IMPLEMENT
    }
    
    /**
    * Sets the name of the state
    *
    * @param newLabel New label for this state
    */
    @Override
    public void setLabel(Label newLabel)
    {
        
    }
    
    /**
     * Gets all outgoing paths from this state
     * 
     * @return Iterable set of all outgoing paths from this state
     */
    @Override
    public Iterable<Path> getPaths()
    {
        //implement
        return new ArrayList();
    }
	
    /**
     * Checks, if this element collides with the point
     * @param pnt POint to check collision with
     * 
     * @return Whether the collision occurred
     */
    @Override
    public boolean isCollision(Point pnt) {
        // TODO : to implement
        return false;	
    }

    /**
     * Returns radius of state
     * 
     * @return radius of state
     */
    @Override
    public int getRadius(){
        return 10;
    }
}

