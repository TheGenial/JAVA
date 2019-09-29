package com.arif.hibernet.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.arif.hibernet.entity.Instructor;
import com.arif.hibernet.entity.InstructorDetails;
import com.arif.hibernet.entity.Student;

public class DeleteInstructionDetaiDemo {

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
			
			//get the instructor detail object
			int theId = 3;
			InstructorDetails tempInstructorDetails = session.get(InstructorDetails.class, theId);
			
			//print the instructor detail
			System.out.println("tempInstructorDetails:" +tempInstructorDetails);
			
			//print the associated instructor
			System.out.println("the associated instructor: " + tempInstructorDetails.getInstructor());
			
			//now let's delete instructor detail
			System.out.println("Deleting tempInstructorDetails: " + tempInstructorDetails);
			session.delete(tempInstructorDetails);
			
			//remove the associated object ref
			//break bidirectional link
			tempInstructorDetails.getInstructor().setInstructorDetails(null);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			//handle the connectio leack issue
			
			session.close();
			factory.close();
		}
	}

}
