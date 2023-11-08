/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpclase03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class TpClase03 {

    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        
        lista.add("España");
        lista.add("Portugal");
        lista.add("Alemania");
        lista.add("Francia");
        lista.add("Italia");
        lista.add("Noruega");
        lista.add("Belgica");
        lista.add("Suiza");
        
        List<String> convierte = ListaMayuscula.transforma(lista);
        
        convierte.stream().forEach((cadena) -> System.out.println("El pais es --> " + cadena));
        
        int longitud = 6;
        String resultado = ConcatenaLista.armacadena(lista,longitud);
        System.out.println("La lista contiene nombre que posean mas de " + longitud +" caracteres --> \n" + resultado);
    }
}
