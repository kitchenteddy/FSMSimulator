package union.codebreakers.view.drawer.labelDrawer;

import union.codebreakers.exception.ExceptionUnexpectedInput;
import union.codebreakers.helper.Canvas;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableLabel;
import union.codebreakers.view.drawer.Drawer;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class LabelDrawer implements Drawer
{
        static private LabelDrawerPath ldp = null;
        static private LabelDrawerState lds = null;
        
        protected void SetLabelDrawerPath() {
            LabelDrawer.ldp = new LabelDrawerPathText();
        }
        
        protected void SetLabelDrawerState() {
            LabelDrawer.lds = new LabelDrawerState();
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
            
            if( El instanceof DrawableLabel ) {
                DrawableLabel element = (DrawableLabel)El;
                switch( element.GetLabel().GetType() ) {
                    case ePath :
                        if( LabelDrawer.ldp == null ) {
                            this.SetLabelDrawerPath();
                        }
                        LabelDrawer.ldp.Draw(El, Where);
                        break;
                    case eState:
                        if( LabelDrawer.lds == null ) {
                            this.SetLabelDrawerState();
                        }
                        LabelDrawer.lds.Draw(El, Where);
                        break;
                }
            } else {
                throw new ExceptionUnexpectedInput( "Unsupported input" );                
            }
	}	
}

