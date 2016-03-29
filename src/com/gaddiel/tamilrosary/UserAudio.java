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
import android.widget.Toast;

public class UserAudio  extends Activity  {
	
	private static final String LOG_TAG = "UserAudio";


		//private static boolean playing=false;
	    private static String mFileName = null;

	    
	    //boolean key for playing recorded audio if there
	    private static boolean playFlag=false;
	    public static boolean checkBoxFlag;
	    
		 private static MediaPlayer mPlayer1=null;
		 private Button   mPlayButton = null;
		 boolean mStartPlaying = true;
	public static int id;

	


		 public UserAudio() {
			 File dir = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio");
		/*	 if(dir.exists() && dir.isDirectory()) {
				 playFlag=true;
			 }
			*/
			
		    }


	Button play;
	Button record;
 public static	CheckBox CheckBox1;
	/*    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        getMenuInflater().inflate(R.menu.activity_main, menu);
	        return true;
	    }
	  */ 

	    @Override
	    public void onCreate(Bundle savedStateInstance) {
	    	super.onCreate(savedStateInstance);
	    	setContentView(R.layout.useraudio_tab);
	    	SharedPreferences settings = getPreferences(Context.MODE_WORLD_READABLE);
	    	SharedPreferences.Editor editor = settings.edit(); 
	 
			
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
	        ImageView playButton33=(ImageView)findViewById(R.id.ImageView54);
	        
	     File f1 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/SignOfTheCross1.3gp");
       	 if(f1.exists())
       	 {
       		playButton1.setVisibility(View.VISIBLE);
       	 }
       	 else
       	 {
       		playButton1.setVisibility(View.INVISIBLE);
       	 }
	        
       	File f2 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/OurFather2.3gp");
      	 if(f2.exists())
      	 {
      		playButton3.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton3.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f3 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/HailMary3.3gp");
      	 if(f3.exists())
      	 {
      		playButton5.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton5.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f4 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/GloryBe4.3gp");
      	 if(f4.exists())
      	 {
      		playButton7.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton7.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f5 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/OMyJesus5.3gp");
      	 if(f5.exists())
      	 {
      		playButton9.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton9.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f6 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Apostlescreed6.3gp");
      	 if(f6.exists())
      	 {
      		playButton11.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton11.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f7 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulone7.3gp");
      	 if(f7.exists())
      	 {
      		playButton13.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton13.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f8 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfultwo8.3gp");
      	 if(f8.exists())
      	 {
      		playButton14.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton14.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f9 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulthree9.3gp");
      	 if(f9.exists())
      	 {
      		playButton15.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton15.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f10 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulfour10.3gp");
      	 if(f10.exists())
      	 {
      		playButton16.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton16.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f11 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulfive11.3gp");
      	 if(f11.exists())
      	 {
      		playButton17.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton17.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f12 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulone12.3gp");
      	 if(f12.exists())
      	 {
      		playButton18.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton18.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f13 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfultwo13.3gp");
      	 if(f13.exists())
      	 {
      		playButton19.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton19.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f14 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulthree14.3gp");
      	 if(f14.exists())
      	 {
      		playButton20.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton20.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f15 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulfour15.3gp");
      	 if(f15.exists())
      	 {
      		playButton21.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton21.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f16 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulfive16.3gp");
      	 if(f16.exists())
      	 {
      		playButton22.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton22.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f17 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousone17.3gp");
      	 if(f17.exists())
      	 {
      		playButton23.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton23.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f18 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Glorioustwo18.3gp");
      	 if(f18.exists())
      	 {
      		playButton24.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton24.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f19 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousthree19.3gp");
      	 if(f19.exists())
      	 {
      		playButton25.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton25.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f20 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousfour20.3gp");
      	 if(f20.exists())
      	 {
      		playButton26.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton26.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f21 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousfive21.3gp");
      	 if(f21.exists())
      	 {
      		playButton27.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton27.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f22 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousone22.3gp");
      	 if(f22.exists())
      	 {
      		playButton28.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton28.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f23 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminoustwo23.3gp");
      	 if(f23.exists())
      	 {
      		playButton29.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton29.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f24 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousthree24.3gp");
      	 if(f24.exists())
      	 {
      		playButton30.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton30.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f25 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousfour25.3gp");
      	 if(f25.exists())
      	 {
      		playButton31.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton31.setVisibility(View.INVISIBLE);
      	 }
      	 
      	File f26 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousfive26.3gp");
      	 if(f26.exists())
      	 {
      		playButton32.setVisibility(View.VISIBLE);
      	 }
      	 else
      	 {
      		playButton32.setVisibility(View.INVISIBLE);
      	 }
      	
      	 File f27 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Michale.3gp");
     	 if(f27.exists())
     	 {
     		 System.out.println("MICHALE VISIBLE");
     		playButton33.setVisibility(View.VISIBLE);
     	 }
     	 else
     	 {
     		System.out.println("MICHALE IN VISIBLE");
     		playButton33.setVisibility(View.INVISIBLE);
     	 }
      	 
      	
	    
  CheckBox1=(CheckBox)findViewById(R.id.checkBox1);
  CheckBox1.setChecked(false);
  CheckBox1.setChecked(load());  
  checkBoxFlag=CheckBox1.isChecked();
  System.out.println("Check Box Checked value"+CheckBox1.isChecked());
  
  if(CheckBox1.isChecked()== true){
	  
    	 if(f1.exists()&& f2.exists()&& f3.exists()&& f4.exists()&& f5.exists()&& f6.exists()&& f7.exists()&& f8.exists()
    		&& f9.exists()&& f10.exists()&& f11.exists()&& f12.exists()&& f13.exists()&& f14.exists()&& f15.exists()&&
    		f16.exists()&& f17.exists()&& f18.exists()&& f19.exists()&& f20.exists()&& f21.exists()&& f22.exists()&&
    		f23.exists()&& f24.exists()&& f25.exists()&& f26.exists()&& f27.exists())
    	 {
    		  
    	 }else{
    		 save(false);
    	 }
    
  	 }
   	 
	  
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
	        save(CheckBox1.isChecked());
	    }
	    
	    @Override
	    public void onResume() {
	        super.onResume();
	       CheckBox1.setChecked(load());
	    }
	    
	    private void save(final boolean isChecked) {
	        SharedPreferences sharedPreferences = getPreferences(Context.MODE_WORLD_READABLE);
	        SharedPreferences.Editor editor = sharedPreferences.edit();
	        editor.putBoolean("check", isChecked);
	        editor.commit();
	        checkBoxFlag=CheckBox1.isChecked();
	    }
	    
	    private boolean load() { 
	        SharedPreferences sharedPreferences = getPreferences(Context.MODE_WORLD_READABLE); 
	        checkBoxFlag=CheckBox1.isChecked();
	        return sharedPreferences.getBoolean("check", false);
	    }
	    
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
	public void check(View checkview){
		if(CheckBox1.isChecked()==true){	
			//Toast.makeText(UserAudio.this, "--------inside checked if condition", Toast.LENGTH_LONG).show();
			
			 File s = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/SignOfTheCross1.3gp");
			 File o = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/OurFather2.3gp");
			 File h = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/HailMary3.3gp");
			 File g = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/GloryBe4.3gp");
			 File om = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/OMyJesus5.3gp");
			 
			 File aC = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Apostlescreed6.3gp");
			 
			 File j1 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulone7.3gp");
			 File j2 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfultwo8.3gp");
			 File j3 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulthree9.3gp");
			 File j4 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulfour10.3gp");
			 File j5 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulfive11.3gp");
			 
			 File s1 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulone12.3gp");
			 File s2 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfultwo13.3gp");
			 File s3 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulthree14.3gp");
			 File s4 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulfour15.3gp");
			 File s5 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulfive16.3gp");
			 
			 File g1 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousone17.3gp");
			 File g2 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Glorioustwo18.3gp");
			 File g3 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousthree19.3gp");
			 File g4 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousfour20.3gp");
			 File g5 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousfive21.3gp");
			 
			 File l1 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousone22.3gp");
			 File l2 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminoustwo23.3gp");
			 File l3 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousthree24.3gp");
			 File l4 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousfour25.3gp");
			 File l5 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousfive26.3gp");
			 
			 File mick1 = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Michale.3gp");
			 
			 
			
			 if(!s.exists() || !o.exists() || !h.exists() || !g.exists() || !om.exists()|| !aC.exists()
					 || !j1.exists() || !j2.exists() || !j3.exists() || !j4.exists()|| !j5.exists()
					 || !s1.exists() || !s2.exists() || !s3.exists() || !s4.exists()|| !s5.exists()
					 || !g1.exists() || !g2.exists() || !g3.exists() || !g4.exists()|| !g5.exists()
					 || !l1.exists() || !l2.exists() || !l3.exists() || !l4.exists()|| !l5.exists()|| !mick1.exists())
			 {
				// Toast.makeText(UserAudio.this, "PLEASE RECORD All THE FILES AND PLAY", Toast.LENGTH_LONG).show();			 
				 if(!s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this, getResources().getString(R.string.toast1), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && !o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this, getResources().getString(R.string.toast2), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && !h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this, getResources().getString(R.string.toast3), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && !g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast4), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && !om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast5), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && !aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast6), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && !j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast7), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && !j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast8), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && !j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast9), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && !j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast10), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& !j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast11), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && !s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast12), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && !s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast13), Toast.LENGTH_LONG).show();
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && !s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast14), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && !s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast15), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& !s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this, getResources().getString(R.string.toast16), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && !g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this, getResources().getString(R.string.toast17), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && !g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast18), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && !g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast19), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && !g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast20), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& !g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast21), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && !l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this, getResources().getString(R.string.toast22), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && !l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast23), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && !l3.exists() && l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast24), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && !l4.exists()&& l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this, getResources().getString(R.string.toast25), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& !l5.exists()&& mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast26), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				 else if(s.exists() && o.exists() && h.exists() && g.exists() && om.exists() && aC.exists()
						 && j1.exists() && j2.exists() && j3.exists() && j4.exists()&& j5.exists()
						 && s1.exists() && s2.exists() && s3.exists() && s4.exists()&& s5.exists()
						 && g1.exists() && g2.exists() && g3.exists() && g4.exists()&& g5.exists()
						 && l1.exists() && l2.exists() && l3.exists() && l4.exists()&& l5.exists()&& !mick1.exists()){
					Toast.makeText(UserAudio.this,getResources().getString(R.string.toast27), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				else{
					Toast.makeText(UserAudio.this, getResources().getString(R.string.Saveaudiotoast), Toast.LENGTH_LONG).show();
					CheckBox1.setChecked(false);
				}
				
			 }
			
		}
		else{
			 boolean check= false;
			 SharedPreferences sharedPreferences = getPreferences(Context.MODE_WORLD_READABLE);
		        SharedPreferences.Editor editor = sharedPreferences.edit();
		        editor.putBoolean("check", check);
		        editor.commit();
		      
		         sharedPreferences = getPreferences(Context.MODE_PRIVATE); 
		        checkBoxFlag=CheckBox1.isChecked();
		         sharedPreferences.getBoolean("check", false);
		        
		       // Toast.makeText(UserAudio.this, sharedPreferences.getBoolean("check", true)+"-else-", Toast.LENGTH_LONG).show();
		}
	//	boolean check= CheckBox1.isChecked();
		
		
		//Toast.makeText(UserAudio.this, check+"--", Toast.LENGTH_LONG).show();
	}
	    private void startPlaying(int id) {
	    	/*System.out.println("STATUS"+CheckBox1.isChecked());
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
	        
	            {
	            	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/SignOfTheCross1.3gp");
	            	 if(f.exists())
	            	   { 
//	            		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
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
	            
	            	   }
	            	 else{
	            		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	            	   }
	             }
	            
	          
	    		mPlayer1.start();
	            break;
	      case R.id.ImageView3:
	            // Second play button
	    	  
	    	  mPlayer1 = new MediaPlayer();
	    	 {
	         	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/OurFather2.3gp");
	         	 if(f.exists())
	         	   { 
//	         		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	         		 // soundPath is usually an URI, but Media player requires a path not url encoded
	         		 FileDescriptor fd = null; 
	         		 File baseDir = Environment.getExternalStorageDirectory();
	         	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/OurFather2" + ".3gp";
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
	        		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	        	   }
	    	  }
	    	  
	  		mPlayer1.start();
	        	  break;
	        case R.id.ImageView5:
	            // Third play button
	        	
	       
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/HailMary3.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/HailMary3" + ".3gp";
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
	        		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	        	   }
	       	  }
	        	
	    		mPlayer1.start();
	        	  break;
	        case R.id.ImageView7:
	            // Fourth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/GloryBe4.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/GloryBe4" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	        	  break;
	        case R.id.ImageView9:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/OMyJesus5.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/OMyJesus5" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;
	          
	        case R.id.ImageView11:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	//if(playFlag==true)
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Apostlescreed6.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Apostlescreed6" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;      
	            
	        case R.id.ImageView13:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulone7.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Joyfulone7" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;       

	        case R.id.ImageView14:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	//if(playFlag==true)
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfultwo8.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Joyfultwo8" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;       

	        case R.id.ImageView15:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulthree9.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Joyfulthree9" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;  
	            
	        case R.id.ImageView16:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulfour10.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Joyfulfour10" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;       
	          
	        case R.id.ImageView17:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Joyfulfive11.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Joyfulfive11" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;       
	            
	        case R.id.ImageView18:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	//if(playFlag==true)
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulone12.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Sarrowfulone12" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	        case R.id.ImageView19:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfultwo13.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Sarrowfultwo13" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	        case R.id.ImageView20:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	//if(playFlag==true)
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulthree14.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Sarrowfulthree14" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	        case R.id.ImageView21:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulfour15.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Sarrowfulfour15" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	        case R.id.ImageView22:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Sarrowfulfive16.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Sarrowfulfive16" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	        case R.id.ImageView23:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousone17.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Gloriousone17" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	        case R.id.ImageView24:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Glorioustwo18.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Glorioustwo18" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	        case R.id.ImageView25:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousthree19.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Gloriousthree19" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;
	            
	        case R.id.ImageView26:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousfour20.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Gloriousfour20" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	        case R.id.ImageView27:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Gloriousfive21.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Gloriousfive21" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	       
	        case R.id.ImageView28:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousone22.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Luminousone22" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	      
	        case R.id.ImageView29:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminoustwo23.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Luminoustwo23" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	      
	        case R.id.ImageView30:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousthree24.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Luminousthree24" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	       
	        
	        case R.id.ImageView31:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousfour25.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Luminousfour25" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	       
	        
	        case R.id.ImageView32:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Luminousfive26.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Luminousfive26" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
	    		mPlayer1.start();
	            break;          
	            
	        case R.id.ImageView54:
	            // Fifth play button
	        	mPlayer1 = new MediaPlayer();
	        	{
	           	 File f = new File(Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/Michale.3gp");
	           	 if(f.exists())
	           	   { 
//	           		 /String pathName=Environment.getExternalStorageDirectory() + "/RossaryAudio"+"/audiorecordtest1.3gp";
	           		 // soundPath is usually an URI, but Media player requires a path not url encoded
	           		 FileDescriptor fd = null; 
	           		 File baseDir = Environment.getExternalStorageDirectory();
	           	        String audioPath = baseDir.getAbsolutePath() + "/RossaryAudio"+"/Michale" + ".3gp";
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
	           
	           	   }
	           	else{
	     		   Toast.makeText(UserAudio.this, "PLEASE RECORD IT AND PLAY", Toast.LENGTH_LONG).show();
	     	   }
	       	  }
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
	        	Intent intent =new Intent(UserAudio.this,RecordActivity.class);
	        	startActivity(intent);
	        	

	        } 
	        
	             @Override
	    	public void onBackPressed() {
	        	
	     Intent intent = new Intent(UserAudio.this,MainActivity.class);  
	     intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);  	
         startActivity(intent);
	        	
         /*
	         	Intent i=new Intent(UserAudio.this,MainActivity.class);
	         	
	            startActivity(i);
	            
	           System.out.println("------THE ONCLICK--Back Button IN LANGUAGE TAB HIT---"); */
	       	 }


	   
	}

