package com.ashish.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ashish.service.StudentService;
import com.ashish.vo.Student;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	@Autowired
	private RestTemplate rt ;
	
	/*@GetMapping(path="/getstd",produces = "application/json")
	public List<Student> getAllStudent(){
		return service.getStudents();
		
	}
	
	@PostMapping(path="/add",produces= "application/json")
	public void addStudents(@RequestBody Student std ) {
		
		Student s=new Student();
		s.setAge(std.getAge());
		s.setName(std.getName());
		s.setAddress(std.getAddress());
		
		service.addStudent(s);
		
	}
	
	@PostMapping(path="/delete",produces = "application/json")
	public void deleteStudent(@RequestBody Student std) {
		service.deleteStd(std);
		
	}*/
	
	
	//--------------------------------------------------------------------------------------------------------
	
	//integrating two microservices
	
	@PostMapping(path="/getclg",produces = "application/json")
	public String getCollegeName(@RequestBody Student std) {
		String url="http://college-service/getclg/"+std.getAge();
		String st=rt.getForObject(url,String.class);
		return st;
		
	}
	
	//-----------------------------------------------------------------------------------------------------------
	
	
	
	
	
	@GetMapping(value="welcome")
	public String welcome() {
		return "welcome";
	}
	
	
	@GetMapping(value="/welcome/getstd")    
	    public String viewStd(Model m){    
	        List<Student> list=service.getStudents();    
	        m.addAttribute("list",list);  
	        return "getstd"; 
	}
	
	
	
	
	@GetMapping(value="welcome/Login")
	public String login() {
		return "Login";
	}
	
	@GetMapping(value="welcome/delete")
	public String delete() {
		return "delete";
	}
	
	@PostMapping(value="welcome/add")
	public String addStudents(@ModelAttribute("std")  Student std ) {
		
		Student s=new Student();
		
		s.setName(std.getName());
		s.setAge(std.getAge());
		s.setAddress(std.getAddress());
		
		System.out.println(std.getName()+" "+std.getAge()+ " "+std.getAddress());
		service.addStudent(s);
		return "success";
		
	}
	
	
	@PostMapping(value="welcome/del")
	public String deleteStudent(@ModelAttribute Student stddel) {
		service.deleteStd(stddel.getName());
		return "redirect:/welcome/getstd";
		
	}
	
	
	
	//--------------------------------------------------------------------------------------------------------

}
