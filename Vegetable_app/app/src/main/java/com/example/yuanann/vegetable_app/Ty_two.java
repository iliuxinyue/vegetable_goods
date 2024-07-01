package com.example.yuanann.vegetable_app;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.yuanann.vegetable_app.Typebase.Xihongshi;
import com.example.yuanann.vegetable_app.Typebase.Yumi;
import com.example.yuanann.vegetable_app.Typebase.Lajiao;
import com.example.yuanann.vegetable_app.base.BaseFragment;

import java.util.ArrayList;

public class Ty_two extends BaseFragment {

    private TextView rb_commf1,rb_commf2,rb_commf3,rb_commf4,rb_commf5,rb_commf6;
    private RadioGroup rg_type;

    private ArrayList<BaseFragment> fragments;//定义一个列表
    private int position = 0;
    private BaseFragment tempFragment;

    @Override
    public View initView() {
        //初始化界面
        View view = View.inflate(mContext, R.layout.activity_type_two,null);
        rg_type = view.findViewById(R.id.rg_type);
        initFragment();
        initListener();
        rg_type.check(R.id.rb_commf1);
        return view;
    }

    public void initData(){
        super.initData();
    }
    private void initFragment(){
        fragments = new ArrayList<>();
        fragments.add(new Xihongshi());
        fragments.add(new Yumi());
        fragments.add(new Lajiao());
        fragments.add(new Xihongshi());
        fragments.add(new Yumi());
        fragments.add(new Lajiao());
    }

    //设置监听
    private void initListener(){
        rg_type.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_commf1:
                        position = 0;
                        break;
                    case R.id.rb_commf2:
                        position = 1;
                        break;
                    case R.id.rb_commf3:
                        position = 2;
                        break;
                    case R.id.rb_commf4:
                        position = 3;
                        break;
                    case R.id.rb_commf5:
                        position = 4;
                        break;
                    case R.id.rb_commf6:
                        position = 5;
                        break;
                    default:
                        position = 0;
                        break;
                }
                BaseFragment baseFragment = getFragment(position);
                switchFragment(tempFragment,baseFragment);
            }
        });
    }
    //得到fragment
    private BaseFragment getFragment(int position){
        if (fragments != null && fragments.size() > 0){
            BaseFragment baseFragment = fragments.get(position);
            return baseFragment;
        }
        return null;
    }

    //切换fragment
    private void switchFragment (Fragment fromfragment, BaseFragment nextfragment){

        if (tempFragment != nextfragment){
            tempFragment = nextfragment;
            if (nextfragment != null){
                //开启事务
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();

                //判断nextFragment是否有添加
                if (!nextfragment.isAdded()){
                    //隐藏当前的fragment
                    if (fromfragment != null){
                        transaction.hide(fromfragment);
                    }
                    transaction.add(R.id.frameLayout_type,nextfragment).commit();
                }else{
                    if (fromfragment != null){
                        transaction.hide(fromfragment);
                    }
                    transaction.show(nextfragment).commit();
                }
            }
        }
    }
}
