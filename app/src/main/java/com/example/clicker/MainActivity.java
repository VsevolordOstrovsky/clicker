package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private Button btn;

    private TextView tv;
    private EditText a_obj;
    private EditText b_obj;
    private EditText c_obj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        a_obj = findViewById(R.id.editTextTextPersonName);
        b_obj = findViewById(R.id.editTextTextPersonName2);
        c_obj = findViewById(R.id.editTextTextPersonName3);

        btn.setOnClickListener(view -> {

            int a = Integer.parseInt(a_obj.getText().toString());
            int b = Integer.parseInt(b_obj.getText().toString());
            int c = Integer.parseInt(c_obj.getText().toString());
            double d = Math.pow(b,2) - 4*a*c;
            double x_1 = (-1 * b - Math.pow(d,0.5))/2*a;
            double x_2 = (-1 * b + Math.pow(d,0.5))/2*a;
            if (d < 0){
                tv.setText("Нет корней");
            }else {if(x_1 == x_2){
                tv.setText(Double.toString(x_1));
            }else{
                tv.setText("x1 = "+Double.toString(x_1)+"; x2 = "+ Double.toString(x_2));
            }}

        });
    }

//    @Override
//    public void onClick(View view) {
//        if(view.)
//    }
}