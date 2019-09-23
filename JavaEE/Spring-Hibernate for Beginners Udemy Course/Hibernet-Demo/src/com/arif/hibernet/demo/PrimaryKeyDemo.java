package com.arif.hibernet.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arif.hibernet.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
				
				// create session
				Session session = factory.getCurrentSession();
				
				try {			
					// create a student object
					System.out.println("Creating new students obj...");
					Student newStudent1 = new Student("Saif","Iqbal","saif@gmail.com");
					Student newStudent2 = new Student("Tahmina","Dipa","dipa@gmail.com");
					Student newStudent3 = new Student("Maimuna","Sauda","sauda@gmail.com");
					
					// start a transaction
					session.beginTransaction();
					
					// save the student object
					System.out.println("Saving the students...");
					session.save(newStudent1);
					session.save(newStudent2);
					session.save(newStudent3);
					
					// commit transaction
					session.getTransaction().commit();
					
					System.out.println("Done!");
				}
				finally {
					factory.close();
				}
			}

	}
