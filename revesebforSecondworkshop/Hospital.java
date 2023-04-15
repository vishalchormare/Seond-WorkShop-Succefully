package revesebforSecondworkshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hospital {

////	Create Patients with details(name, age, phoneNumber,city,state, department)
////	ONCOLOGY, NEUROLOGY , CARDIOLOGY , GYNOCOLOGY)

	String name;
	int age;
	String phoneNumber;
	String city;
	String state;
	String departement;

	Scanner sc = new Scanner(System.in);

	ArrayList<Patient> patientList = new ArrayList<Patient>();

	void addPatient() {
		System.out.println("Enter the paitents Name:");
		name = sc.nextLine();

		System.out.println("Enter the paitents age:");
		age = sc.nextInt();

		System.out.println("Enter the paitents Phone Number:");
		phoneNumber = sc.nextLine();

		System.out.println("Enter the paitents city");
		city = sc.nextLine();

		System.out.println("Enter the paitents state");
		state = sc.nextLine();

		System.out.println("Enter the paitents departement");
		departement = sc.nextLine();

		patientList.add(new Patient(name, age, phoneNumber, city, state, departement));

		System.out.println("Data add Succefully");

	}

	void patientDataView() {
		if (patientList.size() == 0) {
			System.out.println("Your Data is empty Please add the data");
		} else {

			System.out.println("Paitent DATA");
			for (int i = 0; i < patientList.size(); i++) {
				System.out.println("Paiten Name +" + patientList.get(i).getName());

				System.out.println("Paiten Age +" + patientList.get(i).getAge());

				System.out.println("Paiten Phone Number +" + patientList.get(i).getPhoneNumber());

				System.out.println("Paiten City +" + patientList.get(i).getCity());

				System.out.println("Paiten State +" + patientList.get(i).getState());

				System.out.println("Paiten Department +" + patientList.get(i).getDepartment());
			}
		}
	}

}
