package com.example.bt_thongtinhoadon;

import java.util.ArrayList;

public class DanhSachKhachHang {

	ArrayList<KhachHang> listKH = new ArrayList<KhachHang>();
	
	public void themKhachHang(KhachHang kh)
	{
		listKH.add(kh);
	}
	
	public double tongDoanhThu()
	{
		double tong = 0;
		for (KhachHang kh:listKH)
		{
			tong += kh.tinhThanhTien();
		}
		
		return tong;
	}
	
	public int tongKhachHang()
	{
		return this.listKH.size();
	}
	
	public int tongKhachHangVip()
	{
		int dem = 0;
		
		for (KhachHang kh:listKH)
		{
			if (kh.getisVip())
				dem++;
		}
		return dem;
	}
	
	
}
