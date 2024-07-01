package com.example.yuanann.vegetable_app.Typebase;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.yuanann.vegetable_app.Mygoods3;
import com.example.yuanann.vegetable_app.Mygoods4;
import com.example.yuanann.vegetable_app.R;
import com.example.yuanann.vegetable_app.base.BaseFragment;
import com.example.yuanann.vegetable_app.home.Goods;
import com.example.yuanann.vegetable_app.home.GoodsListAdapter;

import java.util.ArrayList;


public class Type2 extends BaseFragment {
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
        goods.add(new Goods(39,R.drawable.cm2,"新鲜草莓","味道深厚 色香味甜",2.90,18,"华为京东自营旗舰店"));
        goods.add(new Goods(40,R.drawable.xj2,"新鲜香蕉","包邮 最快次日到达",2.30,19,"小米京东自营旗舰店"));
        goods.add(new Goods(41,R.drawable.hmg2,"新鲜哈密瓜","有机健康 新鲜必买",6.50,1,"化妆品专营店"));
        goods.add(new Goods(42,R.drawable.pu2,"新鲜葡萄","香甜脆爽 好吃又健康",3.40,12,"京东超市"));
        goods.add(new Goods(43,R.drawable.jz2,"新鲜橘子","绿色生态 清香美味",2.40,9,"Apple产品京东自营旗舰店"));
        goods.add(new Goods(44,R.drawable.pg3,"新鲜苹果","顺丰发货 多种维C",4.30,99,"Apple产品京东自营旗舰店"));
        goods.add(new Goods(45,R.drawable.xg2,"新鲜西瓜","有机健康 新鲜必买",6.20,5,"Apple产品京东自营旗舰店"));
        goods.add(new Goods(46,R.drawable.smt2,"新鲜水蜜桃","包邮 最快次日到达",2.90,99999999,"BMW旗舰店"));

        GoodsListAdapter adapter = new GoodsListAdapter(mContext, goods);
        lv_home.setAdapter(adapter);
    }



    private void initListener(){
        lv_home.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getContext(),Mygoods4.class);
                intent.putExtra("num",i);
                startActivity(intent);
            }
        });

    }
}
