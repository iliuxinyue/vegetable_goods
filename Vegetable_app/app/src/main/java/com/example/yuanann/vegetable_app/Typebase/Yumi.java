package com.example.yuanann.vegetable_app.Typebase;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.yuanann.vegetable_app.Mygoods0;
import com.example.yuanann.vegetable_app.Mygoods1;
import com.example.yuanann.vegetable_app.Mygoods2;
import com.example.yuanann.vegetable_app.R;
import com.example.yuanann.vegetable_app.base.BaseFragment;
import com.example.yuanann.vegetable_app.home.Goods;
import com.example.yuanann.vegetable_app.home.GoodsListAdapter;;import java.util.ArrayList;

public class Yumi extends BaseFragment {
    private ListView lv_home;
    private ImageView ib_top;
    private TextView tv_search_home, tv_message_home;

    @Override
    public View initView() {
        View view = View.inflate(mContext, R.layout.type_grid, null);
        lv_home = view.findViewById(R.id.lv_home);
        initListener();
        return view;
    }

    public void initData(){
        super.initData();
        ArrayList<Goods> goods = new ArrayList<>();
        //int g_id, int g_photo, String g_name, String g_type, double g_price, int g_sales, String g_shop
        goods.add(new Goods(9,R.drawable.xhs1,"新鲜西红柿","绿色生态 清香美味",1.6,9,"Apple产品京东自营旗舰店"));
        goods.add(new Goods(10,R.drawable.dg3,"新鲜冬瓜","香甜脆爽 好吃又健康",5.7,12,"京东超市"));
        goods.add(new Goods(11,R.drawable.td1,"新鲜土豆","有机健康 新鲜必买",4.7,1,"化妆品专营店"));
        goods.add(new Goods(12,R.drawable.bc4,"新鲜白菜","顺丰发货 多种维C",1.2,99,"Apple产品京东自营旗舰店"));
        goods.add(new Goods(13,R.drawable.xc4,"新鲜香菜","有机健康 新鲜必买",4.1,5,"Apple产品京东自营旗舰店"));
        goods.add(new Goods(14,R.drawable.xhs4,"新鲜西红柿","包邮 最快次日到达",2.1,99999999,"BMW旗舰店"));
        goods.add(new Goods(15,R.drawable.lj4,"新鲜辣椒","包邮 最快次日到达",6.6,19,"小米京东自营旗舰店"));
        goods.add(new Goods(16,R.drawable.ym5,"新鲜玉米","味道深厚 色香味甜",2.4,18,"华为京东自营旗舰店"));

        GoodsListAdapter adapter = new GoodsListAdapter(mContext, goods);
        lv_home.setAdapter(adapter);
    }

    private void initListener(){
        lv_home.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getContext(),Mygoods0.class);
                intent.putExtra("num",i);
                startActivity(intent);
            }
        });

    }
}
