package com.springbootmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springbootmanagement.entity.Teacher;

import com.springbootmanagement.repo.Teacherrepo;

@RestController
@RequestMapping("/teacher")
public class Teachercontroller {
	
	
	
	@Autowired Teacherrepo teacherrepo;

	@GetMapping("/")
	public List<Teacher> getid()
	{
		return teacherrepo.findAll();
	}
	
	@PostMapping("/")
	public void add(@RequestBody Teacher teacher )
	{
		teacherrepo.save(teacher);
	}
	
	
	@PutMapping("/")
	public void update(@RequestBody Teacher teacher )
	{
		teacherrepo.save(teacher);
	}
	@DeleteMapping("/{id}")
	public String deleteid(@PathVariable("id") int id)
	{
	 teacherrepo.deleteById(id);
	//	return studentrepo.findAll();
	return "delete sucessfully";
	}
	

}
