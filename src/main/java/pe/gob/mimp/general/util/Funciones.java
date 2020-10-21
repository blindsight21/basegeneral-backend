/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.util;

import java.util.Collection;

/**
 *
 * @author Omar
 */
public class Funciones {
    
    public static boolean esVacio(Object value) {
        if (value == null) {
            return true;
        }
        if (value instanceof String) {
            return ((String) value).trim().equals("") || ((String) value).trim().equals("-")
                    || ((String) value).trim().equals("false");
        }
        if (value instanceof Object[]) {
            return ((Object[]) value).length < 0;
        }
        if (value instanceof Collection) {
            return ((Collection) value).size() < 0;
        }
        if (value instanceof Integer) {
            return ((Integer) value) == 0;
        }
        if (value instanceof Double) {
            return ((Double) value) == 0;
        }
        return false;
    }
    
}
