/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import interfaces.AccesoDatos;
import java.util.*;
import models.ImplementarMYSQL;
import models.ImplementarOracle;

/**
 *
 * @author jvega
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        AccesoDatos datosOracle = new ImplementarOracle();
//        datosOracle.listar();
//        AccesoDatos datosMySql = new ImplementarMYSQL();
//        datosMySql.listar();
//        
        List <String> words = new ArrayList();
        words.add("Hello");
        words.add("word");
        Iterator i = words.iterator();
        for (String word : words) {
            System.out.println("Word: "+ word);
        }
        
        while (i.hasNext()) {
            System.out.println("Iterator: "+i.next());
        }
    }
    
}
