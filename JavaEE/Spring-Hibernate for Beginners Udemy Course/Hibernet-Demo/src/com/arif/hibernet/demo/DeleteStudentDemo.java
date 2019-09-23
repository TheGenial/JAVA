package com.arif.hibernet.demo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.arif.hibernet.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			int studentID = 9;
			//get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student based on id
			System.out.println("\nGetting student with id: "  +studentID);
			Student myStudent = session.get(Student.class, studentID);
			
			//deleting student
			System.out.println("Deleting Student: " + studentID);
			//session.delete(myStudent);
			
			//deleting id=6
			System.out.println("\nDeleting id=6");
			session.createQuery("delete from Student where id=6").executeUpdate();
			
			//commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
