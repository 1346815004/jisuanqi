package com.example.jisuanqi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class jzhuansuan extends AppCompatActivity {

    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_dian,btn_deng,btn_c
            ,btn_tui,btn_shuxuejisuan,btn_a,btn_b,btn_cc,btn_d,btn_e,btn_f;
    TextView tv_xianshi1,tv_xianshi2;
    Spinner sp_1,sp_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jzhuansuan);

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
        btn_a = findViewById(R.id.btn_a);
        btn_b = findViewById(R.id.btn_b);
        btn_cc = findViewById(R.id.btn_cc);
        btn_d = findViewById(R.id.btn_d);
        btn_e = findViewById(R.id.btn_e);
        btn_f = findViewById(R.id.btn_f);


        jzhuansuan.onClick o = new jzhuansuan.onClick();
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
        btn_a.setOnClickListener(o);
        btn_b.setOnClickListener(o);
        btn_cc.setOnClickListener(o);
        btn_d.setOnClickListener(o);
        btn_e.setOnClickListener(o);
        btn_f.setOnClickListener(o);
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
                case R.id.btn_a:
                    s2 = "A";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_b:
                    s2 = "B";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_cc:
                    s2 = "C";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_d:
                    s2 = "D";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_e:
                    s2 = "E";
                    tv_xianshi1.setText(s1 + s2);
                    break;
                case R.id.btn_f:
                    s2 = "F";
                    tv_xianshi1.setText(s1 + s2);
                    break;
            }
        }

        public String huansuan(String s) {
            String s1 = sp_1.getSelectedItem().toString();
            String s2 = sp_2.getSelectedItem().toString();
            int i1 = 1;
            int i2 = 1;
            int n1 = 10;
            int n2 = 10;

            if (s.equals("")) {
                return "0";
            }
            try {
                switch (s1) {
                    case "二进制":
                        n1 = 2;
                        break;
                    case "八进制":
                        n1 = 8;
                        break;
                    case "十进制":
                        n1 = 10;
                        break;
                    case "十六进制":
                        n1 = 16;
                        break;
                }

                switch (s2) {
                    case "二进制":
                        n2 = 2;
                        break;
                    case "八进制":
                        n2 = 8;
                        break;
                    case "十进制":
                        n2 = 10;
                        break;
                    case "十六进制":
                        n2 = 16;
                        break;
                }

                if (n1 == 10){
                    i1 = Integer.parseInt(s);
                    if (n2 == 10)
                        return s;
                   s = Integer.toString( i1, n2);
                }else{
                    i2 = Integer.parseInt( s, n1);
                    s = Integer.toString( i2, n2);
                }

            } catch (Exception e) {
                return "错误 ^^";
            }

            return s;
        }
    }

}