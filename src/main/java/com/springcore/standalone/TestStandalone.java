package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandalone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/standaloneconfig.xml");
		Person person=context.getBean("person1",Person.class);
		System.out.println(person.getFriends());
		System.out.println(person.getFeesstructure());
		System.out.println(person.getProperties());

	}

}
