package com.example.yuanann.vegetable_app;

import android.content.ContentValues;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Home extends AppCompatActivity {

    Button camera,text,find,info,mine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        camera=(Button)findViewById(R.id.camera);
        text=(Button)findViewById(R.id.text);
        find=(Button)findViewById(R.id.find);
        info=(Button)findViewById(R.id.info);
        mine=(Button)findViewById(R.id.mine);
        Fragment two = new Index();
        //实例化管理器
        FragmentManager fm = getSupportFragmentManager();
        //定义事务
        FragmentTransaction ft = fm.beginTransaction();
        //将当前的fragment替换为第二个
        ft.add(R.id.fag1, two);
        //提交事务
        ft.commit();
        Drawable drawable=this.getResources().getDrawable(R.drawable.e4);
        drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        text.setCompoundDrawables(null,drawable,null,null);


        Drawable fi=this.getResources().getDrawable(R.drawable.e2);
        fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        find.setCompoundDrawables(null,fi,null,null);

        Drawable ce=this.getResources().getDrawable(R.drawable.e9);
        ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        camera.setCompoundDrawables(null,ce,null,null);

        Drawable in=this.getResources().getDrawable(R.drawable.e5);
        in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        info.setCompoundDrawables(null,in,null,null);

        Drawable mi=this.getResources().getDrawable(R.drawable.e7);
        mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        mine.setCompoundDrawables(null,mi,null,null);

        text.setTextColor(Color.parseColor("#5bad56"));
        find.setTextColor(Color.parseColor("#999999"));
        camera.setTextColor(Color.parseColor("#999999"));
        info.setTextColor(Color.parseColor("#999999"));
        mine.setTextColor(Color.parseColor("#999999"));

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment one=new Type();
                //实例化管理器
                FragmentManager fm=getSupportFragmentManager();
                //定义事务
                FragmentTransaction ft=fm.beginTransaction();
                //添加fragment
                ft.replace(R.id.fag1,one);
                //提交事务`
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.e1);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                find.setCompoundDrawables(null,drawable,null,null);

                Drawable fi=getResources().getDrawable(R.drawable.e3);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                text.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.e9);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                camera.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.e5);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                info.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.e7);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                mine.setCompoundDrawables(null,mi,null,null);

                find.setTextColor(Color.parseColor("#5bad56"));
                text.setTextColor(Color.parseColor("#999999"));
                camera.setTextColor(Color.parseColor("#999999"));
                info.setTextColor(Color.parseColor("#999999"));
                mine.setTextColor(Color.parseColor("#999999"));

            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment two=new Index();
                //实例化管理器
                FragmentManager fm=getSupportFragmentManager();
                //定义事务
                FragmentTransaction ft=fm.beginTransaction();
                //添加fragment
                ft.replace(R.id.fag1,two);
                //提交事务`
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.e4);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                text.setCompoundDrawables(null,drawable,null,null);

                Drawable fi=getResources().getDrawable(R.drawable.e2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                find.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.e9);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                camera.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.e5);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                info.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.e7);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                mine.setCompoundDrawables(null,mi,null,null);

                text.setTextColor(Color.parseColor("#5bad56"));
                find.setTextColor(Color.parseColor("#999999"));
                camera.setTextColor(Color.parseColor("#999999"));
                info.setTextColor(Color.parseColor("#999999"));
                mine.setTextColor(Color.parseColor("#999999"));
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment three=new Vary();
                //实例化管理器
                FragmentManager fm=getSupportFragmentManager();
                //定义事务
                FragmentTransaction ft=fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag1,three);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.e10);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                camera.setCompoundDrawables(null,drawable,null,null);

                Drawable fi=getResources().getDrawable(R.drawable.e2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                find.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.e3);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                text.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.e5);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                info.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.e7);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                mine.setCompoundDrawables(null,mi,null,null);

                camera.setTextColor(Color.parseColor("#5bad56"));
                find.setTextColor(Color.parseColor("#999999"));
                text.setTextColor(Color.parseColor("#999999"));
                info.setTextColor(Color.parseColor("#999999"));
                mine.setTextColor(Color.parseColor("#999999"));
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment four=new Goodss();
                //实例化管理器
                FragmentManager fm=getSupportFragmentManager();
                //定义事务
                FragmentTransaction ft=fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag1,four);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.e6);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                info.setCompoundDrawables(null,drawable,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.e9);
                ce.setBounds(0,0,ce.getMinimumWidth(),drawable.getMinimumHeight());
                camera.setCompoundDrawables(null,ce,null,null);

                Drawable fi=getResources().getDrawable(R.drawable.e2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                find.setCompoundDrawables(null,fi,null,null);

                Drawable te=getResources().getDrawable(R.drawable.e3);
                te.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                text.setCompoundDrawables(null,te,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.e7);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                mine.setCompoundDrawables(null,mi,null,null);

                info.setTextColor(Color.parseColor("#5bad56"));
                find.setTextColor(Color.parseColor("#999999"));
                camera.setTextColor(Color.parseColor("#999999"));
                text.setTextColor(Color.parseColor("#999999"));
                mine.setTextColor(Color.parseColor("#999999"));


            }
        });
        mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment five=new Mine();
                //实例化管理器
                FragmentManager fm=getSupportFragmentManager();
                //定义事务
                FragmentTransaction ft=fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag1,five);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.e8);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                mine.setCompoundDrawables(null,drawable,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.e9);
                ce.setBounds(0,0,ce.getMinimumWidth(),drawable.getMinimumHeight());
                camera.setCompoundDrawables(null,ce,null,null);

                Drawable fi=getResources().getDrawable(R.drawable.e2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                find.setCompoundDrawables(null,fi,null,null);

                Drawable te=getResources().getDrawable(R.drawable.e3);
                te.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                text.setCompoundDrawables(null,te,null,null);

                Drawable in=getResources().getDrawable(R.drawable.e5);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                info.setCompoundDrawables(null,in,null,null);

                mine.setTextColor(Color.parseColor("#5bad56"));
                find.setTextColor(Color.parseColor("#999999"));
                camera.setTextColor(Color.parseColor("#999999"));
                info.setTextColor(Color.parseColor("#999999"));
                text.setTextColor(Color.parseColor("#999999"));


            }
        });

        DatabaseHelper dbHelper = new DatabaseHelper(this);
        long mygoods = dbHelper.allCaseNum();
        if (mygoods==0){
            long i = -1;
            ContentValues values = new ContentValues();
            values.put("g_photo", String.valueOf(R.drawable.xc1));
            values.put("g_name", "新鲜香菜");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.xc2));
            values.put("g_name", "新鲜香菜");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2.5");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.xc3));
            values.put("g_name", "新鲜香菜");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "1.5");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.xc4));
            values.put("g_name", "新鲜香菜");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2.0");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.xhs1));
            values.put("g_name", "新鲜西红柿");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "4.5");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.xhs2));
            values.put("g_name", "新鲜西红柿");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "3.6");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.xhs3));
            values.put("g_name", "新鲜西红柿");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "4.5");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.xhs4));
            values.put("g_name", "新鲜西红柿");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "1.9");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.td1));
            values.put("g_name", "新鲜土豆");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "1.5");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.td2));
            values.put("g_name", "新鲜土豆");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "3.2");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.td3));
            values.put("g_name", "新鲜土豆");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2.7");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.td4));
            values.put("g_name", "新鲜土豆");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "4.0");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.td5));
            values.put("g_name", "新鲜土豆");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "3.1");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.td6));
            values.put("g_name", "新鲜土豆");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2.8");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.ym1));
            values.put("g_name", "新鲜玉米");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "1.6");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.ym2));
            values.put("g_name", "新鲜玉米");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "1.9");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.ym3));
            values.put("g_name", "新鲜玉米");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2.5");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.ym4));
            values.put("g_name", "新鲜玉米");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "1.2");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.ym5));
            values.put("g_name", "新鲜玉米");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2.0");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.ym6));
            values.put("g_name", "新鲜玉米");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "1.4");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.lj1));
            values.put("g_name", "新鲜辣椒");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "3.5");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.lj2));
            values.put("g_name", "新鲜辣椒");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2.7");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.lj3));
            values.put("g_name", "新鲜辣椒");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "4.2");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.lj4));
            values.put("g_name", "新鲜辣椒");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "4.2");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.dg1));
            values.put("g_name", "新鲜冬瓜");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2.7");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.dg2));
            values.put("g_name", "新鲜冬瓜");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2.9");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.dg3));
            values.put("g_name", "新鲜冬瓜");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "4.2");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.dg4));
            values.put("g_name", "新鲜冬瓜");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "3.7");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.hlb1));
            values.put("g_name", "新鲜胡萝卜");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2.6");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.hlb2));
            values.put("g_name", "新鲜胡萝卜");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2.9");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.hlb3));
            values.put("g_name", "新鲜胡萝卜");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "2.2");
            dbHelper.insertAll(values);

            values.put("g_photo", String.valueOf(R.drawable.hlb4));
            values.put("g_name", "新鲜胡萝卜");
            values.put("g_type", "顺丰发货 多种维C");
            values.put("g_price", "3.2");
            dbHelper.insertAll(values);

        }
    }

}

