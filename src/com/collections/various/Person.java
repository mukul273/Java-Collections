package com.collections.various;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person's [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person another) {
		//return Integer.compare(age, another.getAge()); // Uncomment to set priority based on age
		return this.name.compareTo(another.name);
		//return -this.name.compareTo(another.name); // uncomment for reverse order
	}
}