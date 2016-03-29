package com.gaddiel.tamilrosary;

import android.app.TabActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class CustmSett extends TabActivity {
	
	private static MediaPlayer mPlayer1=null;
	boolean mStartPlaying = true;
	public static TabHost tabHost;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custm_main);
         tabHost = getTabHost();
        
        String tabmess1= getResources().getString(R.string.tabmess1);
        
        // Tab for Language
        TabSpec langspec = tabHost.newTabSpec(tabmess1);
        langspec.setIndicator(tabmess1, getResources().getDrawable(R.drawable.icon_language_tab));
        Intent photosIntent = new Intent(this, LangTab.class);
        langspec.setContent(photosIntent);
        
        // Tab for SysAudio
        String tabmess2= getResources().getString(R.string.tabmess2);        
        TabSpec audiospec = tabHost.newTabSpec(tabmess2);
        // setting Title and Icon for the Tab
        
       audiospec.setIndicator(tabmess2, getResources().getDrawable(R.drawable.icon_audio_tab));
       Intent songsIntent = new Intent(this, AudioTab.class);
       audiospec.setContent(songsIntent);
        System.out.println("HIT AUDIO TAB");
        System.out.println("HIT AUDIO TAB-----> 1");
        System.out.println("HIT AUDIO TAB-----> 2");
     
        
     // Tab for Audio
        String tabmess3= getResources().getString(R.string.tabmess3);
        TabSpec userspec = tabHost.newTabSpec(tabmess3);
        // setting Title and Icon for the Tab
        
        userspec.setIndicator(tabmess3, getResources().getDrawable(R.drawable.icon_audio_tab));
        Intent userIntent = new Intent(this, UserAudio.class);
        userspec.setContent(userIntent);
       
       
        
        // Adding all TabSpec to TabHost
        tabHost.addTab(langspec); // Adding Language tab
        tabHost.addTab(audiospec); // Adding sysAudio tab
        tabHost.addTab(userspec); // Adding userAudio tab
    
    }
	
	
}
