package com.sathish.dao;

import com.sathish.model.Student;

public class TestLoginDAO {

	public static void main(String[] args) {
		Student student = new Student();
		student.setEmail("sram104@gmail.com");
		student.setPassword("ramkumar");
		LoginDAO dao = new LoginDAO();
		dao.log("sram104@gmail.com","ramkumar");
		
	}

}
