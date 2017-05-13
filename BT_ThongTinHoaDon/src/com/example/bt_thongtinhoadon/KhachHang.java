package com.example.bt_thongtinhoadon;

public class KhachHang {

	private String tenKH;
	private int slMua;
	private boolean isVip;
	public static final int GIA = 20000;
	
	public KhachHang()
	{
		
	}
	
	public KhachHang(String tenKH, int slmua, boolean isVip)
	{
		this.tenKH = tenKH;
		this.slMua = slmua;
		this.isVip = isVip;
	}
	
	public String gettenKH()
	{
		return this.tenKH;
	}
	
	public void settenKH(String tenKH)
	{
		this.tenKH = tenKH;
	}
	
	public int getslMua()
	{
		return this.slMua;
	}
	
	public void setslMua(int slMua)
	{
		this.slMua = slMua;
	}
	
	public boolean getisVip()
	{
		return this.isVip;
	}
	
	public void setisVip(boolean isVip)
	{
		this.isVip = isVip;
	}
	
	public double tinhThanhTien()
	{
		if (this.isVip == true)
			return this.slMua * GIA * 0.9;
		else
			return this.slMua * GIA;
	}
	
	
}
