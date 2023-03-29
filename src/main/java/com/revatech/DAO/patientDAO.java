package com.revatech.DAO;

import java.util.List;

import com.revatech.Model.Patient;



public interface patientDAO  {
	
	List<Patient>getPatientList();
	
	public int addpatient(Patient patient);
	
	public int deletepatient(int id);
	
	public Patient getpatient(int id);
	
	public int updatepatient(Patient patient);
	
	
	
}
