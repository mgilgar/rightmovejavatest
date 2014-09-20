package com.rightmove.model;

import java.util.Date;

/**
 * Person.
 * 
 * @author mgilgar
 *
 */
public class Person {

	private int age;
	private Date dob;
	private String fullName;
	private Sex sex;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", dob=" + dob + ", fullName=" + fullName
				+ ", sex=" + sex + "]";
	}
	
	
}
