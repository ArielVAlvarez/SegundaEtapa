/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesstate;

/**
 *
 * @author Ariel
 */
public class Suspendida implements EstadoVentanilla{
    
    @Override
    public void atende(Persona persona){
        if (persona.getEdad()>65){
            System.out.println("Atendiendo: " + persona.getNombre());
                   
        }else{
            System.out.println("Espere 5 minutos por favor....");
        }
    }
}

    

