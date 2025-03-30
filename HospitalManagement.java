package com.patientDetails;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class HospitalManagement 
{
	public static void main(String[] args) throws InterruptedException
	{
		String head="Welocome to Hospital Management";
		char ch[]=head.toCharArray();
		for(char c:ch) 
		{
			System.out.print("\u001B[36m"+"\u001B[1m"+c);
			Thread.sleep(100);
		}
		System.out.println("\u001B[0m");
		System.out.println("..........***Welcome to Hospital Management Application***..........");
		System.out.println("Please login to the application");
		System.out.println("Enter your mobile number 📞");
		Scanner s=new Scanner(System.in);
		
		long mobileNumber=s.nextLong();
		
		if((mobileNumber>999999999l && mobileNumber< 9999999999l) 
				&&(mobileNumber>6000000000l || mobileNumber>7000000000l || mobileNumber>8000000000l || mobileNumber >9000000000l))
		{
			int otp=PatientFactory.generateOTP();
			System.out.println("Your OTP is:"+ otp);
			
			System.out.println("Enter the OTP");
			int inputOTP = s.nextInt();
			
			if(inputOTP==otp) 
			{
				System.out.println("Login is successfull..👍👍👍🏿👍");
				List<Patient> patientList=new ArrayList();
				boolean condition=true;
				
				while(condition) 
				{
					PatientFactory.displayOptions();
					int option=s.nextInt();
					switch(option) 
					{
					case 1: 
					{
						Patient patient=PatientFactory.enrollPatient();
						patientList.add(patient);
						System.out.println("Patient Enrollment Successfull..👍🏿👍🏿👍🏿👍🏿");
					}
					break;
					case 2: 
					{
						if(patientList.isEmpty()) 
						{
							System.out.println("No patient present");
						}
						else 
						{
							System.out.println("Enter the Patient Name..");
							String patientName = s.next();
							PatientFactory.removePatient(patientList,patientName);
						}
					}
					break;
					case 3: 
					{
						System.out.println("Enter the Patient Name..");
						String patientName = s.next();
						System.out.println("a.Update Name \nb.Update Age \nc.Update Disease \nd.Update Status \nEnter which field is to be updated");
						char choice=s.next().charAt(0);
						switch(choice) 
						{
						case 'a':
						{
							System.out.println("Enter the Updated Name..");
							String newName = s.next();
							PatientFactory.updateName(patientList,patientName,newName);
						}
						break;
						case 'b':
						{
							System.out.println("Enter the Updated Age..");
							int newAge = s.nextInt();
							PatientFactory.updateAge(patientList,patientName,newAge);
						}
						break;
						case 'c':
						{
							System.out.println("Enter the Updated Disease..");
							String newDisease = s.next();
							PatientFactory.updateDisease(patientList,patientName,newDisease);
						}
						break;
						case 'd':
						{
							System.out.println("Enter the Updated Status..");
							String newStatus = s.next();
							PatientFactory.updateStatus(patientList,patientName,newStatus);
						}
						}
					}
					break;
					case 4: 
					{
						System.out.format("%-10s %-5s %-10s %-10s","Name","Age","Disease","Status");
						System.out.println();
						System.out.println("------------------------------------------------------");
						for(Patient p : patientList) 
						{
							System.out.format("%-10s %-5s %-10s %-10s",p.getPatient_name(),p.getPatient_age(),p.getDisease(),p.getStatus());
							System.out.println();
						}
					}
					break;
					case 5: 
					{
						condition = false;
						System.out.println("Logout Successfull\nVisit Again");
					}
					break;
					
					default : {System.out.println("Invalid Option \nTry again..");}
					}
				}
			}
			else 
			{
				System.out.println("Invalid OTP❌❌\nPlease try again");
			}
		}
		else 
		{
			System.out.println("Invalid Number❌❌\nPlease try again");
		}
		
	}
}
