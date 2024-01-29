package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
//Samosa samosa=(Samosa)context.getBean("s1");
//System.out.println(samosa);
context.registerShutdownHook();
//System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
//Pepsi pepsi=(Pepsi)context.getBean("pepsi");
//System.out.println(pepsi);
ExampleAnnotation example=(ExampleAnnotation)context.getBean("example");
System.out.println(example);

	}

}
