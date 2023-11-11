/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Ariel
 */
public class RankingEnTendencia implements Ranking{
    
    @Override
    public void mostrar(){
        Iconos FIRE = new Iconos(new int[]{0xD83D, 0xDD25});
        System.out.println(FIRE.texto() + " TENDENCIA");
    }
    
}
