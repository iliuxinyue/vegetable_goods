package com.example.yuanann.vegetable_app;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.io.IOException;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class Vary extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_vary,container,false);
        return view;
    }
    private CustomVideoView videoview;
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        super.onCreate(savedInstanceState);
        ImageView p1=getActivity().findViewById(R.id.m1);
        ImageView p2=getActivity().findViewById(R.id.m2);
        ImageView p3=getActivity().findViewById(R.id.m3);
        ImageView p4=getActivity().findViewById(R.id.m4);
        ImageView p5=getActivity().findViewById(R.id.m5);
        ImageView p6=getActivity().findViewById(R.id.m6);
        ImageView p7=getActivity().findViewById(R.id.m7);
        ImageView p8=getActivity().findViewById(R.id.m8);
        ImageView p9=getActivity().findViewById(R.id.m9);
        ImageView p10=getActivity().findViewById(R.id.m10);
        ImageView p11=getActivity().findViewById(R.id.m11);
        ImageView p12=getActivity().findViewById(R.id.m12);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(),Myfind.class);
                intent.putExtra("count",0);
                startActivity(intent);
            }
        });
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(),Myfind.class);
                intent.putExtra("count",1);
                startActivity(intent);
            }
        });
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(),Myfind.class);
                intent.putExtra("count",2);
                startActivity(intent);
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(),Myfind.class);
                intent.putExtra("count",3);
                startActivity(intent);
            }
        });

        TabHost tab = (TabHost) getActivity().findViewById(android.R.id.tabhost);

        //初始化TabHost容器
        tab.setup();
        //在TabHost创建标签，然后设置：标题／图标／标签页布局
        tab.addTab(tab.newTabSpec("tab1").setIndicator("推荐", null).setContent(R.id.tab1));
        tab.addTab(tab.newTabSpec("tab2").setIndicator("秋季好物", null).setContent(R.id.tab2));
        tab.addTab(tab.newTabSpec("tab3").setIndicator("每日好菜", null).setContent(R.id.tab3));

        Fragment video = new Video();
        //实例化管理器
        FragmentManager fragmentManager1 = getFragmentManager();
        //定义事务
        FragmentTransaction fta1 = fragmentManager1.beginTransaction();
        //添加fragment
        fta1.add(R.id.varyfag, video);
        //提交事务`
        fta1.commit();

    }


}




