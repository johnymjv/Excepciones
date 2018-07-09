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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        ManejoStrings manejo=new ManejoStrings();
        
        System.out.println(manejo.checkPalindromeStringBuffer("aba"));
        
         System.out.println(manejo.checkPalindromeStringBuilder("abac"));
         
         try(MiRecurso recurso=new MiRecurso()){           
                         
         }
         
         
         Main main=new Main();
        // System.out.println(main.divisionPorCeroUnchecked(15,0));
        // System.out.println(main.divisionPorCeroChecked(15,0));
         System.out.println(main.lanzarDivisionPorCeroException(15,0));
         
        }catch(Exception ex){
         System.out.println(ex.getMessage());
        }
         
         
         }
    
    
    public int divisionPorCeroUnchecked(int dividendo,int divisor){
    
        return dividendo/divisor;
    
    }
    
    public int divisionPorCeroChecked(int dividendo,int divisor) throws ArithmeticException {
    
        
         return dividendo/divisor;
    
        
        
        
    }
    
    public int lanzarDivisionPorCeroException(int dividendo,int divisor) throws DivisionPorCeroExcetion{
    
        if(divisor==0)
            throw new DivisionPorCeroExcetion("Posible division por cero");
        
        return dividendo/divisor;
    
    }
    
    
         
    }
    

