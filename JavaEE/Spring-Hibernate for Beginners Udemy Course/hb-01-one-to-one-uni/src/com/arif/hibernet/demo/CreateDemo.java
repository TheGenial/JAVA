package com.arif.hibernet.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.arif.hibernet.entity.Instructor;
import com.arif.hibernet.entity.InstructorDetails;
import com.arif.hibernet.entity.Student;

public class CreateDemo {

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
			
			//create the object
			Instructor tempInstructor = new Instructor("Arif", "Parvez", "arif.mbstu22@gmail.com");
			InstructorDetails tempInstructorDetails = new InstructorDetails("http://love2Code.com","Love2Code");
			
			
			//associate the object
			tempInstructor.setInstructorDetails(tempInstructorDetails);
			
			// start a transaction
			session.beginTransaction();
			
			//save the instructor
			//this will also instructor_details because cascadeType.ALL
			System.out.println("Saving Instructor:" + tempInstructor);
			session.save(tempInstructor);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
