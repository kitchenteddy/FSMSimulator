package union.codebreakers.model;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
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
     * @return string that is the name of this path
     */
    public String getName();
    
    
    
    /**
     *  sets the name of this path
     * @param String newName 
     */
    public void setName(String newName);
    
    
	
}

