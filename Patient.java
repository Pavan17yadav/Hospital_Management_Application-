package com.patientDetails;

public class Patient 
{
	private String patient_name;
	private int patient_age;
	private String disease;
	private String status;
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public int getPatient_age() {
		return patient_age;
	}
	public void setPatient_age(int patient_age) {
		this.patient_age = patient_age;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Patient(String patient_name, int patient_age, String disease, String status) 
	{
		this.patient_name = patient_name;
		this.patient_age = patient_age;
		this.disease = disease;
		this.status = status;
	}
	public Patient() {}
}
