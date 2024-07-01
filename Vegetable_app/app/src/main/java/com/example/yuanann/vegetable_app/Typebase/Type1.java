package com.example.yuanann.vegetable_app.Typebase;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.yuanann.vegetable_app.Mygoods2;
import com.example.yuanann.vegetable_app.Mygoods3;
import com.example.yuanann.vegetable_app.R;
import com.example.yuanann.vegetable_app.base.BaseFragment;
import com.example.yuanann.vegetable_app.home.Goods;
import com.example.yuanann.vegetable_app.home.GoodsListAdapter;

import java.util.ArrayList;


public class Type1 extends BaseFragment {
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
        goods.add(new Goods(31,R.drawable.jz1,"新鲜橘子","绿色生态 清香美味",3.60,9,"Apple产品京东自营旗舰店"));
        goods.add(new Goods(32,R.drawable.pg1,"新鲜苹果","顺丰发货 多种维C",2.40,99,"Apple产品京东自营旗舰店"));
        goods.add(new Goods(33,R.drawable.xg1,"新鲜西瓜","有机健康 新鲜必买",5.20,5,"Apple产品京东自营旗舰店"));
        goods.add(new Goods(34,R.drawable.xj1,"新鲜香蕉","包邮 最快次日到达",4.30,19,"小米京东自营旗舰店"));
        goods.add(new Goods(35,R.drawable.cm1,"新鲜草莓","味道深厚 色香味甜",2.80,18,"华为京东自营旗舰店"));
        goods.add(new Goods(36,R.drawable.pu1,"新鲜葡萄","香甜脆爽 好吃又健康",5.30,12,"京东超市"));
        goods.add(new Goods(37,R.drawable.hmg1,"新鲜哈密瓜","有机健康 新鲜必买",4.50,1,"化妆品专营店"));
        goods.add(new Goods(38,R.drawable.smt1,"新鲜水蜜桃","包邮 最快次日到达",3.90,99999999,"BMW旗舰店"));

        GoodsListAdapter adapter = new GoodsListAdapter(mContext, goods);
        lv_home.setAdapter(adapter);
    }



    private void initListener(){
        lv_home.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getContext(),Mygoods3.class);
                intent.putExtra("num",i);
                startActivity(intent);
            }
        });

    }
}
