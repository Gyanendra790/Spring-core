package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotypeconfig.xml");
        Student st=context.getBean("student",Student.class);
        System.out.println(st);
	}

}
