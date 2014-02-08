package union.codebreakers.helper;

import union.codebreakers.model.Collidable;
import union.codebreakers.model.ModelState;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface CollisionHandlerGeneric 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Collidable CheckCollision(Point Ptn) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean CheckCollisionStates(ModelState El, Point Pnt) ;
	
	
}

