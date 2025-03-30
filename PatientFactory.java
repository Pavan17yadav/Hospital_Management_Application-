package com.patientDetails;
import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
public class PatientFactory 
{
   public static int generateOTP() 
   {
	   Random random=new Random();
	   int otp=random.nextInt(1000,9999);
	   return otp;
   }
   
   public static void displayOptions() 
   {
	   System.out.println("Select a below option...");
	   System.out.println("1.Enroll a Patient");
	   System.out.println("2.Discharge the Patient");
	   System.out.println("3.Update the Patient Details");
	   System.out.println("4.Display all Patient Details");
	   System.out.println("5.Exit");
   }
   public static Patient enrollPatient() 
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the patient name");
	   String name=s.next();
	   System.out.println("Enter the patient age");
	   int age=s.nextInt();
	   System.out.println("Enter the patient disease");
	   String disease=s.next();
	   System.out.println("Enter the status");
	   String status=s.next();
	   
	   return new Patient(name,age,disease,status);
   }
   public static void displayPatientDetails(Patient p) 
   {
	   Patient patient=new Patient();
	   System.out.println(p.getPatient_name()+" "+p.getPatient_age()+" "+p.getDisease()+" "+p.getStatus());
   }
   public static void updateName(List<Patient> patientList,String name,String newName) 
   {
	   boolean condn = true;
	   for(Patient patient : patientList) 
	   {
		   if(patient.getPatient_name().equalsIgnoreCase(name)) 
		   {
			   patient.setPatient_name(newName);
			   condn = false;
		   }
	   }
	   if(condn)
		   System.out.println("Patient Not exist..");
	   else 
		   System.out.println("Patient name Updated sucessfully");
   }
   public static void updateAge(List<Patient> patientList,String name,int newAge) 
   {
	   boolean condn = true;
	   for(Patient patient : patientList) 
	   {
		   if(patient.getPatient_name().equalsIgnoreCase(name)) 
		   {
			   patient.setPatient_age(newAge);
			   condn = false;
		   }
	   }
	   if(condn)
		   System.out.println("Patient Not exist..");
	   else 
		   System.out.println("Patient age Updated sucessfully");
   }
   public static void updateDisease(List<Patient> patientList,String name,String newDisease) 
   {
	   boolean condn = true;
	   for(Patient patient : patientList) 
	   {
		   if(patient.getPatient_name().equalsIgnoreCase(name)) 
		   {
			   patient.setDisease(newDisease);
			   condn = false;
		   }
	   }
	   if(condn)
		   System.out.println("Patient Not exist..");
	   else 
		   System.out.println("Patient disease Updated sucessfully");
   }
   public static void updateStatus(List<Patient> patientList,String name,String newStatus) 
   {
	   boolean condn = true;
	   for(Patient patient : patientList) 
	   {
		   if(patient.getPatient_name().equalsIgnoreCase(name)) 
		   {
			   patient.setStatus(newStatus);
			   condn = false;
		   }
	   }
	   if(condn)
		   System.out.println("Patient Not exist..");
	   else 
		   System.out.println("Patient status Updated sucessfully");
   }
   public static void removePatient(List<Patient> patientList,String name) 
   {
	   boolean condn=true;
	   Iterator<Patient> itr = patientList.iterator();
	   while(itr.hasNext()) 
	   {
		   Patient patient=itr.next();
		   if(patient.getPatient_name().equalsIgnoreCase(name)) 
		   {
			   itr.remove();
			   condn=false;
		   }
	   }
	   if(condn)
		   System.out.println("Patient Not exist..");
	   else 
		   System.out.println("Patient discharged sucessfully");
   }
   
}
