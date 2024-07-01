package com.example.yuanann.vegetable_app;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yuanann.vegetable_app.cart.CartDBOpenHelper;
import com.example.yuanann.vegetable_app.cart.DingdanActivity;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Yuanann on 2020-11-8.
 */

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        TextView tesearch = findViewById(R.id.tesearch);
        final UnScrollListView list2;
        list2= findViewById(R.id.list);
        Intent intent = getIntent();
        final String count = intent.getStringExtra("search");
        tesearch.setText(count);

        DatabaseHelper dbHelper = new DatabaseHelper(this);
//        dbHelper.querysearch(count);
        //定义SimpleCursorAdapter
        Cursor mycursor=dbHelper.queryid(count);
//        try (Cursor mycursor = dbHelper.querysearch(count)) {
        SimpleCursorAdapter simpleCursorAdapter1=new SimpleCursorAdapter(Search.this,R.layout.layout2,mycursor,new String[]{"g_photo","g_name","g_type","g_price"},new int[]{R.id.t1,R.id.t2,R.id.t3,R.id.t4},0);
        list2.setAdapter(simpleCursorAdapter1);
        list2.postInvalidate();


    }


}
