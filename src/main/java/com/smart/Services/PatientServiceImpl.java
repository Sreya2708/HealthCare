package com.smart.Services;


import com.smart.entities.Patient;
import com.smart.entities.Quiz;

public interface PatientServiceImpl {
    Quiz save(Quiz response);
    double subSession(int userid);
}
