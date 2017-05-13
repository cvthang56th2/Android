package com.example.tonghieu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText txtA;
	EditText txtB;
	Button btnTong, btnHieu, btnNhan, btnChia;
	EditText txtKQ;
	float kq = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtA = (EditText)findViewById(R.id.eTextA);
        txtB = (EditText)findViewById(R.id.eTextB);
        txtKQ = (EditText)findViewById(R.id.eTextKQ);
        btnTong = (Button)findViewById(R.id.buttonTong);
        btnHieu = (Button)findViewById(R.id.buttonHieu);
        btnNhan = (Button)findViewById(R.id.buttonNhan);
        btnChia = (Button)findViewById(R.id.buttonChia);
        txtKQ.setText(String.valueOf(kq));
        btnTong.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				float a = Float.parseFloat(txtA.getText().toString());
				float b = Float.parseFloat(txtB.getText().toString());
				kq = a + b;
				txtKQ.setText(String.valueOf(kq));
			}
		});
        btnHieu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				float a = Float.parseFloat(txtA.getText().toString());
				float b = Float.parseFloat(txtB.getText().toString());
				kq = a - b;
				txtKQ.setText(String.valueOf(kq));
			}
		});
        btnNhan.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				float a = Float.parseFloat(txtA.getText().toString());
				float b = Float.parseFloat(txtB.getText().toString());
				kq = a * b;
				txtKQ.setText(String.valueOf(kq));
			}
		});
        btnChia.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				float a = Float.parseFloat(txtA.getText().toString());
				float b = Float.parseFloat(txtB.getText().toString());
				kq = a / b;
				txtKQ.setText(String.valueOf(kq));
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
