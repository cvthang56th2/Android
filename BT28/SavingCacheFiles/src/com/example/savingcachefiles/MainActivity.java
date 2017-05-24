package com.example.savingcachefiles;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button btncreatecache,btnreadcache;
	EditText editdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncreatecache = (Button) findViewById(R.id.btncreatecache);
        btnreadcache = (Button) findViewById(R.id.btnreadcache);
        editdata = (EditText) findViewById(R.id.editdata);
        btncreatecache.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				createCache();
			}
		});
        
        btnreadcache.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				readCache();
			}
		});
    }

    public void loadAllCache()
    {
    	File pathCacheDir = getCacheDir();
    	File []listCache = pathCacheDir.listFiles();
    	
    	for (File f : listCache)
    	{
    		f.delete();
    	}
    }
    
    public void readCache()
    {
    	try {
			File pathCacheDir = getCacheDir();
			String strCacheFileName = "myCacheFile.cache";
			File newCacheFile = new File(pathCacheDir, strCacheFileName);
			Scanner scan = new Scanner(newCacheFile);
			String data = "";
			while (scan.hasNext())
			{
				data += scan.nextLine();
			}
			editdata.setText(data);
			scan.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	
    }
    
    public void createCache()
    {
    	try {
			File pathCacherDir = getCacheDir();
			String strCacheName = "myCacheFile.cache";
			String strFileContent = editdata.getText().toString();
			File newCacheFile = new File(pathCacherDir, strCacheName);
			newCacheFile.createNewFile();
			FileOutputStream foCache = new FileOutputStream(newCacheFile.getAbsolutePath());
			foCache.write(strFileContent.getBytes());
			foCache.close();
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
