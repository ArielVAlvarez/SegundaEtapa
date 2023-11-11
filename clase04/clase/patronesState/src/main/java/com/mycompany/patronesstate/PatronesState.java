/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronesstate;

/**
 *
 * @author Ariel
 */
public class PatronesState {

    public static void main(String[] args) {
        
        Persona pers1 = new Persona("Ariel","Alvarez",48);
        Persona pers2 = new Persona("Carola","Juarez",52);
        Persona pers3 = new Persona("Lorenzo","Lamaz",68);
        Persona pers4 = new Persona("Naza","Sanchez",30);
        
        Banco banco = new Banco();
       // banco.abrirVentanilla();
        banco.atende(pers1);
        
        banco.suspendeVentanilla();
        banco.atende(pers2);
        banco.atende(pers3);
        
        banco.cerrarVentanilla();
        banco.atende(pers4);
        
        
        //control vial
        Direccion dire01 = new Direccion("Bv.España y Salta");
        ControlVial control01 = new ControlVial("ControlCentro",dire01);
        control01.controlSemaforo();
        control01.controlSemaforoVerde();
        control01.controlSemaforo();
        control01.controlSemaforoAmarillo();
        control01.controlSemaforo();
        control01.controlSemaforoRojo();
        control01.controlSemaforo();
    }
}
