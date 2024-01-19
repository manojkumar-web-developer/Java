package Data;

public class medicalrecord {
	private int recordid;
	private int doe;
	private String problem;
	public int getRecordid() {
		return recordid;
	}
	public void setRecordid(int recordid) {
		this.recordid = recordid;
	}
	public int getDoe() {
		return doe;
	}
	public void setDoe(int doe) {
		this.doe = doe;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	@Override
	public String toString() {
		return "medicalrecord [recordid=" + recordid + ", doe=" + doe + ", problem=" + problem + "]";
	}
	
	

}
