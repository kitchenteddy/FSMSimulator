/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.view.drawer.stateDrawer;

import java.awt.Graphics;
import union.codebreakers.view.drawable.Drawable;

/**
 * Tool to draw representation of starting state (text representation)
 */
public class StateDrawerStartingText extends StateDrawerStarting{

    /**
     * Draws two concentric circles representing normal state
     * @param state State to draw
     * @param g Canvas to be drawn on
     */
    @Override
    public void draw(Drawable state, Graphics g) {
        System.out.println("StateDrawerStartingText");
    }
}
