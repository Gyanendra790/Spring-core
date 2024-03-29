package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleAnnotation {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public ExampleAnnotation(String subject) {
		super();
		this.subject = subject;
	}

	public ExampleAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ExampleAnnotation [subject=" + subject + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("INIT METHOD");
	}
   @PreDestroy
	public void end()
	{
		System.out.println("DESTROY METHOD ");
	}

}
