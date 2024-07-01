package com.example.yuanann.vegetable_app;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yuanann.vegetable_app.cart.CartDBOpenHelper;
import com.example.yuanann.vegetable_app.home.Goods;
import com.example.yuanann.vegetable_app.home.GoodsListAdapter;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class Mygoods extends AppCompatActivity {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private ArrayList<Goods> goodsList;
    private CartDBOpenHelper dbOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mygoods);
        ImageView h1 = findViewById(R.id.h1);
        ImageView h4 = findViewById(R.id.h4);
        ImageView h5 = findViewById(R.id.h5);
        ImageView h6 = findViewById(R.id.h6);
        ImageView f1 = findViewById(R.id.f1);
        ImageView f2 = findViewById(R.id.f2);
        Button info=(Button)findViewById(R.id.info);
        TextView h2 = findViewById(R.id.h2);
        TextView h3 = findViewById(R.id.h3);
        TextView money = findViewById(R.id.money);
        TextView price = findViewById(R.id.price);
        ImageView g = findViewById(R.id.g);
        Button gm = findViewById(R.id.gm);
        Button gwc = findViewById(R.id.gwc);

        Intent intent = getIntent();
        int num = intent.getIntExtra("num", 0);
        //声明数据
        int[] imageA = {R.drawable.ym3, R.drawable.hlb3, R.drawable.bc2, R.drawable.lj3,
                R.drawable.xc3, R.drawable.dg4, R.drawable.td2, R.drawable.xhs3,};
//        int[] imageB={R.drawable.w1,R.drawable.w2,R.drawable.w3,R.drawable.w4,
//                R.drawable.w6,R.drawable.w5,R.drawable.w8,R.drawable.w7,
//                R.drawable.w13,R.drawable.w14,R.drawable.w15,R.drawable.w16,
//                R.drawable.w9,R.drawable.w11,R.drawable.w10,R.drawable.w12,};
        int[] id = {17, 18, 19, 20, 21, 22};
        String[] descB = {"顺丰发货 多种维C", "绿色生态 清香美味", "有机健康 新鲜必买", "包邮 最快次日到达", "味道深厚 色香味甜", "香甜脆爽 好吃又健康", "顺丰发货 多种维C", "绿色生态 清香美味"};
        double[] descC = {2.00, 3.00, 1.50, 2.60, 9.00, 6.50};
        String[] descA = {"新鲜玉米", "新鲜胡萝卜", "新鲜白菜", "新鲜辣椒", "新鲜香菜", "新鲜冬瓜", "新鲜土豆", "新鲜西红柿"};

        String myprice = "￥" + descC[num] + "元/斤";

        ArrayList<Goods> goods = new ArrayList<>();
        //int g_id, int g_photo, String g_name, String g_type, double g_price, int g_sales, String g_shop
        goods.add(new Goods(17, R.drawable.ym3, "新鲜玉米", "顺丰发货 多种维C", 2.00, 9, ".."));
        goods.add(new Goods(18, R.drawable.hlb3, "新鲜胡萝卜", "绿色生态 清香美味", 3.00, 99, ".."));
        goods.add(new Goods(19, R.drawable.bc2, "新鲜白菜", "有机健康 新鲜必买", 1.50, 5, ".."));
        goods.add(new Goods(20, R.drawable.lj2, "新鲜辣椒", "包邮 最快次日到达", 2.60, 19, ".."));
        goods.add(new Goods(21, R.drawable.xc3, "新鲜香菜", "味道深厚 色香味甜", 9.00, 18, ".."));
        goods.add(new Goods(22, R.drawable.dg4, "新鲜冬瓜", "香甜脆爽 好吃又健康", 6.50, 12, ".."));

//        GoodsListAdapter adapter = new GoodsListAdapter(R, goods);
//        lv_home.setAdapter(adapter);

        h1.setBackgroundResource(imageA[num]);
//        h4.setBackgroundResource(imageB[num]);
        h2.setText(descB[num]);
        h3.setText(descA[num]);
        price.setText(myprice);
        money.setText("￥" + descC[num] + "/斤");
        ImageView cd1, cd2, cd3, cd4, cd5;
        cd1 = findViewById(R.id.cd1);
        cd2 = findViewById(R.id.cd2);
        cd3 = findViewById(R.id.cd3);
        cd4 = findViewById(R.id.cd4);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Mygoods.this, Home.class);
                startActivity(intent);
            }
        });
        f2.setOnClickListener(new View.OnClickListener() {
            Goodss toPayFragmentManager;
            @Override
            public void onClick(View view) {
//                if (toPayFragmentManager != null)
//                    return;
//
//                toPayFragmentManager = new Goodss();
//
//                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//
//                transaction.add(R.id.fag1, toPayFragmentManager);//这里要引用布局中的FrameLayout，也就是上面强调。
//
//                transaction.commit();
//                Intent intent = new Intent();
//                intent.setClass(Mygoods.this, Goodss.class);
//                startActivity(intent);
//                Fragment four=new Goodss();
//                //实例化管理器
//                FragmentManager fm=getSupportFragmentManager();
//                //定义事务
//                FragmentTransaction ft=fm.beginTransaction();
//                //将当前的fragment替换为第二个
//                ft.add(R.id.fag1,four);
                //提交事务
//                ft.commit();

            }
        });

        gm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                String dec=descC[num]+"";
                intent.setClass(Mygoods.this, Pay.class);
                Bundle bundle = new Bundle();
                bundle.putString("id",dec );
                intent.putExtras(bundle);
                startActivity(intent);
//                CartDBOpenHelper dbOpenHelper = new CartDBOpenHelper(Mygoods.this, 1);
//                SQLiteDatabase db = dbOpenHelper.getWritableDatabase();
//                //参数依次是表名，以及where条件与约束
//                db.delete("cart", "cart_id=?", new String[]{"11"});
            }

        });

        gwc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long i = -1;
                //创建数据库
                CartDBOpenHelper dbOpenHelper = new CartDBOpenHelper(Mygoods.this,1);
                SQLiteDatabase db = dbOpenHelper.getWritableDatabase();
                //商品数量
                int goods_num = isExist((id[num]));
//                int goods_num = 0;
                if (goods_num == 0) {
                    //如果数据库中不存在当前商品
                    //Toast.makeText(mContext,"当前数据库不存在改商品！", Toast.LENGTH_SHORT).show();
                    ContentValues values = new ContentValues();
                    //cart(g_id,g_photo,g_name,g_type,g_price,g_num,g_check)
                    values.put("g_id", String.valueOf(id[num]));
                    values.put("g_photo", String.valueOf(imageA[num]));
                    values.put("g_name", descA[num]);
                    values.put("g_type", descB[num]);
                    values.put("g_price", descC[num]);
                    values.put("g_num", "1");
                    values.put("g_check", "false");
                    i=db.insert("cart", null, values);
                } else {
                    //如果数据库中存在当前商品
                    //Toast.makeText(mContext,"当前数据库存在改商品！！！", Toast.LENGTH_SHORT).show();
                    ContentValues values = new ContentValues();
                    values.put("g_num", goods_num + 1);
                    //参数:表名，修改后的值，where条件，以及约束，如果不指定三四两个参数，会更改所有行
                    i = dbOpenHelper.getWritableDatabase().update(
                            "cart",
                            values,
                            "g_id=?",
                            new String[]{String.valueOf(id[num])});
                }
                if (i != -1)
                    Toast.makeText(Mygoods.this, descA[num] + "加入购物车成功！", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Mygoods.this, "加入购物车失败！", Toast.LENGTH_SHORT).show();
                dbOpenHelper.close();


            }
        });


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Mygoods.this, Mygoods0.class);
                intent.putExtra("num", 0);
                startActivity(intent);
            }
        });
        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Mygoods.this, Mygoods.class);
                intent.putExtra("num", 2);
                startActivity(intent);
            }
        });
        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Mygoods.this, Mygoods.class);
                intent.putExtra("num", 0);
                startActivity(intent);
            }
        });
        cd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Mygoods.this, Mygoods.class);
                intent.putExtra("num", 3);
                startActivity(intent);
            }
        });
    }

    //判断商品id是否存在,存在返回商品数量，不存在返回0
    private int isExist(int g_id){
        dbOpenHelper = new CartDBOpenHelper(Mygoods.this,1);
        //表名，列名，where约束条件，where中占位符提供具体的值，指定group by的列，进一步约束
        Cursor cursor = dbOpenHelper.getReadableDatabase().query(
                "cart",
                new String[]{"g_num"},
                "g_id=?",
                new String[]{String.valueOf(g_id)},
                null,
                null,
                null);
        boolean idIsExist = cursor.moveToFirst();
        if (idIsExist){
            String str = cursor.getString(0);
            cursor.close();
            dbOpenHelper.close();
            //Toast.makeText(mContext,"当前数据库存在改商品！！！" + str, Toast.LENGTH_SHORT).show();
            return Integer.parseInt(str);
        }
        //Toast.makeText(mContext,"当前数据库不存在改商品！", Toast.LENGTH_SHORT).show();
        cursor.close();
        dbOpenHelper.close();
        return 0;
    }
}