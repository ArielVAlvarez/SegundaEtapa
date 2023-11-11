/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Ariel
 */
public class RankingEnAuge implements Ranking{
    
    @Override
    public void mostrar(){
        Iconos ROCKET = new Iconos(new int[]{0xD83D, 0xDE80});
        System.out.println(ROCKET.texto() + " EN AUGE");
    }

}
