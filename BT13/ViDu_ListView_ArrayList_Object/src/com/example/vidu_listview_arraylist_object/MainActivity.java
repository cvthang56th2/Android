package com.example.vidu_listview_arraylist_object;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

	ListView lv;
	ArrayList<Employee>arrList = null;
	ArrayAdapter<Employee>adapter = null;
	Employee employee = null;
	EditText editId, editTen;
	Button btnNhap;
	RadioGroup radgroup;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editId = (EditText)findViewById(R.id.editText1);
        editTen = (EditText)findViewById(R.id.editText2);
        btnNhap = (Button)findViewById(R.id.button1);
        radgroup = (RadioGroup)findViewById(R.id.radioGroup1);
        lv = (ListView)findViewById(R.id.listView1);
        
        arrList = new ArrayList<Employee>();
        adapter = new ArrayAdapter<Employee>(this, android.R.layout.simple_list_item_1, arrList);
        lv.setAdapter(adapter);
        
        btnNhap.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Nhap();
			}
		});
          
    }
    
    public void Nhap()
    {
    	String id = editId.getText() + "";
    	String name = editTen.getText() + "";
    	int radId = radgroup.getCheckedRadioButtonId();
    	
    	if (radId == R.id.radio0)
    		employee = new EmployeeFullTime();
    	else
    		employee = new EmployeePartTime();
    	employee.setId(id);
    	employee.setName(name);
    	arrList.add(employee);
    	adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
