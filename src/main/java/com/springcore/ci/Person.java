package com.springcore.ci;

public class Person {
	private String personName;
	private int personId;
	private Certi certi;
	public Person(String personName, int personId,Certi certi) {
		super();
		this.personName = personName;
		this.personId = personId;
		this.certi=certi;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personId=" + personId +",certificate="+certi+"]";
	}
	

}
