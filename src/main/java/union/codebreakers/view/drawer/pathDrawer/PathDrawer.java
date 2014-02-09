package union.codebreakers.view.drawer.pathDrawer;

import union.codebreakers.exception.ExceptionUnexpectedInput;
import union.codebreakers.helper.Canvas;
import union.codebreakers.model.ModelState;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawablePath;
import union.codebreakers.view.drawer.DrawerGeneric;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class PathDrawer implements DrawerGeneric
{
        static protected PathDrawerNormal pdn = null;
        
        protected void setPathDrawerNormal() {
            PathDrawer.pdn = new PathDrawerNormalText();
        }

        /**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void getTool(Drawable El, Canvas Where) {
            if(El == null ) {
                throw new ExceptionUnexpectedInput( "Unsupported input" );
            }
            
            if( El instanceof DrawablePath ) {
                if( PathDrawer.pdn == null ) {
                    this.setPathDrawerNormal();
                }
                PathDrawer.pdn.draw(El, Where);
            } else {
                throw new ExceptionUnexpectedInput( "Unsupported input" );                
            }
	}
	
}

