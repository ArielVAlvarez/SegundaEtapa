/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpclase02;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Ariel
 */
public class TpClase02 {

    public static void main(String[] args) {
        
        List<String> listado = new ArrayList<>();
        
        listado.add("Argentina");
        listado.add("Chile");
        listado.add("Brasil");
        listado.add("Bolivia");
        listado.add("Uruguay");
        listado.add("Paraguay");
        
        Lista lista = new Lista(listado);
        
        List<String> resultado = lista.Transforma();
        
        for (String lis:resultado){
            System.out.println("El texto es --> " + lis);
        }
       
        
    }
}
