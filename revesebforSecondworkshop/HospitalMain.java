package revesebforSecondworkshop;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalMain {

//	Create multiple Hospitals -> Create Patients with details(name, age, phoneNumber,city,state, department)
//	-> Create an Enum for Department(Values-> ONCOLOGY, NEUROLOGY , CARDIOLOGY , GYNOCOLOGY)-> 
//	Add multiple Patients in each Hospital -> Also Maintain a MAP of Hospitals 
//	through a Map(key->HospitalName , value-> Hospital-Object)  ->  
//	Create 3 classes - Hospital , Patient and HospitalMain

	enum Department {
		ONCOLOGY, NEUROLOGY, CARDIOLOGY, GYNOCOLOGY
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Hospital hospital = new Hospital();

		int displayvlue = 1;

		while (displayvlue == 1) {

			System.out.println("1 Add Patients Deatials  2.Display Patients Detials 3.Exite");

			System.out.println("Enter the option");
			int enterValue = sc.nextInt();

			switch (enterValue) {

			case 1:
				hospital.addPatient();
				break;

			case 2:
				hospital.patientDataView();
				break;

			case 3:

				displayvlue = 0;
				break;
			default:
				System.out.println("Enter the correct selection");
			}
		}

	}

}
