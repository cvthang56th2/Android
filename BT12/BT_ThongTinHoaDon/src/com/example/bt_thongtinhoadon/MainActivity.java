package com.example.bt_thongtinhoadon;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button btnTinhTT, btnTiep, btnThongKe;
	
	EditText txtTenKH, txtSlSach, txtTongSoKH, txtSoKHVIP, txtTongDoanhThu;
	
	TextView txtThanhTien;
	
	CheckBox chkBoxVip;
	
	ImageButton btnThoat;
	
	DanhSachKhachHang danhsach = new DanhSachKhachHang();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getControls();
        addEvents();
    }

    private void getControls()
    {
    	btnTinhTT = (Button)findViewById(R.id.button1);
    	btnTiep = (Button)findViewById(R.id.button2);
    	btnThongKe = (Button)findViewById(R.id.button3);
    	txtTenKH = (EditText)findViewById(R.id.editText1);
    	txtSlSach = (EditText)findViewById(R.id.editText2);
    	txtTongSoKH = (EditText)findViewById(R.id.editText4);
    	txtSoKHVIP = (EditText)findViewById(R.id.editText5);
    	txtTongDoanhThu = (EditText)findViewById(R.id.editText6);
    	txtThanhTien = (TextView)findViewById(R.id.textView4);
    	chkBoxVip = (CheckBox)findViewById(R.id.checkBox1);
    	btnThoat = (ImageButton)findViewById(R.id.imageButton1);
    }

    private void addEvents()
    {
    	btnTinhTT.setOnClickListener(new MyEvents());
    	btnTiep.setOnClickListener(new MyEvents());
    	btnThongKe.setOnClickListener(new MyEvents());
    	btnThoat.setOnClickListener(new MyEvents());
    }
    
    private void TinhTien()
    {
    	KhachHang kh = new KhachHang();
    	kh.settenKH(txtTenKH.getText() + "");
    	System.out.println(txtTenKH.getText());
    	kh.setslMua(Integer.parseInt(txtSlSach.getText()+""));
    	kh.setisVip(chkBoxVip.isChecked());
    	txtThanhTien.setText(kh.tinhThanhTien() + "");
    	danhsach.themKhachHang(kh);
    }
    
    private void Tiep()
    {
    	txtTenKH.setText("");
    	txtSlSach.setText("");
    	txtThanhTien.setText("");
    	txtTenKH.requestFocus();
    }
    
    private void ThongKe()
    {
    	txtTongDoanhThu.setText(danhsach.tongDoanhThu() + "");
    	txtSoKHVIP.setText(danhsach.tongKhachHangVip() + "");
    	txtTongSoKH.setText(danhsach.tongKhachHang() + "");   	
    }
    
    private void Thoat()
    {
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setTitle("Chú ý");
    	builder.setMessage("Bạn có chắc muốn thoát chương trình này không?");
    	builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				arg0.cancel();
			}
		});
    	builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				finish();
			}
		});
    	builder.create().show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private class MyEvents implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			switch (arg0.getId()) {
			case R.id.button2:
				TinhTien();
				break;
			case R.id.button3:
				Tiep();
				break;
			case R.id.button1:
				ThongKe();
				break;
			case R.id.imageButton1:
				Thoat();
				break;

			default:
				break;
			}
		}
    	
    }
}
