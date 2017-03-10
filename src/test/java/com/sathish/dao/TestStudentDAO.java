package com.sathish.dao;

import com.sathish.model.Student;

public class TestStudentDAO {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		Student	 student = new Student();
		student.setName("sathish");
		student.setRegNO(14304518);
		student.setEmail("ms.sathish.26@gmail.com");
		dao.insert(student);
	}

}
