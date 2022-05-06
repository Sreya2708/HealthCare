package com.smart.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.smart.entities.Questions;


public interface QuestionRepository extends JpaRepository<Questions,Integer>{
//	public List<Questions> saveAll(List<Questions> )
	
}
