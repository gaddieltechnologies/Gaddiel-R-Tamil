package com.gaddiel.tamilrosary;

import java.util.Locale;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;



public class LangTab extends Activity {

	RadioButton btnen;
	RadioButton btnhi;
	RadioButton btnta;
	Locale myLocale;
	boolean userChoiceen;
	boolean userChoicehi;
	boolean userChoiceta;
	
	
	
	 @Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lang_tab1);   
      //  buttonSave=(Button)findViewById(R.id.buttoncustsave);
        btnen=(RadioButton)findViewById(R.id.radio0);
        btnhi=(RadioButton)findViewById(R.id.radio1);
        btnta=(RadioButton)findViewById(R.id.radio2);
       
        SharedPreferences sharedPref = getSharedPreferences("radioState",0);
        
        
        boolean startStateen=sharedPref.getBoolean("userChoiceen",userChoiceen);
        boolean startStatehi=sharedPref.getBoolean("userChoicehi",userChoicehi);
        boolean startStateta=sharedPref.getBoolean("userChoiceta",userChoiceta);
        if(startStateen==false && startStatehi==false && startStateta==false ){
        	
        }
        else{
            btnen.setChecked(sharedPref.getBoolean("userChoiceen",userChoiceen));
            btnhi.setChecked(sharedPref.getBoolean("userChoicehi",userChoicehi));
            btnta.setChecked(sharedPref.getBoolean("userChoiceta",userChoiceta));
        }
        
      /*  System.out.println("--ENGLISH BUTTON CHECKED--"+btnen.isChecked());
        System.out.println("--HINDI BUTTON CHECKED--"+btnhi.isChecked());
        System.out.println("--TAMIL BUTTON CHECKED--"+btnta.isChecked());
        
         btnen.setChecked(sharedPref.getBoolean("userChoiceen",userChoiceen));
         btnhi.setChecked(sharedPref.getBoolean("userChoicehi",userChoicehi));
         btnta.setChecked(sharedPref.getBoolean("userChoiceta",userChoiceta));*/
        
        Resources res = getResources();
		DisplayMetrics dm = res.getDisplayMetrics();
		Configuration conf = res.getConfiguration();
		if(conf.locale != null)
			{
			System.out.println("--Current Locale--"+conf.locale);
		    // Toast.makeText(LangTab.this, conf.locale.toString(), Toast.LENGTH_LONG).show();
		     if(conf.locale.toString().equals("en"))
		     {
		    	    btnen.setChecked(true);
		            btnhi.setChecked(false);
		            btnta.setChecked(false);
		     }
		     else if(conf.locale.toString().equals("hi")){
		    	    btnen.setChecked(false);
		            btnhi.setChecked(true);
		            btnta.setChecked(false);
		     }
		     else if(conf.locale.toString().equals("ta")){
		    	    btnen.setChecked(false);
		            btnhi.setChecked(false);
		            btnta.setChecked(true);
		     }
		     else{
		    	 btnen.setChecked(true);
		    	 btnhi.setChecked(false);
		    	 btnta.setChecked(false);
		     }
			}
     }
	 
	
    public void onClickSave(View view){
    	
    	 SharedPreferences sharedPref = getSharedPreferences("radioState",0);
	 	  SharedPreferences.Editor prefEditor = sharedPref.edit();
	 	
	 	  //boolean value intialize
	 	 boolean useren=false;
	 	 boolean userhi=false;
	 	 boolean userta=false;
	 	 
	 	 //boolean value asiging stored value
	 	 useren=sharedPref.getBoolean("userChoiceen",useren);
	 	userhi=sharedPref.getBoolean("userChoicehi",userhi);
	 	userta=sharedPref.getBoolean("userChoiceta",userta);
	
	 System.out.println("english"+useren);
	 System.out.println("hindi"+userhi);
	 System.out.println("tamil"+userta);
	// view.getId();
	 boolean eng=btnen.isChecked();
	 boolean hindi=btnhi.isChecked();
	 boolean tamil=btnta.isChecked();
	 
   if(useren==true && eng==true || userhi==true && hindi==true || userta==true && tamil==true){
	   Toast.makeText(LangTab.this,getResources().getString(R.string.allready), Toast.LENGTH_LONG).show();
    }
   else{
		
   	 if(btnen.isChecked()){    		
   		prefEditor.putBoolean("userChoiceen", btnen.isChecked());
   		prefEditor.putBoolean("userChoicehi", btnhi.isChecked());
   		prefEditor.putBoolean("userChoiceta", btnta.isChecked());
   		prefEditor.commit();   		
   		setLocale("en");
   	 }
   	 if(btnhi.isChecked()){
   		prefEditor.putBoolean("userChoiceen", btnen.isChecked());
   		prefEditor.putBoolean("userChoicehi", btnhi.isChecked());
   		prefEditor.putBoolean("userChoiceta", btnta.isChecked());
   		prefEditor.commit();
   		 setLocale("hi");
   	 }
   	 if(btnta.isChecked()){
   		prefEditor.putBoolean("userChoiceen", btnen.isChecked());
   		prefEditor.putBoolean("userChoicehi", btnhi.isChecked());
   		prefEditor.putBoolean("userChoiceta", btnta.isChecked());
   		prefEditor.commit();
   		 setLocale("ta");
   	 }
   	Toast.makeText(LangTab.this,getResources().getString(R.string.Savelangtoast), Toast.LENGTH_SHORT).show();
   }
 }	 
	 
    public void setLocale(String lang) {  

		if(lang.equals("en")){
			 System.out.println("--Hit ENGLISH-- ");
			myLocale = new Locale(lang);
			Resources res = getResources();
			DisplayMetrics dm = res.getDisplayMetrics();
			Configuration conf = res.getConfiguration();
			conf.locale = myLocale;
			res.updateConfiguration(conf, dm);
			Intent refresh = new Intent(this, CustmSett.class);
			startActivity(refresh);
		}
		if(lang.equals("hi")){
			 System.out.println("--Hit HINDI-- ");
			myLocale = new Locale(lang);
			Resources res = getResources();
			DisplayMetrics dm = res.getDisplayMetrics();
			Configuration conf = res.getConfiguration();
			conf.locale = myLocale;
			res.updateConfiguration(conf, dm);
			Intent refresh = new Intent(this, CustmSett.class);
			startActivity(refresh);
		}
		if(lang.equals("ta")){
			 System.out.println("--Hit Tamil -- ");
			myLocale = new Locale(lang);
			Resources res = getResources();
			DisplayMetrics dm = res.getDisplayMetrics();
			Configuration conf = res.getConfiguration();
			conf.locale = myLocale;
			res.updateConfiguration(conf, dm);
			Intent refresh = new Intent(this, CustmSett.class);
			startActivity(refresh);
		}
	
	}
   
    @Override
  	public void onBackPressed() {
    	
    	Intent intent = new Intent(LangTab.this,MainActivity.class);
    	intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        
    	
    	 /*	Intent i=new Intent(LangTab.this,MainActivity.class);
        startActivity(i);*/
       
          System.out.println("------THE ONCLICK--Back Button IN LANGUAGE TAB HIT---");
       	 }
}


