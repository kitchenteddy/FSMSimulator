package union.codebreakers.model;

import java.awt.Point;
import java.io.Serializable;
import union.codebreakers.helper.PathType;
import union.codebreakers.view.formatter.FormatterVisitor;

public class ModelPath implements Path, Collidable, Serializable
{
    private int angle;
    private State startPoint;
    private State endPoint;
    private Point position;
    private Label label;
    private PathType type;

    /**
     * Constructor
     * 
     * @param from Starting path
     * @param to Destination path
     */
    public ModelPath(State from, State to)
    {
        this.angle = 0;
        this.startPoint = from;
        this.endPoint = to;
        this.position = new Point(0,0);
        this.label = new ModelLabel();
        this.type = PathType.eNormal;          
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
     * Gets angle of this path
     * 
     * @return the angle of this path
     */
    @Override
    public int getAngle()
    {
        return this.angle;
    }
    
    /**
     * Sets the startPoint of this path
     * 
     * @param newAngle New angle of this path
     */
    @Override
    public void setAngle(int newAngle)
    {
        this.angle = newAngle;
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
     * Returns collidable version of path
     * 
     * @return Collidable path
     */
        @Override
    public Collidable getCollidable()
    {
        return this;
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

    
}


