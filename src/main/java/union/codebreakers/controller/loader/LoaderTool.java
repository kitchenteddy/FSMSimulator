/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.loader;

/**
 * Loads a .csv file
 *
 * @author joshualoew
 */
public interface LoaderTool {
    
    public String load(Loadable toLoad);
    
}
