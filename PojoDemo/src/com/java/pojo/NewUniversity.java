package com.java.pojo;

public class NewUniversity {

	public static void main(String[] args) {
		NewCollege clg = new NewCollege();
		Student st = clg.setData();
		System.out.println(st.getRollNo());
		System.out.println(st.getName());
		System.out.println(st.getAddress().getCity());
		System.out.println(st.getAddress().getArea());
		System.out.println(st.getAddress().getState());
		System.out.println(st.getAddress().getCountry());
		

	}

}
