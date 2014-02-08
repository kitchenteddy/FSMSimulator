package union.codebreakers.view.drawer.stateDrawer;

import union.codebreakers.exception.ExceptionUnexpectedInput;
import union.codebreakers.helper.Canvas;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableState;
import union.codebreakers.view.drawer.Drawer;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StateDrawer implements Drawer
{
        static private StateDrawerEnd sde = null;
        static private StateDrawerNormal sdn = null;
        static private StateDrawerStarting sds = null;
        
        protected void setStateDrawerEnd() {
            StateDrawer.sde = new StateDrawerEndText();
        }

        protected void setStateDrawerNormal() {
            StateDrawer.sdn = new StateDrawerNormalText();
        }

        protected void setStateDrawerStarting() {
            StateDrawer.sds = new StateDrawerStartingText();
        }
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void draw(Drawable El, Canvas Where) {
            if(El == null ) {
                throw new ExceptionUnexpectedInput( "Unsupported input" );
            }
            
            if( El instanceof DrawableState ) {
                DrawableState element = (DrawableState)El;
                switch( element.getState().getType() ) {
                    case eStart :
                        if( StateDrawer.sds == null ) {
                            this.setStateDrawerStarting();
                        }
                        StateDrawer.sds.draw(El, Where);
                        break;
                    case eEnd:
                        if( StateDrawer.sde == null ) {
                            this.setStateDrawerEnd();
                        }
                        StateDrawer.sde.draw(El, Where);
                        break;
                    case eNormal:
                        if( StateDrawer.sdn == null ) {
                            this.setStateDrawerNormal();
                        }
                        StateDrawer.sdn.draw(El, Where);
                        break;
                }
            } else {
                throw new ExceptionUnexpectedInput( "Unsupported input" );                
            }
	}
	
}

