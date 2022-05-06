package com.smart.Repository;



import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smart.entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Integer>{
	@Query("from Quiz where P_ID=?1")
	public List<Quiz> findById(int patient);
	
}
