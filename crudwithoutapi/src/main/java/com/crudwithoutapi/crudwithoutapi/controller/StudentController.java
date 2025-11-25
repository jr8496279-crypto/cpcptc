package com.crudwithoutapi.crudwithoutapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.crudwithoutapi.crudwithoutapi.model.Student;
import com.crudwithoutapi.crudwithoutapi.repository.StudentRepo;

@Controller
public class StudentController {
	@Autowired
	StudentRepo studentrepo;
	@RequestMapping("index")
	public String index() {
		
		return "index.jsp";
	}
	
	@RequestMapping("addStu")
	public String addStu(Student student) {
		studentrepo.save(student);
		return "index.jsp";	
	}
	@RequestMapping("getStu")
	public ModelAndView getStu(@RequestParam int sid) {
		ModelAndView mv = new ModelAndView("display.jsp");
		Student student = studentrepo.findById(sid).orElse(new Student());
		mv.addObject(student);
	    return mv;
	}
	@RequestMapping("delStu")
	public ModelAndView delStu (@RequestParam int sid) {
		
		ModelAndView mv=new ModelAndView("delete.jsp");
		Student student = studentrepo.findById(sid).orElse(new Student());
		studentrepo.deleteById(sid);
		mv.addObject(student);
		return mv;
	}
	@RequestMapping("updStu")
	public ModelAndView updStu(Student student) {
		ModelAndView mv =new ModelAndView("update.jsp");
		student =studentrepo.findById(student.getSid()).orElse(new Student());
		mv.addObject(student);
		return mv;
		
	}
	

}
