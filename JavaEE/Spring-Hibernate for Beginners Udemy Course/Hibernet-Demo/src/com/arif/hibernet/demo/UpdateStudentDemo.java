package com.arif.hibernet.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.arif.hibernet.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			int studentID = 1;
			//get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student based on id
			System.out.println("\nGetting student with id: "  +studentID);
			Student myStudent = session.get(Student.class, studentID);
			
			//updating student
			System.out.println("Updating student");
			myStudent.setEmail("ariful.mbstu22@gmail.com");
			
			//commit the transaction
			session.getTransaction().commit();
			
			//update for all student
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("\n\nUpdating all student lastName");
			session.createQuery("update Student set lastName='Sayed'").executeUpdate();
			
			session.getTransaction().commit();
			
			
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
