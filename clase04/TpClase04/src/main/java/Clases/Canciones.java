/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import static java.time.Instant.now;
import java.util.Date;
import java.time.ZonedDateTime;
import java.time.Duration;

/**
 *
 * @author Ariel
 */
public class Canciones {
    
    private String artista;
    private String cancion;
    private String album;
    private int fechaalbum;
    private Auge auge = new Auge();
    private int reproducciones;
    private int like;
    private int dislike;
    private ZonedDateTime ultimareproduccion;
    private DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Canciones(String artista, String cancion, String album, int fechaalbum) {
        this.artista = artista;
        this.cancion = cancion;
        this.album = album;
        this.fechaalbum = fechaalbum;
        
    }
 
    public ZonedDateTime getUltimareproduccion() {
        return ultimareproduccion;
    }

    public void setUltimareproduccion(ZonedDateTime ultimareproduccion){ 
        this.ultimareproduccion = ultimareproduccion;
    }    
    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike)  {
        this.dislike = dislike;
        this.analizareproducciones();
    } 
    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
        this.analizareproducciones();
    }

    public Auge getAuge() {
        return auge;
    }

    public void setAuge(Auge auge) {
        this.auge = auge;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
        this.analizareproducciones();
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getFechaalbum() {
        return fechaalbum;
    }

    public void setFechaalbum(int fechaalbum) {
        this.fechaalbum = fechaalbum;
    }
    
    private void analizareproducciones(){
        
       Duration duracion = Duration.between(ultimareproduccion,ZonedDateTime.now() );
       long tiempotranscurrido = duracion.getSeconds()/3600;
              
        if (this.reproducciones<1000){
            this.auge.normal();
        }
        if (this.reproducciones>1000){
            this.auge.auge();
        }
        if (this.reproducciones>50000 && this.like>20000 && this.dislike<5000){
         this.auge.tendencia();
        }
        
        if ((this.reproducciones>50000 && this.dislike>5000) || (tiempotranscurrido>24)){
            this.auge.normal();
        }
    }
    public void mostarauge(){
        System.out.println("La Cancion : " + this.cancion + " de " + this.artista +
                " del Album : " + this.album + " lanzamiento "+ this.fechaalbum  + " esta en la Tendencia \n");
        this.auge.mostrar();
    }
    
}
