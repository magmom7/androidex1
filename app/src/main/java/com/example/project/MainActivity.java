package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRem;
    TextView textResult;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnRem = (Button) findViewById(R.id.BtnRem);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        if (num1.isEmpty() || num2.isEmpty()) {
                            Toast.makeText(getApplicationContext(), "오류입니다.", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        result = Integer.parseInt(num1) + Integer.parseInt(num2);
                        textResult.setText("결과값 ="+ result.toString());
                        break;

            }
            return false;

        }
    });
        btnSub.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        if (num1.isEmpty() || num2.isEmpty()) {
                            Toast.makeText(getApplicationContext(), "오류입니다.", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        result = Integer.parseInt(num1) - Integer.parseInt(num2);
                        textResult.setText("결과값 ="+ result.toString());
                        break;


                }
                return false;

            }
        });
        btnMul.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        if (num1.isEmpty() || num2.isEmpty()) {
                            Toast.makeText(getApplicationContext(), "오류입니다.", Toast.LENGTH_SHORT).show();
                            break;
                        }
                        result = Integer.parseInt(num1) * Integer.parseInt(num2);
                        textResult.setText("결과값 ="+ result.toString());
                        break;


                }
                return false;

            }
        });
        btnDiv.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        if (num1.equals("0") || num2.equals("0")) {
                            Toast.makeText(getApplicationContext(), "오류입니다.", Toast.LENGTH_SHORT).show();
                            break;
                        }else if (num1.isEmpty() || num2.isEmpty()){
                            Toast.makeText(getApplicationContext(), "오류입니다.", Toast.LENGTH_SHORT).show();
                            break;
                        }
                            result = Integer.parseInt(num1) / Integer.parseInt(num2);
                            textResult.setText("결과값 =" + result.toString());

                            break;


                        }

                return false;

            }
        });
        btnRem.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        num1 = edit1.getText().toString();
                        num2 = edit2.getText().toString();
                        if (num1.equals("0") || num2.equals("0")) {
                            Toast.makeText(getApplicationContext(), "오류입니다.", Toast.LENGTH_SHORT).show();
                            break;
                        }else if (num1.isEmpty() || num2.isEmpty()){
                            Toast.makeText(getApplicationContext(), "오류입니다.", Toast.LENGTH_SHORT).show();
                            break;
                    }
                        result = Integer.parseInt(num1) % Integer.parseInt(num2);
                        textResult.setText("결과값 ="+ result.toString());
                        break;


                }
                return false;

            }
        });
    }
}