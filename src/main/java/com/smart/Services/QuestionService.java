package com.smart.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.smart.entities.*;
import com.smart.Repository.QuestionRepository;
@Service
@Configurable
public class QuestionService {
@Autowired
private static QuestionRepository quesRepository;
public  ArrayList<Questions> getAll()
{
	ArrayList<Questions> ques=(ArrayList<Questions>)quesRepository.findAll();
	return ques;
}
}