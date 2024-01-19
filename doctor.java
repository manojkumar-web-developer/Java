package Data;

public class doctor {
	private int id;
	private String name;
	private String qulafication;
	private double salary;
	private Patient Patient;
	public int getid() {
		return id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQulafication() {
		return qulafication;
	}
	public void setQulafication(String qulafication) {
		this.qulafication = qulafication;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Patient getPatient() {
		return Patient;
	}
	public void setPatient(Patient patient) {
		Patient = patient;
	}
	@Override
	public String toString() {
		return "doctor [id=" + id + ", name=" + name + ", qulafication=" + qulafication + ", salary=" + salary
				+ ", Patient=" + Patient + "]";
	}
	
	
	
	
	
	
}
