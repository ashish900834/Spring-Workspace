package com.ashish.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ashish.vo.Student;

public interface StudentDao extends CrudRepository<Student,String> {
	
	//@Query("DELETE FROM Student s WHERE s.name = :name")
	
	@Transactional
	@Modifying
    String deleteByName(String name);

}
