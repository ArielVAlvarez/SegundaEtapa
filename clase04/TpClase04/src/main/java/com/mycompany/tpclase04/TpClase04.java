/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpclase04;
import Clases.Canciones;
import Clases.Iconos;
import java.text.ParseException;
import static java.time.Instant.now;
import java.util.HashSet;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
/**
 *
 * @author Ariel
 */
public class TpClase04 {

    public static void main(String[] args)  {
       
        LocalDate date = LocalDate.of(2023,11,10);
        LocalTime time = LocalTime.of(18,0);
        
        ZoneId zoneId = ZoneId.systemDefault();
        
        ZonedDateTime diahoraactual = ZonedDateTime.of(date,time,zoneId);
        
       
       Canciones can01 = new Canciones("Rodolfo","Mi arbol","Vege",2023);
       can01.setUltimareproduccion(diahoraactual);
       can01.setReproducciones(65000);
       can01.setLike(60000);
       can01.setDislike(500);
      
       can01.mostarauge();
       
       
       
        
        
    }
}
