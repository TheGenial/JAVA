package com.arif.hibernet.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.arif.hibernet.entity.Student;

public class ReadStudentDemo {

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
			System.out.println("Creating new student obj...");
			Student newStudent = new Student("Ruksana","Akter","ruksana@gmail.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the student...");
			System.out.println(newStudent);
			session.save(newStudent);
			
			// commit transaction
			session.getTransaction().commit();
			
			//MY NEW CODE
			//find out student id: Primary key
			System.out.println("New student primary key: " +newStudent.getId());
			
			//get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student based on id
			System.out.println("\nGetting student with id: "  +newStudent.getId());
			
			Student myStudent = session.get(Student.class, newStudent.getId());
			
			System.out.println("Get complete " + myStudent);
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
