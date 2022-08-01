package com.business.interview;

public class Skill {
	private int id;
	private String s_name;
	
	public Skill(int id,String s_name)
	{
		this.id=id;
		this.s_name=s_name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

}
