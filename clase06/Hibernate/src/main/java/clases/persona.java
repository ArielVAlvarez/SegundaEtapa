/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

/**
 *
 * @author Ariel
 */
@Entity
@Table (name="persona")

public class persona {
    
    @Id                 //definir un pk
    @Column(name="id")  //utilizar name si la columna se llama distinto al atributo
    private int id ;
    
    @Column
    private String nombre;
    @Column
    private String Apellido;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    public void showHibernate(){
        System.out.println("La puta madre Hibernate --> " + this.nombre + " " + this.Apellido);
    }
    
    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", nombre=" + nombre + ", Apellido=" + Apellido + '}';
    }
    
    
}
