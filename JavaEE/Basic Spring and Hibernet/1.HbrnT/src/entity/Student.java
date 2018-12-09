package entity;

import javax.persistence.*;

@Entity// declare pojo class as entity class
@Table(name = "student") //fixed the table name
public class Student {

    @Id //Declare id as primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //Generate Id value as auto
    private int id;

    private String name;

    @Column(name = "rool_no")
    private String roolno;
    public Student(){}

    public Student(String name, String roolno) {
        this.name = name;
        this.roolno = roolno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoolno() {
        return roolno;
    }

    public void setRoolno(String roolno) {
        this.roolno = roolno;
    }
    //to string method for print object
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roolno='" + roolno + '\'' +
                '}';
    }
}
