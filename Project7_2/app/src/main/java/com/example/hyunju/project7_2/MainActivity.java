package com.example.hyunju.project7_2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기(context menu)");
        baseLayout=(LinearLayout)findViewById(R.id.baseLayout);
        btn1=(Button)findViewById(R.id.button1);
        registerForContextMenu(btn1);
        btn2=(Button)findViewById(R.id.button2);
        registerForContextMenu(btn2);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater =getMenuInflater();
        if(v==btn1){
            menu.setHeaderTitle("배경색 변경");
            mInflater.inflate(R.menu.menu1,menu);
        }
        if(v==btn2){
            //menu.setHeaderTitle("버튼 변경");
            mInflater.inflate(R.menu.menu2,menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.itemGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.subRotate:
                btn2.setRotation(45);
                return true;
            case R.id.subSize:
                btn2.setScaleX(2);
                return true;

        }
        return false;
    }
}
