package com.example.bt3_bmi;

import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{

	Button btnChandoan;
	EditText editTen,editChieucao,
	editCannang,editBMI,editChandoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChandoan=(Button) findViewById(R.id.button1);
        btnChandoan.setOnClickListener(this);
        editTen=(EditText) findViewById(R.id.editText1);
        editChieucao=(EditText) findViewById(R.id.editText2);
        editCannang=(EditText) findViewById(R.id.editText3);
        editBMI=(EditText) findViewById(R.id.editTextBMI);
        editChandoan=(EditText) findViewById(R.id.editTextKQ);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		double H=Double.parseDouble(editChieucao.getText()+"");
		double W=Double.parseDouble(editCannang.getText()+"");
		double BMI=W/Math.pow(H, 2);
		String chandoan="";
		if(BMI<18)
		{
		chandoan="Bạn gầy";
		}
		else if(BMI<=24.9)
		{
		chandoan="Bạn bình thường";
		}
		else if(BMI<=29.9)
		{
		chandoan="Bạn béo phì độ 1";
		}
		else if(BMI<=34.9)
		{
		chandoan="Bạn béo phì độ 2";
		}
		else
		{
		chandoan="Bạn béo phì độ 3";
		}
		DecimalFormat dcf=new DecimalFormat("#.0");
		editBMI.setText(dcf.format(BMI));
//		editBMI.setText(String.valueOf(BMI));
		editChandoan.setText(chandoan);

	}
    
}
