package com.example.learnfileinternalstorage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button btnRead, btnWrite;
	
	EditText editData;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnRead = (Button)findViewById(R.id.button1);
        
        btnWrite = (Button)findViewById(R.id.button2);
        
        editData = (EditText)findViewById(R.id.editText1);
        
        btnRead.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				readData();
			}
		});
        
        btnWrite.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				writeData();
			}
		});
    }

    
    public void readData2() //Ham doc Resource
    {
    	String data;
    	InputStream in = getResources().openRawResource(R.drawable.myfile);
    	InputStreamReader inreader = new InputStreamReader(in);
    	BufferedReader buffreader = new BufferedReader(inreader);
    	StringBuilder builder = new StringBuilder();
    	if (in != null)
    	{
    		try {
				while((data = buffreader.readLine()) != null)
				{
					builder.append(data);
					builder.append("\n");
				}
				in.close();
				editData.setText(builder.toString());
			} catch (Exception e) {
				// TODO: handle exception
				Log.e("ERROR", e.getMessage());
			}
    	}
    }

    public void readData()
    {
    	try {
			FileInputStream in = openFileInput("myfile.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String data = "";
			StringBuilder builder = new StringBuilder();
			while ((data=reader.readLine()) != null)
			{
				builder.append(data);
				builder.append("\n");
			}
			in.close();
			editData.setText(builder.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
    
    public void writeData()
    {
    	try {
			FileOutputStream out = openFileOutput("myfile.txt", 0);
			OutputStreamWriter writer = new OutputStreamWriter(out);
			writer.write(editData.getText().toString());
			writer.close();
		} catch (Exception e) {
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
