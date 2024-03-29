package com.springcore.standalone;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String,Integer> feesstructure;
	private Properties properties;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFeesstructure() {
		return feesstructure;
	}

	public void setFeesstructure(Map<String, Integer> feesstructure) {
		this.feesstructure = feesstructure;
	}
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feesstructure=" + feesstructure + ", properties=" + properties + "]";
	}

		

	
}
