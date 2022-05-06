package com.smart.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;






@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    public Patient() {

        // TODO Auto-generated constructor stub
    }
    public Patient(String firstname, String lastname, String email, Date dateofBirth, String experience) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        DateofBirth = dateofBirth;
        Experience = experience;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDateofBirth() {
        return DateofBirth;
    }
    public void setDateofBirth(Date dateofBirth) {
        DateofBirth = dateofBirth;
    }
    public String getExperience() {
        return Experience;
    }
    public void setExperience(String experience) {
        Experience = experience;
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;
    @Column(nullable = true, name = "email")
    private String email;
    @Column(name="DateofBirth")
    private Date DateofBirth;
    @Column(name="Experience")
    private String Experience;

}

