package com.ashish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.service.GetCollegeName;

@RestController

public class GetCollegeNameController {
	@Autowired
	private GetCollegeName clgname;
	
	@GetMapping(value="/getclg/{roll}")
	public String getCollege(@PathVariable("roll")int roll) {
		
		List<String> collegeName=clgname.getCollegeName(roll);
		return collegeName.toString();
		
	}

}
