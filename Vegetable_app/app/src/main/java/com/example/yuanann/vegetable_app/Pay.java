package com.example.yuanann.vegetable_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yuanann.vegetable_app.cart.SuccessActivity;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Yuanann on 2020-10-29.
 */

public class Pay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay);
        Bundle bundle = this.getIntent().getExtras();
        String type=bundle.getString("id");
        TextView textView=(TextView) findViewById(R.id.ding_money);
        TextView ding_buy = findViewById(R.id.ding_buy);
        textView.setText("合计:￥" +type);

        ding_buy.setOnClickListener(v -> {
//            String address = u_address.getText().toString().trim();
//            String name = u_name.getText().toString().trim();
//            String phone = u_phone.getText().toString().trim();
//            SharedPreferences sharedPreferences = getSharedPreferences("userInfo", MODE_PRIVATE);
//            //默认操作模式，代表该文件是私有数据，只能被应用本身访问，在该模式下，写入的内容会覆盖原文件的内容
//            SharedPreferences.Editor editor = sharedPreferences.edit();
//            editor.putString("address",address);
//            editor.putString("name",name);
//            editor.putString("phone",phone);
//            editor.apply();
//            //SharedPreference 提交数据时，尽量使用Editor.apply()而非Editor.commit()。
//            // 一般来讲，仅当需要确定提交结果，并据此有后续操作时，才使用 Editor#commit()。
//            //SharedPreference 相关修改使用 apply() 方法进行提交会先写入内存，然后异步写入磁盘，
//            // commit() 方法是直接写入磁盘。如果频繁操作的话 apply 的性能会优于 commit，apply会将最后修改内容写入磁盘。
//            //但是如果希望立刻获取存储操作的结果，并据此做相应的其他操作，应当使用 commit。
//            delCartAll();
            Toast.makeText(this, "支付中...", Toast.LENGTH_LONG).show();
            new Handler().postDelayed(() -> {
                startActivity(new Intent(this,SuccessActivity.class));
                //overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                finish();
            },3000);
        });


    }
}
