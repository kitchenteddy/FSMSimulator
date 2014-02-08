package union.codebreakers.view.drawer.pathDrawer;

import union.codebreakers.exception.ExceptionUnexpectedInput;
import union.codebreakers.helper.Canvas;
import union.codebreakers.model.ModelState;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawablePath;
import union.codebreakers.view.drawer.Drawer;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class PathDrawer implements Drawer
{
        static private PathDrawerNormal pdn = null;
        
        protected void SetPathDrawerNormal() {
            PathDrawer.pdn = new PathDrawerNormalText();
        }

        /**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void Draw(Drawable El, Canvas Where) {
            if(El == null ) {
                throw new ExceptionUnexpectedInput( "Unsupported input" );
            }
            
            if( El instanceof DrawablePath ) {
                if( PathDrawer.pdn == null ) {
                    this.SetPathDrawerNormal();
                }
                PathDrawer.pdn.Draw(El, Where);
            } else {
                throw new ExceptionUnexpectedInput( "Unsupported input" );                
            }
	}
	
}

