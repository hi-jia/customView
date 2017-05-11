package com.example.myview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TitleActivity extends RelativeLayout {


	public TitleActivity(Context context) {
		super(context);
		// º”‘ÿ≤ºæ÷
		LayoutInflater.from(context).inflate(R.layout.title, this);
		
	}

	public TitleActivity(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		LayoutInflater.from(context).inflate(R.layout.title, this);
	}

	public TitleActivity(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.title, this);
	}

	
}
