package com.gaddiel.tamilrosary;

import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.view.View;
import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Log;
import android.media.MediaRecorder;
import java.io.File;
import java.io.IOException;



public class RecordActivity extends Activity{
	
    Chronometer chronometer;

    private static final String LOG_TAG = "AudioRecordTest";
    private static String mFileName = null;
    private MediaRecorder mRecorder = null;

//Intializes constructor    
    public RecordActivity()  {
     	
    	boolean exists = (new File(Environment.getExternalStorageDirectory() + "/RossaryAudio/")).exists();
    	System.out.println("---THE NEW CHECKING FUNC---"+exists);
    	if (!exists) {
    		System.out.println("---HIT NEW IF BLOC---");
    	    new File(android.os.Environment.getExternalStorageDirectory() + "/RossaryAudio/").mkdirs();
    	}

    	 mFileName = Environment.getExternalStorageDirectory() + "/RossaryAudio";
     	
     	
    }
  @Override
    public void onCreate(Bundle savedStateInstance) {
    super.onCreate(savedStateInstance); 
    setContentView(R.layout.record_popup);
    chronometer=(Chronometer)findViewById(R.id.chronometer1);
    TextView textView=(TextView) findViewById(R.id.textView1);
	
	int id = UserAudio.id;
	String textViewContent=textViewContent(id);
	//textViewContent=getResources().getString(R.string.pleaserecord)+"  "+textViewContent;
	textView.setText(textViewContent);
	textView.setTextColor(Color.BLACK);
	//textView.setTextSize(313,233);
	    File f = null;
		  f = new File("rossaryaudio");
		  System.out.println("--PATH NAME--"+f);
	if(!f.isDirectory()){
		try{
		   boolean success = f.mkdir();
		   System.out.println("--- CREATED---"+success);
		     if (success) {
			   System.out.println("--- CREATED---"+success);
		  }
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
  }
  private void showElapsedTime() {
	    long elapsedMillis = SystemClock.elapsedRealtime() - chronometer.getBase();            
	    Toast.makeText(RecordActivity.this, "Elapsed milliseconds: " + elapsedMillis, 
	            Toast.LENGTH_SHORT).show();
	}
	    public void onClickStart(View v) {
	    	
	    	int stoppedMilliseconds = 0;

	        String chronoText = chronometer.getText().toString();
	        String array[] = chronoText.split(":");
	        if (array.length == 2) {
	          stoppedMilliseconds = Integer.parseInt(array[0]) * 60 * 1000
	              + Integer.parseInt(array[1]) * 1000;
	        } else if (array.length == 3) {
	          stoppedMilliseconds = Integer.parseInt(array[0]) * 60 * 60 * 1000 
	              + Integer.parseInt(array[1]) * 60 * 1000
	              + Integer.parseInt(array[2]) * 1000;
	        }

	        chronometer.setBase(SystemClock.elapsedRealtime() - stoppedMilliseconds);
	        chronometer.start();
	        int id = UserAudio.id;
	        
	        System.out.println("Hit Switch........."+id);
	      //Toast.makeText(this, "Hit Switch....."+id, Toast.LENGTH_LONG).show();
	  	  switch (id) {
	  	    case R.id.ImageView2:
	  	        // First record button
	  	    	mFileName += "/SignOfTheCross1.3gp";
	  	        break;
	  	    case R.id.ImageView4:
	  	        // Second record button
	  	    	mFileName += "/OurFather2.3gp";
	  	    	  break;
	  	    case R.id.ImageView6:
	  	        // Third record button
	  	    	mFileName += "/HailMary3.3gp";
	  	    	  break;
	  	    case R.id.ImageView8:
	  	        // Fourth record button
	  	    	mFileName += "/GloryBe4.3gp";
	  	    	  break;
	  	    case R.id.ImageView10:
	  	        // Fifth record button
	  	    	mFileName += "/OMyJesus5.3gp";
	  	        break;
	  	        
	  	  case R.id.ImageView12:
	  	        
	  	    	mFileName += "/Apostlescreed6.3gp";
	  	        break;
	  	case R.id.ImageView33:
  	        
  	    	mFileName += "/Joyfulone7.3gp";
  	        break;
	  	case R.id.ImageView34:
  	        
  	    	mFileName += "/Joyfultwo8.3gp";
  	        break;
	  	case R.id.ImageView35:
  	        
  	    	mFileName += "/Joyfulthree9.3gp";
  	        break;
	  	case R.id.ImageView36:
  	        
  	    	mFileName += "/Joyfulfour10.3gp";
  	        break;
	  	case R.id.ImageView37:
  	        
  	    	mFileName += "/Joyfulfive11.3gp";
  	        break;
	  	case R.id.ImageView38:
  	        
  	    	mFileName += "/Sarrowfulone12.3gp";
  	        break;
	  	case R.id.ImageView39:
  	        
  	    	mFileName += "/Sarrowfultwo13.3gp";
  	        break;
	  	case R.id.ImageView40:
  	        
  	    	mFileName += "/Sarrowfulthree14.3gp";
  	        break;
	  	case R.id.ImageView41:
  	        
  	    	mFileName += "/Sarrowfulfour15.3gp";
  	        break;
	  	case R.id.ImageView42:
  	        
  	    	mFileName += "/Sarrowfulfive16.3gp";
  	        break;
	  	        
	  	  case R.id.ImageView43:
	  	        
	  	    	mFileName += "/Gloriousone17.3gp";
	  	        break;
	  	case R.id.ImageView44:
	        
	    	mFileName += "/Glorioustwo18.3gp";
	        break;
	  	case R.id.ImageView45:
	        
	    	mFileName += "/Gloriousthree19.3gp";
	        break;
	  	case R.id.ImageView46:
	        
	    	mFileName += "/Gloriousfour20.3gp";
	        break;
	  	case R.id.ImageView47:
	        
	    	mFileName += "/Gloriousfive21.3gp";
	        break;
	  	case R.id.ImageView48:
	        
	    	mFileName += "/Luminousone22.3gp";
	        break;
	  	case R.id.ImageView49:
	        
	    	mFileName += "/Luminoustwo23.3gp";
	        break;
	  	case R.id.ImageView50:
	        
	    	mFileName += "/Luminousthree24.3gp";
	        break;
	  	case R.id.ImageView51:
	        
	    	mFileName += "/Luminousfour25.3gp";
	        break;
	  	case R.id.ImageView52:
	        
	    	mFileName += "/Luminousfive26.3gp";
	        break;
	        
	  	case R.id.ImageView53:
	        
	    	mFileName += "/Michale.3gp";
	        break;
	  	    }
	        startRecording();
	        Button record = (Button) findViewById(R.id.button2);
    		record.setEnabled(false);
    		
    		Button stop = (Button) findViewById(R.id.button1);
    		//stop.setEnabled(true);
		    }
	        
	       // showElapsedTime();
	    
	
	    public void onClickStop(View v) {
	    	
	    	chronometer.stop();
	    	stopRecording();	
	    	 Button record = (Button) findViewById(R.id.button2);
	    		record.setEnabled(true);
	        //showElapsedTime();
	    	
	    }
	
	    public void onClickReset(View v) {
	    	chronometer.setBase(SystemClock.elapsedRealtime());
	        //showElapsedTime();
	    }
	
//Starts Recording  function	    
	    private void startRecording() {
	        mRecorder = new MediaRecorder();
	        mRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
	        mRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
	        System.out.println("----FILE NAME LOCATION---"+mFileName);
	        mRecorder.setOutputFile(mFileName);
	        mRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

	        try {
	            mRecorder.prepare();
	        } catch (IOException e) {
	            Log.e(LOG_TAG, "prepare() failed");
	        }

	        mRecorder.start();
	    }
	    
//Stops Recording  function
	    private void stopRecording() {
	    	if(mRecorder!=null){
	    		Toast.makeText(RecordActivity.this,getResources().getString(R.string.Saverectoast), Toast.LENGTH_SHORT).show();
	    		  mRecorder.stop();
	  	        mRecorder.release();
	  	        
	  	  //  Intent intent =new Intent(RecordActivity.this,CustmSett.class);
	        //	startActivity(intent);
	    	}	  
	    	 mRecorder = null;
	    	 super.onBackPressed();
	    	Intent intent =new Intent(RecordActivity.this,CustmSett.class);
        	startActivity(intent);
	       
	    }
	    public String textViewContent(int id){
	    	 String textViewString="";
	    	 switch (id) {
		  	    case R.id.ImageView2:
		  	        // First record button
		  	    	textViewString = getResources().getString(R.string.pleaserecord1); 
		  	        break;
		  	    case R.id.ImageView4:
		  	        // Second record button
		  	    	textViewString= getResources().getString(R.string.pleaserecord2); 
		  	    	  break;
		  	    case R.id.ImageView6:
		  	        // Third record button
		  	    	textViewString = getResources().getString(R.string.pleaserecord3); 
		  	    	  break;
		  	    case R.id.ImageView8:
		  	        // Fourth record button
		  	    	textViewString = getResources().getString(R.string.pleaserecord4); 
		  	    	  break;
		  	    case R.id.ImageView10:
		  	        // Fifth record button
		  	    	textViewString = getResources().getString(R.string.pleaserecord5); 
		  	        break;
		  	        
		  	  case R.id.ImageView12:
		  	        
		  		textViewString = getResources().getString(R.string.pleaserecord6); 
		  	        break;
		  	case R.id.ImageView33:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord7); 
		        break;
		  	case R.id.ImageView34:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord8); 
		        break;
		  	case R.id.ImageView35:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord9); 
		        break;
		  	case R.id.ImageView36:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord10); 
		        break;
		  	case R.id.ImageView37:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord11); 
		        break;
		  	case R.id.ImageView38:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord12); 
		        break;
		  	case R.id.ImageView39:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord13); 
		        break;
		  	case R.id.ImageView40:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord14); 
		        break;
		  	case R.id.ImageView41:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord15); 
		        break;
		  	case R.id.ImageView42:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord16); 
		        break;
		  	        
		  	  case R.id.ImageView43:
		  	        
		  		textViewString = getResources().getString(R.string.pleaserecord17); 
		  	        break;
		  	case R.id.ImageView44:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord18); 
		        break;
		  	case R.id.ImageView45:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord19); 
		        break;
		  	case R.id.ImageView46:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord20); 
		        break;
		  	case R.id.ImageView47:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord21); 
		        break;
		  	case R.id.ImageView48:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord22); 
		        break;
		  	case R.id.ImageView49:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord23); 
		        break;
		  	case R.id.ImageView50:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord24); 
		        break;
		  	case R.id.ImageView51:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord25); 
		        break;
		  	case R.id.ImageView52:
		        
		  		textViewString = getResources().getString(R.string.pleaserecord26); 
		        break;
		 	case R.id.ImageView53:
		        
		 		textViewString = getResources().getString(R.string.pleaserecord27); 
		        break;   
		  	    }
	    	 return textViewString;
	     }	   


}
