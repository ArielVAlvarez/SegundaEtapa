/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expresioneslambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Ariel
 */
public class ExpresionesLambda {
    
    public static void main(String[] args) {
                            
        Calculo unaSuma = (numero01,numero02) -> {
            return numero01+numero02;};
        
        Calculo unaResta = (numero01,numero02) -> numero01-numero02;
        
        System.out.println("La suma es " + unaSuma.Operacion(5,10));
        System.out.println("La resta es " + unaSuma.Operacion(25,10)); 
        
        int unaMulti = Calculo02.operacion(4,8,(num01,num02) -> num01*num02);       
        System.out.println("La multiplicacion es " + unaMulti); 
        
        double unaDivi = Calculo02.operacion(8,4,(num01,num02) -> num01/num02);       
        System.out.println("La divicion es " + unaDivi); 
     
      
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(25);
        lista1.add(18);
        lista1.add(114);
        lista1.stream().forEach((numero) -> {
            int resultado = numero * 2;
             System.out.println("el Numero es -- " + resultado);
                
                });
        
        boolean coincide = lista1.stream().anyMatch((numero) -> numero > 3);
        System.out.println("existen numeros mayores que 3 ? -- " + coincide);
        
        
        //crea una nueva lista solo con los nombre
        List<Persona> personas = new ArrayList<>();
        personas.add( new Persona( "Jose"));
        personas.add( new Persona( "Maria"));
        personas.add( new Persona( "Carlos" ));
        
        List<String> personasString = personas.stream().map((persona) ->
        persona.getNombre().toUpperCase()).collect(Collectors.toList());
        
        personasString.stream().forEach((nombre) -> System.out.println("La persona se llama " + nombre));
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add( 4);
        numeros.add( 1);
        numeros.add( 8);
        int suma = numeros.stream().mapToInt(Integer::intValue).sum();  
        System.out.println("la suma es -- " + suma);
        
    }
    
}
