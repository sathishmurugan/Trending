package com.sathish.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sathish.model.Student;
import com.sathish.util.ConnectionUtil;

public class StudentDAO {
	JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
	public void insert(Student student)
	{
		String sql="insert into students(NAME,REGNO,EMAIL,PASSWORD)values(?,?,?,?)";
		Object[] params={student.getName(),student.getRegNO(),student.getEmail(),student.getPassword()};
		int row=jdbcTemplate.update(sql,params);
		System.out.println(row + "Student Added");
		
	}

}

