package com.ecs.android.sample.seekbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class AndroidSeekBarActivity extends Activity {

	private TextView text;
	private SeekBar seekBar;
	private SeekBar seekBar2;
	private SeekBar seekBarDefault;

	SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {

		@Override
		public void onProgressChanged(SeekBar arg0, int index, boolean arg2) {
			text.setText("Seeking at " + index);
		}

		@Override
		public void onStartTrackingTouch(SeekBar arg0) {
			System.out.println("onStartTrackingTouch");
		}

		@Override
		public void onStopTrackingTouch(SeekBar arg0) {
			System.out.println("onStopTrackingTouch");
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		text = (TextView) findViewById(R.id.text);

		seekBar = (SeekBar) findViewById(R.id.seekbar);
		seekBar.setMax(100);
		seekBar.setOnSeekBarChangeListener(seekBarChangeListener);

		seekBar2 = (SeekBar) findViewById(R.id.seekbar2);
		seekBar2.setMax(100);
		seekBar2.setOnSeekBarChangeListener(seekBarChangeListener);
		
		
		seekBarDefault = (SeekBar) findViewById(R.id.seekbar_default);
		seekBarDefault.setMax(100);
		seekBarDefault.setOnSeekBarChangeListener(seekBarChangeListener);
		
		

	}
}