package union.codebreakers.view.drawable;

import union.codebreakers.helper.Canvas;
import union.codebreakers.model.State;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class DrawableState implements Drawable
{
	private State actState;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DrawableState(){
		this.actState = null;
	}

        
        public State getState() {
            return this.actState;
        }
        
        public void setState(State NewState ) {
            this.actState = NewState;
        }

        /**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void draw(Canvas Canvas) {
		// TODO : to implement	
	}
	
}

