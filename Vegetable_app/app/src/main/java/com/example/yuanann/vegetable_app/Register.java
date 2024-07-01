package com.example.yuanann.vegetable_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    Button bu1;
    EditText ed1,ed2,ed3;
    String name,psw,pswagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        bu1 = (Button) findViewById(R.id.bu1);
        ed1=(EditText) findViewById(R.id.ed1);
        ed2=(EditText) findViewById(R.id.ed2);
        ed3=(EditText) findViewById(R.id.ed3);
        bu1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                name = ed1.getText().toString().trim();
                psw= ed2.getText().toString().trim();
                pswagain= ed3.getText().toString().trim();
                if (TextUtils.isEmpty(name)) {
                    Toast.makeText( Register.this, "请输入用户名", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(psw)) {
                    Toast.makeText( Register.this, "请输入密码", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(pswagain)) {
                    Toast.makeText( Register.this,"请再次输入密码", Toast.LENGTH_SHORT).show();
                } else if (!psw.equals(pswagain)) {
                    Toast.makeText(Register.this, "输入两次的密码不一样", Toast.LENGTH_SHORT).show();
                }else if(isExistName(name)){
                    Toast.makeText(Register.this, "此账户名已经存在", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Register.this, "注册成功", Toast.LENGTH_SHORT).show();
                    saveRegister(name, psw);
                    Intent data = new Intent();
                    setResult(RESULT_OK, data);
                    Register.this.finish();
                }
            } });
//        bu2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                ed1.setText("");
//                ed2.setText("");
//                ed3.setText("");
//            }
//        });
    }
    private boolean isExistName(String sname){
        boolean has_name=false;
        SharedPreferences sp=getSharedPreferences("loginInfo", MODE_PRIVATE);
        String spsw=sp.getString(name, "");//传入用户名获取密码
        if(!TextUtils.isEmpty(spsw)) {
            has_name=true;
        }
        return has_name;
    }
    private void saveRegister(String name,String psw){
        SharedPreferences sp=getSharedPreferences("loginInfo", MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        editor.putString(name, psw);
        editor.putString("username",name);
        editor.commit();
    }
}

