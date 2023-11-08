/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpclase03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Ariel
 */
public class ListaMayuscula {
    
    public static List<String> transforma(List<String> lista){
    
        List<String> resultado = lista.stream().map((String cadena) ->
        cadena.toUpperCase()).collect(Collectors.toList());
       
        return resultado;
    
}
   
}
