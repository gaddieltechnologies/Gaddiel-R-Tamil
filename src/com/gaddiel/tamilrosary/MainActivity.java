package com.gaddiel.tamilrosary;


import java.util.Date;
import java.util.Locale;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {  
	/** Stores the selected item's position */
	  
		Button buttonCustom;
		private Spinner spinnerz;
		private Button btnSubmit;
    /** Called when the activity is first created.*/
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        setContentView(R.layout.activity_main);        
        buttonCustom = (Button) findViewById(R.id.btnCustom);
        addListenerOnButton();            
       //
        Spinner spinnerz = (Spinner) findViewById( R.id.spinner1 );
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
        this, R.array.color, android.R.layout.simple_spinner_item );
       adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
       spinnerz.setAdapter( adapter );

	/*	spinnerz.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
		 @Override
       public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
           Spinner spinner = (Spinner) parent;
        // showToast(Integer.toString(spinner.getSelectedItemPosition()));
           switch (position){
           case 0:
           	
               break;
           case 1:
           	Intent position1=new Intent(MainActivity.this,rosaryActivity.class);
           	position1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
           	position1.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
           	position1.putExtra("keep", false);
               startActivity(position1);
               break;
           case 2:
           	Intent position2=new Intent(MainActivity.this,SorrowfulActivity.class);
           	position2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
           	position2.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
           	position2.putExtra("keep", false);
               startActivity(position2);
              break;
              
           case 3:
           	Intent position3=new Intent(MainActivity.this,GloriousActivity.class);
           	position3.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
           	position3.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
           	position3.putExtra("keep", false);
               startActivity(position3);
              break;
          case 4:
           	Intent position4=new Intent(MainActivity.this,LuminousActivity.class);
           	position4.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
           	position4.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
           	position4.putExtra("keep", false);
               startActivity(position4);
              break;
        }                       
           
   }

       @Override
       public void onNothingSelected(AdapterView<?> parent) {
       }
   });*/
       //
        TextView mystry=(TextView) findViewById(R.id.textView101); 
       
        String dayOfWeek;
		java.text.DateFormat mydateformat;
		java.util.Date currentdate;
		mydateformat = new java.text.SimpleDateFormat("EEEE");
		currentdate = new Date();
		dayOfWeek = mydateformat.format(currentdate);
		 
		// Set the right mystery checkbox based on the day of the week 
		if(dayOfWeek.contentEquals("Monday") || dayOfWeek.contentEquals("Saturday") )
		{
			System.out.println( "TODAY IS  JOYFULL "+dayOfWeek);
			spinnerz.setSelection(0);
			String mess = getResources().getString(R.string.joyyy);
			String mess1 = getResources().getString(R.string.today);

			Resources res = getResources();
			DisplayMetrics dm = res.getDisplayMetrics();
			Configuration conf = res.getConfiguration();
			if(conf.locale != null)
				{
				System.out.println("--Current Locale--"+conf.locale);
				//Toast.makeText(MainActivity.this, conf.locale.toString(), Toast.LENGTH_LONG).show();
				}
			
			dayOfWeek=findWeekDay(conf.locale, dayOfWeek);
			mystry.setText(" "+ dayOfWeek + mess);
			
		}
		else if (dayOfWeek.contentEquals("Tuesday") || dayOfWeek.contentEquals("Friday") )
		{ 
			System.out.println( "TODAY IS  SORROWFULL "+dayOfWeek);
			spinnerz.setSelection(1);
			String mess = getResources().getString(R.string.sorrr);
			String mess1 = getResources().getString(R.string.today);

			Resources res = getResources();
			DisplayMetrics dm = res.getDisplayMetrics();
			Configuration conf = res.getConfiguration();
			if(conf.locale != null)
				{
				System.out.println("--Current Locale--"+conf.locale);
				//Toast.makeText(MainActivity.this, conf.locale.toString(), Toast.LENGTH_LONG).show();
				}
			
			dayOfWeek=findWeekDay(conf.locale, dayOfWeek);
			mystry.setText(" "+ dayOfWeek + mess);
			
		}
		else if (dayOfWeek.contentEquals("Wednesday") || dayOfWeek.contentEquals("Sunday"))
		{
			 System.out.println( "TODAY IS  GLORIOUS "+dayOfWeek);
			 spinnerz.setSelection(2);
			    String mess = getResources().getString(R.string.glooo);
				String mess1 = getResources().getString(R.string.today);

				Resources res = getResources();
				DisplayMetrics dm = res.getDisplayMetrics();
				Configuration conf = res.getConfiguration();
				if(conf.locale != null)
					{
					System.out.println("--Current Locale--"+conf.locale);
					//Toast.makeText(MainActivity.this, conf.locale.toString(), Toast.LENGTH_LONG).show();
					}
				
				dayOfWeek=findWeekDay(conf.locale, dayOfWeek);
				mystry.setText(" "+ dayOfWeek + mess);
		}
		else
		{
			 System.out.println( "TODAY IS  LUMINOUS "+dayOfWeek);
			 spinnerz.setSelection(3);
			    String mess = getResources().getString(R.string.lummm);
				String mess1 = getResources().getString(R.string.today);

				Resources res = getResources();
				DisplayMetrics dm = res.getDisplayMetrics();
				Configuration conf = res.getConfiguration();
				if(conf.locale != null)
					{
					System.out.println("--Current Locale--"+conf.locale);
					//Toast.makeText(MainActivity.this, conf.locale.toString(), Toast.LENGTH_LONG).show();
					}
				
				dayOfWeek=findWeekDay(conf.locale, dayOfWeek);
				mystry.setText(" "+ dayOfWeek + mess);
		}
        
        
    }
    
 // get the selected dropdown list value
    public void addListenerOnButton() {
   
    spinnerz = (Spinner) findViewById(R.id.spinner1);
   	btnSubmit = (Button) findViewById(R.id.button1);
   	btnSubmit.setOnClickListener(new Button.OnClickListener() {
    
  	  @Override
	public void onClick(View v) {
  		 System.out.println("------THE ONCLICK--HIT---");
  		 showToast((String)spinnerz.getSelectedItem());
	  	  Toast.makeText(MainActivity.this, String.valueOf(spinnerz.getSelectedItem()),Toast.LENGTH_SHORT).show();
	  	  if(String.valueOf(spinnerz.getSelectedItemPosition()).equals("0")){
	  	    	Intent position=new Intent(MainActivity.this,rosaryActivity.class);
		  		startActivity(position);
	  	    }
	  	    else if(String.valueOf(spinnerz.getSelectedItemPosition()).equals("1")){
	  	    	Intent position=new Intent(MainActivity.this,SorrowfulActivity.class);
		  		startActivity(position);
	  	    }
	  	    else if(String.valueOf(spinnerz.getSelectedItemPosition()).equals("2")){
	  	    	Intent position=new Intent(MainActivity.this,GloriousActivity.class);
		  		startActivity(position);
	  	    }
	  	 else{
	  		Intent position=new Intent(MainActivity.this,LuminousActivity.class);
	  		startActivity(position);
	  	 }
  	  }	  
   
  	});
    

    }
    
    private void showToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
    
    public void onCustomClick2(View arg0) {
    	// Toast.makeText(MainActivity.this, String.valueOf("'தனிப்பயனாக்கம்' இலவச பதிப்பில் இல்லை.  /n தயவு செய்து தனிப்பயனாக்கத்திற்க்கு பரதிபலிக்கின்ற ஜெபமாலையை  பதிவிறக்கம் செய்ய கட்டண பதிப்பை பதிவிறக்கம் செய்யுங்கள்.  /n பரதிபலிக்கின்ற ஜெபமாலையை கட்டண  பதிவில் பதிவிறக்கம்  செய்ததற்க்கு  நன்றி. "),Toast.LENGTH_LONG).show();
		
	    Intent intent = new Intent(MainActivity.this, ImgScreen.class);
                    startActivity(intent);   
                   

	}
    public void onalarmClick(View arg0) {
		 
	    Intent intent = new Intent(MainActivity.this, AlarmManagerCaller.class);
                    startActivity(intent);   
                    

	}
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return  true;
    }

    
       @Override
	    public boolean onOptionsItemSelected(MenuItem item){
    	   
    	  switch(item.getItemId())
    	  {
    	  case R.id.button1:
    		  Intent launchNewIntent = new Intent(MainActivity.this, Aboutus.class);
    	    	startActivityForResult(launchNewIntent, 0);
    	    	break;
    	  case R.id.button2:
    		  Intent launchNewIntent2= new Intent(MainActivity.this, Help.class);
    	    	startActivityForResult(launchNewIntent2, 0);
    	    	break;
    	  }
		return true;
        
    }
       /*
    public void onCustomClickStart(View arg0){
    	 System.out.println("------THE ONCLICK--HIT---");
      	
    		 Intent i=new Intent(MainActivity.this,rosaryActivity.class);
              startActivity(i);
   } */
   
    
    
    
    
   // @Override
  // 	public void onBackPressed() {
    	//super.onBackPressed();
    //	Log.i("HA", "Finishing");
    //	Intent intent = new Intent();
     //   intent.setAction(Intent.ACTION_MAIN);
    //    intent.addCategory(Intent.CATEGORY_HOME);

    //    startActivity(intent);
       
  
       	  // Log.i("HA", "Finishing");
       	   //SharedPreferences sharedPref = getSharedPreferences("radioState",0);
    	   //SharedPreferences.Editor prefEditor = sharedPref.edit();
    	   //prefEditor.putBoolean("userChoiceen",true);
    	   //prefEditor.putBoolean("userChoicehi",false);
    	   //prefEditor.putBoolean("userChoiceta",false);
    	  // prefEditor.commit();
       
    	 //  Intent intent = new Intent(Intent.ACTION_MAIN);
       	  // intent.addCategory(Intent.CATEGORY_HOME);
       	  // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
         	
           //startActivity(intent);
          
        //android.os.Process.killProcess(android.os.Process.myPid());
       	  // System.out.println("------THE ONCLICK--Back Button IN MAIN ACTIVITY HIT---");
       	   
//}
    public String findWeekDay(Locale locale,String dayOfWeek){
    	String currentLocale=locale.toString();
    	if(dayOfWeek.equals("Monday"))
    		{
    			dayOfWeek="திங்கட்கிழமையில்  ";
    		}
    		if(dayOfWeek.equals("Tuesday"))
    		{
    			dayOfWeek="செவ்வாய்க்கிழமையில்  ";
    		}
    		if(dayOfWeek.equals("Wednesday"))
    		{
    			dayOfWeek="புதன்கிழமையில்  ";
    		}
    		if(dayOfWeek.equals("Thursday"))
    		{
    			dayOfWeek="வியாழக்கிழமையில்  ";
    		}
    		if(dayOfWeek.equals("Friday"))
    		{
    			dayOfWeek="வெள்ளிக்கிழமையில்  ";
    		}
    		if(dayOfWeek.equals("Saturday"))
    		{
    			dayOfWeek="சனிக்கிழமையில்  ";
    		}
    		if(dayOfWeek.equals("Sunday"))
    		{
    			dayOfWeek="ஞாயிற்றுக்கிழமையில்  ";
    		}
    	
    	return dayOfWeek;
    }
    
    @Override
    public void onBackPressed() {
    	
    	Log.d("HA", "Finishing");
    	Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        this.finish();
     //   android.os.Process.killProcess(android.os.Process.myPid());
        }
}
