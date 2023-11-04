/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ariel
 */
public class Alumno {
    
    int key;
    String nombreAlumno;    
    ArrayList<String> materias = new ArrayList<String>();

    public Alumno(int key, String nombreAlumno) {
        this.key = key;
        this.nombreAlumno = nombreAlumno;
    }
    
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public ArrayList<String> getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias.add(materias);
    }
    
    public Boolean validaCorrelativa(Materia materias){
        ArrayList<String> materiasCursadas = materias.getCorrelativas();
        
        Boolean puedeCursar = true;
        
        for (int i=0;i<materiasCursadas.size();i++){
           
            if (this.validaMateria(materiasCursadas.get(i))==false){
                puedeCursar = false ;
                break;
            }
        }
        
        return puedeCursar;
    }
    public Boolean validaMateria(String materia){
        Boolean resultado = false ;
        
        for (String m:this.materias){          
            if (m.equals(materia)){          
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    
}
