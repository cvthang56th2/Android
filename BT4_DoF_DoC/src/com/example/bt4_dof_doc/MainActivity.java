package com.example.bt4_dof_doc;

import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private Button btnFar,btnCel,btnClear;
	private EditText txtFar,txtCel;
	DecimalFormat dcf = new DecimalFormat("#.0");
	
	private OnClickListener myVarListener = new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			txtFar = (EditText)findViewById(R.id.editTextF);
			txtCel = (EditText)findViewById(R.id.editTextC);
			
			if(arg0==btnFar)
			{
				double f = Double.parseDouble(txtFar.getText() + "");
				double c = (f - 32) * 5 / 9;
				txtCel.setText(dcf.format(c));
			}
			else if(arg0==btnCel)
			{
				double c = Double.parseDouble(txtCel.getText() + "");
				double f = (c * 9 / 5) + 32;
				txtFar.setText(dcf.format(f));
			}
			else if(arg0==btnClear)
			{
			txtFar.setText("");
			txtCel.setText("");
			txtFar.requestFocus();
			}

		}
	};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFar = (Button)findViewById(R.id.buttonF);
        btnCel = (Button)findViewById(R.id.buttonC);
        btnClear = (Button)findViewById(R.id.buttonClear);
        txtFar = (EditText)findViewById(R.id.editTextF);
        txtCel = (EditText)findViewById(R.id.editTextC);
        btnFar.setOnClickListener(myVarListener);
        btnCel.setOnClickListener(myVarListener);
        btnClear.setOnClickListener(myVarListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
