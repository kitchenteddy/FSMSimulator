package union.codebreakers.view.drawer.stateDrawer;

import java.awt.Color;
import java.awt.Graphics;
import union.codebreakers.view.drawable.Drawable;
import union.codebreakers.view.drawer.DrawerSpecific;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StateDrawerNormal  implements DrawerSpecific
{

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void draw(Drawable state, Graphics g) {
		
            g.setColor(Color.RED);
            g.drawOval(200, 200, 60, 60);
            
	}
	
}

