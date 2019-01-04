/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.*;

/**
 *
 * @author jvega
 */
public class PropiedadesSistema {
    public static void main(String [] args){
        Properties p = System.getProperties();
        Enumeration nombrePropiedades = p.propertyNames();
        while(nombrePropiedades.hasMoreElements()){
            String nombrePropiedad = (String) nombrePropiedades.nextElement();
            String valorPropiedad = p.getProperty(nombrePropiedad);
            System.out.println("Key: "+nombrePropiedad+" Value: "+valorPropiedad);
            System.out.println();
        }
    }
}
