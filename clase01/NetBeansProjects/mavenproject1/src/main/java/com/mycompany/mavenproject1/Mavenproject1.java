/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import clases.Materia;
import clases.Alumno;
import clases.Inscripcion;
/**
 *
 * @author Ariel
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        Materia matematicas = new Materia(1,"Matematicas"); //sin correlativas
        Materia historia = new Materia(1,"Historia"); //sin correlativas
         
        Materia geometria = new Materia(2,"Geometria");     //con correlativas
        geometria.setCorrelativas("Matematicas");
       
        Materia fisica = new Materia(2,"Fisica");     //con correlativas
        fisica.setCorrelativas("Geometria");
        
        Alumno alumno01 = new Alumno(1,"Ariel");
        alumno01.setMaterias("Matematicas");                
        
        Inscripcion insc01 = new Inscripcion();
        
        System.out.println("El alumno " + alumno01.getNombreAlumno() + " puede Cursar la materia " + matematicas.getNombre() + 
                   " --> " + insc01.Aprobado(matematicas,alumno01));
        
        System.out.println("El alumno " + alumno01.getNombreAlumno() + " puede Cursar la materia " + geometria.getNombre() + 
                   " --> " + insc01.Aprobado(geometria,alumno01));
        
        System.out.println("El alumno " + alumno01.getNombreAlumno() + " puede Cursar la materia " + fisica.getNombre() + 
                   " --> " + insc01.Aprobado(fisica,alumno01));
        System.out.println("El alumno " + alumno01.getNombreAlumno() + " puede Cursar la materia " + historia.getNombre() + 
                   " --> " + insc01.Aprobado(historia,alumno01));        
    }
}
