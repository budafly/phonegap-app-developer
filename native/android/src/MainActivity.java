package com.adobe.phonegap.appbuda;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

public class MainActivity extends Activity {
	int _counter = 0;
	
	public MainActivity() {}
	
	public int getCounter() {		
		return _counter;
	}
	
	public int setCounter(int n) {
		_counter = n;
		return _counter;
	}
		
	public void onKeyDown(int keyCode, KeyEvent event) {		
		if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
			++_counter;
		}
	}
}
