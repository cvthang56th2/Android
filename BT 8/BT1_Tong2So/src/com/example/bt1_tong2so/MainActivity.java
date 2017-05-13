package com.example.bt1_tong2so;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	public void btn_tong2so(View v)
	{
		EditText edita = (EditText)findViewById(R.id.editText1);
		EditText editb = (EditText)findViewById(R.id.editText2);
		int a = Integer.parseInt(edita.getText()+"");
		int b = Integer.parseInt(editb.getText()+"");
		TextView txtkq = (TextView)findViewById(R.id.txtkq);
		txtkq.setText(String.valueOf(a+b));
	}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
