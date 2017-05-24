package com.example.externalstorage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button btnread,btnwrite;
	EditText editdata;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnread=(Button) findViewById(R.id.button1);
        btnwrite=(Button) findViewById(R.id.button2);
        editdata=(EditText) findViewById(R.id.editText1);
        btnread.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				readData();
			}
		});
        
        btnwrite.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				writeData();
			}
		});
    }

    
    public void readData()
    {
    	String sdcard = Environment.getExternalStorageDirectory().getAbsolutePath() + "/myfile.txt";
    	
    	try {
			Scanner scan = new Scanner(new File(sdcard));
			String data = "";
			while (scan.hasNext())
			{
				data += scan.nextLine();
			}
			scan.close();
			editdata.setText(data + "");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }

    public void writeData()
    {
    	String sdcard = Environment.getExternalStorageDirectory().getAbsolutePath() + "/myfile.txt";
    	try {
			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(sdcard));
			writer.write(editdata.getText().toString());
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
