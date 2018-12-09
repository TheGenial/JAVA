package main;

import entity.Student;
import org.hibernate.Session;

import java.util.List;

public class testHibernet {
    public static void main(String[] args) {

        Session session = createHibernateSession.hibernateSession();//Ceeate Hibernet session for any operation

        //Create
        /*Student student = new Student("Nasif", "IT-13030");//Insert a row value in table
        session.save(student);//save the operation
        session.getTransaction().commit();//Save the transaction
        System.out.println("Saved...");*/

        //Fetch Data
        List<Student> studentList = session.createCriteria(Student.class).list();

        /*for(Student s:studentList){
            System.out.println("==="+s);

            s.setName("My edit");
            session.update(s);
        }*/
        /*Student s = studentList.get(2); //edit a specific row
        s.setName("My Khan");
        session.update(s);*/
        Student s = studentList.get(1);
        session.delete(s);
        session.getTransaction().commit();
    }
}
