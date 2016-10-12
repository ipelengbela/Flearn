package com.example.flearn;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

public class UserSelection extends Activity  {
private RadioGroup rgb;
private RadioButton Student, Teaccher, Principal, Parents,Other; 
	private Button button;
	private Button btn;
	private TextView textView ;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user_profile);
		
		button = (Button)findViewById(R.id.proceed);
		
		button.setEnabled(false);
		 rgb = (RadioGroup)findViewById(R.id.Grop);
		rgb.setOnCheckedChangeListener(new OnCheckedChangeListener()
		{

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				if(checkedId == R.id.Student)
				{
					button.setEnabled(true);
					
				}
				
				else if (checkedId == R.id.Teacher)
					
				{button.setEnabled(true);
					}
				else if (checkedId == R.id.Principal)
				{button.setEnabled(true);
					}
				else if (checkedId == R.id.Parents)
				{button.setEnabled(true);
					}
				else if (checkedId == R.id.Other)
				{button.setEnabled(true);
					}
				
			}
			

	
	


});
	Student = (RadioButton)	findViewById(R.id.Student);
	Teaccher = (RadioButton)	findViewById(R.id.Teacher);
	Principal = (RadioButton)	findViewById(R.id.Principal);
	Parents = (RadioButton)	findViewById(R.id.Parents);
	Other = (RadioButton)	findViewById(R.id.Other);
	
	
	button.setOnClickListener(new OnClickListener()
	{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int selectedId = rgb.getCheckedRadioButtonId();
			if(selectedId == Student.getId())
			{
				Intent intent = new Intent (UserSelection.this, StudentPage.class);
				startActivity(intent);}
			
			else if(selectedId == Teaccher.getId() )
			{
				
				Intent intent = new Intent (UserSelection.this, TeachersPage.class);
				startActivity(intent);
			}
			else if(selectedId == Principal.getId() )
			{
				Intent intent = new Intent (UserSelection.this, PrincipalsPage.class);
				startActivity(intent);
			}
			else if(selectedId == Parents.getId() )
			{Intent intent = new Intent (UserSelection.this, ParentsPage.class);
			startActivity(intent);
				}
			else if(selectedId == Other.getId() )
			{Intent intent = new Intent(UserSelection.this, OtherPage.class);
			startActivity(intent);}
		}}
			);
	
	
	}}