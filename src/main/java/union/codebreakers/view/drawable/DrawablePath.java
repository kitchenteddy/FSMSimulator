package union.codebreakers.view.drawable;

import union.codebreakers.helper.Canvas;
import union.codebreakers.model.Path;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class DrawablePath implements Drawable
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Path actPath;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DrawablePath(){
            this.actPath = null;
	}
        
        public Path GetPath() {
            return this.actPath;
        }
        
        public void SetPath(Path NewPath ) {
            this.actPath = NewPath;
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

