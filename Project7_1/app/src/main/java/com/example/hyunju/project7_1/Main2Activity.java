package com.example.hyunju.project7_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {

    LinearLayout baseLayout;
    EditText edit1;
    ImageView image1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setTitle("이미지 바꾸기");
        baseLayout = (LinearLayout)findViewById(R.id.baseLayout1);
        edit1 = (EditText) findViewById(R.id.edit1);
        image1=(ImageView)findViewById(R.id.image1);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu2, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item1:
                image1.setImageResource(R.drawable.cat);
                return true;
            case R.id.item2:
                image1.setImageResource(R.drawable.dog);
                return true;
            case R.id.item3:
                image1.setImageResource(R.drawable.rabbit);
                return true;
            case R.id.item0:
                image1.setRotation(Float.parseFloat(edit1.getText().toString()));
                return true;


        }
        return false;
    }
}
