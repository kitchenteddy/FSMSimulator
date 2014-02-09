package union.codebreakers.model;

import union.codebreakers.helper.LabelType;
import union.codebreakers.helper.Point;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ModelLabel implements Movable, Label, Collidable
{
        private LabelType type;
    
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
	 */
	public ModelLabel(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
        
        
        @Override
        public LabelType getType(){
            return this.type;
        }
	
        public void setType(LabelType NewType){
            this.type = NewType;
        }

        @Override
	public boolean isCollision(Point Pnt) {
		// TODO : to implement
		return false;	
	}
	
}

