package union.codebreakers.model;

import union.codebreakers.helper.Point;
import union.codebreakers.helper.StateType;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ModelState implements State, Movable, Collidable
{
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public StateType type;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Point position;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Iterable outgoingPaths;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String name;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ModelState(){
		super();
	}
        
        public StateType getType(){
            return this.type;
        }

        public void setType(StateType NewType){
            this.type = NewType;
        }

        /**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
        
        
        
        
        
        
        
        
        
        
        
        
        ///// IMPLEMENT BELOW
        
        
        
        
        
        
            /*
    * gets the number of outgoing paths that this state has
    * @return number of outgoing paths
    */
    public int getPathNum()
    {
        return 0;  //IMPLEMENT
    }
    
    
    
    /*
    * gets a point representing the position of a state
    * @return point for position of state
    */
    public Point getPos()
    {
        return new Point();
    }
    
    
    /*
    *
    * sets the position of the state
    *
    * @param desired position point
    */
    public void setPos(Point position)
    {
        //IMPLEMENT
    }
    
    
    /*
    *
    * sets the position of the state
    *
    * @param desired x postion
    * @param desired y position
    */
    public void setPos(int x, int y)
    {
        //IMPLEMENT
    }
    
    
    
    /*
    *
    * gets the name of the state as a string
    *
    * @return string for the name of state
    */
    public String getName()
    {
        return "";//IMPLEMENT
    }
    
    
    /*
    *
    * sets the name of the state
    *
    * @param String for desired name
    */
    public void setName(String newName)
    {
        
    }
    
    
    
    

    
    
    
    /*
    * sets the state's type
    @param StateType of the state
    */
    public void setType()
    {
        
    }
    
    
    
    
    
    
	
	public boolean isCollision(Point Pnt) {
		// TODO : to implement
		return false;	
	}
        
        
	
}

