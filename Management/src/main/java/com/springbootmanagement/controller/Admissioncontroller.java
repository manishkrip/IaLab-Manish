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
import com.springbootmanagement.entity.Admission;

import com.springbootmanagement.repo.Admissionrepo;

@RestController
@RequestMapping("/admission")
public class Admissioncontroller {
	@Autowired Admissionrepo admissionrepo;

	@GetMapping("/")
	public List<Admission> getid()
	{
		return admissionrepo.findAll();
	}
	
	@PostMapping("/")
	public void add(@RequestBody Admission admission )
	{
		admissionrepo.save(admission);
	}
	
	
	@PutMapping("/")
	public void update(@RequestBody Admission admission )
	{
		admissionrepo.save(admission);
	}
	
	@DeleteMapping("/{id}")
	public String deleteid(@PathVariable("id") int id)
	{
	 admissionrepo.deleteById(id);
	//	return studentrepo.findAll();
	return "delete sucessfully";
	}
	
}
