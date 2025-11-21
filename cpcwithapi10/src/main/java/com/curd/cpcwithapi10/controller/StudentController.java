package com.curd.cpcwithapi10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curd.cpcwithapi10.model.Student;
import com.curd.cpcwithapi10.repository.StudentRepo;



@RestController
public class StudentController {
	 
	@Autowired
	StudentRepo studentrepo;
	
	@PostMapping("/add")
	public String addStu(@RequestBody Student student) {
		studentrepo.save(student);
		return "inserted successfully";
		
	}
	@GetMapping("/get")
	public List<Student> getStu() {
		return(List<Student>) studentrepo.findAll();
	}
	
	@DeleteMapping("/del/{sid}")
	public String delStu(@PathVariable int sid) {
		studentrepo.deleteById(sid);
		return "record deleted sucessfully";
		
	}
	@PutMapping("/upd")
	public String updemp(@RequestBody Student student) {
		Student Studentupdate = studentrepo.findById(student.getSid()).get();
		Studentupdate.setSname(student.getSname());
		Studentupdate.setCollage(student.getCollage());
		Studentupdate.setLocation(student.getLocation());
		studentrepo.save(Studentupdate);
		return "Record Updated Successfully";
	}
	
	
	
	
	
	
	

}
