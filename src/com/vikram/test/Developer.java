package com.vikram.test;

import java.math.BigDecimal;

public class Developer {

	private String name;
	private int age;
	private BigDecimal salary;

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

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Developer(String name, BigDecimal salary, int age) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
