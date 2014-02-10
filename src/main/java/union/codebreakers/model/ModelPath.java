package union.codebreakers.model;

import java.awt.Point;
import union.codebreakers.helper.PathType;

/**
 * Model for path
 */
public class ModelPath implements Path, Collidable
{
    private int angle;
    private State startPoint;
    private State endPoint;
    private Label label;
    private PathType type;
	
    /**
     * Constructor
     */
    public ModelPath(){
            super();
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
}