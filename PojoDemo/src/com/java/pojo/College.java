package com.java.pojo;

public class College {
	//private AllStudentObjects allStud;

	public AllStudentObjects setStudentData() {
		AllStudentObjects allStud = new AllStudentObjects();
		allStud.s1.setRollNo(1);
	// allStud.s1.setAddress();
		allStud.s1.setName("Prajakta");
		
		
		allStud.s2.setRollNo(2);
		//allStud.s2.setAddress("Satara");
		allStud.s2.setName("Reva");
		
		allStud.s3.setRollNo(3);
		//allStud.s3.setAddress("Pune");
		allStud.s3.setName("ABC");
		
		allStud.s4.setRollNo(4);
		//allStud.s4.setAddress("Pune");
		allStud.s4.setName("XYZ");
		
		allStud.s5.setRollNo(5);
		//allStud.s5.setAddress("Pune");
		allStud.s5.setName("PQR");
		
		return allStud;
	}

	/*@Override
	public String toString() {
		return "College [allStud=" + allStud + "]";
	}
*/


	
	
	
	
}
