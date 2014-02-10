package union.codebreakers.model;
import union.codebreakers.helper.PathType;

/**
 * Interface for path model
 */
public  interface Path 
{
    /**
     * Gets start point for this path
     * 
     * @return state that is start point for this path
     */
    public State getStartPoint();
    
    /**
     * Gets end point for this path
     * 
     * @return state that is end point for this path
     */
    public State getEndPoint();
    
    /**
     * Gets angle of this path
     * 
     * @return the angle of this path
     */
    public int getAngle();
    
    /**
     * Sets the startPoint of this path
     * 
     * @param newAngle New angle of this path
     */
    public void setAngle(int newAngle);
    
    /**
     * Gets label of this path
     * 
     * @return Label of this path
     */
    public Label getLabel();
       
    /**
     * Sets the label of this path
     * 
     * @param  newLabel New label of this path
     */
    public void setLabel(Label newLabel);
    
    /**
     * Gets the path type of the path
     * 
     * @return the type of path
     */
    public PathType getType();
}