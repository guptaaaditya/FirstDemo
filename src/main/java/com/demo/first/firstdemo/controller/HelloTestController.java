package com.demo.first.firstdemo.controller;

import java.util.ArrayList;
import java.util.List;
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
	
	@RequestMapping(value="/allstudent", method = RequestMethod.GET)
	public List<StudentBO> getAllStudent(){
		List<StudentBO> students = new ArrayList<StudentBO>();
		StudentBO s1 = new StudentBO();
		students.add(s1);
		StudentBO s2 = new StudentBO();
		students.add(s2);
		return students;
	}
	public StudentBO deleteStudent(StudentBO student) {
		StudentBO student1=new StudentBO();
		return student1;
	}
	
	
	public StudentBO test2() {
		return new StudentBO();
	}
	public StudentBO test() {
		return new StudentBO();
	}
}
