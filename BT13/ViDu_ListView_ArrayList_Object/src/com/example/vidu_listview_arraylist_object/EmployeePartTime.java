package com.example.vidu_listview_arraylist_object;

public class EmployeePartTime extends Employee{

	@Override
	public double TinhLuong() {
		// TODO Auto-generated method stub
		return 150;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " - Luong PartTime: " + TinhLuong();
	}
}
