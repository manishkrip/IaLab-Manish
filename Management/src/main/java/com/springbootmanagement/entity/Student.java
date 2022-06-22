package com.springbootmanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	public Student()
	{
		
	}
	public Student(int id, String name, int age, List<Address> address, Admission admission, List<Teacher> teacher) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.admission = admission;
		this.teacher = teacher;
	}

	@Column
	String name;

	@Column
	int age;

	@OneToMany(cascade = {CascadeType.MERGE})
	private List<Address> address;

	@OneToOne(cascade = {CascadeType.MERGE})
	private Admission admission;

	@ManyToMany(cascade = {CascadeType.MERGE})
	private List<Teacher> teacher;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public Admission getAdmission() {
		return admission;
	}
	public void setAdmission(Admission admission) {
		this.admission = admission;
	}
	public List<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
	
}
