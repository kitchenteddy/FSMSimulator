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

        
        public State GetState() {
            return this.actState;
        }
        
        public void SetState(State NewState ) {
            this.actState = NewState;
        }

        /**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void Draw(Canvas Canvas) {
		// TODO : to implement	
	}
	
}
