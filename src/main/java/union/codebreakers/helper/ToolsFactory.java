package union.codebreakers.helper;

import union.codebreakers.view.drawer.DrawerStock;
import union.codebreakers.view.drawer.DrawerStockGeneric;

/**
 * Tools factory handles managing only one instance of every auxiliary tool at the time
 * @author polakl
 */
public class ToolsFactory {
    
    static private Intersection IntersectionTool = null;
    static private CollisionHandlerGeneric CollisionHandlerTool = null;
    static private DrawerStockGeneric DrawerStockShared = null;
    
    /*
     * Gets an instance of intersection tools
     * @return Instance of Intersection tool
    */
    public static Intersection getIntersection(){
        if( ToolsFactory.IntersectionTool == null ) {
            ToolsFactory.IntersectionTool = new Intersection();
        }
        return ToolsFactory.IntersectionTool;
    }
    
    /*
     * Gets an instance of collision tools
     * @return Instance of CollisionHandlerGeneric tool
    */
    public static CollisionHandlerGeneric getCollisionHandler(){
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
