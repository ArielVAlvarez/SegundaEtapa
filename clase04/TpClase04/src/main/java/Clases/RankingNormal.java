/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Ariel
 */
public class RankingNormal implements Ranking{
    
    @Override
    public void mostrar(){
        Iconos MUSICAL_NOTE = new Iconos(new int[]{0xD83C, 0xDFB5});
        System.out.println(MUSICAL_NOTE.texto() + " NORMAL");
    }
    
}
