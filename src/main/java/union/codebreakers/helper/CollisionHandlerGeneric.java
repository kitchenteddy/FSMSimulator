package union.codebreakers.helper;
import java.awt.Point;
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
	
	public Collidable checkCollision(Point Ptn) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean checkCollisionStates(ModelState El, Point Pnt) ;	
}

