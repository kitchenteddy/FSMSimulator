package union.codebreakers.model;

import java.awt.Point;
import union.codebreakers.helper.PathType;



public class ModelPath implements Path, Collidable
{
	
	
	private int angle;
	private State startPoint;
	private State endPoint;
        private Point position;
	private Label label;
        private PathType type;
	
	
	
	
	
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
     * getter method for a path's label
     * @return Label of this path
     */
    public Label getLabel()
    {
        return this.label;
    }
    
    
    
    /**
     *  sets the label of this path
     * @param newLabel
     */
    public void setLabel(Label newLabel)
    {
        this.label = newLabel;
    }
    
    
    
    /**
     * 
     * gets the path type of the path
     * @return the type of path
     */
    public PathType getType()
    {
        return this.type;
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

