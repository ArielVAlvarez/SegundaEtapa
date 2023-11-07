/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpclase02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class Lista {
    
    List<String> lista = new ArrayList<>();
    
    public Lista(List<String> lista){
        this.lista=lista;
        
    }
    
    public List<String> Transforma(){
        
        List<String> nuevaLista = new ArrayList<>();
        TransformaCadena tansformaCadena = (texto) -> texto.toUpperCase();
        
        for (int i=0;i<this.lista.size();i++){
           
            nuevaLista.add(tansformaCadena.cadena(this.lista.get(i)));
            
        }        
        
        return nuevaLista;
    }
    
}
