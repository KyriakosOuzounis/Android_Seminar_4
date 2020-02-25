package com.example.android_seminar_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    float num1 , num2;
    boolean add_flag,sub_flag,div_flag,mul_flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);
        final Button btn_2 = findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);
        final Button btn_3 = findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);
        final Button btn_4 = findViewById(R.id.btn_4);
        btn_4.setOnClickListener(this);
        final Button btn_5 = findViewById(R.id.btn_5);
        btn_5.setOnClickListener(this);
        final Button btn_6 = findViewById(R.id.btn_6);
        btn_6.setOnClickListener(this);
        final Button btn_7 = findViewById(R.id.btn_7);
        btn_7.setOnClickListener(this);
        final Button btn_8 = findViewById(R.id.btn_8);
        btn_8.setOnClickListener(this);
        final Button btn_9 = findViewById(R.id.btn_9);
        btn_9.setOnClickListener(this);
        final Button btn_0 = findViewById(R.id.btn_0);
        btn_0.setOnClickListener(this);
        final Button btn_add = findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);
        final Button btn_sub = findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(this);
        final Button btn_mul = findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(this);
        final Button btn_div = findViewById(R.id.btn_div);
        btn_div.setOnClickListener(this);
        final Button btn_dot = findViewById(R.id.btn_dot);
        btn_dot.setOnClickListener(this);
        final Button btn_eq = findViewById(R.id.btn_eq);
        btn_eq.setOnClickListener(this);
        final Button btn_clear = findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText editText_res = findViewById(R.id.edTxt_res);
        switch (v.getId()){
            case R.id.btn_0 :
                editText_res.setText(editText_res.getText() + "0");
                break;
            case R.id.btn_1 :
                editText_res.setText(editText_res.getText() + "1");
                break;
            case R.id.btn_2 :
                editText_res.setText(editText_res.getText() + "2");
                break;
            case R.id.btn_3 :
                editText_res.setText(editText_res.getText() + "3");
                break;
            case R.id.btn_4 :
                editText_res.setText(editText_res.getText() + "4");
                break;
            case R.id.btn_5 :
                editText_res.setText(editText_res.getText() + "5");
                break;
            case R.id.btn_6 :
                editText_res.setText(editText_res.getText() + "6");
                break;
            case R.id.btn_7 :
                editText_res.setText(editText_res.getText() + "7");
                break;
            case R.id.btn_8 :
                editText_res.setText(editText_res.getText() + "8");
                break;
            case R.id.btn_9 :
                editText_res.setText(editText_res.getText() + "9");
                break;
            case R.id.btn_add :
                if (editText_res == null) {
                    editText_res.setText("");
                } else {
                    num1 = Float.parseFloat(editText_res.getText() + "");
                    add_flag = true;
                    editText_res.setText("");
                }
                break;
            case R.id.btn_sub :
                num1 = Float.parseFloat(editText_res.getText() + "");
                sub_flag = true;
                editText_res.setText("");
                break;
            case R.id.btn_div :
                num1 = Float.parseFloat(editText_res.getText() + "");
                div_flag = true;
                editText_res.setText("");
                break;
            case R.id.btn_mul :
                num1 = Float.parseFloat(editText_res.getText() + "");
                mul_flag = true;
                editText_res.setText("");
                break;
            case R.id.btn_dot :
                editText_res.setText(editText_res.getText() + ".");
                break;
            case R.id.btn_eq :
                num2 = Float.parseFloat(editText_res.getText() + "");
                if (add_flag == true) {
                    editText_res.setText(num1 + num2 + "");
                    add_flag = false;
                }

                if (sub_flag == true) {
                    editText_res.setText(num1 - num2 + "");
                    sub_flag = false;
                }

                if (div_flag == true) {
                    editText_res.setText(num1 / num2 + "");
                    div_flag = false;
                }

                if (mul_flag == true) {
                    editText_res.setText(num1 * num2 + "");
                    mul_flag = false;
                }
                break;
            case R.id.btn_clear :
                editText_res.setText("");
                break;
        }

    }
}
