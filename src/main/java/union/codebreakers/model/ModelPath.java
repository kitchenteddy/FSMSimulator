package union.codebreakers.model;

import java.awt.Point;
import java.io.Serializable;
import union.codebreakers.helper.enums.PathType;

/**
 * Concrete implementation of Path model
 */
public class ModelPath implements Path, Collidable, Serializable, AutomatonPart
{
    private State startPoint;
    private State endPoint;
    private Point position;
    private Label label;
    private PathType type;
    private Automaton fsm;

    /**
     * Constructor
     * 
     * @param from  Starting path
     * @param to    Destination path
     * @param fsm   FSM which is path part of
     */
    public ModelPath(State from, State to, Automaton fsm)
    {
        this.startPoint = from;
        this.endPoint = to;
        this.position = new Point(0,0);
        this.label = new ModelLabel();
        this.type = PathType.eNormal;
        this.fsm = fsm;
    }
        
    /**
     * Gets start point for this path
     * 
     * @return state that is start point for this path
     */
    @Override
    public State getStartPoint()
    {
        return this.startPoint;
    }
    
    /**
     * Gets end point for this path
     * 
     * @return state that is end point for this path
     */
    @Override
    public State getEndPoint()
    {
        return this.endPoint;
    }
    
    /**
     * Gets label of this path
     * 
     * @return Label of this path
     */
    @Override
    public Label getLabel()
    {
        return this.label;
    }
    
    /**
     * Sets the label of this path
     * 
     * @param  newLabel New label of this path
     */
    @Override
    public void setLabel(Label newLabel)
    {
        this.label = newLabel;
    }
    
    /**
     * Gets the path type of the path
     * 
     * @return the type of path
     */
    @Override
    public PathType getType()
    {
        return this.type;
    }
        
   /**
     * Sets the type of this path
     * 
     * @param  newType New type of path
     */
        @Override
    public void setType(PathType newType)
    {
        this.type = newType;
    }

    /**
     * Is this path in collision
     * @param pnt Point to check collision with
     * 
     * @return Whether the collision has occurred
     */
    @Override
    public boolean isCollision(Point pnt) {
            // TODO : to implement
            return false;	
    }

    /**
     * Sets instance of automaton of which its part of
     * 
     * @param a Instance of automaton
     */
    public void SetAutomaton(Automaton a){
       this.fsm = a;
    }    

    /**
     * Gets instance of automaton of which its part of
     * 
     * @return Instance of parent automaton
     */
    @Override
    public Automaton getAutomaton() {
        return this.fsm;
    }
}


