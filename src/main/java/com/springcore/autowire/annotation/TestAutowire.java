package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autowireannotationconfig.xml");
		Employee emp=context.getBean("emp",Employee.class);
		System.out.println(emp);

	}

}
