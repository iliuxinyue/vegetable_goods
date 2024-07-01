package com.example.yuanann.vegetable_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button b1;
    EditText e1,e2;
    TextView b2;
    String n,p;
    CheckBox t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置当前页面的布局初始化组件
        setContentView(R.layout.activity_login);
        //
        b1 = (Button) findViewById(R.id.b1);
        b2 = (TextView) findViewById(R.id.b2);
        e1 = (EditText) findViewById(R.id.edit1);
        e2 = (EditText) findViewById(R.id.edit2);
        t = (CheckBox) findViewById(R.id.save);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = e1.getText().toString();
                String p = e2.getText().toString();
                if (TextUtils.isEmpty(n)) {
                    Toast.makeText(getApplicationContext(), "请输入用户名", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(p)) {
                    Toast.makeText(getApplicationContext(), "请输入密码", Toast.LENGTH_SHORT).show();
                } else if (isExistN(n) == false) {
                    Toast.makeText(getApplicationContext(), "用户名不存在", Toast.LENGTH_SHORT).show();
                } else if (p.equals(isExistP(n))) {
                    Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                    intent.setClass(Login.this, Loading.class);
                    SharedPreferences sp = getSharedPreferences("name", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString("name", n);
                    editor.commit();
                    String a = e1.getText().toString();
                    String b = e2.getText().toString();
                    intent.putExtra("name",a);
                    intent.putExtra("psw",b);
                    startActivity(intent);
                    e1.setText("");
                    e2.setText("");
                } else {
                    Toast.makeText(getApplicationContext(), "登录失败,密码错误", Toast.LENGTH_SHORT).show();
                    e1.setText("");
                    e2.setText("");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Login.this, Register.class);
                startActivity(intent);
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String na = e1.getText().toString();
                if (isExistName(na) ==true) {
                    SharedPreferences sp = getSharedPreferences("save", MODE_PRIVATE);
                    String b = sp.getString(na, null);
                    e2.setText(b);
                }
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = e1.getText().toString();
                String b = e2.getText().toString();
                if (t.isChecked()) {
                    SharedPreferences sp = getSharedPreferences("save", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString(a, b);
                    editor.putString("name", a);
                    editor.commit();
                }
                else if(!t.isChecked()) {
                    SharedPreferences sp = getSharedPreferences("save",MODE_PRIVATE);
                    sp.edit().remove(a).commit();
                }
            }
        });
    }
    private boolean isExistN(String name) {
        SharedPreferences sp=getSharedPreferences("loginInfo", MODE_PRIVATE);
        return sp.contains(name);
    }
    private boolean isExistName(String name) {
        SharedPreferences sp=getSharedPreferences("save", MODE_PRIVATE);
        return sp.contains(name);
    }
    private String isExistP(String name){
        SharedPreferences sp=getSharedPreferences("loginInfo", MODE_PRIVATE);
        String pw = sp.getString(name, null);
        return pw;
    }
}
