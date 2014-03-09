/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.loader;

import java.io.File;
import union.codebreakers.helper.enums.FormatterType;
import union.codebreakers.view.formatter.Formattable;
import union.codebreakers.view.formatter.FormatterTool;
import union.codebreakers.view.formatter.LoadableAutomatonFormatter;
import union.codebreakers.view.formatter.ReadableAutomatonFormatter;

/**
 *
 * @author joshualoew
 */
public class LoadableAutomaton implements Loadable {

    @Override
    public String acceptLoader(File myFile, FormatterType myType) {
        
        FormatterTool myLoadable;
        
        switch(myType)
        {
            case eLoadable:
                myLoadable = new LoadableAutomatonFormatter();
                break;
            default:
                myLoadable = new ReadableAutomatonFormatter();
                break;
        }
        
        return myLoadable.format((Formattable) this);
        
    }
    
}
