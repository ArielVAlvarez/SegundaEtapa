/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpclase03;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Ariel
 */
public class ConcatenaLista {
    
    public static String armacadena(List<String> lista,int longitud){
  
        String resultado = lista.stream().filter(dato -> dato.length()>longitud)
                 .collect(Collectors.joining( ", "));
                
        return resultado;
    }
}
