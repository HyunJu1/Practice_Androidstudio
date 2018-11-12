package com.example.hyunju.project4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView textResult;
    String num1, num2;
    Float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");
        edit1=(EditText) findViewById((R.id.edit1));
        edit2=(EditText) findViewById((R.id.edit2));
        btnAdd=(Button)findViewById((R.id.btnAdd));
        btnSub=(Button)findViewById((R.id.btnSub));
        btnMul=(Button)findViewById((R.id.btnMul));
        btnDiv=(Button)findViewById((R.id.btnDiv));
        textResult=(TextView) findViewById(R.id.TextResult);


        btnAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();

                if(num1.length()==0||num2.length()==0){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
return;
                }
                else {
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    textResult.setText("계산 결과: " + result.toString());
                }
            }
        });


        btnSub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.equals("")||num2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
return;

                }
                result=Float.parseFloat(num1)-Float.parseFloat(num2);
                textResult.setText("계산 결과: "+result.toString());

            }
        });
        btnMul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.equals("")||num2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT);
return;
                }
                result=Float.parseFloat(num1)*Float.parseFloat(num2);
                textResult.setText("계산 결과: "+result.toString());

            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(num1.equals("")||num2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(num2.equals("0")){
                    Toast.makeText(getApplicationContext(),"0으로 나눌 수 없습니다.",Toast.LENGTH_SHORT).show();

                }

                result=Float.parseFloat(num1)/Float.parseFloat(num2);
                textResult.setText("계산 결과: "+result.toString());

            }
        });
    }

}
