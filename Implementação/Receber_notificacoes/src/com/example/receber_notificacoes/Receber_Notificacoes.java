package com.example.receber_notificacoes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Receber_Notificacoes extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_receber__notificacoes);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.receber__notificacoes, menu);
		return true;
	}

}
