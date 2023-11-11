/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesstate;

/**
 *
 * @author Ariel
 */
public class SemaforoAmarillo implements EstadoSemaforo{
    
    @Override
    public void estado(Direccion direccion){
         System.out.println("De la direccion " + direccion.getNombre() + " -->esta en AMARILLO");
    }
    
}
