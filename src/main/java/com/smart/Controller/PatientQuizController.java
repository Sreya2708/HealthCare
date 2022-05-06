package com.smart.Controller;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.smart.Repository.PatientRepository;
import com.smart.Repository.QuizRepository;
import com.smart.Services.PatientService;
import com.smart.entities.Patient;
import com.smart.entities.Quiz;

import org.springframework.web.bind.annotation.RequestMethod;
@RestController
@EnableAutoConfiguration
@RequestMapping(value="/api")
public class PatientQuizController{
    private static final String APPLICATION_JSON_VALUE = null;
    @Autowired
    private PatientService patientService;
    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private PatientRepository patientRepository;
    public PatientQuizController(PatientService patientService) {
        super();
        this.patientService = patientService;
    }

    @RequestMapping("/response")

    public void registerAccount(@RequestBody Quiz quiz)
    {
    	System.out.println(quiz);
    	patientService.save(quiz);

    }
    @GetMapping("/AnalyticsSection/{id}")
    public ResponseEntity<Integer> getUsersById(@PathVariable(value = "id") int userId)
		       {
    	
    		    List<Quiz> details =(ArrayList<Quiz>) quizRepository
    		            .findById(userId);
    		    HashSet<Integer> section=new HashSet<>();;  
    		    for(int i=0;i<details.size();i++)
    		    {
    		    	section.add(details.get(i).getSectionID());
    		    }
    		    int count=section.size();
    		    System.out.println(count);
    		    return ResponseEntity.ok(count);
    		  }
    @GetMapping("/details/{id}")
    public ResponseEntity<Patient> getDetailsById(@PathVariable(value="id") int userId)
    {
    	 Patient detail = patientRepository
		            .findById(userId);
    	 return ResponseEntity.ok(detail);
    	
    }
    @GetMapping("/subsession/{id}")
    public ResponseEntity<Double> getSubsession(@PathVariable(value="id") int userId)
    {
    	Double current=patientService.subSession(userId);
    	System.out.println(current);
    	return ResponseEntity.ok(current);
    }
    }

