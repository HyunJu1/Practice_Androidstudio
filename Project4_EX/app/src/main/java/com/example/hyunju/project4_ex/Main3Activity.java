package com.example.hyunju.project4_ex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    ImageView image;
    Button btn;
    int rotate=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        setTitle("연습문제4-9");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        btn = (Button) (findViewById(R.id.imageButton));
        image = (ImageView) (findViewById(R.id.imageView));


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rotate+=10;
                image.setRotation(rotate);
            }
        });

    }
}
