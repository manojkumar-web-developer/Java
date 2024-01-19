package Data;

public class Admit {
	public static void main(String[] args) {
		medicalrecord M = new medicalrecord();
		M.setDoe(23-9-2024);
		M.setProblem("Maleria");
		M.setRecordid(23);
		
		Patient P = new Patient();

		P.setAddress("Hyderabad");
		P.setMedicalrecord(M);
		P.setPname("Suresh");
		P.setPid(31);
		P.setPdiagnosis("CarePlus");
		
		doctor D = new doctor();

		D.setId(123);
		D.setName("Suresh");
		D.setQulafication("MBBS");
		D.setSalary(100000.00);
		D.setPatient(P);
		
		
		hospital H = new hospital();

		H.setHosid(23);
		H.setHoscity("Ameerpet");
		H.setHosaddress("Ameerpet");
		H.setHosname("Medplus");
		H.setHosdoc(D);
		
		System.out.println(H);

		
		
		
	}
}