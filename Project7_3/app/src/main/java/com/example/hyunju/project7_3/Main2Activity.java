package com.example.hyunju.project7_3;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText tvName, tvEmail;
    Button btn1;
    EditText dlgEdtName, dlgEdtEmail;
    TextView toastText;
    View dialogView, toastView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("사용자 정보 입력");

        tvName=(EditText) findViewById(R.id.editText1);
        tvEmail=(EditText)findViewById(R.id.editText2);
        btn1=(Button)findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView=(View)View.inflate(Main2Activity.this, R.layout.dialog1,null);
                AlertDialog.Builder dlg=new AlertDialog.Builder(Main2Activity.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.ic_launcher_background);
                dlgEdtName=(EditText)dialogView.findViewById(R.id.dlgEdt1);
                dlgEdtEmail=(EditText)dialogView.findViewById(R.id.dlgEdt2);

                dlgEdtName.setText(tvName.getText().toString());
                dlgEdtEmail.setText(tvEmail.getText().toString());
                dlg.setView(dialogView);


                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dlgEdtName=(EditText)dialogView.findViewById(R.id.dlgEdt1);
                        dlgEdtEmail=(EditText)dialogView.findViewById(R.id.dlgEdt2);

                        tvName.setText(dlgEdtName.getText().toString());
                        tvEmail.setText(dlgEdtEmail.getText().toString());
                    }
                });
                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast = new Toast(Main2Activity.this);
                        toastView=(View)View.inflate(Main2Activity. this, R.layout.toast1,null);
                        toastText=(TextView)toastView.findViewById(R.id.toastText1);
                        toastText.setText("취소했습니다");
                        toast.setView(toastView);
                        toast.setGravity(Gravity.CENTER, 50, 10);
                        toast.show();
                    }
                });
                dlg.show();
            }
        });
    }
}
