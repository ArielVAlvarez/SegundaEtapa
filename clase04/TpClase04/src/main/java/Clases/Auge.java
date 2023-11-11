/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Ariel
 */
public class Auge {
    
    private Ranking ranking;
    
    Auge(){
        this.ranking = new RankingNormal();
    }
    
    public void normal(){
        this.ranking = new RankingNormal();
    }
    public void auge(){
        this.ranking = new RankingEnAuge();
    }
    
    public void tendencia(){
        this.ranking = new RankingEnTendencia();
    }
    
    public void mostrar(){
        this.ranking.mostrar();
    }
}
