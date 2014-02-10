package union.codebreakers.model;
import union.codebreakers.helper.PathType;




public  interface Path 
{
    
    
    
    /**
     * 
     * @return state that is start point for this path
     */
    public State getStartPoint();
    
    
   
    
    
    
    /**
     * 
     * @return state that is end point for this path
     */
    public State getEndPoint();
    
    
    
    
    
    /**
     * 
     * @return the angle of this path
     */
    public int getAngle();
    
    
    
    /**
     *  sets the startPoint of this path
     * @param newStartPoint 
     */
    public void setAngle(int newAngle);
    
    
    /**
     * 
     * @return Label of this path
     */
    public Label getLabel();
    
    
    
    /**
     *  sets the label of this path
     * @param  newLabel 
     */
    public void setLabel(Label newLabel);
    
    
    /**
     * 
     * gets the path type of the path
     * @return the type of path
     */
    public PathType getType();
    
    
    
    /**
     *  sets the type of this path
     * @param  newType 
     */
    public void setType(PathType newType);
    
    
    /**
     * Returns collidable version of state
     * @return Collidable state
     */
    public Collidable getCollidable();
    
    
	
}

