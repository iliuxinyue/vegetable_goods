package com.example.yuanann.vegetable_app.cart;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yuanann.vegetable_app.DatabaseHelper;
import com.example.yuanann.vegetable_app.Mygoods;
import com.example.yuanann.vegetable_app.R;

import java.io.File;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class DingdanActivity extends AppCompatActivity {

    private TextView ding_money, ding_buy;
    private EditText u_address, u_name, u_phone;
    private CartDBOpenHelper dbOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dingdan);

        ding_money = findViewById(R.id.ding_money);
        ding_buy = findViewById(R.id.ding_buy);
        u_address = findViewById(R.id.u_address);
        u_name = findViewById(R.id.u_name);
        u_phone = findViewById(R.id.u_phone);

        Intent intent = getIntent();
        double money = intent.getDoubleExtra("money", 0.0);
        ding_money.setText("合计:￥" + money);

//        getUserInfo();

        ding_buy.setOnClickListener(v -> {
            String address = u_address.getText().toString().trim();
            String name = u_name.getText().toString().trim();
            String phone = u_phone.getText().toString().trim();
            SharedPreferences sharedPreferences = getSharedPreferences("userInfo", MODE_PRIVATE);
            //默认操作模式，代表该文件是私有数据，只能被应用本身访问，在该模式下，写入的内容会覆盖原文件的内容
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("address",address);
            editor.putString("name",name);
            editor.putString("phone",phone);
            editor.apply();
            //SharedPreference 提交数据时，尽量使用Editor.apply()而非Editor.commit()。
            // 一般来讲，仅当需要确定提交结果，并据此有后续操作时，才使用 Editor#commit()。
            //SharedPreference 相关修改使用 apply() 方法进行提交会先写入内存，然后异步写入磁盘，
            // commit() 方法是直接写入磁盘。如果频繁操作的话 apply 的性能会优于 commit，apply会将最后修改内容写入磁盘。
            //但是如果希望立刻获取存储操作的结果，并据此做相应的其他操作，应当使用 commit。


            dbOpenHelper = new CartDBOpenHelper(DingdanActivity.this,1);
            Cursor cursor = dbOpenHelper.getReadableDatabase().query("cart",null,"g_check=?",new String[]{"true"},null,null,null);
            int a=0;


//            while (cursor.moveToNext()){
//                a = a + 1;
//                int g_id = Integer.parseInt(cursor.getString(1));
//                int g_photo = Integer.parseInt(cursor.getString(2));
//                String g_name = cursor.getString(3);
//                String g_type = cursor.getString(4);
//                double g_price = Double.parseDouble(cursor.getString(5));
//                int c_num = Integer.parseInt(cursor.getString(6));
//                String c_check = cursor.getString(7);
////                cartGoods.add(new CartGoods(g_id, g_photo, g_name, g_type, g_price, c_num, c_check));
//
//
//            }
                    while (cursor.moveToNext()) {
                        DatabaseHelper dbHelper = new DatabaseHelper(this);
                        ContentValues values = new ContentValues();
                        values.put("g_id", String.valueOf(Integer.parseInt(cursor.getString(1))));
                        values.put("g_photo", String.valueOf(Integer.parseInt(cursor.getString(2))));
                        values.put("g_name", cursor.getString(3));
                        values.put("g_type", cursor.getString(4));
                        values.put("g_price", String.valueOf(Double.parseDouble(cursor.getString(5))));
                        values.put("g_num", String.valueOf(Integer.parseInt(cursor.getString(6))));
                        values.put("g_check", cursor.getString(7));
                        dbHelper.insertVege(values);
                    }
//            cursor.close();
//            dbOpenHelper.close();
//            DatabaseHelper dbHelper = new DatabaseHelper(this);
//            long i = -1;
//            ContentValues values = new ContentValues();

//            DatabaseHelper dbHelper = new DatabaseHelper(this);
//            ContentValues values = new ContentValues();
//            values.put("g_id", "1");
//            values.put("g_photo", String.valueOf(2));
//            values.put("g_name", "香菜");
//            values.put("g_type", "顺丰发货 多种维C");
//            values.put("g_price", "2");
//            values.put("g_num", "1");
//            values.put("g_check", "false");
//            dbHelper.insertVege(values);

//            if (i != -1)
//                Toast.makeText(DingdanActivity.this,  "加入订单成功！", Toast.LENGTH_SHORT).show();
//            else
//                Toast.makeText(DingdanActivity.this, "加入订单失败！", Toast.LENGTH_SHORT).show();
            delCartAll();
            Toast.makeText(this, "支付中...", Toast.LENGTH_LONG).show();
            new Handler().postDelayed(() -> {
                startActivity(new Intent(this,SuccessActivity.class));
                //overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                finish();
            },3000);
        });
    }
//    private void getUserInfo(){
//        File file = new File("/data/data/com.asyyy.shixun/shared_prefs/userInfo.xml");
//        if (file.exists()){
//            SharedPreferences sharedPreferences = getSharedPreferences("userInfo", MODE_PRIVATE);
//            String address = sharedPreferences.getString("address","NOT FOUND");
//            String name = sharedPreferences.getString("name","NOT FOUND");
//            String phone = sharedPreferences.getString("phone","NOT FOUND");
//
//            u_address.setText(address);
//            u_name.setText(name);
//            u_phone.setText(phone);
//        }
//    }

    //删除购物车中选中的商品
    private void delCartAll(){
//        CartDBOpenHelper dbOpenHelper = new CartDBOpenHelper(this, 1);
        CartDBOpenHelper dbOpenHelper = new CartDBOpenHelper(this,1);
        SQLiteDatabase db = dbOpenHelper.getWritableDatabase();
        //参数依次是表名，以及where条件与约束
        dbOpenHelper.getWritableDatabase().delete(
                "cart",
                "g_check=?",
                new String[]{"true"});
        dbOpenHelper.close();


    }
}
