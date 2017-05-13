package com.example.bt6_viewsubclassing;

import android.R.bool;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText editTextA;
	EditText editTextB;
	TextView txtKQ;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextA = (EditText)findViewById(R.id.editText1);
        editTextB = (EditText)findViewById(R.id.editText2);
        txtKQ = (TextView)findViewById(R.id.txtKQ);
        Button btnTong = new Button(this) {
        	@Override
        	public boolean performClick()
        	{
        		int a = Integer.parseInt(editTextA.getText() + "");
        		int b = Integer.parseInt(editTextB.getText() + "");
        		txtKQ.setText(String.valueOf(a + b));
        		return false;
        	}
        };
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
