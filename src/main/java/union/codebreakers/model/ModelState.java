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

