package union.codebreakers.model;
import java.util.ArrayList;
import java.awt.Point;
import union.codebreakers.helper.StateType;


/**
 * 
 * ModelState class
 * 
 * 
 */

public class ModelState implements State, Movable, Collidable
{
    
    
    public StateType type;

    public Point position;

    public ArrayList<Path> outgoingPaths;

    public Label stateLabel;

    /**
     * 
     * 
     * Constructor method for ModelState
     * 
     */
    public ModelState(){
            
    }

    
    
    
    
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
    *
    * sets the state's type
    * @param StateType of the state
    */
    public void setType(StateType newType){
        this.type = newType;
    }

    /**
    * gets the number of outgoing paths that this state has
    * @return number of outgoing paths
    */
    public int getPathNum()
    {
        return this.outgoingPaths.size();
        
    }
        
    /**
    * gets a point representing the position of a state
    * @return point for position of state
    */
    public Point getPos()
    {
        return this.position;
    }
    
   /**
    *
    * sets the position of the state
    *
    * @param desired position point
    */
    public void setPos(Point position)
    {
        this.position = position;
    }
    
    
   /**
    *
    * sets the position of the state
    *
    * @param desired x postion
    * @param desired y position
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
    *
    * sets the label of the state
    *
    * @param newLabel
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
        //implement
        return new ArrayList();
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
	
   
    
    /////IMPLEMENT THISVVVVVVVVVVV
    
    public boolean isCollision(Point pnt) {
        // TODO : to implement
        return false;	
    }
    
    
    

    /**
     * Returns radius of state
     * @return radius of state
     */
    public int getRadius(){
        return 10;
    }

}

