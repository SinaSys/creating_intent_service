package com.sriyanksiddhartha.servicesdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * 	Author: Sriyank Siddhartha
 *
 * 	Module 5: Understanding Communication Flow between Service and Activity
 *
 *		"AFTER" project
 * */
public class MainActivity extends AppCompatActivity {

	private TextView txvIntentServiceResult, txvStartedServiceResult;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		txvIntentServiceResult = (TextView) findViewById(R.id.txvIntentServiceResult);
		txvStartedServiceResult = (TextView) findViewById(R.id.txvStartedServiceResult);
	}

	/*public void startStartedService(View view) {

		Intent intent = new Intent(MainActivity.this, MyStartedService.class);
		intent.putExtra("sleepTime", 10);
		startService(intent);
	}*/

/*	public void stopStartedService(View view) {

		Intent intent = new Intent(MainActivity.this, MyStartedService.class);
		stopService(intent);
	}*/

	public void startIntentService(View view) {

		Intent intent = new Intent(this, MyIntentService.class);
		intent.putExtra("sleepTime", 10);
		startService(intent);
	}







}
