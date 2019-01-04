/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.AccesoDatos;

/**
 *
 * @author jvega
 */
public class ImplementarOracle implements AccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertando con Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listando con Oracle");
    }
    
}
