package com.sistema.app;

import java.util.List;

import com.sistema.app.beans.Person;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class AppActivity extends Activity {
	

	protected Aplicacion app;
	protected List<Person> datos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		app = (Aplicacion)getApplication();
		datos=app.getPersons();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}


}
