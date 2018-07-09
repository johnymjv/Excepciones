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
public class ManejoStrings {  
    
    
public boolean checkPalindromeStringBuffer(String inputString) {
    
    StringBuffer stringBuffer=new StringBuffer(inputString);
            
     int x=0;
    int y=stringBuffer.length();    
    int tamano=y;
   --y;
    while(x<tamano){
        if(stringBuffer.charAt(x)!=stringBuffer.charAt(y)) 
            return false;
       ++x;     
       --y; 
    }
    return true;
}

public boolean checkPalindromeStringBuilder(String inputString) {
    
    StringBuilder stringBuilder=new StringBuilder(inputString);
            
     int x=0;
    int y=stringBuilder.length();    
    int tamano=y;
   --y;
    while(x<tamano){
        if(stringBuilder.charAt(x)!=stringBuilder.charAt(y)) 
            return false;
       ++x;     
       --y; 
    }
    return true;
}


//public String reemplazarTextoStringBuffer(String textoPrincipal,String textoReemplazado){
//
//StringBuffer textoEnStringBuffer=new StringBuffer(textoPrincipal);
//
//textoEnStringBuffer.
//
//
//}







}
