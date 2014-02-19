package com.example.tela_cadastro;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Cadastro_Medicamentos extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro__medicamentos);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro__medicamentos, menu);
		return true;
	}

}
