package revesebforSecondworkshop;

public class Patient {
//	Create Patients with details(name, age, phoneNumber,city,state, department)

	private String name;
	private int age;
	private String phoneNumber;
	private String city;
	private String state;
	private String department;

	public Patient(String name, int age, String phoneNumber, String city, String state, String department) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", city=" + city + ", state="
				+ state + ", department=" + department + "]";
	}

}
