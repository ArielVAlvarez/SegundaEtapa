/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Ariel
 */
public class Inscripcion {
   
    public Boolean Aprobado(Materia materia,Alumno alumno){
        
        return alumno.validaCorrelativa(materia);
     
    }
}
