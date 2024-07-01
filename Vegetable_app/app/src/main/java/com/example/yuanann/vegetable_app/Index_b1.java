package com.example.yuanann.vegetable_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yuanann.vegetable_app.R;
import com.example.yuanann.vegetable_app.base.BaseFragment;
import com.example.yuanann.vegetable_app.home.Goods;
import com.example.yuanann.vegetable_app.home.GoodsListAdapter;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Index_b1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_index_b1,container,false);
        return view;
    }
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        super.onCreate(savedInstanceState);
        ImageView m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;
        m1 = (ImageView) getActivity().findViewById(R.id.m1);
        m2 = (ImageView) getActivity().findViewById(R.id.m2);
        m3 = (ImageView) getActivity().findViewById(R.id.m3);
        m4 = (ImageView) getActivity().findViewById(R.id.m4);
        m5 = (ImageView) getActivity().findViewById(R.id.m5);
        m6 = (ImageView) getActivity().findViewById(R.id.m6);
        m7 = (ImageView) getActivity().findViewById(R.id.m7);
        m8 = (ImageView) getActivity().findViewById(R.id.m8);
        m9 = (ImageView) getActivity().findViewById(R.id.m9);
        m10 = (ImageView) getActivity().findViewById(R.id.m10);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods0.class);
                intent.putExtra("num", 3);
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods2.class);
                intent.putExtra("num", 5);
                startActivity(intent);
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods2.class);
                intent.putExtra("num", 7);
                startActivity(intent);
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods1.class);
                intent.putExtra("num", 5);
                startActivity(intent);
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods1.class);
                intent.putExtra("num", 4);
                startActivity(intent);
            }
        });
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods0.class);
                intent.putExtra("num", 0);
                startActivity(intent);
            }
        });
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods0.class);
                intent.putExtra("num", 1);
                startActivity(intent);
            }
        });
        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods1.class);
                intent.putExtra("num", 6);
                startActivity(intent);
            }
        });
        m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods1.class);
                intent.putExtra("num", 0);
                startActivity(intent);
            }
        });
        m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods2.class);
                intent.putExtra("num", 4);
                startActivity(intent);
            }
        });

    }
}