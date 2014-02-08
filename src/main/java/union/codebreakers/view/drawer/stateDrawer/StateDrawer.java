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
        
        protected void SetStateDrawerEnd() {
            StateDrawer.sde = new StateDrawerEndText();
        }

        protected void SetStateDrawerNormal() {
            StateDrawer.sdn = new StateDrawerNormalText();
        }

        protected void SetStateDrawerStarting() {
            StateDrawer.sds = new StateDrawerStartingText();
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
            
            if( El instanceof DrawableState ) {
                DrawableState element = (DrawableState)El;
                switch( element.GetState().GetType() ) {
                    case eStart :
                        if( StateDrawer.sds == null ) {
                            this.SetStateDrawerStarting();
                        }
                        StateDrawer.sds.Draw(El, Where);
                        break;
                    case eEnd:
                        if( StateDrawer.sde == null ) {
                            this.SetStateDrawerEnd();
                        }
                        StateDrawer.sde.Draw(El, Where);
                        break;
                    case eNormal:
                        if( StateDrawer.sdn == null ) {
                            this.SetStateDrawerNormal();
                        }
                        StateDrawer.sdn.Draw(El, Where);
                        break;
                }
            } else {
                throw new ExceptionUnexpectedInput( "Unsupported input" );                
            }
	}
	
}

