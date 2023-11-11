/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesstate;

/**
 *
 * @author Ariel
 */
public class ControlVial {
    
    private String nombreControl;
    private Direccion direccion;
    private Semaforo controlSemaforo;
    
    public ControlVial(String nombre, Direccion direccion){
        this.nombreControl= nombre;
        this.controlSemaforo= new Semaforo();
        controlSemaforo.setNombre("Semaforo 001");
        this.direccion=direccion;
    }
    
    public void controlSemaforoVerde(){
        controlSemaforo.verde();
    }
    public void controlSemaforoRojo(){
        controlSemaforo.rojo();
    }    
    public void controlSemaforoAmarillo(){
        controlSemaforo.amarillo();
    }    
    public void controlSemaforoIntermitente(){
        controlSemaforo.intermitente();
    }    
    public void controlSemaforo(){
        System.out.println("El Semaforo " + this.controlSemaforo.getNombre());
        controlSemaforo.verestado(direccion);
    }
}
