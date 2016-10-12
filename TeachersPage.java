package com.example.flearn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TeachersPage extends Activity {
	private Button btn = (Button)findViewById(R.id.teachlogin);
	@Override

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
setContentView(R.layout.teacher_page);
 btn.setOnClickListener(new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent (TeachersPage.this, T_Home.class);
			startActivity(intent);
			
		}});
}
}