package union.codebreakers.model;
import union.codebreakers.helper.enums.PathType;

/**
 * Interface for Path model
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
    
    /**
     *  sets the type of this path
     * @param  newType 
     */
    public void setType(PathType newType);
    
    
    
    
    
    
    /**
     * TBK
     * updates the position of the label for the path
     */
    
    public void updateLabelPos();
}


