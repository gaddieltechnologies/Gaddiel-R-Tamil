package com.gaddiel.tamilrosary;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.webkit.WebView;
import android.widget.TextView;

public class Help extends Activity {
	
	private TextView mLink;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
	       
	        setContentView(R.layout.help);   
	        mLink = (TextView) findViewById(R.id.textView2);
	        mLink.setMovementMethod(LinkMovementMethod.getInstance());
	      
	        
	   	}
}
