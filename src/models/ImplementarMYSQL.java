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
public class ImplementarMYSQL implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertando con MYSQL");
    }

    @Override
    public void listar() {
        System.out.println("Listando con MYSQL");
    }
}
