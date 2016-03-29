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
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.Toast;


public class AudioTab extends Activity {

	 private static final String LOG_TAG = "AudioTab";

    private static String mFileName = null;

    //boolean key for playing recorded audio if there
    private static boolean playFlag=false;
    public static boolean checkBoxFlag;
    
	 private static MediaPlayer mPlayer1=null;
	 private Button   mPlayButton = null;
	 boolean mStartPlaying = true;
     public static int id;

     public static  TabHost  tabHost;

	 public AudioTab() {
		 File dir = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio");
	/*	 if(dir.exists() && dir.isDirectory()) {
			 playFlag=true;
		 }
		*/
		
	    }


Button play;
Button record;
CheckBox CheckBox1;
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/
    

    @Override
    public void onCreate(Bundle savedStateInstance) {
    	super.onCreate(savedStateInstance);
    	setContentView(R.layout.audio_tab2);
    	SharedPreferences settings = getPreferences(Context.MODE_PRIVATE);
    	SharedPreferences.Editor editor = settings.edit(); 
 
    	//tabHost=CustmSett.tabHost;
		
    	ImageView playButton1=(ImageView)findViewById(R.id.ImageView1);
        ImageView playButton3=(ImageView)findViewById(R.id.ImageView3);
        ImageView playButton5=(ImageView)findViewById(R.id.ImageView5);
        ImageView playButton7=(ImageView)findViewById(R.id.ImageView7);
        ImageView playButton9=(ImageView)findViewById(R.id.ImageView9);
        ImageView playButton11=(ImageView)findViewById(R.id.ImageView11);
        ImageView playButton13=(ImageView)findViewById(R.id.ImageView13);
        ImageView playButton14=(ImageView)findViewById(R.id.ImageView14);
        ImageView playButton15=(ImageView)findViewById(R.id.ImageView15);
        ImageView playButton16=(ImageView)findViewById(R.id.ImageView16);
        ImageView playButton17=(ImageView)findViewById(R.id.ImageView17);
        ImageView playButton18=(ImageView)findViewById(R.id.ImageView18);
        ImageView playButton19=(ImageView)findViewById(R.id.ImageView19);
        ImageView playButton20=(ImageView)findViewById(R.id.ImageView20);
        ImageView playButton21=(ImageView)findViewById(R.id.ImageView21);
        ImageView playButton22=(ImageView)findViewById(R.id.ImageView22);
        ImageView playButton23=(ImageView)findViewById(R.id.ImageView23);
        ImageView playButton24=(ImageView)findViewById(R.id.ImageView24);
        ImageView playButton25=(ImageView)findViewById(R.id.ImageView25);
        ImageView playButton26=(ImageView)findViewById(R.id.ImageView26);
        ImageView playButton27=(ImageView)findViewById(R.id.ImageView27);
        ImageView playButton28=(ImageView)findViewById(R.id.ImageView28);
        ImageView playButton29=(ImageView)findViewById(R.id.ImageView29);
        ImageView playButton30=(ImageView)findViewById(R.id.ImageView30);
        ImageView playButton31=(ImageView)findViewById(R.id.ImageView31);
        ImageView playButton32=(ImageView)findViewById(R.id.ImageView32);
        ImageView playButton33=(ImageView)findViewById(R.id.ImageView33);
        
   
     
//  System.out.println("Check Box Checked value"+CheckBox1.isChecked());
    playButton1.setOnClickListener(onClickListener);
    playButton3.setOnClickListener(onClickListener);
    playButton5.setOnClickListener(onClickListener);
    playButton7.setOnClickListener(onClickListener);
    playButton9.setOnClickListener(onClickListener);
    playButton11.setOnClickListener(onClickListener);
    playButton13.setOnClickListener(onClickListener);
    playButton14.setOnClickListener(onClickListener);
    playButton15.setOnClickListener(onClickListener);
    playButton16.setOnClickListener(onClickListener);
    playButton17.setOnClickListener(onClickListener);
    playButton18.setOnClickListener(onClickListener);
    playButton19.setOnClickListener(onClickListener);
    playButton20.setOnClickListener(onClickListener);
    playButton21.setOnClickListener(onClickListener);
    playButton22.setOnClickListener(onClickListener);
    playButton23.setOnClickListener(onClickListener);
    playButton24.setOnClickListener(onClickListener);
    playButton25.setOnClickListener(onClickListener);
    playButton26.setOnClickListener(onClickListener);
    playButton27.setOnClickListener(onClickListener);
    playButton28.setOnClickListener(onClickListener);
    playButton29.setOnClickListener(onClickListener);
    playButton30.setOnClickListener(onClickListener);
    playButton31.setOnClickListener(onClickListener);
    playButton32.setOnClickListener(onClickListener);
    playButton33.setOnClickListener(onClickListener);
    }
    
    @Override
    public void onPause() {
        super.onPause();
       // save(CheckBox1.isChecked());
    }
    
    @Override
    public void onResume() {
        super.onResume();
       // CheckBox1.setChecked(load());
    }
    
  /*  private void save(final boolean isChecked) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("check", isChecked);
        editor.commit();
        checkBoxFlag=CheckBox1.isChecked();
    }
    
    private boolean load() { 
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE); 
        checkBoxFlag=CheckBox1.isChecked();
        return sharedPreferences.getBoolean("check", false);
    }*/
    
    @Override
    protected void onStop() {
            super.onStop();
            if (this.isFinishing()){
            	if(mPlayer1!=null){
            		mPlayer1.stop();
            	}
            }
        }
    

    
    
    private void onPlay(boolean start,int id) {
        if (start) {
            startPlaying(id);
        } else {
            stopPlaying();
        }
    }
   
       
    private void startPlaying(int id) {
     /*	System.out.println("STATUS"+CheckBox1.isChecked());
    	 if(CheckBox1.isChecked()==true){
    	    	playFlag=true;
    	    	System.out.println("--INSIDE CHECKBOX CHECKS FUNCTION");
    	    }
    	 else{
 	    	playFlag=false;
 	    	System.out.println("--INSIDE CHECKBOX NON CHECKS FUNCTION");
 	    }*/
    	
        	
    	switch (id) {
        case R.id.ImageView1:
            // First play button
        	mPlayer1 = new MediaPlayer();
        
        	/*    if(playFlag==true){
            	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/SignOfTheCross1.3gp");
            	 if(f.exists())
            	   { 
//            		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
            		 // soundPath is usually an URI, but Media player requires a path not url encoded
            		 FileDescriptor fd = null; 
            		 File baseDir = Environment.getExternalStorageDirectory();
            	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/SignOfTheCross1" + ".3gp";
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
							mPlayer1.setDataSource(fd);
							mPlayer1.prepare();
						} catch (IllegalArgumentException e) {
					
							e.printStackTrace();
						} catch (IllegalStateException e) {
			
							e.printStackTrace();
						} catch (IOException e) {
						
							e.printStackTrace();
						}
            
            	   }else{
            		   Toast.makeText(AudioTab.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
            	   }
             }
             else{*/
      		   System.out.println("---IN DEFAULT MODE");		   
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.one);
      	//   }
          
    		mPlayer1.start();
            break;
      case R.id.ImageView3:
            // Second play button
    	  
    	  mPlayer1 = new MediaPlayer();
    
     		  System.out.println("---IN DEFAULT MODE");	
     		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.two);
     	//   }
  		mPlayer1.start();
        	  break;
        case R.id.ImageView5:
            // Third play button
          	mPlayer1 = new MediaPlayer();
         
         		  System.out.println("---IN DEFAULT MODE");	
         		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.three);
         //	   }
    		mPlayer1.start();
        	  break;
        case R.id.ImageView7:
            // Fourth play button
        	mPlayer1 = new MediaPlayer();
        
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.four);
      	//   }
    		mPlayer1.start();
        	  break;
        case R.id.ImageView9:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
        
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.five);
      	  // }
    		mPlayer1.start();
            break;
          
        case R.id.ImageView11:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
        
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.visuvasam);
      	//   }
    		mPlayer1.start();
            break;      
            
        case R.id.ImageView13:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
        	
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.jyone);
      	 //  }
    		mPlayer1.start();
            break;       

        case R.id.ImageView14:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
        
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.jytwo);
      	 //  }
    		mPlayer1.start();
            break;       

        case R.id.ImageView15:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
        
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.jythree);
      //	   }
    		mPlayer1.start();
            break;  
            
        case R.id.ImageView16:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
        	
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.jyfour);
      	 //  }
    		mPlayer1.start();
            break;       
          
        case R.id.ImageView17:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
        
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.jyfive);
      	//   }
    		mPlayer1.start();
            break;       
            
        case R.id.ImageView18:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
       
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.srwone);
      //	   }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView19:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
        
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.srwtwo);
      	 //  }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView20:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
   
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.srwthree);
      	//   }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView21:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
   
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.srwfour);
      //	   }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView22:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
    
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.srwfive);
      	//   }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView23:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
 
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.gluone);
      //	   }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView24:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
 
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.glutwo);
      	//   }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView25:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
 
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.gluthree);
      	 //  }
    		mPlayer1.start();
            break;
            
        case R.id.ImageView26:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
        
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.glufour);
      	//   }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView27:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
        	
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.glufive);
      //	   }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView28:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
     
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.luone);
      	 //  }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView29:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
      
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.lutwo);
      	//   }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView30:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
        
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.luthree);
      	 //  }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView31:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
        
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.lufour);
      //	   }
    		mPlayer1.start();
            break;          
            
        case R.id.ImageView32:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
       
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.lufive);
      //	   }
    		mPlayer1.start();
            break;  
            
        case R.id.ImageView33:
            // Fifth play button
        	mPlayer1 = new MediaPlayer();
   
       		  System.out.println("---IN DEFAULT MODE");	
      		   mPlayer1 =  MediaPlayer.create(AudioTab.this, R.raw.finalprayer);
      //	   }
    		mPlayer1.start();
            break;
            
        }  	
    	
    }

    private void stopPlaying() {
    	//mPlayer1.stop();
    	//mPlayer1.release();
    	mPlayer1 = null;
    	mStartPlaying = false;
    }

    
 

        private OnClickListener onClickListener = new OnClickListener() {
            public void onClick(View v) {
            	  final int id = v.getId();
            	  ImageView button=(ImageView) findViewById(id);
            	  if(mPlayer1!=null){
            	  System.out.println("THHE MEDIA PLAYING STATE--"+mPlayer1.isPlaying());
            	  if(mPlayer1.isPlaying()){
            		  mPlayer1.stop();
            		  mPlayer1.release();
            		 mStartPlaying=true;
            		 // onPlay(mStartPlaying,id);
            	  }
            	  }
                onPlay(mStartPlaying,id);
              //  mStartPlaying = !mStartPlaying;
            }
        };

        public void record(View view){
        	id=view.getId();
        	  if(mPlayer1!=null){
        	if(mPlayer1.isPlaying())
        	{
      		  mPlayer1.stop();
        	}
        	  }
        	Intent intent =new Intent(AudioTab.this,RecordActivity.class);
        	startActivity(intent);

        } 
    
        @Override
      	public void onBackPressed() {
        	
        	Intent intent = new Intent(AudioTab.this,MainActivity.class);      
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            
        	
        	 /*	Intent i=new Intent(LangTab.this,MainActivity.class);
            startActivity(i);*/
           
              System.out.println("------THE ONCLICK--Back Button IN LANGUAGE TAB HIT---");
           	 }   

   
}


