package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
    // Person person=(Person)context.getBean("person1");
     // System.out.println(person);
     Addition addition=(Addition)context.getBean("addition");
    
     addition.doSum();
	}

}
