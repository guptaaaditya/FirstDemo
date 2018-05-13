package com.demo.first.firstdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.first.firstdemo.bo.StudentBO;
import com.demo.first.test.TestService;

@Controller
@ResponseBody
@RequestMapping("/test")
public class HelloTestController {
	@Autowired
	TestService testService;
	
	@RequestMapping(value="/hello/{firstname}",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
	public String hello(@RequestParam(value = "lastname",required = false)String lastname,@PathVariable("firstname")String firstname) {
		return "Hello "+firstname+ " "+lastname +" !!";
	}
	
	@RequestMapping(value = "/save-student",method = RequestMethod.POST)
	public StudentBO SaveStudent(@RequestBody StudentBO student) {
		StudentBO stud =new StudentBO();
		stud.setId(101);
		stud.setFirstname(student.getFirstname());
		stud.setLastname(student.getLastname());
		return stud;
	}
	
	@RequestMapping(value = "/get-student",method = RequestMethod.GET)
	public StudentBO getStudent(@RequestParam("studentid") Integer studentId) {
		StudentBO stud =new StudentBO();
		stud.setId(studentId);
		stud.setFirstname("Aadi");
		stud.setLastname("Kumar");
		return stud;
	}
	
	@RequestMapping(value="/student-firstname", method = RequestMethod.GET)
	public StudentBO getStudentByFirstName(@RequestParam("firstname") String firstName) {
		StudentBO student = new StudentBO();
		student.setId(105);
		student.setFirstname(firstName);
		student.setLastname("Gupta");
		return student;
	}
}
