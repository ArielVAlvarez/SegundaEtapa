/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hibernate;

import clases.persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author Ariel
 */
public class Hibernate {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myConnectBD");  //el nombre esta definido en el archivos persistence.xml
        EntityManager em = emf.createEntityManager();
        persona p = em.find(persona.class,1);
        System.out.println(p);
        p.showHibernate();
        em.close();
        emf.close();
    }
}
