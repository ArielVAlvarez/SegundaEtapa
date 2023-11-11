/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesstate;

/**
 *
 * @author Ariel
 */
public class Semaforo {
    
    private String nombre;
    private EstadoSemaforo estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public Semaforo(){
        this.estado = new SemaforoIntermitente();
    }
    public void verde(){
        estado = new SemaforoVerde();
    }
    
     public void rojo(){
        estado = new SemaforoRojo();
    }
     
    public void amarillo(){
        estado = new SemaforoAmarillo();
    } 
    public void intermitente(){
        estado = new SemaforoIntermitente();
    } 
    
    public void verestado(Direccion direccion){
        estado.estado(direccion);
    }
}
