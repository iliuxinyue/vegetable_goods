package com.example.yuanann.vegetable_app.Typebase;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.yuanann.vegetable_app.Mygoods1;
import com.example.yuanann.vegetable_app.Mygoods2;
import com.example.yuanann.vegetable_app.R;
import com.example.yuanann.vegetable_app.base.BaseFragment;
import com.example.yuanann.vegetable_app.home.Goods;
import com.example.yuanann.vegetable_app.home.GoodsListAdapter;;import java.util.ArrayList;

public class Xihongshi extends BaseFragment {
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
        goods.add(new Goods(1,R.drawable.xhs4,"新鲜西红柿","绿色生态 清香美味",1.3,9,"Apple产品京东自营旗舰店"));
        goods.add(new Goods(2,R.drawable.hlb2,"新鲜胡萝卜","顺丰发货 多种维C",4.2,99,"Apple产品京东自营旗舰店"));
        goods.add(new Goods(3,R.drawable.xc4,"新鲜香菜","有机健康 新鲜必买",5.4,5,"Apple产品京东自营旗舰店"));
        goods.add(new Goods(4,R.drawable.lj2,"新鲜辣椒","包邮 最快次日到达",3.5,19,"小米京东自营旗舰店"));
        goods.add(new Goods(5,R.drawable.ym3,"新鲜玉米","味道深厚 色香味甜",2.4,18,"华为京东自营旗舰店"));
        goods.add(new Goods(6,R.drawable.dg4,"新鲜冬瓜","香甜脆爽 好吃又健康",5.8,12,"京东超市"));
        goods.add(new Goods(7,R.drawable.td2,"新鲜土豆","有机健康 新鲜必买",1.5,1,"化妆品专营店"));
        goods.add(new Goods(8,R.drawable.xhs3,"新鲜西红柿","包邮 最快次日到达",4.9,99999999,"BMW旗舰店"));

        GoodsListAdapter adapter = new GoodsListAdapter(mContext, goods);
        lv_home.setAdapter(adapter);
    }

    private void initListener(){
        lv_home.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getContext(),Mygoods1.class);
                intent.putExtra("num",i);
                startActivity(intent);
            }
        });
//        ib_top.setOnClickListener(v -> {
//            //滑动回到顶部
//            lv_home.smoothScrollToPosition(0);
//        });

//        0tv_search_home.setOnClickListener(v -> {
//            Intent intent = new Intent();
//            intent.setAction("android.intent.action.VIEW");
//            intent.setData(Uri.parse("http://www.baidu.com"));
//            startActivity(intent);
//        });
//
//        tv_message_home.setOnClickListener(v -> {
//            Toast.makeText(mContext, "进入消息中心！", Toast.LENGTH_SHORT).show();
//        });

    }
}
