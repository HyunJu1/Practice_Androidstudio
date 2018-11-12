package com.example.hyunju.project4_ex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity {



    CheckBox chEnable;
    CheckBox chClick;
    CheckBox chrotate;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("연습문제4-7");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        chEnable = (CheckBox)(findViewById(R.id.checkBox));
        chClick=(CheckBox)(findViewById(R.id.checkBox2));
        chrotate=(CheckBox)(findViewById(R.id.checkBox3));
        btn=(Button)(findViewById(R.id.button));

        chEnable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chEnable.isChecked()==true) {
                    btn.setVisibility(View.VISIBLE);
                }
                else{
                    btn.setVisibility(View.INVISIBLE);
                }
            }
        });

        chClick.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                btn.setClickable(TRUE); //이건 그냥 대충 넘어가자

            }
        });

        chrotate.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
              if(chrotate.isChecked()==true){
                btn.setRotation(45);
                  }
                  else{
                  btn.setRotation(0);
              }
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });


    }



}
