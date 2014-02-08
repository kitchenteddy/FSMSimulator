package union.codebreakers.view.drawable;

import union.codebreakers.helper.Canvas;
import union.codebreakers.model.Label;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class DrawableLabel implements Drawable
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Label actLabel;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DrawableLabel(){
            this.actLabel = null;
	}
        
        public Label GetLabel() {
            return this.actLabel;
        }
        
        public void SetLabel(Label NewLabel) {
            this.actLabel = NewLabel;
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

