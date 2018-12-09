package com.mbstu.ict.model;

/**
 * Created by habib on 12/28/17.
 */
public class Student {

    private String name;
    private int age;
    private String rolNo;

    public Student(String name, int age, String rolNo) {
        this.name = name;
        this.age = age;
        this.rolNo = rolNo;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRolNo() {
        return rolNo;
    }

    public void setRolNo(String rolNo) {
        this.rolNo = rolNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rolNo='" + rolNo + '\'' +
                '}';
    }
}
