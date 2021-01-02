package com.java.pojo;

public class NewCollege {
	public Student setData(){
		Address ad = new Address();
		ad.setArea("KN");
		ad.setCity("Pune");
		ad.setState("Maharashtra");
		ad.setCountry("India");
		
		Student st = new Student();
		st.setRollNo(1);
		st.setName("Prajakta");
		st.setAddress(ad);
		
		return st;
	}
}
