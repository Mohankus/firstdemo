package com.business.interview;

import java.util.List;

public class Employee2 {
private String name;
private int age;
private int salary;
private String department;
private List<Skill> skill;
public Employee2(String name, int age, int salary, String department,List<Skill> skill2) {
	// TODO Auto-generated constructor stub
	this.name=name;
	this.age=age;
	this.salary=salary;
	this.department=department;
}
public List<Skill> getSkill() {
	return skill;
}
public void setSkill(List<Skill> skill) {
	this.skill = skill;
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}


}
