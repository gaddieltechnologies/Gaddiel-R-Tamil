package com.gaddiel.tamilrosary;

import java.util.Date;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.widget.RemoteViews;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {

	private Context context;
	RemoteViews remoteViews;
	WakeLock wakeLock;
	
	@Override
	public void onReceive(Context arg0, Intent arg1) {
	
		//Toast.makeText(arg0, "Alarm received!", Toast.LENGTH_LONG).show();
		
		/*KeyguardManager km = (KeyguardManager) context.getSystemService(Context.KEYGUARD_SERVICE);
		final KeyguardManager.KeyguardLock kl = km.newKeyguardLock("MyKeyguardLock");
		kl.disableKeyguard();

		PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
		 wakeLock = pm.newWakeLock(PowerManager.FULL_WAKE_LOCK | PowerManager.ACQUIRE_CAUSES_WAKEUP
		        | PowerManager.ON_AFTER_RELEASE, "MyWakeLock");
		wakeLock.acquire();*/
		
		 String dayOfWeek;
			java.text.DateFormat mydateformat;
			java.util.Date currentdate;
			mydateformat = new java.text.SimpleDateFormat("EEEE");
			currentdate = new Date();
			dayOfWeek = mydateformat.format(currentdate);
			
			if(dayOfWeek.contentEquals("Monday") || dayOfWeek.contentEquals("Saturday") )
			{
				  Intent i = new Intent(arg0, rosaryActivity.class);
				    i.setAction(Intent.ACTION_SCREEN_ON);
				    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				    i.putExtra("playViaAlarmIntent","true");
				    arg0.startActivity(i);
			}else if (dayOfWeek.contentEquals("Tuesday") || dayOfWeek.contentEquals("Friday") )
			{ 
				  Intent i = new Intent(arg0, SorrowfulActivity.class);
				    i.setAction(Intent.ACTION_SCREEN_ON);
				    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				    i.putExtra("playViaAlarmIntent","true");
				    arg0.startActivity(i);
			}else if (dayOfWeek.contentEquals("Wednesday") || dayOfWeek.contentEquals("Sunday"))
			{
				  Intent i = new Intent(arg0, GloriousActivity.class);
				    i.setAction(Intent.ACTION_SCREEN_ON);
				    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				    i.putExtra("playViaAlarmIntent","true");
				    arg0.startActivity(i);
			}else{
				  Intent i = new Intent(arg0, LuminousActivity.class);
				    i.setAction(Intent.ACTION_SCREEN_ON);
				    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				    i.putExtra("playViaAlarmIntent","true");
				    arg0.startActivity(i);
			}
		
	     
	}
	

}
