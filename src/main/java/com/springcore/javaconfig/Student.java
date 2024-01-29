package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component("firstStudent")
public class Student {
	private Samosa samosa;
	
	public void print()
	{
		this.samosa.print();
		System.out.println("My name is Gyanendra Pratap Shukla");
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	

}
