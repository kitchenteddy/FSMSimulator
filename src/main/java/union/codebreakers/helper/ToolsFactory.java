package union.codebreakers.helper;

import union.codebreakers.view.drawer.DrawerStock;
import union.codebreakers.view.drawer.DrawerStockGeneric;

/**
 * Tools factory handles managing only one instance of every auxiliary tool at the time
 */
public class ToolsFactory {
    
    static private CollisionHandler CollisionHandlerTool = null;
    static private DrawerStockGeneric DrawerStockShared = null;
    
    /*
     * Gets an instance of collision tools
     * @return Instance of CollisionHandlerGeneric tool
    */
    public static CollisionHandler getCollisionHandler(){
        if( ToolsFactory.CollisionHandlerTool == null ) {
            ToolsFactory.CollisionHandlerTool = new CollisionHandler();
        }
        return ToolsFactory.CollisionHandlerTool;
    }

    /*
     * Gets an instance of DrawerStock tools shared across application
     * @return Instance of DrawerStockGeneric tool
    */
    public static DrawerStockGeneric getDrawerStock(){
        if( ToolsFactory.DrawerStockShared == null ) {
            ToolsFactory.DrawerStockShared = new DrawerStock();
        }
        return ToolsFactory.DrawerStockShared;
    }
}
