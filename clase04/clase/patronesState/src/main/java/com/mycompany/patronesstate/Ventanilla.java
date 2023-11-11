/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesstate;

/**
 *
 * @author Ariel
 */
public class Ventanilla {
 
    private String cajero;
    private EstadoVentanilla estado;
    
    public Ventanilla(){
       this.estado = new Abierta();
    }
    public void suspendete(){
        this.estado = new Suspendida();
    }
    public void cerrate(){
        this.estado = new Cerrada();
    }
    public void abrite(){
        this.estado = new Abierta();
    }
    public void atende(Persona persona){
        this.estado.atende(persona);
    }

    public String getCajero() {
        return cajero;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }

    public EstadoVentanilla getEstado() {
        return estado;
    }

    public void setEstado(EstadoVentanilla estado) {
        this.estado = estado;
    }
    
}
