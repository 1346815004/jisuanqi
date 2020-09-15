package com.example.jisuanqi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_jia,btn_jian,btn_cheng,btn_chu,btn_dian,btn_kuohao1,btn_kuohao2,btn_deng,btn_c
            ,btn_tui;
    TextView tv_xianshi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        btn_jia = findViewById(R.id.btn_jia);
        btn_jian = findViewById(R.id.btn_jian);
        btn_cheng = findViewById(R.id.btn_cheng);
        btn_chu = findViewById(R.id.btn_chu);
        btn_dian = findViewById(R.id.btn_dian);
        btn_deng = findViewById(R.id.btn_deng);
        tv_xianshi = findViewById(R.id.tv_xianshi);
        btn_c = findViewById(R.id.btn_c);
        btn_kuohao1 = findViewById(R.id.btn_kuohao1);
        btn_kuohao2 = findViewById(R.id.btn_kuohao2);
        btn_tui = findViewById(R.id.btn_tui);

        onClick o = new onClick();
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
        btn_jia.setOnClickListener(o);
        btn_jian.setOnClickListener(o);
        btn_cheng.setOnClickListener(o);
        btn_chu.setOnClickListener(o);
        btn_dian.setOnClickListener(o);
        btn_deng.setOnClickListener(o);
        btn_c.setOnClickListener(o);
        btn_kuohao1.setOnClickListener(o);
        btn_kuohao2.setOnClickListener(o);
        btn_tui.setOnClickListener(o);




    }

    class onClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            String s1 = tv_xianshi.getText().toString();
            if(s1.equals("0"))
                s1 = "";
            String s2 = null;
            switch (v.getId()){
                case R.id.btn_0:
                    s2 = "0";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_1:
                    s2 = "1";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_2:
                    s2 = "2";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_3:
                    s2 = "3";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_4:
                    s2 = "4";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_5:
                    s2 = "5";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_6:
                    s2 = "6";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_7:
                    s2 = "7";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_8:
                    s2 = "8";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_9:
                    s2 = "9";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_jia:
                    s2 = "+";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_jian:
                    s2 = "-";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_cheng:
                    s2 = "×";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_chu:
                    s2 = "÷";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_dian:
                    s2 = ".";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_deng:
                    tv_xianshi.setText(jisuan(s1));
                    break;
                case R.id.btn_c:
                    tv_xianshi.setText("0");
                    break;
                case R.id.btn_kuohao1:
                    s2 = "(";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_kuohao2:
                    s2 = ")";
                    tv_xianshi.setText(s1+s2);
                    break;
                case R.id.btn_tui:
                    if(s1.length() > 1){
                    s1 = s1.substring(0,s1.length()-1);
                    tv_xianshi.setText(s1);}
                    else
                        tv_xianshi.setText("0");
                    break;
            }

        }

        public String jisuan(String s) {
            String s1;
            String s2;
            int i1 = 0;
            double d1 = 0;
            Boolean b1 = false;

try {
         if (s.indexOf(".") != -1) {
             b1 = true;
         }
//         if(s.indexOf("(") != -1 && s.indexOf(")") != -1){
//             s1 = s.substring(0, s.indexOf("("));
//             s2 = s.substring(s.indexOf("(")+1, s.indexOf(")"));
//             String s3 = s.substring(s.indexOf(")") + 1);
//             s2 = digui(s2);
//             digui(s1+s2+s3);
//
//         }


            if (s.indexOf("×") != -1) {
                s1 = s.substring(0, s.indexOf("×"));
                s2 = s.substring(s.indexOf("×") + 1);
                if (!b1)
                    i1 = Integer.parseInt(s1) * Integer.parseInt(s2);
                else
                    d1 = Double.parseDouble(s1) * Double.parseDouble(s2);
            } else if (s.indexOf("÷") != -1) {
                s1 = s.substring(0, s.indexOf("÷"));
                s2 = s.substring(s.indexOf("÷") + 1);
                if (!b1)
                    i1 = Integer.parseInt(s1) / Integer.parseInt(s2);
                else
                    d1 = Double.parseDouble(s1) / Double.parseDouble(s2);
            } else if (s.indexOf("+") != -1) {
                s1 = s.substring(0, s.indexOf("+"));
                s2 = s.substring(s.indexOf("+") + 1);
                s1 = digui(s1);
                s2 = digui(s2);
                if (!b1)
                    i1 = Integer.parseInt(s1) + Integer.parseInt(s2);
                else
                    d1 = Double.parseDouble(s1) + Double.parseDouble(s2);
            } else if (s.indexOf("-") != -1  && s.indexOf("-") != 0) {
                s1 = s.substring(0, s.indexOf("-"));
                s2 = s.substring(s.indexOf("-") + 1);
                if(!s1.equals("")){
                    s1 = digui(s1);
                    s2 = digui(s2);
                }
                if (!b1)
                    i1 = Integer.parseInt(s1) - Integer.parseInt(s2);
                else
                    d1 = Double.parseDouble(s1) - Double.parseDouble(s2);
            }

            if(!b1)
                s = i1 + "";
            else
                s = d1 + "";
} catch (Exception e) {
    return "错误";
}
            return s;
        }

        public String digui(String s){
            if(s.indexOf("+") != -1 ) {
                s = jisuan(s);
            }else if(s.indexOf("-") != -1 && s.indexOf("-") != 0){
                s = jisuan(s);
            }
            return s;
        }

    }
}