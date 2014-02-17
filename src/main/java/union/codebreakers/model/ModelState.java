package union.codebreakers.model;
import java.util.ArrayList;
import java.awt.Point;
import union.codebreakers.helper.StateType;
import union.codebreakers.view.formatter.FormatterVisitor;

/**
 * 
 * ModelState class
 * 
 * 
 */
public class ModelState implements State, Movable, Collidable
{
    private StateType type;
    private Point position;
    private ArrayList<Path> outgoingPaths;
    private Label stateLabel;

    /**
     * Constructor method for ModelState
     */
    public ModelState(){
            
    }
    
    
    /**
     * non default constructor for StateLabel
     * @param type
     * @param pos
     * @param stateLabel 
     */
    public ModelState(StateType myType, Point myPos, Label myLabel)
    {
        this.type = myType;
        this.position = myPos;
        this.stateLabel = myLabel;
        this.outgoingPaths = new ArrayList<Path>();
        
        
    }
    
    /**
     * Adds outgoing path from this state
     * @param destination Destination state
     */
    @Override
    public void addPath(State destination)
    {
        
        Path newPath = new ModelPath(this, destination);
        this.outgoingPaths.add(newPath);
    }

   /**
    * 
    * removes an outgoing path from the state
    * @param toRemove
    */   
    public void removePath(Path toRemove)
    {
        this.outgoingPaths.remove(toRemove);
    }

   /**
    * returns the state's type
    * @return StateType of the state
    */
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
    public int getPathNum()
    {
        return this.outgoingPaths.size();   
    }
        
   /**
    * Gets a point representing the position of a state
    * 
    * @return point for position of state
    */
    public Point getPos()
    {
        return this.position;
    }
    

    /**
     * 
    * Sets the position of the state
    *
    * @param position desired position point
    */
    public void setPos(Point position)
    {
        this.position = position;
    }
    

    /**
    * Sets the position of the state
    *
    * @param x desired x postion
    * @param y desired y position
    */
    public void setPos(int x, int y)
    {
        this.position = new Point(x, y);
    }
    
   /**
    *
    * gets the label of the state
    *
    * @return Label for the state
    */
    public Label getLabel()

    {
        return this.stateLabel;
    }
    
    /**
    * Sets the name of the state

    *
    * @param newLabel New label for this state
    */
    public void setLabel(Label newLabel)
    {
        this.stateLabel = newLabel;
    }

   /**
    *
    * gets an iterable of the outgoing paths
    *
    * @return outgoing paths iterable
    */
    public Iterable<Path> getPaths()
    {
        
        return this.outgoingPaths;
    }

    /**
     * Returns collidable version of state
     * @return Collidable state
     */
    public Collidable getCollidable()
    {
        return this;
    }
    
    /**
     * Returns the path going to the destination State
     * @return Path
     */
    public Path getPathTo(State destination)
    {
        
        for (Path currentPath: this.outgoingPaths)
        {
            if (currentPath.equals(destination))
            {
                return currentPath;
            }
        }
        
        //not sure if this is a good idea
        return new ModelPath();
    }
	

   
    
    /////IMPLEMENT THIS VVVVVVVVVVV
    

    /**
     * Checks, if this element collides with the point
     * @param pnt point to check collision with
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
    public int getRadius(){
        return 10;
    }

    
    
    
    
    
    
    
    
    
    
}

