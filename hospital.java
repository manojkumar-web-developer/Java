package Data;

public class hospital {
	private int hosid;
	private String hosname;
	private String hosaddress;
	private String hoscity;
	private doctor hosdoc;
	
	public int getHosid() {
		return hosid;
	}
	public void setHosid(int hosid) {
		this.hosid = hosid;
	}
	public String getHosname() {
		return hosname;
	}
	public void setHosname(String hosname) {
		this.hosname = hosname;
	}
	public String getHosaddress() {
		return hosaddress;
	}
	public void setHosaddress(String hosaddress) {
		this.hosaddress = hosaddress;
	}
	public String getHoscity() {
		return hoscity;
	}
	public void setHoscity(String hoscity) {
		this.hoscity = hoscity;
	}
	public doctor getHosdoc() {
		return hosdoc;
	}
	public void setHosdoc(doctor hosdoc) {
		this.hosdoc = hosdoc;
	}
	
	@Override
	public String toString() {
		return "hospital [hosid=" + hosid + ", hosname=" + hosname + ", hosaddress=" + hosaddress + ", hoscity="
				+ hoscity + ", hosdoc=" + hosdoc + "]";
	}

}
