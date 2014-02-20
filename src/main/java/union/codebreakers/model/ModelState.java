package union.codebreakers.model;

import java.util.ArrayList;
import java.awt.Point;
import java.awt.Shape;
import java.io.Serializable;
import java.util.List;
import union.codebreakers.helper.ShapeFactory;
import union.codebreakers.helper.enums.StateType;
import union.codebreakers.view.drawer.stateDrawer.StateDrawer;

/**
 * ModelState class
 */
public class ModelState implements State, Movable, Collidable, Serializable, AutomatonPart
{
    private Automaton fsm;
    private StateType type;
    private Point position;
    private ArrayList<Path> outgoingPaths;
    private Label stateLabel;
    
    /**
     * non default constructor for StateLabel
     * @param msType    Type of state
     * @param msPos     Position of state
     * @param msLabel   Label of the state
     * @param fsm       FSM the state is part of
     */
    public ModelState(StateType msType, Point msPos, Label msLabel, Automaton fsm)
    {
        this.fsm = fsm;
        this.type = msType;
        this.position = msPos;
        this.stateLabel = msLabel;
        this.outgoingPaths = new ArrayList<Path>();
        this.getAutomaton().addCollidable(this);
        
        if( msLabel instanceof Collidable ) {
            this.getAutomaton().addCollidable((Collidable)msLabel);            
        }
    }
    
    /**
     * Adds outgoing path from this state
     * 
     * @param destination Destination state
     */
    @Override
    public void addPath(State destination)
    { 
        Path newPath = new ModelPath(this, destination, this.fsm);
        this.outgoingPaths.add(newPath);
        if( destination instanceof Collidable ) {
            this.getAutomaton().addCollidable((Collidable)destination);
        }
    }

   /**
    * Removes an outgoing path from the state
    * 
    * @param toRemove Removes path from automaton
    */   
    @Override
    public void removePath(Path toRemove)
    {
        this.outgoingPaths.remove(toRemove);
        if( toRemove instanceof Collidable ) {
            this.getAutomaton().removeCollidable((Collidable)toRemove);
        }
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
    * Gets a point representing the position of a state
    * 
    * @return point for position of state
    */
    @Override
    public Point getPos()
    {
        return this.position;
    }
    
    /**
    * Sets the position of the state
    *
    * @param position desired position point
    */
    @Override
    public void setPos(Point position)
    {
        this.position = position;
    }
    
   /**
    * Gets the label of the state
    *
    * @return Label for the state
    */
    @Override
    public Label getLabel()
    {
        return this.stateLabel;
    }
    
    /**
    * Sets the name of the state
    *
    * @param newLabel New label for this state
    */
    @Override
    public void setLabel(Label newLabel)
    {
        if( this.stateLabel != null ){
            if( this.stateLabel instanceof Collidable ) {
                this.getAutomaton().removeCollidable((Collidable)this.stateLabel);
            }
        }
        this.stateLabel = newLabel;
        if( this.stateLabel instanceof Collidable ) {
            this.getAutomaton().addCollidable((Collidable)this.stateLabel);
        }
    }

    /**
    * Gets an list collection of the outgoing paths
    *
    * @return outgoing paths in list collection
    */
    @Override
    public List<Path> getPaths()
    {
        return this.outgoingPaths;
    }
    
    /**
     * Returns the path going to the destination State
     * 
     * @param destination   Destination state
     * 
     * @return Path between this state and destination state
     */
    @Override
    public Path getPathTo(State destination)
    {
        
        for (Path currentPath: this.outgoingPaths)
        {
            
            
            ////Changed this to work.  found bug in tests @author TBK
            if (currentPath.getEndPoint().equals(destination))
            {
                return currentPath;
            }
        }
        
        return null;
    }

    /**
     * Gets shape of this element
     * 
     * @return Shape of the element
     */
    @Override
    public Shape getShape(){
        Point dim = StateDrawer.getDimensions( this.getType() );
        Point pos = new Point( this.getPos() );
        switch( this.getType() ){
            case eStart:
                pos.x -= dim.y/2;
                pos.y -= dim.y/2;
                return ShapeFactory.getEllipse( pos, dim.y, dim.y);
            case eEnd:
                pos.x -= dim.x/2;
                pos.y -= dim.y/2;
                return ShapeFactory.getEllipse( pos, dim.x, dim.y);
            case eNormal:
                pos.x -= dim.x/2;
                pos.y -= dim.y/2;
                return ShapeFactory.getEllipse( pos, dim.x, dim.y);
            default:
                return null;
        }
    }

    /**
     * Gets instance of automaton of which its part of
     * 
     * @return Instance of parent automaton
     */
    @Override
    public Automaton getAutomaton(){
        return this.fsm;
    }
}

