package main;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

/**
 *
 * @author habib
 */
public class createHibernateSession {
   public static Session hibernateSession(){
       AnnotationConfiguration config = new AnnotationConfiguration();
//        config.addAnnotatedClass(salary.class);
	config.configure("hibernate.cfg.xml");
	//new SchemaExport(config).create(true, true);
    SessionFactory factory = config.buildSessionFactory();
    Session session =factory.getCurrentSession();
    session.beginTransaction();   
    return session;
   } 
    
}
