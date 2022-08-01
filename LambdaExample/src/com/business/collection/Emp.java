package com.business.collection;

import java.util.Objects;

public class Emp {
	private int id;
	private String name;
	private String dep;
	private int age;
	
	
	public Emp(int id,String name,String dep,int age) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.dep=dep;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, dep, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return age == other.age && Objects.equals(dep, other.dep) && id == other.id && Objects.equals(name, other.name);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
