/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Ariel
 */
public class Iconos {
    
    private int[] internalEncoding;
    
    public Iconos(int[] internalEncoding){
        this.internalEncoding = internalEncoding;
    }
    public String texto() {
        return new String(internalEncoding, 0, internalEncoding.length);
    }            
}
