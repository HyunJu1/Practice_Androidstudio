package com.example.hyunju.a60151196_project4_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    Switch switchAgree;
    RadioGroup rGroup;
    RadioButton rdoLollipop, rdoMash, rdoNougat;
    Button endBtn, resetBtn;
    ImageView imgAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        setTitle("안드로이드 사진 보기");

        text1 = (TextView) findViewById(R.id.Text1);
        text2 = (TextView) findViewById(R.id.Text2);
        switchAgree = (Switch) findViewById(R.id.switch1);
        rGroup = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoLollipop = (RadioButton) findViewById(R.id.RdoLollipop);
        rdoMash = (RadioButton) findViewById(R.id.RdoMash);
        rdoNougat = (RadioButton) findViewById(R.id.RdoNougat);
        endBtn = (Button) findViewById(R.id.endBtn);
        resetBtn = (Button) findViewById(R.id.resetBtn);
        imgAndroid = (ImageView) findViewById(R.id.ImgPet);


        switchAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                if (switchAgree.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    imgAndroid.setVisibility(View.VISIBLE);
                    rdoLollipop.setVisibility(View.VISIBLE);
                    rdoMash.setVisibility(View.VISIBLE);
                    rdoNougat.setVisibility(View.VISIBLE);
                    resetBtn.setVisibility(View.VISIBLE);
                    endBtn.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    imgAndroid.setVisibility(View.INVISIBLE);
                    rdoLollipop.setVisibility(View.INVISIBLE);
                    rdoMash.setVisibility(View.INVISIBLE);
                    rdoNougat.setVisibility(View.INVISIBLE);
                    resetBtn.setVisibility(View.INVISIBLE);
                    endBtn.setVisibility(View.INVISIBLE);
                }

            }

        });
        rdoLollipop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imgAndroid.setImageResource(R.drawable.lollipop);
            }
        });
        rdoMash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imgAndroid.setImageResource(R.drawable.mashmallow);
            }
        });
        rdoNougat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imgAndroid.setImageResource(R.drawable.nougat);
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                text2.setVisibility(android.view.View.INVISIBLE);
                rGroup.setVisibility(android.view.View.INVISIBLE);
                imgAndroid.setVisibility(android.view.View.INVISIBLE);
                endBtn.setVisibility(android.view.View.INVISIBLE);
                resetBtn.setVisibility(android.view.View.INVISIBLE);
                rGroup.clearCheck();
                switchAgree.setChecked(false);
            }
        });

        endBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                finish();
            }
        });
    }
}
