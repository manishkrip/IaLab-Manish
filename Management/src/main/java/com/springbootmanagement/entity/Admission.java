package com.springbootmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admission")
public class Admission {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column
	int roll;
	@Column
	int fees;
	public Admission(int id, int roll, int fees) {
		super();
		this.id = id;
		this.roll = roll;
		this.fees = fees;
	}
	
	public Admission()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
	

}
