package com.example.myview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private ImageButton search;
	private ImageButton add;
	private TextView title;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		search = (ImageButton) findViewById(R.id.ibSearch);
		add = (ImageButton) findViewById(R.id.ibAdd);
		title = (TextView) findViewById(R.id.title);
		add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this, "你点击了一下", 0).show();	
			}
		});
	}

	

}
