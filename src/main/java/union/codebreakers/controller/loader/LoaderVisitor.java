/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.loader;

import union.codebreakers.helper.enums.LoadableType;

/**
 *
 * @author joshualoew
 */
public class LoaderVisitor implements Visitor {

    @Override
    public String visit(LoadableType myType) { // Also, include file path here
        
        return "";
        
    }
    
    public LoaderVisitor() {};
    
}
