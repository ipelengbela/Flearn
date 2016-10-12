package com.example.flearn;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
 
public class PP_Home extends Activity {
 private String[] MyDrawerlist ;
 private ListView DrawerView ;
 private DrawerLayout myDrawer;
 private ActionBarDrawerToggle mytoggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        DrawerView = (ListView)findViewById(R.id.list_sliderx);
        MyDrawerlist = getResources().getStringArray(R.array.drawer_listings);
        myDrawer = (DrawerLayout)findViewById(R.id.drawer_layoutx);
        DrawerView = (ListView)findViewById(R.id.list_sliderx);
    	MyDrawerlist = getResources().getStringArray(R.array.drawer_listings);
    DrawerView.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_item, MyDrawerlist ));
    mytoggle = new ActionBarDrawerToggle(this, myDrawer, R.drawable.ic_drawer, R.string.Drawer_Opened, R.string.Drawer_Closed);

    myDrawer.setDrawerListener(mytoggle);
    	getActionBar().setDisplayHomeAsUpEnabled(true);
    	myDrawer.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
    	
    	
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState)
    {
    	super.onPostCreate(savedInstanceState);
    	mytoggle.syncState();
    	
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
    	super.onConfigurationChanged(newConfig);
    	mytoggle.onConfigurationChanged(newConfig);
    	
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
    	return false;
    	
    }
    	@Override
    	public boolean onOptionsItemSelected(MenuItem item)
    	{
    		if(mytoggle.onOptionsItemSelected(item))
    		{
    return true;}
    		return super.onOptionsItemSelected(item); 
    	
    		
    	}
    	@SuppressWarnings("unused")
    	private class DrawerItemClickListener implements ListView.OnItemClickListener{
    	
    		
    		@Override
    		public void onItemClick(AdapterView<?> parent, View view, int position,
    				long id) {
    			// TODO Auto-generated method stub
    			Toast.makeText(getApplicationContext(), ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
    		myDrawer.closeDrawer(DrawerView);	
    		
    		}
    	
    	

    	}

    }