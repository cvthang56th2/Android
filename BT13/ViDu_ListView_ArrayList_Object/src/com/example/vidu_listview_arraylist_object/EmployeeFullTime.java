package com.example.vidu_listview_arraylist_object;

public class EmployeeFullTime extends Employee{

	@Override
	public double TinhLuong() {
		// TODO Auto-generated method stub
		return 500;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " - Luong FullTime: " + TinhLuong();
	}
}
