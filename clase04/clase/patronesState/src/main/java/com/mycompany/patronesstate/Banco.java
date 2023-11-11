/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesstate;

/**
 *
 * @author Ariel
 */
public class Banco {
    
    private String nombre;
    private String direccion;
    private Ventanilla ventanilla;
    
    public Banco(){
        this.ventanilla = new Ventanilla();
    }
    
    public void atende(Persona persona){
        System.out.println(persona.getNombre() + " Ingresa a la fila");
        ventanilla.atende(persona);
        
    }
    public void suspendeVentanilla(){
        ventanilla.suspendete();
    }
    public void cerrarVentanilla(){
        ventanilla.cerrate();
    }
    public void abrirVentanilla(){
        ventanilla.abrite();
    }
    public String getNombre(){
        return nombre;
    }
}
