package com.example.jisuanqi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class tjhuansuan extends AppCompatActivity {

    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_dian,btn_deng,btn_c
            ,btn_tui,btn_shuxuejisuan;
    TextView tv_xianshi1,tv_xianshi2;
    Spinner sp_1,sp_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tjhuansuan);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_dian = findViewById(R.id.btn_dian);
        btn_deng = findViewById(R.id.btn_deng);
        tv_xianshi1 = findViewById(R.id.tv_xianshi1);
        tv_xianshi2 = findViewById(R.id.tv_xianshi2);
        btn_c = findViewById(R.id.btn_c);
        btn_tui = findViewById(R.id.btn_tui);
        btn_shuxuejisuan = findViewById(R.id.btn_shuxuejisuan);
        sp_1 = findViewById(R.id.sp_1);
        sp_2 = findViewById(R.id.sp_2);


        tjhuansuan.onClick o = new tjhuansuan.onClick();
        btn_0.setOnClickListener(o);
        btn_1.setOnClickListener(o);
        btn_2.setOnClickListener(o);
        btn_3.setOnClickListener(o);
        btn_4.setOnClickListener(o);
        btn_5.setOnClickListener(o);
        btn_6.setOnClickListener(o);
        btn_7.setOnClickListener(o);
        btn_8.setOnClickListener(o);
        btn_9.setOnClickListener(o);
        btn_dian.setOnClickListener(o);
        btn_deng.setOnClickListener(o);
        btn_c.setOnClickListener(o);
        btn_tui.setOnClickListener(o);
        btn_shuxuejisuan.setOnClickListener(o);

    }

    class onClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            String s1 = tv_xianshi1.getText().toString();
            if (s1.equals("0"))
                s1 = "";
            String s2 = null;
            switch (v.getId()) {
                case R.id.btn_0:
                    s2 = "0";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_1:
                    s2 = "1";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_2:
                    s2 = "2";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_3:
                    s2 = "3";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_4:
                    s2 = "4";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_5:
                    s2 = "5";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_6:
                    s2 = "6";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_7:
                    s2 = "7";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_8:
                    s2 = "8";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_9:
                    s2 = "9";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_dian:
                    if (s1.equals(""))
                        s2 = "0.";
                    else
                        s2 = ".";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_deng:
                    s2 = huansuan(s1);
                    tv_xianshi2.setText(s2);
                    break;
                case R.id.btn_c:
                    tv_xianshi1.setText("0");
                    break;
                case R.id.btn_tui:
                    if (s1.length() > 1) {
                        s1 = s1.substring(0, s1.length() - 1);
                        tv_xianshi1.setText(s1);
                    } else
                        tv_xianshi1.setText("0");
                    break;
                case R.id.btn_shuxuejisuan:
                    finish();
                    break;
            }
        }

        public String huansuan(String s) {
            String s1 = sp_1.getSelectedItem().toString();
            String s2 = sp_2.getSelectedItem().toString();
            double i1 = 1;
            double i2 = 1;

            if (s.equals("")) {
                return "0";
            }
            try {
                switch (s1) {
                    case "立方码":
                        i1 = 764554.9;
                        break;
                    case "立方英尺":
                        i1 = 28316.85;
                        break;
                    case "立方英寸":
                        i1 = 16.38706;
                        break;
                    case "立方米":
                        i1 = 1000000;
                        break;
                    case "升":
                        i1 = 1000;
                        break;
                    case "立方厘米":
                        i1 = 1;
                        break;
                    case "毫升":
                        i1 = 1;
                        break;
                }

                switch (s2) {
                    case "立方码":
                        i2 = 764554.9;
                        break;
                    case "立方英尺":
                        i2 = 28316.85;
                        break;
                    case "立方英寸":
                        i2 = 16.38706;
                        break;
                    case "立方米":
                        i2 = 1000000;
                        break;
                    case "升":
                        i2 = 1000;
                        break;
                    case "立方厘米":
                        i2 = 1;
                        break;
                    case "毫升":
                        i2 = 1;
                        break;
                }

                double d1 = Double.parseDouble(s);
                Toast.makeText(tjhuansuan.this, i1 + "?" + i2, Toast.LENGTH_SHORT).show();

                d1 = i1 / i2 * d1;
                s = d1 + "";
            } catch (Exception e) {
                return "错误 ^^";
            }

            return s;
        }
    }

    }