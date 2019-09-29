package com.arif.hibernet.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.arif.hibernet.entity.Course;
import com.arif.hibernet.entity.Instructor;
import com.arif.hibernet.entity.InstructorDetails;
import com.arif.hibernet.entity.Student;

public class CreateInstructorDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetails.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
			
			//get the instructor from db
			
			int theID = 1;
			Instructor tempInstructor = session.get(Instructor.class, theID);
			
			//create some courses
			Course tempCourse1 = new Course("Java");
			Course tempCourse2 = new Course("C++");
			
			//add courses to instructor
			tempInstructor.add(tempCourse1);
			tempInstructor.add(tempCourse2);
			
			//save the courses
			session.save(tempCourse1);
			session.save(tempCourse2);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!"); 
		}
		finally {
			
			//add clean up
			session.close();
			
			factory.close();
		}
	}

}
