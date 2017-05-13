package com.example.listviewactivitywitharraylist;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText txtTen;
	TextView txtChon;
	Button btnNhap;
	ListView lv;
	ArrayList<String>nguoi = null;
	ArrayAdapter<String>adapter = null;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtChon = (TextView)findViewById(R.id.textView2);
        txtTen = (EditText)findViewById(R.id.editText1);
        btnNhap = (Button)findViewById(R.id.button1);
        lv = (ListView)findViewById(R.id.listView1);
        nguoi = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nguoi);
        lv.setAdapter(adapter);
        
        btnNhap.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				nguoi.add(txtTen.getText() + "");
				adapter.notifyDataSetChanged();
			}
		});
        
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				txtChon.setText("Vị trí thứ: " + arg2 + " - Tên: " + nguoi.get(arg2));
			}
		});
        
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				nguoi.remove(arg2);
				adapter.notifyDataSetChanged();
				return false;
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
