package Data;

public class Patient {
	private int pid;
	private String pname;
	private String pdiagnosis;
	private String address;
	private medicalrecord medicalrecord;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdiagnosis() {
		return pdiagnosis;
	}
	public void setPdiagnosis(String pdiagnosis) {
		this.pdiagnosis = pdiagnosis;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public medicalrecord getMedicalrecord() {
		return medicalrecord;
	}
	public void setMedicalrecord(medicalrecord medicalrecord) {
		this.medicalrecord = medicalrecord;
	}
	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", pdiagnosis=" + pdiagnosis + ", address=" + address
				+ ", medicalrecord=" + medicalrecord + "]";
	}
	
	
	
}
