package com.sathish.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sathish.model.Student;
import com.sathish.util.ConnectionUtil;

public class LoginDAO {
	JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
	public String log(String email,String password)
	{
		
	String sql="select EMAIL,PASSWORD from students where EMAIL=? and PASSWORD=?";
	Object[] param={email,password};
	String data=jdbcTemplate.queryForObject(sql, param,String.class);
	
return data;
	
	}
}
