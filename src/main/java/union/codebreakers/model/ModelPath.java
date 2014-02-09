package union.codebreakers.model;

import java.awt.Point;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ModelPath implements Movable, Path, Collidable
{
	
	
	private int angle;
	private State startPoint;
	private State endPoint;
        private Point position;
	private Label label;
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ModelPath(){
		super();
	}

        
        
        
        
    /**
     * 
     * @return state that is start point for this path
     */
    public State getStartPoint()
    {
        return this.startPoint;
    }
    
    
   
    
    
    
    /**
     * 
     * @return state that is end point for this path
     */
    public State getEndPoint()
    {
        return this.endPoint;
    }
    
    
    
    
    
    /**
     * 
     * @return the angle of this path
     */
    public int getAngle()
    {
        return this.angle;
    }
    
    
    
    /**
     *  sets the startPoint of this path
     * @param newStartPoint 
     */
    public void setAngle(int newAngle)
    {
        this.angle = newAngle;
    }
    
    
    /**
     * 
     * @return string that is the name of this path
     */
    public String getName()
    {
        return this.label.toString();
    }
    
    
    
    /**
     *  sets the name of this path
     * @param String newName 
     */
    public void setName(String newName)
    {
        
    }
        
        
        
        
        
        
        
        
        
        
        
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean isCollision(Point Pnt) {
		// TODO : to implement
		return false;	
	}


	
}

