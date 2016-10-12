package com.example.flearn;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;



public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	Handler mHandler = new Handler();
	mHandler.postDelayed(new  Runnable()
	
	{

		@Override
		public void run() {
			SharedPreferences pref = getSharedPreferences("MyPref", MODE_PRIVATE);
			String box = pref.getString("selection", null);
			if(box.equals("0"))
			{
				Intent intent = new Intent (MainActivity.this, UserSelection.class);
				startActivity(intent);
				
			}
			else if(box.equals("1"))
				
			{
				Intent intent2 = new Intent (MainActivity.this, StudentPage.class);
				startActivity(intent2);}
			
			else if(box.equals("2"))
				
			{
				Intent intent3 = new Intent (MainActivity.this, TeachersPage.class);
				startActivity(intent3);
				
				
			
			}
		
			else if(box.equals("3"))
	
			{
				Intent intent4  = new Intent(MainActivity.this, PrincipalsPage.class);
				startActivity(intent4);
				
			}
			else if(box.equals("4"))
	
			{
				Intent intent5 = new Intent(MainActivity.this, ParentsPage.class );
				startActivity(intent5);
			

}
			else if(box.equals("5"))
				
			{
				
				Intent intent6 = new Intent(MainActivity.this, OtherPage.class);
				startActivity(intent6);
				

}
		}}, 2000L);
	
}
		
	

			
	
		
		
}
