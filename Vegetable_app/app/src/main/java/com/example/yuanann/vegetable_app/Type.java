package com.example.yuanann.vegetable_app;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Type extends Fragment {

    Button t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view=inflater.inflate(R.layout.activity_type,container,false);
            return view;
        }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        super.onCreate(savedInstanceState);
        t1 = (Button) getActivity().findViewById(R.id.t1);
        t2 = (Button) getActivity().findViewById(R.id.t2);
        t3=(Button)getActivity().findViewById(R.id.t3);
        t4=(Button)getActivity().findViewById(R.id.t4);
        t5=(Button)getActivity().findViewById(R.id.t5);
        t6=(Button)getActivity().findViewById(R.id.t6);
        t7=(Button)getActivity().findViewById(R.id.t7);
        t8=(Button)getActivity().findViewById(R.id.t8);
        t9=(Button)getActivity().findViewById(R.id.t9);
        t10=(Button)getActivity().findViewById(R.id.t10);
        Fragment one = new Ty_two();
        //实例化管理器
        FragmentManager fm = getFragmentManager();
        //定义事务
        FragmentTransaction ft = fm.beginTransaction();
        //将当前的fragment替换为第二个
        ft.add(R.id.fag2, one);
        //提交事务
        ft.commit();
        Drawable drawable = this.getResources().getDrawable(R.drawable.d1);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        t1.setCompoundDrawables(null, drawable, null, null);


        Drawable fi=this.getResources().getDrawable(R.drawable.c2);
        fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        t2.setCompoundDrawables(null,fi,null,null);

        Drawable ce=this.getResources().getDrawable(R.drawable.c3);
        ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        t3.setCompoundDrawables(null,ce,null,null);

        Drawable in=this.getResources().getDrawable(R.drawable.c4);
        in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        t4.setCompoundDrawables(null,in,null,null);

        Drawable mi=this.getResources().getDrawable(R.drawable.c5);
        mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        t5.setCompoundDrawables(null,mi,null,null);

        Drawable syy=this.getResources().getDrawable(R.drawable.c6);
        syy.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        t6.setCompoundDrawables(null,syy,null,null);

        Drawable rzp=this.getResources().getDrawable(R.drawable.c7);
        rzp.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        t7.setCompoundDrawables(null,rzp,null,null);

        Drawable ss=this.getResources().getDrawable(R.drawable.c8);
        ss.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        t8.setCompoundDrawables(null,ss,null,null);

        Drawable ms=this.getResources().getDrawable(R.drawable.c9);
        ms.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        t9.setCompoundDrawables(null,ms,null,null);

        Drawable yl=this.getResources().getDrawable(R.drawable.c10);
        yl.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
        t10.setCompoundDrawables(null,yl,null,null);

        t1.setTextColor(Color.parseColor("#5bad56"));
        t2.setTextColor(Color.parseColor("#999999"));
        t3.setTextColor(Color.parseColor("#999999"));
        t4.setTextColor(Color.parseColor("#999999"));
        t5.setTextColor(Color.parseColor("#999999"));
        t6.setTextColor(Color.parseColor("#999999"));
        t7.setTextColor(Color.parseColor("#999999"));
        t8.setTextColor(Color.parseColor("#999999"));
        t9.setTextColor(Color.parseColor("#999999"));
        t10.setTextColor(Color.parseColor("#999999"));

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment two = new Ty_four();
                //实例化管理器
                FragmentManager fm = getFragmentManager();
                //定义事务
                FragmentTransaction ft = fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag2, two);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.c1);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t1.setCompoundDrawables(null,drawable,null,null);


                Drawable fi=getResources().getDrawable(R.drawable.d2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t2.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.c3);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t3.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.c4);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t4.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.c5);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t5.setCompoundDrawables(null,mi,null,null);

                Drawable syy=getResources().getDrawable(R.drawable.c6);
                syy.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t6.setCompoundDrawables(null,syy,null,null);

                Drawable rzp=getResources().getDrawable(R.drawable.c7);
                rzp.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t7.setCompoundDrawables(null,rzp,null,null);

                Drawable ss=getResources().getDrawable(R.drawable.c8);
                ss.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t8.setCompoundDrawables(null,ss,null,null);

                Drawable ms=getResources().getDrawable(R.drawable.c9);
                ms.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t9.setCompoundDrawables(null,ms,null,null);

                Drawable yl=getResources().getDrawable(R.drawable.c10);
                yl.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t10.setCompoundDrawables(null,yl,null,null);

                t1.setTextColor(Color.parseColor("#999999"));
                t2.setTextColor(Color.parseColor("#5bad56"));
                t3.setTextColor(Color.parseColor("#999999"));
                t4.setTextColor(Color.parseColor("#999999"));
                t5.setTextColor(Color.parseColor("#999999"));
                t6.setTextColor(Color.parseColor("#999999"));
                t7.setTextColor(Color.parseColor("#999999"));
                t8.setTextColor(Color.parseColor("#999999"));
                t9.setTextColor(Color.parseColor("#999999"));
                t10.setTextColor(Color.parseColor("#999999"));

            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment one = new Ty_two();
                //实例化管理器
                FragmentManager fm =getFragmentManager();
                //定义事务
                FragmentTransaction ft = fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag2, one);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.d1);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t1.setCompoundDrawables(null,drawable,null,null);


                Drawable fi=getResources().getDrawable(R.drawable.c2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t2.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.c3);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t3.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.c4);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t4.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.c5);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t5.setCompoundDrawables(null,mi,null,null);

                Drawable syy=getResources().getDrawable(R.drawable.c6);
                syy.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t6.setCompoundDrawables(null,syy,null,null);

                Drawable rzp=getResources().getDrawable(R.drawable.c7);
                rzp.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t7.setCompoundDrawables(null,rzp,null,null);

                Drawable ss=getResources().getDrawable(R.drawable.c8);
                ss.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t8.setCompoundDrawables(null,ss,null,null);

                Drawable ms=getResources().getDrawable(R.drawable.c9);
                ms.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t9.setCompoundDrawables(null,ms,null,null);

                Drawable yl=getResources().getDrawable(R.drawable.c10);
                yl.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t10.setCompoundDrawables(null,yl,null,null);

                t1.setTextColor(Color.parseColor("#5bad56"));
                t2.setTextColor(Color.parseColor("#999999"));
                t3.setTextColor(Color.parseColor("#999999"));
                t4.setTextColor(Color.parseColor("#999999"));
                t5.setTextColor(Color.parseColor("#999999"));
                t6.setTextColor(Color.parseColor("#999999"));
                t7.setTextColor(Color.parseColor("#999999"));
                t8.setTextColor(Color.parseColor("#999999"));
                t9.setTextColor(Color.parseColor("#999999"));
                t10.setTextColor(Color.parseColor("#999999"));
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment three = new Ty_two();
                //实例化管理器
                FragmentManager fm = getFragmentManager();
                //定义事务
                FragmentTransaction ft = fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag2, three);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.c1);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t1.setCompoundDrawables(null,drawable,null,null);


                Drawable fi=getResources().getDrawable(R.drawable.c2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t2.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.d3);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t3.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.c4);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t4.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.c5);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t5.setCompoundDrawables(null,mi,null,null);

                Drawable syy=getResources().getDrawable(R.drawable.c6);
                syy.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t6.setCompoundDrawables(null,syy,null,null);

                Drawable rzp=getResources().getDrawable(R.drawable.c7);
                rzp.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t7.setCompoundDrawables(null,rzp,null,null);

                Drawable ss=getResources().getDrawable(R.drawable.c8);
                ss.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t8.setCompoundDrawables(null,ss,null,null);

                Drawable ms=getResources().getDrawable(R.drawable.c9);
                ms.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t9.setCompoundDrawables(null,ms,null,null);

                Drawable yl=getResources().getDrawable(R.drawable.c10);
                yl.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t10.setCompoundDrawables(null,yl,null,null);

                t1.setTextColor(Color.parseColor("#999999"));
                t2.setTextColor(Color.parseColor("#999999"));
                t3.setTextColor(Color.parseColor("#5bad56"));
                t4.setTextColor(Color.parseColor("#999999"));
                t5.setTextColor(Color.parseColor("#999999"));
                t6.setTextColor(Color.parseColor("#999999"));
                t7.setTextColor(Color.parseColor("#999999"));
                t8.setTextColor(Color.parseColor("#999999"));
                t9.setTextColor(Color.parseColor("#999999"));
                t10.setTextColor(Color.parseColor("#999999"));

            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment four= new Ty_two();
                //实例化管理器
                FragmentManager fm = getFragmentManager();
                //定义事务
                FragmentTransaction ft = fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag2, four);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.c1);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t1.setCompoundDrawables(null,drawable,null,null);


                Drawable fi=getResources().getDrawable(R.drawable.c2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t2.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.c3);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t3.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.d4);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t4.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.c5);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t5.setCompoundDrawables(null,mi,null,null);

                Drawable syy=getResources().getDrawable(R.drawable.c6);
                syy.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t6.setCompoundDrawables(null,syy,null,null);

                Drawable rzp=getResources().getDrawable(R.drawable.c7);
                rzp.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t7.setCompoundDrawables(null,rzp,null,null);

                Drawable ss=getResources().getDrawable(R.drawable.c8);
                ss.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t8.setCompoundDrawables(null,ss,null,null);

                Drawable ms=getResources().getDrawable(R.drawable.c9);
                ms.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t9.setCompoundDrawables(null,ms,null,null);

                Drawable yl=getResources().getDrawable(R.drawable.c10);
                yl.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t10.setCompoundDrawables(null,yl,null,null);

                t1.setTextColor(Color.parseColor("#999999"));
                t2.setTextColor(Color.parseColor("#999999"));
                t3.setTextColor(Color.parseColor("#999999"));
                t4.setTextColor(Color.parseColor("#5bad56"));
                t5.setTextColor(Color.parseColor("#999999"));
                t6.setTextColor(Color.parseColor("#999999"));
                t7.setTextColor(Color.parseColor("#999999"));
                t8.setTextColor(Color.parseColor("#999999"));
                t9.setTextColor(Color.parseColor("#999999"));
                t10.setTextColor(Color.parseColor("#999999"));

            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment five = new Ty_two();
                //实例化管理器
                FragmentManager fm =getFragmentManager();
                //定义事务
                FragmentTransaction ft = fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag2, five);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.c1);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t1.setCompoundDrawables(null,drawable,null,null);


                Drawable fi=getResources().getDrawable(R.drawable.c2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t2.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.c3);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t3.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.c4);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t4.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.d5);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t5.setCompoundDrawables(null,mi,null,null);

                Drawable syy=getResources().getDrawable(R.drawable.c6);
                syy.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t6.setCompoundDrawables(null,syy,null,null);

                Drawable rzp=getResources().getDrawable(R.drawable.c7);
                rzp.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t7.setCompoundDrawables(null,rzp,null,null);

                Drawable ss=getResources().getDrawable(R.drawable.c8);
                ss.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t8.setCompoundDrawables(null,ss,null,null);

                Drawable ms=getResources().getDrawable(R.drawable.c9);
                ms.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t9.setCompoundDrawables(null,ms,null,null);

                Drawable yl=getResources().getDrawable(R.drawable.c10);
                yl.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t10.setCompoundDrawables(null,yl,null,null);

                t1.setTextColor(Color.parseColor("#999999"));
                t2.setTextColor(Color.parseColor("#999999"));
                t3.setTextColor(Color.parseColor("#999999"));
                t4.setTextColor(Color.parseColor("#999999"));
                t5.setTextColor(Color.parseColor("#5bad56"));
                t6.setTextColor(Color.parseColor("#999999"));
                t7.setTextColor(Color.parseColor("#999999"));
                t8.setTextColor(Color.parseColor("#999999"));
                t9.setTextColor(Color.parseColor("#999999"));
                t10.setTextColor(Color.parseColor("#999999"));

            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment six = new Ty_two();
                //实例化管理器
                FragmentManager fm =getFragmentManager();
                //定义事务
                FragmentTransaction ft = fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag2, six);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.c1);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t1.setCompoundDrawables(null,drawable,null,null);


                Drawable fi=getResources().getDrawable(R.drawable.c2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t2.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.c3);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t3.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.c4);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t4.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.c5);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t5.setCompoundDrawables(null,mi,null,null);

                Drawable syy=getResources().getDrawable(R.drawable.d6);
                syy.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t6.setCompoundDrawables(null,syy,null,null);

                Drawable rzp=getResources().getDrawable(R.drawable.c7);
                rzp.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t7.setCompoundDrawables(null,rzp,null,null);

                Drawable ss=getResources().getDrawable(R.drawable.c8);
                ss.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t8.setCompoundDrawables(null,ss,null,null);

                Drawable ms=getResources().getDrawable(R.drawable.c9);
                ms.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t9.setCompoundDrawables(null,ms,null,null);

                Drawable yl=getResources().getDrawable(R.drawable.c10);
                yl.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t10.setCompoundDrawables(null,yl,null,null);

                t1.setTextColor(Color.parseColor("#999999"));
                t2.setTextColor(Color.parseColor("#999999"));
                t3.setTextColor(Color.parseColor("#999999"));
                t4.setTextColor(Color.parseColor("#999999"));
                t5.setTextColor(Color.parseColor("#999999"));
                t6.setTextColor(Color.parseColor("#5bad56"));
                t7.setTextColor(Color.parseColor("#999999"));
                t8.setTextColor(Color.parseColor("#999999"));
                t9.setTextColor(Color.parseColor("#999999"));
                t10.setTextColor(Color.parseColor("#999999"));

            }

        });

        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment seven = new Ty_two();
                //实例化管理器
                FragmentManager fm =getFragmentManager();
                //定义事务
                FragmentTransaction ft = fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag2, seven);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.c1);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t1.setCompoundDrawables(null,drawable,null,null);


                Drawable fi=getResources().getDrawable(R.drawable.c2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t2.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.c3);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t3.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.c4);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t4.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.c5);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t5.setCompoundDrawables(null,mi,null,null);

                Drawable syy=getResources().getDrawable(R.drawable.c6);
                syy.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t6.setCompoundDrawables(null,syy,null,null);

                Drawable rzp=getResources().getDrawable(R.drawable.d7);
                rzp.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t7.setCompoundDrawables(null,rzp,null,null);

                Drawable ss=getResources().getDrawable(R.drawable.c8);
                ss.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t8.setCompoundDrawables(null,ss,null,null);

                Drawable ms=getResources().getDrawable(R.drawable.c9);
                ms.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t9.setCompoundDrawables(null,ms,null,null);

                Drawable yl=getResources().getDrawable(R.drawable.c10);
                yl.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t10.setCompoundDrawables(null,yl,null,null);

                t1.setTextColor(Color.parseColor("#999999"));
                t2.setTextColor(Color.parseColor("#999999"));
                t3.setTextColor(Color.parseColor("#999999"));
                t4.setTextColor(Color.parseColor("#999999"));
                t5.setTextColor(Color.parseColor("#999999"));
                t6.setTextColor(Color.parseColor("#999999"));
                t7.setTextColor(Color.parseColor("#5bad56"));
                t8.setTextColor(Color.parseColor("#999999"));
                t9.setTextColor(Color.parseColor("#999999"));
                t10.setTextColor(Color.parseColor("#999999"));

            }

        });

        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment eight = new Ty_two();
                //实例化管理器
                FragmentManager fm =getFragmentManager();
                //定义事务
                FragmentTransaction ft = fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag2, eight);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.c1);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t1.setCompoundDrawables(null,drawable,null,null);


                Drawable fi=getResources().getDrawable(R.drawable.c2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t2.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.c3);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t3.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.c4);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t4.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.c5);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t5.setCompoundDrawables(null,mi,null,null);

                Drawable syy=getResources().getDrawable(R.drawable.c6);
                syy.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t6.setCompoundDrawables(null,syy,null,null);

                Drawable rzp=getResources().getDrawable(R.drawable.c7);
                rzp.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t7.setCompoundDrawables(null,rzp,null,null);

                Drawable ss=getResources().getDrawable(R.drawable.d8);
                ss.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t8.setCompoundDrawables(null,ss,null,null);

                Drawable ms=getResources().getDrawable(R.drawable.c9);
                ms.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t9.setCompoundDrawables(null,ms,null,null);

                Drawable yl=getResources().getDrawable(R.drawable.c10);
                yl.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t10.setCompoundDrawables(null,yl,null,null);

                t1.setTextColor(Color.parseColor("#999999"));
                t2.setTextColor(Color.parseColor("#999999"));
                t3.setTextColor(Color.parseColor("#999999"));
                t4.setTextColor(Color.parseColor("#999999"));
                t5.setTextColor(Color.parseColor("#999999"));
                t6.setTextColor(Color.parseColor("#999999"));
                t7.setTextColor(Color.parseColor("#999999"));
                t8.setTextColor(Color.parseColor("#5bad56"));
                t9.setTextColor(Color.parseColor("#999999"));
                t10.setTextColor(Color.parseColor("#999999"));

            }

        });

        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment nine= new Ty_two();
                //实例化管理器
                FragmentManager fm =getFragmentManager();
                //定义事务
                FragmentTransaction ft = fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag2, nine);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.c1);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t1.setCompoundDrawables(null,drawable,null,null);


                Drawable fi=getResources().getDrawable(R.drawable.c2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t2.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.c3);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t3.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.c4);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t4.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.c5);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t5.setCompoundDrawables(null,mi,null,null);

                Drawable syy=getResources().getDrawable(R.drawable.c6);
                syy.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t6.setCompoundDrawables(null,syy,null,null);

                Drawable rzp=getResources().getDrawable(R.drawable.c7);
                rzp.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t7.setCompoundDrawables(null,rzp,null,null);

                Drawable ss=getResources().getDrawable(R.drawable.c8);
                ss.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t8.setCompoundDrawables(null,ss,null,null);

                Drawable ms=getResources().getDrawable(R.drawable.d9);
                ms.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t9.setCompoundDrawables(null,ms,null,null);

                Drawable yl=getResources().getDrawable(R.drawable.c10);
                yl.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t10.setCompoundDrawables(null,yl,null,null);

                t1.setTextColor(Color.parseColor("#999999"));
                t2.setTextColor(Color.parseColor("#999999"));
                t3.setTextColor(Color.parseColor("#999999"));
                t4.setTextColor(Color.parseColor("#999999"));
                t5.setTextColor(Color.parseColor("#999999"));
                t6.setTextColor(Color.parseColor("#999999"));
                t7.setTextColor(Color.parseColor("#999999"));
                t8.setTextColor(Color.parseColor("#999999"));
                t9.setTextColor(Color.parseColor("#5bad56"));
                t10.setTextColor(Color.parseColor("#999999"));

            }

        });

        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment ten = new Ty_two();
                //实例化管理器
                FragmentManager fm =getFragmentManager();
                //定义事务
                FragmentTransaction ft = fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag2, ten);
                //提交事务
                ft.commit();
                Drawable drawable=getResources().getDrawable(R.drawable.c1);
                drawable.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t1.setCompoundDrawables(null,drawable,null,null);


                Drawable fi=getResources().getDrawable(R.drawable.c2);
                fi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t2.setCompoundDrawables(null,fi,null,null);

                Drawable ce=getResources().getDrawable(R.drawable.c3);
                ce.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t3.setCompoundDrawables(null,ce,null,null);

                Drawable in=getResources().getDrawable(R.drawable.c4);
                in.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t4.setCompoundDrawables(null,in,null,null);

                Drawable mi=getResources().getDrawable(R.drawable.c5);
                mi.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t5.setCompoundDrawables(null,mi,null,null);

                Drawable syy=getResources().getDrawable(R.drawable. c6);
                syy.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t6.setCompoundDrawables(null,syy,null,null);

                Drawable rzp=getResources().getDrawable(R.drawable.c7);
                rzp.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t7.setCompoundDrawables(null,rzp,null,null);

                Drawable ss=getResources().getDrawable(R.drawable.c8);
                ss.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t8.setCompoundDrawables(null,ss,null,null);

                Drawable ms=getResources().getDrawable(R.drawable.c9);
                ms.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t9.setCompoundDrawables(null,ms,null,null);

                Drawable yl=getResources().getDrawable(R.drawable.d10);
                yl.setBounds(0,0,drawable.getMinimumWidth(),drawable.getMinimumHeight());
                t10.setCompoundDrawables(null,yl,null,null);

                t1.setTextColor(Color.parseColor("#999999"));
                t2.setTextColor(Color.parseColor("#999999"));
                t3.setTextColor(Color.parseColor("#999999"));
                t4.setTextColor(Color.parseColor("#999999"));
                t5.setTextColor(Color.parseColor("#999999"));
                t6.setTextColor(Color.parseColor("#999999"));
                t7.setTextColor(Color.parseColor("#999999"));
                t8.setTextColor(Color.parseColor("#999999"));
                t9.setTextColor(Color.parseColor("#999999"));
                t10.setTextColor(Color.parseColor("#5bad56"));

            }

        });
    }
}
