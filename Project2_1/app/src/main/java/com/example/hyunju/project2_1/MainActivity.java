package com.example.hyunju.project2_1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    EditText editText;
    Button btn1;
    Button btn2;
    RadioGroup rgroup;
    RadioButton rd1;
    RadioButton rd2;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);

        imageView=(ImageView)findViewById(R.id.imageView);
        rgroup=(RadioGroup)findViewById(R.id.rgroup1);
        rd1=(RadioButton)findViewById(R.id.radioRolli);
        rd2=(RadioButton)findViewById(R.id.radioNougat);
        editText=(EditText) findViewById(R.id.edit1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                str= editText.getText().toString();

                Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str= editText.getText().toString();
                Intent nyIntent= new Intent(Intent.ACTION_VIEW, Uri.parse(str));
                startActivity(nyIntent);
            }
        });
        rd1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                imageView.setImageResource(R.drawable.lollipop);
            }
        });
        rd2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                imageView.setImageResource(R.drawable.nougat);
            }
        });
    }



}
