package com.mbstu.ict.model;

import javax.persistence.*;

/**
 * Created by habib on 12/28/17.
 */
@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @Column(name="father_name")
    private String fatherName;

    @Column(name="mother_name")
    private String motherName;

    private String gender;

    @Column(name="rool_no")
    private String roolNo;

    private String email;

    private String mobile;

    public Student() { }

    public Student(String name, String fatherName, String motherName, String roolNo) {
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.roolNo = roolNo;
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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRoolNo() {
        return roolNo;
    }

    public void setRoolNo(String roolNo) {
        this.roolNo = roolNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", gender='" + gender + '\'' +
                ", roolNo='" + roolNo + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
