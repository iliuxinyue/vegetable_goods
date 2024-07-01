package com.example.yuanann.vegetable_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static android.content.Context.MODE_PRIVATE;


public class Mine extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_mine,container,false);
        return view;
    }
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        super.onCreate(savedInstanceState);
        TextView myyhq=(TextView)getActivity().findViewById(R.id.myyhq);
        TextView myjf=(TextView)getActivity().findViewById(R.id.myjf);
        ImageView lqjf=(ImageView) getActivity().findViewById(R.id.lqjf);
        TextView a1=(TextView)getActivity().findViewById(R.id.a1);
        TextView a2=(TextView)getActivity().findViewById(R.id.a2);
        TextView a3=(TextView)getActivity().findViewById(R.id.a3);
        TextView a4=(TextView)getActivity().findViewById(R.id.a4);
        TextView a5=(TextView)getActivity().findViewById(R.id.a5);
        TextView name=(TextView) getActivity().findViewById(R.id.name);
        SharedPreferences sp =  getActivity().getSharedPreferences("name", MODE_PRIVATE);
        String b = "欢迎您，"+sp.getString("name", null);
        name.setText(b);
        SharedPreferences sp1 =  getActivity().getSharedPreferences("allyhq", MODE_PRIVATE);
        int num =sp1.getInt("yhq", 0);
        String yhqnum=num+"";
        myyhq.setText(yhqnum);
//        SharedPreferences sp2 =  getActivity().getSharedPreferences("alljf", MODE_PRIVATE);
//        int num2 =sp2.getInt("jf", 0);
//        String yhqnum2=num2+"";
//        myjf.setText(yhqnum2);

        Handler handler = new Handler() {
            public void handleMessage(android.os.Message msg) {
                if (msg.what == 0&&isAdded()) {
                    SharedPreferences sp2 = getActivity().getSharedPreferences("alljf", MODE_PRIVATE);
                    int num2 = sp2.getInt("jf", 0);
                    String yhqnum2 = num2 + "";
                    myjf.setText(yhqnum2);
                }
                }
            };

            new Thread(new Runnable() {

                @Override
                public void run() {
                    while (true) {
                        handler.sendEmptyMessage(0);

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();

       a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Order.class);
                startActivity(intent);
            }
        });
        lqjf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                            SharedPreferences sp1 =  getActivity().getSharedPreferences("alljf", MODE_PRIVATE);
                            int myjf= sp1.getInt("jf", 0);
                            SharedPreferences sp2 =  getActivity().getSharedPreferences("alljf", MODE_PRIVATE);
                            SharedPreferences.Editor editor = sp2.edit();
                            int myjf1=myjf+5;
                            editor.putInt("jf", myjf1);
                            editor.commit();
                            Toast.makeText(getActivity(), "成功领取5积分", Toast.LENGTH_SHORT).show();
            }
        });

        }
    }

