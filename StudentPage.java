package com.example.flearn;
import android.os.Bundle;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;


public class StudentPage extends Activity {
private Button  button;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.student_page);
		button = (Button)findViewById(R.id.login);
		button.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(StudentPage.this, Home.class);
				startActivity(intent);
				
			}
		
	

});}}
