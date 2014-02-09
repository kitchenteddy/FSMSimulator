package union.codebreakers.helper;

/**
 * Tools factory handles managing only one instance of every auxiliary tool at the time
 * @author polakl
 */
public class ToolsFactory {
    
    static private Intersection IntersectionTool = null;
    static private CollisionHandlerGeneric CollisionHandlerTool = null;
    
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

}
