package com.smart.Services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.smart.entities.Patient;
import com.smart.entities.Quiz;

import com.smart.Repository.QuizRepository;

@Service
public class PatientService implements PatientServiceImpl{
    @Autowired
    private QuizRepository patientRepository;
   

    // TODO Auto-generated constructor stub
    public PatientService(QuizRepository patientRepository) {
        super();
        this.patientRepository = patientRepository;
    }



    @Override
    public Quiz save(Quiz response) {
        // TODO Auto-generated method stub
        Quiz patient1=new Quiz(
                response.getSectionID(),response.getSubSectionID(),response.getQid(),response.getPatient(),response.getResponse());
        

        return patientRepository.save(patient1);
    }
    public double subSession(int userid)
    {
    	List<Quiz> details =(ArrayList<Quiz>) patientRepository
	            .findById(userid);
    	TreeSet<Double> section=new TreeSet();
    	
	    for(int i=0;i<details.size();i++)
	    {
	    	section.add( details.get(i).getSubSectionID());
	    }
	    Double current=section.last();
	    current=current+0.1;
	    System.out.println(current);
	    return current;}

}
