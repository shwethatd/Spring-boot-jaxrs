package com.example.demo.controller;

import java.io.Serializable;

//@JsonSerialize(include = Inclusion.NON_NULL)
public class User implements Serializable  {
	String name;
	int age;
	
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

	public User(String name, int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
