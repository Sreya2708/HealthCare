package com.smart.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity
@Table(name = "Quiz")
public class Quiz implements Serializable {

    public Quiz() {

        // TODO Auto-generated constructor stub
    }
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private int id;
    @Column(name="SectionID")
    private int SectionID;
    @Column(name="SubSectionID",precision=2,scale=1)
    private double SubSectionID;
    @Column(name="QuizID")
    private int qid;
    @Column(name="P_ID")
    private int patient;
    @Column(name="Response")
    private String Response;
	public int getSectionID() {
		return SectionID;
	}
	public void setSectionID(int sectionID) {
		this.SectionID = sectionID;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSubSectionID() {
		return SubSectionID;
	}
	public void setSubSectionID(double subSectionID) {
		this.SubSectionID = subSectionID;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getPatient() {
		return patient;
	}
	public void setPatient(int patient) {
		this.patient = patient;
	}
	public String getResponse() {
		return Response;
	}
	public void setResponse(String response) {
		Response = response;
	}
	public Quiz(int SectionID, double SubSectionID, int qid, int patient, String Response) {
		super();
		this.SectionID = SectionID;
		this.SubSectionID = SubSectionID;
		this.qid = qid;
		this.patient = patient;
		this.Response = Response;
	}
    
}

 