package com.example.hyunju.project5_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button[] numButtons = new Button[10];
    Integer[] numBtnIds = {R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5,
            R.id.button6, R.id.button7, R.id.button8, R.id.button9};

    Button btnadd, btnsub, btnmul, btndiv;
    TextView textView;
    EditText edit1, edit2;
    String num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        setTitle("테이블레이아웃 계산기");


        btnadd = (Button) (findViewById(R.id.buttonadd));
        btnsub = (Button) (findViewById(R.id.buttonsub));
        btnmul = (Button) (findViewById(R.id.buttonmul));
        btndiv = (Button) (findViewById(R.id.buttondiv));

        textView = (TextView) (findViewById(R.id.textView));
        edit1 = (EditText) (findViewById(R.id.edit1));
        edit2 = (EditText) (findViewById(R.id.edit2));

        for (int i = 0; i < numBtnIds.length; i++) {
            numButtons[i] = (Button) findViewById(numBtnIds[i]);
        }

        for (int i = 0; i < numBtnIds.length; i++) {
            final int index;
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (edit1.isFocused() == true) {
                        num1 = edit1.getText().toString() + numButtons[index].getText().toString();
                        edit1.setText(num1);

                    } else if (edit2.isFocused() == true) {
                        num2 = edit2.getText().toString() + numButtons[index].getText().toString();
                        edit2.setText(num2);
                    } else {
                        Toast.makeText(getApplicationContext(), "먼저 에디트 텍스트를 선택해주세요", Toast.LENGTH_LONG).show();
                    }
                }
            });

            btnadd.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    textView.setText("계산결과: " + (Integer.parseInt(num1) + Integer.parseInt(num2)));
                    return false;
                }
            });
            btnsub.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    textView.setText("계산결과: " + (Integer.parseInt(num1) - Integer.parseInt(num2)));
                    return false;
                }
            });
            btnmul.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    textView.setText("계산결과: " + (Integer.parseInt(num1) * Integer.parseInt(num2)));
                    return false;
                }
            });
            btndiv.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    textView.setText("계산결과: " + (Integer.parseInt(num1) / Integer.parseInt(num2)));
                    return false;
                }
            });
        }
    }
}
