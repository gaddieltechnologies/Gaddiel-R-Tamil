package com.gaddiel.tamilrosary;

import java.util.Calendar;
import java.util.Date;



import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

public class AlarmManagerCaller extends Activity {


	
	//DatePicker pickerDate;
	TimePicker pickerTime;
	public static ToggleButton button;
	TextView info;
	
	CheckBox checkboxmon;
	CheckBox checkboxtue;
	CheckBox checkboxwed;
	CheckBox checkboxthu;
	CheckBox checkboxfri;
	CheckBox checkboxsat;
	CheckBox checkboxsun;
	final static int RQS_1 = 1;
	static boolean toggleFlag=false;
	AlarmManager alarmManager;
	PendingIntent pendingIntent;
	
	//for repaeat
	PendingIntent pendingIntent1;
	PendingIntent pendingIntent2;
	PendingIntent pendingIntent3;
	PendingIntent pendingIntent4;
	PendingIntent pendingIntent5;
	PendingIntent pendingIntent6;
	PendingIntent pendingIntent7;
	
	//for repeat ids
	static int _id1;
	 static int _id2;
	 static int _id3;
	 static int _id4;
	 static int _id5;
	 static int _id6;
	 static int _id7;
	
	String infoText;
	String meridian;
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.alarm_page); 
	        info = (TextView)findViewById(R.id.info);
	        pickerTime=(TimePicker)findViewById(R.id.timePicker1);
	        
	        checkboxmon=(CheckBox) findViewById(R.id.checkBox1);
	        checkboxtue=(CheckBox) findViewById(R.id.checkBox2);
	        checkboxwed=(CheckBox) findViewById(R.id.checkBox3);
	        checkboxthu=(CheckBox) findViewById(R.id.checkBox4);
	        checkboxfri=(CheckBox) findViewById(R.id.checkBox5);
	        checkboxsat=(CheckBox) findViewById(R.id.checkBox6);
	        checkboxsun=(CheckBox) findViewById(R.id.checkBox7);
	        //pickerDate=(DatePicker)findViewById(R.id.datePicker1);
	        
	         
	       

	     
			
			//pickerTime.setCurrentHour(now.get(Calendar.HOUR_OF_DAY));
			//pickerTime.setCurrentMinute(now.get(Calendar.MINUTE));
			
			button=(ToggleButton)findViewById(R.id.button1);
			
			  SharedPreferences preferences = getSharedPreferences("toggle",0);
		        boolean tgpref = preferences.getBoolean("tgpref", false);  //default is false
		        String infoString=preferences.getString("infoText", infoText);
		        System.out.println("--Booelaen Value--"+tgpref);
		        try{
		       if(!infoString.equals(""))
		    	   	info.setText(infoString);
		        }catch(NullPointerException n){
		        	info.setText("");
		        }
		      button.setChecked(tgpref);
			
		      boolean checkBoxMon = preferences.getBoolean("checkboxMon", false); 
		      checkboxmon.setChecked(checkBoxMon);
		      boolean checkBoxTue = preferences.getBoolean("checkboxTue", false); 
		      checkboxtue.setChecked(checkBoxTue);
		      boolean checkBoxWed = preferences.getBoolean("checkboxWed", false); 
		      checkboxwed.setChecked(checkBoxWed);
		      boolean checkBoxThu = preferences.getBoolean("checkboxThu", false); 
		      checkboxthu.setChecked(checkBoxThu);
		      boolean checkBoxFri = preferences.getBoolean("checkboxFri", false); 
		      checkboxfri.setChecked(checkBoxFri);
		      boolean checkBoxSat = preferences.getBoolean("checkboxSat", false); 
		      checkboxsat.setChecked(checkBoxSat);
		      boolean checkBoxSun = preferences.getBoolean("checkboxSun", false); 
		      checkboxsun.setChecked(checkBoxSun);
		      
		      System.out.println("--Monday Flag--"+checkBoxMon);
		      System.out.println("--TUESDAY Flag--"+checkBoxTue);
		      System.out.println("--WEDNESDAY Flag--"+checkBoxWed);
		      System.out.println("--THURSDAY Flag--"+checkBoxThu);
		      System.out.println("--FRIDAY Flag--"+checkBoxFri);
		      System.out.println("--SATURDAY Flag--"+checkBoxSat);
		      System.out.println("--SUNDAY Flag--"+checkBoxSun);
		      
			button.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View arg0) {
					
					System.out.println("--THE Toggle Flag Value---"+toggleFlag);
					
				if(toggleFlag==false){
						
						Calendar current = Calendar.getInstance();
						
						Calendar cal = Calendar.getInstance();
						cal.set(current.get(Calendar.YEAR), 
								current.get(Calendar.MONTH), 
								current.get(Calendar.DAY_OF_MONTH),
								pickerTime.getCurrentHour(), 
								pickerTime.getCurrentMinute(), 
								00);
						
						/*if(cal.compareTo(current) <= 0){
							//The set Date/Time already passed
						    Toast.makeText(getApplicationContext(), 
						    		"Invalid Date/Time", 
						    		Toast.LENGTH_LONG).show();
						    button.setChecked(false);
						    toggleFlag=false;
						    SharedPreferences preferences = getSharedPreferences("toggle",0);
							SharedPreferences.Editor editor = preferences.edit();
				            editor.putBoolean("tgpref", false); // value to store
				            editor.putString("infoText","");
				            editor.commit();
				           
				            
						}else{*/
							System.out.println("--INSIDE SET ALARM--");
							pickerTime.setEnabled(false);
							  checkboxmon.setEnabled(false);
						        checkboxtue.setEnabled(false);
						        checkboxwed.setEnabled(false);
						        checkboxthu.setEnabled(false);
						        checkboxfri.setEnabled(false);
						        checkboxsat.setEnabled(false);
						        checkboxsun.setEnabled(false);
							setAlarm(cal);
							toggleFlag=true;
							 SharedPreferences preferences = getSharedPreferences("toggle",0);
								SharedPreferences.Editor editor = preferences.edit();
					            editor.putBoolean("tgpref", true); // value to store
					            editor.putString("infoText", info.getText().toString());
					            editor.commit();
					//	}
					
				            
					
					}
					else if(toggleFlag==true){
						System.out.println("--INSIDE CANCEL ALARM--");
						cancelAlarm();
						 SharedPreferences preferences = getSharedPreferences("toggle",0);
						SharedPreferences.Editor editor = preferences.edit();
			            editor.putBoolean("tgpref", false); // value to store
			            editor.putString("infoText", "");
			            editor.putBoolean("checkboxMon", false); // value to store
			            editor.putBoolean("checkboxTue", false); // value to store
			            editor.putBoolean("checkboxWed", false); // value to store
			            editor.putBoolean("checkboxThu", false); // value to store
			            editor.putBoolean("checkboxFri", false); // value to store
			            editor.putBoolean("checkboxSat", false); // value to store
			            editor.putBoolean("checkboxSun", false); // value to store
			            editor.commit();
			        	pickerTime.setEnabled(true);
						  checkboxmon.setEnabled(true);
					        checkboxtue.setEnabled(true);
					        checkboxwed.setEnabled(true);
					        checkboxthu.setEnabled(true);
					        checkboxfri.setEnabled(true);
					        checkboxsat.setEnabled(true);
					        checkboxsun.setEnabled(true);
						toggleFlag=false;
						 info.setText("");
						 checkboxmon.setChecked(false);
						  checkboxtue.setChecked(false);
						  checkboxwed.setChecked(false);
						  checkboxthu.setChecked(false);
						  checkboxfri.setChecked(false);
						  checkboxsat.setChecked(false);
						  checkboxsun.setChecked(false);
					}
					
				
					
				}});
	        
	         }
	 
	 private void setAlarm(Calendar targetCal){

		
			
			Intent intent = new Intent(getBaseContext(), AlarmReceiver.class);
			//intent.setAction(Intent.ACTION_SCREEN_ON);
			pendingIntent = PendingIntent.getBroadcast(getBaseContext(), RQS_1, intent, 0);
			alarmManager = (AlarmManager)getBaseContext().getSystemService(Context.ALARM_SERVICE);
			if(checkboxmon.isChecked()==false && checkboxtue.isChecked()==false && checkboxwed.isChecked()==false && checkboxthu.isChecked()==false && checkboxfri.isChecked()==false && checkboxsat.isChecked()==false && checkboxsun.isChecked()==false )
			{
				Calendar current = Calendar.getInstance();
				
				Calendar cal = Calendar.getInstance();
				cal.set(current.get(Calendar.YEAR), 
						current.get(Calendar.MONTH), 
						current.get(Calendar.DAY_OF_MONTH),
						pickerTime.getCurrentHour(), 
						pickerTime.getCurrentMinute(), 
						00);
				if(cal.compareTo(current) <= 0){
					
					//setting the forwarding date
					int date=cal.get(Calendar.DAY_OF_MONTH);
					int max=cal.getMaximum(Calendar.DAY_OF_MONTH);
					if(date==max){
				
						date=1;
					}else{
						date+=1;
					}
				cal.set(current.get(Calendar.YEAR), 
						current.get(Calendar.MONTH), 
						date,
						pickerTime.getCurrentHour(), 
						pickerTime.getCurrentMinute(), 
						00);
					alarmManager.set(AlarmManager.RTC_WAKEUP,cal.getTimeInMillis(), pendingIntent);
					info.setText("Alarm is set for"+ cal.getTime());
					
				}else{
					alarmManager.set(AlarmManager.RTC_WAKEUP, targetCal.getTimeInMillis(), pendingIntent);
					info.setText("Alarm is set for"+ targetCal.getTime());
				}
				
			}		
			
			
			long interval = 0;
			
			
			 SharedPreferences preferences = getSharedPreferences("toggle",0);
				SharedPreferences.Editor editor = preferences.edit();
				editor.putBoolean("checkboxMon", false); // value to store
				editor.putBoolean("checkboxTue", false); // value to store
				editor.putBoolean("checkboxWed", false); // value to store
				editor.putBoolean("checkboxThu", false); // value to store
				editor.putBoolean("checkboxFri", false); // value to store
				editor.putBoolean("checkboxSat", false); // value to store
				editor.putBoolean("checkboxSun", false); // value to store
			
				 Calendar current = Calendar.getInstance();	
			String repeat=" ";
			String meridian="";	
			if(checkboxmon.isChecked()==true){
				System.out.println("--THE MONDAY SELECTED FOR REPEAT--");
				editor.putBoolean("checkboxMon", true); // value to store
				interval = 7 * AlarmManager.INTERVAL_DAY;
				 _id1 = (int) System.currentTimeMillis();
				 pendingIntent1 = PendingIntent.getBroadcast(getBaseContext(), _id1, intent, 0);
				//alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,targetCal.getTimeInMillis(),interval, pendingIntent);
				forday(2,pendingIntent1);
				repeat+="Monday";
			}
			if(checkboxtue.isChecked()==true){
				System.out.println("--THE TUESDAY SELECTED FOR REPEAT--");
				editor.putBoolean("checkboxTue", true); // value to store
				 interval = 7 * AlarmManager.INTERVAL_DAY;
				 _id2 = (int) System.currentTimeMillis();
				 pendingIntent2 = PendingIntent.getBroadcast(getBaseContext(), _id2, intent, 0);
				 //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,targetCal.getTimeInMillis(),interval, pendingIntent);
				 forday(3,pendingIntent2);
				 repeat+=" Tuesday";
			}
			if(checkboxwed.isChecked()==true){
				System.out.println("--THE WEDNESDAY SELECTED FOR REPEAT--");
				editor.putBoolean("checkboxWed", true); // value to store
				 interval = 7 * AlarmManager.INTERVAL_DAY;
				 _id3 = (int) System.currentTimeMillis();
				 pendingIntent3 = PendingIntent.getBroadcast(getBaseContext(), _id3, intent, 0);
				 //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,targetCal.getTimeInMillis(),interval, pendingIntent);
				 forday(4,pendingIntent3);
				 repeat+=" Wednesday";
			}
			if(checkboxthu.isChecked()==true){
				System.out.println("--THE THURSDAY SELECTED FOR REPEAT--");
				editor.putBoolean("checkboxThu", true); // value to store
				interval = 7 * AlarmManager.INTERVAL_DAY;
				_id4 = (int) System.currentTimeMillis();
				 pendingIntent4 = PendingIntent.getBroadcast(getBaseContext(), _id4, intent, 0);
				 //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,targetCal.getTimeInMillis(),interval, pendingIntent);
				forday(5,pendingIntent4);
				repeat+=" Thursday";
			}
			if(checkboxfri.isChecked()==true){
				System.out.println("--THE FRIDAY SELECTED FOR REPEAT--");
				editor.putBoolean("checkboxFri", true); // value to store
				interval = 7 * AlarmManager.INTERVAL_DAY;
				_id5 = (int) System.currentTimeMillis();
				 pendingIntent5 = PendingIntent.getBroadcast(getBaseContext(), _id5, intent, 0);
				 //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,targetCal.getTimeInMillis(),interval, pendingIntent);
				forday(6,pendingIntent5);
				repeat+=" Friday";
			}
			if(checkboxsat.isChecked()==true){
				System.out.println("--THE SATURDAY SELECTED FOR REPEAT--");
				editor.putBoolean("checkboxSat", true); // value to store
				interval = 7 * AlarmManager.INTERVAL_DAY;
				 _id6= (int) System.currentTimeMillis();
				 pendingIntent6 = PendingIntent.getBroadcast(getBaseContext(), _id6, intent, 0);
				// alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,targetCal.getTimeInMillis(),interval, pendingIntent);
				forday(7,pendingIntent6);
				repeat+=" Saturday";
			}
			if(checkboxsun.isChecked()==true){
				System.out.println("--THE SUNDAY SELECTED FOR REPEAT--");
				editor.putBoolean("checkboxSun", true); // value to store
				 interval = 7 * AlarmManager.INTERVAL_DAY;
				  _id7 = (int) System.currentTimeMillis();
				 pendingIntent7 = PendingIntent.getBroadcast(getBaseContext(), _id7, intent, 0);
				 //alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,targetCal.getTimeInMillis(),interval, pendingIntent);
				 forday(1,pendingIntent7);
				 repeat+=" Sunday";
			}
			
			
		
			editor.commit();
			if(!repeat.equals(" "))
				info.setText("Alarm is set in "+pickerTime.getCurrentHour()+":"+pickerTime.getCurrentMinute()+meridian+" and repeat for" + repeat);
			
		}

	 
	 public void cancelAlarm(){

		 	alarmManager = (AlarmManager)getBaseContext().getSystemService(Context.ALARM_SERVICE);

		   Intent updateServiceIntent = new Intent(getBaseContext(), AlarmReceiver.class);
		     pendingIntent = PendingIntent.getBroadcast(getBaseContext(), RQS_1, updateServiceIntent, 0);

		    // Cancel alarms
		    try {
		        alarmManager.cancel(pendingIntent);
		    } catch (Exception e) {
		        System.out.println( "AlarmManager update was not canceled. " + e.toString());
		        e.printStackTrace();
		    }
		    
		    if(checkboxmon.isChecked()==true){
		    	pendingIntent1 = PendingIntent.getBroadcast(getBaseContext(), _id1, updateServiceIntent, 0);
		    	  try {
				        alarmManager.cancel(pendingIntent1);
				    } catch (Exception e) {
				        System.out.println( "AlarmManager update was not canceled. " + e.toString());
				        e.printStackTrace();
				    }
		    }
		    if(checkboxtue.isChecked()==true){
		    	pendingIntent2 = PendingIntent.getBroadcast(getBaseContext(), _id2, updateServiceIntent, 0);
		    	 try {
				        alarmManager.cancel(pendingIntent2);
				    } catch (Exception e) {
				        System.out.println( "AlarmManager update was not canceled. " + e.toString());
				        e.printStackTrace();
				    }
		    }
		    if(checkboxwed.isChecked()==true){
		    	pendingIntent3 = PendingIntent.getBroadcast(getBaseContext(), _id3, updateServiceIntent, 0);
		    	 try {
				        alarmManager.cancel(pendingIntent3);
				    } catch (Exception e) {
				        System.out.println( "AlarmManager update was not canceled. " + e.toString());
				        e.printStackTrace();
				    }
		    }
		    if(checkboxthu.isChecked()==true){
		    	pendingIntent4 = PendingIntent.getBroadcast(getBaseContext(), _id4, updateServiceIntent, 0);
		    	try {
			        alarmManager.cancel(pendingIntent4);
			    } catch (Exception e) {
			        System.out.println( "AlarmManager update was not canceled. " + e.toString());
			        e.printStackTrace();
			    }
		    }
		    if(checkboxfri.isChecked()==true){
		    	pendingIntent5 = PendingIntent.getBroadcast(getBaseContext(), _id5, updateServiceIntent, 0);
		    	try {
			        alarmManager.cancel(pendingIntent5);
			    } catch (Exception e) {
			        System.out.println( "AlarmManager update was not canceled. " + e.toString());
			        e.printStackTrace();
			    }
		    }
		    if(checkboxsat.isChecked()==true){
		    	pendingIntent6 = PendingIntent.getBroadcast(getBaseContext(), _id6, updateServiceIntent, 0);
		    	try {
			        alarmManager.cancel(pendingIntent6);
			    } catch (Exception e) {
			        System.out.println( "AlarmManager update was not canceled. " + e.toString());
			        e.printStackTrace();
			    }
		    }
		    if(checkboxsun.isChecked()==true){
		    	 
		    	pendingIntent7 = PendingIntent.getBroadcast(getBaseContext(), _id7, updateServiceIntent, 0);
		    	try {
			        alarmManager.cancel(pendingIntent7);
			    } catch (Exception e) {
			        System.out.println( "AlarmManager update was not canceled. " + e.toString());
			        e.printStackTrace();
			    }
		    }
	 }
	 
	 @Override
	  	public void onResume() {
		 super.onResume();
		  SharedPreferences preferences = getSharedPreferences("toggle",0);
	        boolean tgpref = preferences.getBoolean("tgpref", false);  //default is false
	        button.setChecked(tgpref);
	        if(tgpref==true){
	        pickerTime.setEnabled(false);
			  checkboxmon.setEnabled(false);
		        checkboxtue.setEnabled(false);
		        checkboxwed.setEnabled(false);
		        checkboxthu.setEnabled(false);
		        checkboxfri.setEnabled(false);
		        checkboxsat.setEnabled(false);
		        checkboxsun.setEnabled(false);
	        }else{
	        	   pickerTime.setEnabled(true);
	 			  checkboxmon.setEnabled(true);
	 		        checkboxtue.setEnabled(true);
	 		        checkboxwed.setEnabled(true);
	 		        checkboxthu.setEnabled(true);
	 		        checkboxfri.setEnabled(true);
	 		        checkboxsat.setEnabled(true);
	 		        checkboxsun.setEnabled(true);
	        }
	        
	        String infoString=preferences.getString("infoText", infoText);
	       try{
	       if(!infoString.equals(""))
	    	   	info.setText(infoString);
	        }catch(NullPointerException n){
	        	info.setText("");
	        }
	       boolean checkBoxMon = preferences.getBoolean("checkboxMon", false); 
		      checkboxmon.setChecked(checkBoxMon);
		      boolean checkBoxTue = preferences.getBoolean("checkboxTue", false); 
		      checkboxtue.setChecked(checkBoxTue);
		      boolean checkBoxWed = preferences.getBoolean("checkboxWed", false); 
		      checkboxwed.setChecked(checkBoxWed);
		      boolean checkBoxThu = preferences.getBoolean("checkboxThu", false); 
		      checkboxthu.setChecked(checkBoxThu);
		      boolean checkBoxFri = preferences.getBoolean("checkboxFri", false); 
		      checkboxfri.setChecked(checkBoxFri);
		      boolean checkBoxSat = preferences.getBoolean("checkboxSat", false); 
		      checkboxsat.setChecked(checkBoxSat);
		      boolean checkBoxSun = preferences.getBoolean("checkboxSun", false); 
		      checkboxsun.setChecked(checkBoxSun);
		 
		
	 }
	 
	 @Override
	  	public void onBackPressed() {
		 super.onBackPressed();
		 SharedPreferences preferences = getSharedPreferences("toggle",0);
			SharedPreferences.Editor editor = preferences.edit();
			boolean tgpref = preferences.getBoolean("tgpref", false); 
            editor.putBoolean("tgpref", tgpref); // value to store
          editor.putString("infoText", info.getText().toString());
          /*   boolean checmonvalue=checkboxmon.isChecked();
            editor.putBoolean("checkboxMon",checmonvalue); // value to store
            boolean chectuevalue=checkboxtue.isChecked();
			editor.putBoolean("checkboxTue", chectuevalue); // value to store
		      boolean checwedvalue=checkboxwed.isChecked();
			editor.putBoolean("checkboxWed", checwedvalue); // value to store
		      boolean checthuvalue=checkboxthu.isChecked();
			editor.putBoolean("checkboxThu", checthuvalue); // value to store
		      boolean checfrivalue=checkboxfri.isChecked();
			editor.putBoolean("checkboxFri", checfrivalue); // value to store
		      boolean checsatvalue=checkboxsat.isChecked();
			editor.putBoolean("checkboxSat", checsatvalue); // value to store
		      boolean checsunvalue=checkboxsun.isChecked();
			editor.putBoolean("checkboxSun", checsunvalue); // value to store*/
		    editor.commit();
	 }
	 
     public void forday (int week,PendingIntent pendingIntent) {

         Calendar calSet = Calendar.getInstance();               

 int hour = pickerTime.getCurrentHour();
 pickerTime.setIs24HourView(pickerTime.is24HourView());

int testHour=pickerTime.getCurrentHour();
System.out.println("--PICKER TIME HOUR--"+testHour);
if(testHour>12){
	meridian="PM";
}
else
{
meridian="AM";
}
         int minute = pickerTime.getCurrentMinute();
         pickerTime.setIs24HourView(false);  
      //   Date now=new Date();
         //calSet.set(Calendar.YEAR, value); 
      //  int year =now.getYear();
       // int month=now.getMonth();

        Calendar current = Calendar.getInstance();
        int day = current.get(Calendar.DAY_OF_WEEK); 
        
        
       // calSet.set(Calendar.YEAR, year);
        
        //calSet.set(Calendar.MONTH,month);
         
        calSet.set(Calendar.DAY_OF_WEEK, week); 

        calSet.set(Calendar.HOUR_OF_DAY, testHour);

        calSet.set(Calendar.MINUTE, minute);

        calSet.set(Calendar.SECOND, 0);

        calSet.set(Calendar.MILLISECOND, 0);                 

        System.out.println("---DAY OF WEEK--"+day);
        System.out.println("--CURRENT AM PM-"+calSet.get(Calendar.AM_PM));
    	

        if(week>=day){
        	//alarmManager = (AlarmManager)getBaseContext().getSystemService(Context.ALARM_SERVICE);
        	System.out.println("--Current day--"+day);
        	alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calSet.getTimeInMillis(), AlarmManager.INTERVAL_DAY * 7, pendingIntent);
        	
        }else{
        	System.out.println("--Current day is less--"+day);
        	Calendar calSetting = Calendar.getInstance();  
           	calSetting.set(Calendar.DAY_OF_WEEK, week); 
        	calSetting.add(Calendar.WEEK_OF_YEAR, 1);
     

        	calSetting.set(Calendar.HOUR_OF_DAY, hour);

        	calSetting.set(Calendar.MINUTE, minute);

        	calSetting.set(Calendar.SECOND, 0);

        	calSetting.set(Calendar.MILLISECOND, 0);                 

        	alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calSetting.getTimeInMillis(), AlarmManager.INTERVAL_DAY * 7, pendingIntent);
        }
              		    

}
	 
	 }

