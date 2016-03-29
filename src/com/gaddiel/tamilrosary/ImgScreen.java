package com.gaddiel.tamilrosary;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class ImgScreen extends Activity {

	private TextView Linkk;
	@Override
    public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
	       
	        setContentView(R.layout.screen_img);
	        Linkk = (TextView) findViewById(R.id.textView7);
	        Linkk.setMovementMethod(LinkMovementMethod.getInstance());
	}
}
