package com.example.vidu_customlayout_listview;

public class Employee {

	private String id;
	private String name;
	private boolean gender;
	public String getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getGender()
	{
		return gender;
	}
	
	public void setGender(boolean gender)
	{
		this.gender = gender;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return this.id + " " + this.name;
	}
}
