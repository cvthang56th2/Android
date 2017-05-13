package com.example.bt2_chuyendoinam;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText editTextA;
	TextView txtkq;
	Button btnChuyenDoi;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChuyenDoi = (Button)findViewById(R.id.button1);
        
        
        btnChuyenDoi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String can, chi;
				editTextA = (EditText)findViewById(R.id.editText1);
				txtkq = (TextView)findViewById(R.id.txtkq);
				int nam = Integer.parseInt(editTextA.getText() + "");
				int ca = nam % 10;
				int ch = nam % 12;
				switch (ca) {
				case 0:
					can = "Canh";
					break;
				case 1:
					can = "Tân";
					break;
				case 2:
					can = "Nhâm";
					break;
				case 3:
					can = "Quý";
					break;
				case 4:
					can = "Giáp";
					break;
				case 5:
					can = "Ất";
					break;
				case 6:
					can = "Bính";
					break;
				case 7:
					can = "Đinh";
					break;
				case 8:
					can = "Mậu";
					break;
				case 9:
					can = "Kỷ";
					break;
				default:
					can = "";
					break;
				}
				
				switch (ch) {
				case 0:
					chi = "Thân";
					break;
				case 1:
					chi = "Dậu";
					break;
				case 2:
					chi = "Tuất";
					break;
				case 3:
					chi = "Hợi";
					break;
				case 4:
					chi = "Tý";
					break;
				case 5:
					chi = "Sửu";
					break;
				case 6:
					chi = "Dần";
					break;
				case 7:
					chi = "Mẹo";
					break;
				case 8:
					chi = "Thìn";
					break;
				case 9:
					chi = "Tỵ";
					break;
				case 10:
					chi = "Ngọ";
					break;
				case 11:
					chi = "Mùi";
					break;
				default:
					chi = "";
					break;
			}
			txtkq.setText(can + " " + chi);
			}
		});				
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
