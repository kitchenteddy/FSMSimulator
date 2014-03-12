/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package union.codebreakers.controller.loader;

/**
 *
 * @author joshualoew
 */
public interface Visitable {

    public String accept(Visitor visitor);
    
}