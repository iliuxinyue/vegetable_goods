package com.example.yuanann.vegetable_app;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        final UnScrollListView list2;
        list2= findViewById(R.id.list);

        DatabaseHelper dbHelper2 = new DatabaseHelper(this);
//        dbHelper.querysearch(count);
        //定义SimpleCursorAdapter
        Cursor mycursor=dbHelper2.queryorder();
//        try (Cursor mycursor = dbHelper.querysearch(count)) {
        SimpleCursorAdapter simpleCursorAdapter1=new SimpleCursorAdapter(Order.this,R.layout.layout,mycursor,new String[]{"g_photo","g_name","g_type","g_price","g_num"},new int[]{R.id.t1,R.id.t2,R.id.t3,R.id.t4,R.id.t5},0);
        list2.setAdapter(simpleCursorAdapter1);
        list2.postInvalidate();


    }


}
