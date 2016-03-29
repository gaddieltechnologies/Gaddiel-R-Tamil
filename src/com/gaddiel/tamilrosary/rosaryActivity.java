package com.gaddiel.tamilrosary;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;

public class rosaryActivity extends Activity {
	ImageView imageView1;
//	Button button;
	ImageView imageView2;
	ImageView imageView3;
	String play_After_Call_Flag=null;	
	
	String playViaAlarmIntent="false";

	 MediaPlayer mPlayer=null;
	 int i=1;
	 public int[] imageArrayHide={
			 R.id.imageView1,
		
			
		
	 };
	 public rosaryActivity(){
		
		  mPlayer=null;
	 }
	 public int[] imageArrayShow={
				
			 R.drawable.one,
			 R.drawable.one,
			 R.drawable.two,
			 R.drawable.three,
			 R.drawable.four,
			 R.drawable.five,
			 R.drawable.five,
			 R.drawable.five,
			 
			 R.drawable.joy1,
			 R.drawable.joy1,
			 R.drawable.father_1_1,
			 R.drawable.father_1_2,
			 R.drawable.father_1_3,
			 R.drawable.father_1_4,
			 R.drawable.father_1_5,
			 R.drawable.father_1_6,
			 R.drawable.father_1_7,
			 R.drawable.father_1_8,
			 R.drawable.father_1_9,
			 R.drawable.father_1_10,
			 R.drawable.father_1_10,
			 R.drawable.father_1_10,
	
			 R.drawable.joy2,
			 R.drawable.joy2,
			 R.drawable.father_2_1,
			 R.drawable.father_2_2,
			 R.drawable.father_2_3,
			 R.drawable.father_2_4,
			 R.drawable.father_2_5,
			 R.drawable.father_2_6,
			 R.drawable.father_2_7,
			 R.drawable.father_2_8,
			 R.drawable.father_2_9,
			 R.drawable.father_2_10,
			 R.drawable.father_2_10,
			 R.drawable.father_2_10,
			 
			 R.drawable.joy3,
			 R.drawable.joy3,
			 R.drawable.father_3_1,
			 R.drawable.father_3_2,
			 R.drawable.father_3_3,
			 R.drawable.father_3_4,
			 R.drawable.father_3_5,
			 R.drawable.father_3_6,
			 R.drawable.father_3_7,
			 R.drawable.father_3_8,
			 R.drawable.father_3_9,
			 R.drawable.father_3_10,
			 R.drawable.father_3_10,
			 R.drawable.father_3_10,
			 
			 R.drawable.joy4,
			 R.drawable.joy4,
			 R.drawable.father_4_1,
			 R.drawable.father_4_2,
			 R.drawable.father_4_3,
			 R.drawable.father_4_4,
			 R.drawable.father_4_5,
			 R.drawable.father_4_6,
			 R.drawable.father_4_7,
			 R.drawable.father_4_8,
			 R.drawable.father_4_9,
			 R.drawable.father_4_10,
			 R.drawable.father_4_10,
			 R.drawable.father_4_10,
			 
			 R.drawable.joy5,
			 R.drawable.joy5,
			 R.drawable.father_5_1,
			 R.drawable.father_5_2,
			 R.drawable.father_5_3,
			 R.drawable.father_5_4,
			 R.drawable.father_5_5,
			 R.drawable.father_5_6,
			 R.drawable.father_5_7,
			 R.drawable.father_5_8,
			 R.drawable.father_5_9,
			 R.drawable.father_5_10,
			 R.drawable.father_5_10,
			 R.drawable.father_5_10,
			
			 R.drawable.father_6_0,
			 R.drawable.father_6_0,
			 R.drawable.father_6_1,
			 R.drawable.father_6_2,
			 R.drawable.father_6_3,
			 R.drawable.father_6_5
			 
			 
	 };
	 
	 public int[] recordArray = {
			 1, 
			 6,
             2, 
             3,
             3,
             3,
             4,
             5,  
             
             
             7,
             2,        
             3,
             3,
             3,
             3,
             3,
             3,
             3,
             3,
             3,
             3,             
             4,
             5,
             
            8,
            2,           
            3,
            3,
            3,
            3,
            3,
            3,
            3,
            3,
            3,
            3,             
            4,
            5,
            
             9,
             2,      
             3,
             3,
             3,
             3,
             3,
             3,
             3,
             3,
             3,
             3,             
             4,
             5,
             
             10,
             2,            
             3,
             3,
             3,
             3,
             3,
             3,
             3,
             3,
             3,
             3,             
             4,
             5,
             
             11,
             2,       
             3,
             3,
             3,
             3,
             3,
             3,
             3,
             3,
             3,
             3,             
             4,
             5,
             
            12,
             2,
             3,
             3,
             3,
             4
             
           };
		public int[] audioArray = {
			   R.raw.one,
			   R.raw.visuvasam,
               R.raw.two, 
               R.raw.three,
               R.raw.three,
               R.raw.three,               
               R.raw.four,
               R.raw.five,
               
               R.raw.jyone,
               R.raw.two,          
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,               
               R.raw.four,
               R.raw.five,
               
               R.raw.jytwo,
               R.raw.two,             
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,               
               R.raw.four,
               R.raw.five,
               
               R.raw.jythree,
               R.raw.two,       
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,               
               R.raw.four,
               R.raw.five,
               
               R.raw.jyfour,
               R.raw.two,              
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,               
               R.raw.four,
               R.raw.five,
               
               R.raw.jyfive,
               R.raw.two,         
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.four,
               R.raw.five,
              
               R.raw.finalprayer,
               R.raw.two,
               R.raw.three,
               R.raw.three,
               R.raw.three,
               R.raw.four
               
             };
boolean checkBoxFlag;
//UserAudio.checkBoxFlag;
	@Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.ring_main);
     //   button=(Button)findViewById(R.id.button1);
       // System.out.println("Flag Checked"+checkBoxFlag);
        imageView1=(ImageView)findViewById(R.id.imageView1);
        imageView2=(ImageView)findViewById(R.id.imageView2);
        
        imageView3=(ImageView)findViewById(R.id.imageView3);
      
      //button.setOnClickListener(mAutoGlobal_OnClickListener);
        imageView3.setOnClickListener(mAutoGlobal_OnClickListener);//Play    
        imageView2.setOnClickListener(mGlobal_OnClickListener);//Fwd
        
        imageView2.setVisibility(View.INVISIBLE);
        
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_WORLD_READABLE);      
           System.out.println("---THE RECORDED AUDIO VALUE---"+sharedPreferences.getBoolean("check",true));                  
           // Toast.makeText(rosaryActivity.this, "---THE RECORDED AUDIO VALUE---"+sharedPreferences.getBoolean("check",true) ,Toast.LENGTH_LONG).show();  
          
           CheckBox CheckBox1= UserAudio.CheckBox1;  
           try{
           CheckBox1.isChecked();
           checkBoxFlag= CheckBox1.isChecked();
           }
           catch(NullPointerException e){
        	   checkBoxFlag= false;
        	   e.printStackTrace();
           }
          // Toast.makeText(rosaryActivity.this, "---THE RECORDED AUDIO VALUE---"+ CheckBox1.isChecked() ,Toast.LENGTH_LONG).show();
           //checkBoxFlag= prefs.getBoolean("check",true);  
           if(checkBoxFlag== true){
        	   System.out.println("boolean valvue rklas"+checkingAllAudioFiles());
               checkBoxFlag=checkingAllAudioFiles();
           		if(checkBoxFlag== false){
           			UserAudio.CheckBox1.setChecked(false);
           		}
           		System.out.println("--The checkbox value by---"+checkBoxFlag);
              }
         //  Toast.makeText(rosaryActivity.this, "Flag Checked"+checkBoxFlag ,Toast.LENGTH_LONG).show();  
           
        TelephonyManager mgr = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
	 	if(mgr != null) {
	 	    mgr.listen(phoneStateListener, PhoneStateListener.LISTEN_CALL_STATE);
	 	}
	 	try{
        	playViaAlarmIntent = getIntent().getExtras().getString("playViaAlarmIntent");
      	  if(!playViaAlarmIntent.equals(null) && playViaAlarmIntent!=null){
      		SharedPreferences preferences = getSharedPreferences("toggle",0);
      		SharedPreferences.Editor editor = preferences.edit();
      	//	System.out.println("--THE BUTTON VAL--"+);
      		boolean checkBoxMon = preferences.getBoolean("checkboxMon", false);
      		boolean checkBoxTue = preferences.getBoolean("checkboxTue", false); 
      		boolean checkBoxWed = preferences.getBoolean("checkboxWed", false);
      		 boolean checkBoxThu = preferences.getBoolean("checkboxThu", false); 
      		  boolean checkBoxFri = preferences.getBoolean("checkboxFri", false);
      		boolean checkBoxSat = preferences.getBoolean("checkboxSat", false);
      	  boolean checkBoxSun = preferences.getBoolean("checkboxSun", false); 
      		
      	  if(checkBoxMon==false && checkBoxTue==false && checkBoxWed==false && checkBoxThu==false && checkBoxFri==false && checkBoxSat==false && checkBoxSun==false){
            editor.putBoolean("tgpref", false); // value to store
            editor.putString("infoText", "");
            editor.commit();
      	  }
           // System.out.println("--THE BUTTON VAL--"+preferences.getBoolean("tgpref", true));
      		//AlarmManagerCaller.button.setChecked(false);
      		  imageView3.performClick();
      	  }
      	  System.out.println("----ALARM INTENT---"+playViaAlarmIntent);
        }catch(NullPointerException n){
        	
        }
	}
	@Override
	public void onBackPressed(){
		 finish();
		}
	
	int playAudioSeg = 0;
	 @Override
	    protected void onStop() {
	            super.onStop();
	            if (this.isFinishing()){
	            	if ( mPlayer!=null){
	            	mPlayer.stop();
	            	}
	            }
	        }
	 private static boolean isPaused=false;
	    final OnClickListener mAutoGlobal_OnClickListener = new OnClickListener() {
	        @Override
			public void onClick(final View v) {
	       
               imageView1=(ImageView)findViewById(R.id.imageView1);
	        	
	        	//button=(Button)findViewById(R.id.button1);
	        	imageView3=(ImageView)findViewById(R.id.imageView3);
	        	if(mPlayer!=null && mPlayer.isPlaying()==false)
	        	{
	        		
	        			System.out.println("--HIT Play BUTTON--");
	            		//button.setText("Pause");
	            	
	        		
	            		mPlayer.start();
	        		
	        		/*System.out.println("--BUTTON TEXT NAME--"+button.getText());
	        		mPlayer.pause();
	        		isPaused=true;*/
	        		
	        		
	        		
	        	}
	        	else if(mPlayer!=null &&  mPlayer.isPlaying()==true){
	        	
	        		System.out.println("--HIT PAUSE BUTTON--");
	        		//button.setText("Start");
	        	
	        		mPlayer.pause();
	        	}
	           	else{
	        	
	        	imageView1.setImageResource(R.drawable.one);
	      if(checkBoxFlag==false)
	       		{
	    		System.out.println("--HIT FIRST PLAYING BUTTON--");
	         	mPlayer = MediaPlayer.create(rosaryActivity.this, audioArray[0]);
	   	        mPlayer.start();
	       	}
	     else if(checkBoxFlag==true){
	    	 boolean exists = (new File(Environment.getExternalStorageDirectory() + "/RossaryAudio/")).exists();
	    	 if (!exists) {
	     		System.out.println("---HIT NEW IF BLOC---");
	     	    Toast.makeText(rosaryActivity.this,"RECORD THE AUDIO FILE", Toast.LENGTH_LONG).show();
	     	}
	    	 else{
	       	    System.out.println("--HIT FIRST PLAYING with recording BUTTON--");
	       		mPlayer=new MediaPlayer();
	       		 FileDescriptor fd = null; 
	       		 File baseDir = Environment.getExternalStorageDirectory();
	       		 String audioPath1 = baseDir.getAbsolutePath() + "/RossaryAudio"+"/SignOfTheCross1" + ".3gp";
       			 FileInputStream fis = null;
				try {
						fis = new FileInputStream(audioPath1);
				        fd = fis.getFD();
				        System.out.println("audiocheck"+audioPath1);
				        System.out.println("fd check"+fd);
					} catch (FileNotFoundException e) {
					
						e.printStackTrace();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					try {
						mPlayer.setDataSource(fd);
						mPlayer.prepare();
					} catch (IllegalArgumentException e) {
				
						e.printStackTrace();
					} catch (IllegalStateException e) {
		
						e.printStackTrace();
					} catch (IOException e) {
					
						e.printStackTrace();
					}
       			
			
       			
					mPlayer.start();
	    	 }
	       		}
	        	   // int iconColor = android.graphics.Color.GREEN;
	        	
	        	    if(mPlayer!=null && mPlayer.isPlaying()==true){
	            		//button.setText("Pause");
	            		 mPlayer.setOnCompletionListener(changeStep);
	            	}
	        	   // imageViewg1.setVisibility(View.VISIBLE);
	            	//imageView1.setVisibility(View.GONE);
	            	// Set the correct new color
	            	//imageView1.setColorFilter(iconColor, Mode.MULTIPLY);
	        	 
	        	   }
	        }};
	 
	  final OnCompletionListener changeStep= new OnCompletionListener(){
	       	 @Override
	   		public void onCompletion(MediaPlayer mp) {
	       	if(i<84){
	       		System.out.println("CUREENNT LOOP "+i);
	       		if(i>10 && i<19)
		   		 {
		       		System.out.println("HIT FORWARD IMAGE--------------> VISIBLE--M--1----"+i);
		       		imageView2.setVisibility(View.VISIBLE);
		   		 }
	       		else if(i>24 && i<32)
	       		{
	       			System.out.println("HIT FORWARD IMAGE--------------> VISIBLE--M--2----"+i);
	       			imageView2.setVisibility(View.VISIBLE);
	       		}
	       		else if(i>38 && i<46)
	       		{
	       			System.out.println("HIT FORWARD IMAGE--------------> VISIBLE--M--3----"+i);
	       			imageView2.setVisibility(View.VISIBLE);
	       		}
	       		else if(i>52 && i<60)
	       		{
	       			System.out.println("HIT FORWARD IMAGE--------------> VISIBLE--M--4----"+i);
	       			imageView2.setVisibility(View.VISIBLE);
	       		}
	       		else if(i>66 && i<74)
	       		{
	       			System.out.println("HIT FORWARD IMAGE--------------> VISIBLE--M--5----"+i);
	       			imageView2.setVisibility(View.VISIBLE);
	       		}
		   		else
		   		{
		   			 System.out.println("HIT FORWARD IMAGE--------------> INVISIBLE----"+i);
		   			 imageView2.setVisibility(View.INVISIBLE);
		   		}
	       		imageView1=(ImageView)findViewById(R.id.imageView1);
	       		imageView1.setImageResource(imageArrayShow[i]);
	       		//mPlayer.stop();
	       		//mPlayer.release();
	       		if(checkBoxFlag==false)
	       		{
	         	mPlayer = MediaPlayer.create(rosaryActivity.this, audioArray[i]);
	   	        
	       		}
	       		else if(checkBoxFlag==true){
		System.out.println("--GOT RECORDED PLAYING SECTION");
	       			
	       			mPlayer=new MediaPlayer();
	       			
	       		 FileDescriptor fd = null; 
	       		 
	       		String audioPath1=findRecordAudio(recordArray,i);
	       		
	       				System.out.println("--INSIDE PLAYING AUDIO PATH--");
	       			FileInputStream fis;
					try {
						fis = new FileInputStream(audioPath1);
				        fd = fis.getFD();
					} catch (FileNotFoundException e) {
					
						e.printStackTrace();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					try {
						mPlayer.setDataSource(fd);
						mPlayer.prepare();
					} catch (IllegalArgumentException e) {
				
						e.printStackTrace();
					} catch (IllegalStateException e) {
		
						e.printStackTrace();
					} catch (IOException e) {
					
						e.printStackTrace();
					}
					
	       		}
	       	 mPlayer.start();
	   	  i++;
	   	  mPlayer.setOnCompletionListener(changeStep);
	   	   
	     	}else{
	     		mPlayer.stop();
	     		mPlayer.release();
	     		System.out.println("------BACK TO ROSARY ACTIVITY---");
	     		Intent i=new Intent(rosaryActivity.this,MainActivity.class);
	            startActivity(i);
	     	}
	     	}
	     };
	     
	     public void onClick(View view) {
	         /*  */  int[] values = new int[2]; 
	             view.getLocationOnScreen(values);
	             Log.d("X & Y",values[0]+" "+values[1]);
	         System.out.println("-------HIT ONCLICK EVENT--------");
	         }
	     
	/*     @Override
	     public boolean onCreateOptionsMenu(Menu menu) {
	         getMenuInflater().inflate(R.menu.activity_main, menu);
	         return true;
	     }  
	   */  
	        //Global On click listener for all views
	     final OnClickListener mGlobal_OnClickListener = new OnClickListener() {
	    	 
	    	 @Override
    		 public void onClick(final View v) {
    			
    			   //System.out.println("--HIT ONCLICK----"+i);
    			if(i>7 && i<21){
	  	        //  Toast.makeText(rosaryActivity.this,"--HIT ONCLICK FIRST DECADE----"+i, Toast.LENGTH_LONG).show(); 
	  	    	imageView1=(ImageView)findViewById(R.id.imageView1);
	       		imageView1.setImageResource(imageArrayShow[21]);
	       		if(mPlayer.isPlaying()==true){
	       			mPlayer.stop();
	       			mPlayer.release();
	       		}
	       		System.out.println("IMAGE ARRAY---"+imageArrayShow[21]+"---AUDIO ARRAY"+audioArray[20]);
	       		if(checkBoxFlag==false)
	       		{
    			mPlayer = MediaPlayer.create(rosaryActivity.this, audioArray[20]);
    			mPlayer.start();
			 	i=21;
			 	mPlayer.setOnCompletionListener(changeStep);
	       		}
	       		else{
	       		MediaPlayer recordMediaPlayer=new MediaPlayer();	
	       		 FileDescriptor fd = null; 
        		 File baseDir = Environment.getExternalStorageDirectory();
        	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/GloryBe4"+".3gp";
        	        FileInputStream fis;
					try {
						fis = new FileInputStream(audioPath);
				        fd = fis.getFD();
					} catch (FileNotFoundException e) {
					
						e.printStackTrace();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					try {
						recordMediaPlayer.setDataSource(fd);
						recordMediaPlayer.prepare();
					} catch (IllegalArgumentException e) {
				
						e.printStackTrace();
					} catch (IllegalStateException e) {
		
						e.printStackTrace();
					} catch (IOException e) {
					
						e.printStackTrace();
					}
					recordMediaPlayer.start();
				 	i=21;
				 	recordMediaPlayer.setOnCompletionListener(changeStep);
	       		}
	       		
              
              
    			}
    			else if(i>21 && i<35){
    			//	Toast.makeText(rosaryActivity.this,"--HIT ONCLICK SECOND DECADE----"+i, Toast.LENGTH_LONG).show();
    				imageView1=(ImageView)findViewById(R.id.imageView1);
		       		imageView1.setImageResource(imageArrayShow[35]);
		       		if(mPlayer.isPlaying()==true){
		       			mPlayer.stop();
		       			mPlayer.release();
		       		}
		       		System.out.println("IMAGE ARRAY---"+imageArrayShow[35]+"---AUDIO ARRAY"+audioArray[34]);
		       		if(checkBoxFlag==false)
		       		{
	    			mPlayer = MediaPlayer.create(rosaryActivity.this, audioArray[34]);
	    			mPlayer.start();
				 	i=35;
				 	mPlayer.setOnCompletionListener(changeStep);
		       		}
		       		else{
		       			MediaPlayer recordMediaPlayer=new MediaPlayer();	
			       		 FileDescriptor fd = null; 
	            		 File baseDir = Environment.getExternalStorageDirectory();
	            	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/GloryBe4"+".3gp";
	            	        FileInputStream fis;
							try {
								fis = new FileInputStream(audioPath);
						        fd = fis.getFD();
							} catch (FileNotFoundException e) {
							
								e.printStackTrace();
							} catch (IOException e) {
								
								e.printStackTrace();
							}
							try {
								recordMediaPlayer.setDataSource(fd);
								recordMediaPlayer.prepare();
							} catch (IllegalArgumentException e) {
						
								e.printStackTrace();
							} catch (IllegalStateException e) {
				
								e.printStackTrace();
							} catch (IOException e) {
							
								e.printStackTrace();
							}
							recordMediaPlayer.start();
						 	i=35;
						 	recordMediaPlayer.setOnCompletionListener(changeStep);
		       		}
		       		
    			}	
    			else if(i>35 && i<49){
    				//Toast.makeText(rosaryActivity.this,"--HIT ONCLICK THIRD DECADE----"+i, Toast.LENGTH_LONG).show();
    				imageView1=(ImageView)findViewById(R.id.imageView1);
		       		imageView1.setImageResource(imageArrayShow[49]);
		       		if(mPlayer.isPlaying()==true){
		       			mPlayer.stop();
		       			mPlayer.release();
		       		}
		       		System.out.println("IMAGE ARRAY---"+imageArrayShow[49]+"---AUDIO ARRAY"+audioArray[48]);
		       		if(checkBoxFlag==false)
		       		{
	    			mPlayer = MediaPlayer.create(rosaryActivity.this, audioArray[49]);
	    			mPlayer.start();
	               	i=49;
	               	mPlayer.setOnCompletionListener(changeStep);
		       		}
		       		else{
		       			MediaPlayer recordMediaPlayer=new MediaPlayer();	
			       		 FileDescriptor fd = null; 
	            		 File baseDir = Environment.getExternalStorageDirectory();
	            	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/GloryBe4"+".3gp";
	            	        FileInputStream fis;
							try {
								fis = new FileInputStream(audioPath);
						        fd = fis.getFD();
							} catch (FileNotFoundException e) {
							
								e.printStackTrace();
							} catch (IOException e) {
								
								e.printStackTrace();
							}
							try {
								recordMediaPlayer.setDataSource(fd);
								recordMediaPlayer.prepare();
							} catch (IllegalArgumentException e) {
						
								e.printStackTrace();
							} catch (IllegalStateException e) {
				
								e.printStackTrace();
							} catch (IOException e) {
							
								e.printStackTrace();
							}
							recordMediaPlayer.start();
					     	i=49;
						 	recordMediaPlayer.setOnCompletionListener(changeStep);
		       		}
		       		
    			}
    			else if(i>49 && i<63){
    			//	Toast.makeText(rosaryActivity.this,"--HIT ONCLICK FOURTH DECADE----"+i, Toast.LENGTH_LONG).show();
    				imageView1=(ImageView)findViewById(R.id.imageView1);
		       		imageView1.setImageResource(imageArrayShow[63]);
		       		if(mPlayer.isPlaying()==true){
		       			mPlayer.stop();
		       			mPlayer.release();
		       		}
		       		System.out.println("IMAGE ARRAY---"+imageArrayShow[63]+"---AUDIO ARRAY"+audioArray[62]);
		       		if(checkBoxFlag==false)
		       		{
	    			mPlayer = MediaPlayer.create(rosaryActivity.this, audioArray[62]);
	    			mPlayer.start();
	               	i=63;
	               	mPlayer.setOnCompletionListener(changeStep);
		       		}
		       		else{
		       			MediaPlayer recordMediaPlayer=new MediaPlayer();	
			       		 FileDescriptor fd = null; 
	            		 File baseDir = Environment.getExternalStorageDirectory();
	            	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/GloryBe4"+".3gp";
	            	        FileInputStream fis;
							try {
								fis = new FileInputStream(audioPath);
						        fd = fis.getFD();
							} catch (FileNotFoundException e) {
							
								e.printStackTrace();
							} catch (IOException e) {
								
								e.printStackTrace();
							}
							try {
								recordMediaPlayer.setDataSource(fd);
								recordMediaPlayer.prepare();
							} catch (IllegalArgumentException e) {
						
								e.printStackTrace();
							} catch (IllegalStateException e) {
				
								e.printStackTrace();
							} catch (IOException e) {
							
								e.printStackTrace();
							}
							recordMediaPlayer.start();
						 	i=63;
						 	recordMediaPlayer.setOnCompletionListener(changeStep);
		       		}
		       	
    			}
    			else if(i>63 && i<77){
    			//	Toast.makeText(rosaryActivity.this,"--HIT ONCLICK FITFTH DECADE----"+i, Toast.LENGTH_LONG).show();
    				imageView1=(ImageView)findViewById(R.id.imageView1);
		       		imageView1.setImageResource(imageArrayShow[77]);
		       		if(mPlayer.isPlaying()==true){
		       			mPlayer.stop();
		       			mPlayer.release();
		       		}
		       		System.out.println("IMAGE ARRAY---"+imageArrayShow[77]+"---AUDIO ARRAY"+audioArray[76]);
		       		if(checkBoxFlag==false)
		       		{
	    			mPlayer = MediaPlayer.create(rosaryActivity.this, audioArray[76]);
	    			mPlayer.start();
	               	i=77;
	               	mPlayer.setOnCompletionListener(changeStep);
		       		}
		       		else{
		       			MediaPlayer recordMediaPlayer=new MediaPlayer();	
			       		 FileDescriptor fd = null; 
	            		 File baseDir = Environment.getExternalStorageDirectory();
	            	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/GloryBe4"+".3gp";
	            	        FileInputStream fis;
							try {
								fis = new FileInputStream(audioPath);
						        fd = fis.getFD();
							} catch (FileNotFoundException e) {
							
								e.printStackTrace();
							} catch (IOException e) {
								
								e.printStackTrace();
							}
							try {
								recordMediaPlayer.setDataSource(fd);
								recordMediaPlayer.prepare();
							} catch (IllegalArgumentException e) {
						
								e.printStackTrace();
							} catch (IllegalStateException e) {
				
								e.printStackTrace();
							} catch (IOException e) {
							
								e.printStackTrace();
							}
							recordMediaPlayer.start();
							i=77;
						 	recordMediaPlayer.setOnCompletionListener(changeStep);
		       		}
		       	
    			} 
    	
	    		}
	  	        
				
	    	 
	   
	    	 
	     /*    public void onClick(final View v) {
	        	
	         }*/

		
	     };
	     PhoneStateListener phoneStateListener = new PhoneStateListener() {
		 	    @Override
		 	    public void onCallStateChanged(int state, String incomingNumber) {
		 	        if (state == TelephonyManager.CALL_STATE_RINGING) {
		 	            //Incoming call: Pause music
		 	        	if(mPlayer!=null &&  mPlayer.isPlaying()==true){
		 	        		play_After_Call_Flag="YES";
			        		System.out.println("--HIT PAUSE BUTTON--");
			        		//button.setText("Start");
			        	
			        		mPlayer.pause();
			        	}
		       			
		 	        } else if(state == TelephonyManager.CALL_STATE_IDLE) {
		 	            //Not in call: Play music
		 	        	if(mPlayer!=null && mPlayer.isPlaying()==false)
			        	{
			        		
			        			System.out.println("--HIT Play BUTTON--");
			        			if(play_After_Call_Flag!=null){
			        				if(play_After_Call_Flag.equals("YES")){
			        							        					play_After_Call_Flag=null;
			        				mPlayer.start();
			        				}
			        			}
			        			
			        		/*System.out.println("--BUTTON TEXT NAME--"+button.getText());
			        		mPlayer.pause();
			        		isPaused=true;*/
			        		
			        		
			        		
			        	}
		 	        } else if(state == TelephonyManager.CALL_STATE_OFFHOOK) {
		 	            //A call is dialing, active or on hold
		 	        	if(mPlayer!=null &&  mPlayer.isPlaying()==true){
		 		        	
			        		System.out.println("--HIT PAUSE BUTTON--");
			        		//button.setText("Start");
			        	
			        		mPlayer.pause();
			        	}
		       			
		 	        }
		 	        super.onCallStateChanged(state, incomingNumber);
		 	    }
		 	};
		 	
		 	
		 	public String findRecordAudio(int[] recordArray,int currentState){
		 		String audioPath=null;
		 		File baseDir = Environment.getExternalStorageDirectory();
	       			switch(recordArray[currentState]){
	       			case 1:
	       				System.out.println("--HIT FIRST PLAYING with first recording BUTTON--");
	       			
	       			  audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/SignOfTheCross1" + ".3gp";
	       			 
				
	       			 break;
	       			case 2:
	       				System.out.println("--HIT FIRST PLAYING second with recording BUTTON--");
	       			
	       				 audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/OurFather2" + ".3gp";
	       			
	       			 break;
	       			case 3:
	       				System.out.println("--HIT FIRST PLAYING third with recording BUTTON--");
	    
	       				audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/HailMary3" + ".3gp";
	       			
					
	       			 break;
	       			case 4:
	       				System.out.println("--HIT FIRST PLAYING four with recording BUTTON--");
	       		
	       				audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/GloryBe4" + ".3gp";
	       				
	       			 break;
	       			case 5:
	       				System.out.println("--HIT FIRST PLAYING five with recording BUTTON--");
	       		
	       				audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/OMyJesus5" + ".3gp";
	       				
	       			 break;
	       			 
	       			case 6:
	       				System.out.println("--HIT FIRST PLAYING five with recording BUTTON--");
	       		
	       				audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Apostlescreed6" + ".3gp";
	       				
	       			 break;
	       			 
	       			case 7:
	       				System.out.println("--HIT FIRST PLAYING five with recording BUTTON--");
	       		
	       				audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Joyfulone7" + ".3gp";
	       				
	       			 break;
	       			 
	       			case 8:
	       				System.out.println("--HIT FIRST PLAYING five with recording BUTTON--");
	       		
	       				audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Joyfultwo8" + ".3gp";
	       				
	       			 break;
	       			 
	       			case 9:
	       				System.out.println("--HIT FIRST PLAYING five with recording BUTTON--");
	       		
	       				audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Joyfulthree9" + ".3gp";
	       				
	       			 break;
	       			 
	       			case 10:
	       				System.out.println("--HIT FIRST PLAYING five with recording BUTTON--");
	       		
	       				audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Joyfulfour10" + ".3gp";
	       				
	       			 break;
	       			 
	       			case 11:
	       				System.out.println("--HIT FIRST PLAYING five with recording BUTTON--");
	       		
	       				audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Joyfulfive11" + ".3gp";
	       				
	       			 break;
	       			 
	       			case 12:
	       				System.out.println("--HIT FIRST PLAYING Ending with recording BUTTON--");
	       		
	       				audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Michale" + ".3gp";
	       				
	       			 break;
	       			 
	       			default:
	       				System.out.println("--HIT FIRST PLAYING default with recording BUTTON--");
	       				mPlayer = MediaPlayer.create(rosaryActivity.this, recordArray[i]);
	       			
	       			}
	       			return audioPath;
		 	} 	
		
		 	public boolean checkingAllAudioFiles(){
		 		boolean result=false;
		 		
		 		File f1 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/SignOfTheCross1.3gp");
		 		File f2 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/OurFather2.3gp");
		 		File f3 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/HailMary3.3gp");
		 		File f4 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/GloryBe4.3gp");
		 		File f5 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/OMyJesus5.3gp");
		 		File f6 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Apostlescreed6.3gp");
		 		File f7 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulone7.3gp");
		    	File f8 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfultwo8.3gp");
		 		File f9 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulthree9.3gp");
		 		File f10 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulfour10.3gp");
		 		File f11 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulfive11.3gp");
		 		File f12 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulone12.3gp");
		 		File f13 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfultwo13.3gp");
		 		File f14 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulthree14.3gp");
		 		File f15 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulfour15.3gp");
		 		File f16 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulfive16.3gp");
		 		File f17 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousone17.3gp");
		 		File f18 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Glorioustwo18.3gp");
		 		File f19 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousthree19.3gp");
		 		File f20 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousfour20.3gp");
		 		File f21 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousfive21.3gp");
		 		File f22 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousone22.3gp");
		 		File f23 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminoustwo23.3gp");
		 		File f24 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousthree24.3gp");
		 		File f25 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousfour25.3gp");
		 		File f26 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousfive26.3gp");
		 		File f27 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Michale.3gp");
		 		
		 		
		 		if(f1.exists() && f2.exists() && f3.exists() && f4.exists() && f5.exists() && f6.exists() && f7.exists() && f8.exists() && f9.exists() && f10.exists()
		 				&& f11.exists() && f12.exists() && f13.exists() && f14.exists() && f15.exists() && f16.exists() && f17.exists() && f18.exists() && f19.exists() && f20.exists()
		 				&& f21.exists() && f22.exists() && f23.exists() && f24.exists() && f25.exists() && f26.exists() && f27.exists()){
		 			result=true;
		 			
		 		}
		 		
		 		return result;
		 	}
		 	
}
