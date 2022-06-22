package com.springbootmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootmanagement.entity.Student;
import com.springbootmanagement.repo.Studentrepo;

@RestController
@RequestMapping("/student")
public class Studentcontroller {
@Autowired Studentrepo studentrepo;

	@GetMapping("/")
	public List<Student> getid()
	{
		return studentrepo.findAll();
	}
	
	@PostMapping("/")
	public void add(@RequestBody Student student )
	{
		studentrepo.save(student);
	}
	
//@GetMapping
//public ResponseEntity<List <Student>> getdata()
//{
//	return new ResponseEntity<List<Student>>(studentrepo.findAll(),HttpStatus.BAD_REQUEST);
//	
//}
//	@PostMapping
//public ResponseEntity<String> add(@RequestBody Student student)
//{
//		studentrepo.save(student);
//		return new ResponseEntity<String>("Save sucessfuly",HttpStatus.OK);
//}

	@PutMapping("/")
	public void update(@RequestBody Student student )
	{
		studentrepo.save(student);
	}
	
	@DeleteMapping("/{id}")
	public String deleteid(@PathVariable("id") int id)
	{
	 studentrepo.deleteById(id);
	//	return studentrepo.findAll();
	return "delete sucessfully";
	}
	
}
