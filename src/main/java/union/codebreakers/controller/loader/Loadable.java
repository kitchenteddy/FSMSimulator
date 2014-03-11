/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.loader;

import java.io.File;
import union.codebreakers.helper.enums.FormatterType;

/**
 *
 * @author joshualoew
 */
public interface Loadable {
    
    /**
     * Accept method for things that are visitable by the loader
     * 
     * @param myFile the file to load
     * @param formatterType the type of loading to perform
     */
    
    public String acceptLoader(File myFile, FormatterType myType);
    
}
