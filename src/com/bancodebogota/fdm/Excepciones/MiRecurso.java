/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.Excepciones;

/**
 *
 * @author corre_000
 */
public class MiRecurso implements AutoCloseable  {

    @Override
    public void close() throws Exception {
       System.out.println("Cerrando recurso");
    }
    
}
