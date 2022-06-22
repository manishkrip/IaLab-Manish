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

import com.springbootmanagement.entity.Address;

import com.springbootmanagement.repo.Addressrepo;

@RestController
@RequestMapping("/address")
public class Addresscontroller {
	@Autowired Addressrepo addressrepo;

	@GetMapping("/")
	public List<Address> getid()
	{
		return addressrepo.findAll();
	}
	
	@PostMapping("/")
	public void add(@RequestBody Address address )
	{
		addressrepo.save(address);
	}
	
	
	@PutMapping("/")
	public void update(@RequestBody Address address )
	{
		addressrepo.save(address);
	}
	@DeleteMapping("/{id}")
	public String deleteid(@PathVariable("id") int id)
	{
	 addressrepo.deleteById(id);
	//	return studentrepo.findAll();
	return "delete sucessfully";
	}
	
}
