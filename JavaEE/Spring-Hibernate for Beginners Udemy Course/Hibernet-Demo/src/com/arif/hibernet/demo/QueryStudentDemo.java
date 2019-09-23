package com.arif.hibernet.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;


import com.arif.hibernet.entity.Student;


public class QueryStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// start a transaction
			session.beginTransaction();
			
			//query student
			List<Student> theStudent = session.createQuery("from Student").getResultList();
			
			//display the student
			for(Student tempStudent: theStudent) {
				System.out.println(tempStudent);
			}
			
			//query student last name Akter
			theStudent = session.createQuery("from Student s where s.lastName='Akter'").getResultList();
			System.out.println("\n\nNames end with 'Akter' are:\n");
			
			//display the student
			for(Student tempStudent: theStudent) {
				System.out.println(tempStudent);
			}
			
			//query student where firstName is Arif & lastName Akter
			theStudent = session.createQuery("from Student s where s.lastName='Akter' OR s.firstName='Arif'").getResultList();
			System.out.println("\n\nNames start with 'Arif' & end with 'Akter' are:\n");
			
			//display the student
			for(Student tempStudent: theStudent) {
				System.out.println(tempStudent);
			}
			
			//query student where emails are gmail account
			theStudent = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();
			System.out.println("\n\nEmails are gmail account is:\n");
			
			//display the student
			for(Student tempStudent: theStudent) {
				System.out.println(tempStudent);
			}
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
