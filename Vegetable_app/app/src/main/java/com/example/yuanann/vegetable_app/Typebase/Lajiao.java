package com.example.yuanann.vegetable_app.Typebase;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.yuanann.vegetable_app.Mygoods;
import com.example.yuanann.vegetable_app.Mygoods2;
import com.example.yuanann.vegetable_app.R;
import com.example.yuanann.vegetable_app.base.BaseFragment;
import com.example.yuanann.vegetable_app.home.Goods;
import com.example.yuanann.vegetable_app.home.GoodsListAdapter;;import java.util.ArrayList;

public class Lajiao extends BaseFragment {
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
        goods.add(new Goods(23, R.drawable.ym3, "新鲜玉米", "顺丰发货 多种维C", 2.00, 9, "Apple产品京东自营旗舰店"));
        goods.add(new Goods(24, R.drawable.hlb3, "新鲜胡萝卜", "绿色生态 清香美味", 3.00, 99, "Apple产品京东自营旗舰店"));
        goods.add(new Goods(25, R.drawable.bc2, "新鲜白菜", "有机健康 新鲜必买", 1.50, 5, "Apple产品京东自营旗舰店"));
        goods.add(new Goods(26, R.drawable.lj2, "新鲜辣椒", "包邮 最快次日到达", 2.60, 19, "小米京东自营旗舰店"));
        goods.add(new Goods(27, R.drawable.xc1, "新鲜香菜", "味道深厚 色香味甜", 3.60, 18, "华为京东自营旗舰店"));
        goods.add(new Goods(28, R.drawable.dg4, "新鲜冬瓜", "香甜脆爽 好吃又健康", 6.50, 12, "京东超市"));
        goods.add(new Goods(29, R.drawable.lj1, "新鲜辣椒", "味道深厚 色香味甜", 2.50, 12, "京东超市"));
        goods.add(new Goods(30, R.drawable.gm4, "新鲜冬瓜", "香甜脆爽 好吃又健康", 3.00, 12, "京东超市"));

        GoodsListAdapter adapter = new GoodsListAdapter(mContext, goods);
        lv_home.setAdapter(adapter);
    }



    private void initListener(){
        lv_home.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getContext(),Mygoods2.class);
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
