package com.example.hyunju.project6_3;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

@SuppressWarnings("deprecation")
public class Main3Activity extends AppCompatActivity implements ActionBar.TabListener{

    ActionBar.Tab tabSong, tabArtist, tabAlbum;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        tabSong = bar.newTab();
        tabSong.setText("음악별");
        tabSong.setTabListener(this);
        bar.addTab(tabSong);

        tabArtist = bar.newTab();
        tabArtist.setText("가수별");
        tabArtist.setTabListener(this);
        bar.addTab(tabArtist);

        tabAlbum = bar.newTab();
        tabAlbum.setText("앨범별");
        tabAlbum.setTabListener(this);
        bar.addTab(tabAlbum);
    }

    MyTabFragment myFrags[]=new MyTabFragment[3];
     @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
         MyTabFragment myTabFrag=null;
         if(myFrags[tab.getPosition()]==null){
             myTabFrag=new MyTabFragment();
             Bundle data =new Bundle();
             data.putString("tabName",tab.getText().toString());
             myTabFrag.setArguments(data);
             myFrags[tab.getPosition()]=myTabFrag;
         }
         else{
             myTabFrag=myFrags[tab.getPosition()];
         }
         ft.replace(android.R.id.content,myTabFrag);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }
}