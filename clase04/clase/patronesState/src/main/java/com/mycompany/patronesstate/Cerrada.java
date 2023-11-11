/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesstate;

/**
 *
 * @author Ariel
 */
public class Cerrada implements EstadoVentanilla{
    
    @Override
    public void atende(Persona persona){
        System.out.println("Ventanilla cerrada!");
    }
    
}
