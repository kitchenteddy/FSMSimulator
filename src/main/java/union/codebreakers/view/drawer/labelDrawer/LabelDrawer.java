package union.codebreakers.view.drawer.labelDrawer;

import union.codebreakers.exception.ExceptionUnexpectedInput;
import union.codebreakers.helper.Canvas;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawable.DrawableLabel;
import union.codebreakers.view.drawer.DrawerGeneric;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class LabelDrawer implements DrawerGeneric
{
        static protected LabelDrawerPath ldp = null;
        static protected LabelDrawerState lds = null;
        
        protected void setLabelDrawerPath() {
            LabelDrawer.ldp = new LabelDrawerPathText();
        }
        
        protected void setLabelDrawerState() {
            LabelDrawer.lds = new LabelDrawerState();
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
            
            if( El instanceof DrawableLabel ) {
                DrawableLabel element = (DrawableLabel)El;
                switch( element.getLabel().getType() ) {
                    case ePath :
                        if( LabelDrawer.ldp == null ) {
                            this.setLabelDrawerPath();
                        }
                        LabelDrawer.ldp.draw(El, Where);
                        break;
                    case eState:
                        if( LabelDrawer.lds == null ) {
                            this.setLabelDrawerState();
                        }
                        LabelDrawer.lds.draw(El, Where);
                        break;
                }
            } else {
                throw new ExceptionUnexpectedInput( "Unsupported input" );                
            }
	}	
}

