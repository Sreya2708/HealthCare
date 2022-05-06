package com.smart.Repository;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smart.entities.Patient;
import com.smart.entities.Quiz;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer>{
	@Query("from Patient where id=?1")
	public Patient findById(int patient);

}
