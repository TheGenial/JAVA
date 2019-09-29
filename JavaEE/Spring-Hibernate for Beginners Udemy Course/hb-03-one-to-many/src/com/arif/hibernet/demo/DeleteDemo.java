package com.arif.hibernet.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.arif.hibernet.entity.Instructor;
import com.arif.hibernet.entity.InstructorDetails;
import com.arif.hibernet.entity.Student;

public class DeleteDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetails.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession(); 
		
		try {			
			
			// start a transaction
			session.beginTransaction();
			
			//get the instructor by primary key / id
			int theID = 1;
			Instructor tempInstructor = session.get(Instructor.class, theID);
			System.out.println("Found Instructor: " +tempInstructor);
			
			//delete the instructor
			if (tempInstructor != null) {
				System.out.println("Deleting: " + tempInstructor);
				
				//Note: will also delete "details" object
				//because of cascadeAll
				
				session.delete(tempInstructor);
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
