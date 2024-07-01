package com.example.yuanann.vegetable_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yuanann.vegetable_app.cart.CartGoods;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import pl.droidsonroids.gif.GifImageView;

import static android.content.Context.MODE_PRIVATE;


public class Index extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_index, container, false);
        return view;
    }

//    private Handler handler ;
    private int[] imagearr = { R.drawable.a1, R.drawable.a4,
            R.drawable.a5, R.drawable.a6, R.drawable.a7};
    private int count = 0;
//    private ImageView imageview;
    private LinearLayout ba;
    Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if (msg.what == 0&&isAdded()) {
//                imageview.setImageResource(imagearr[count++]);
//                ba.setBackgroundResource(imagearr[count++]);

                Drawable drawable = getResources().getDrawable(imagearr[count++]);
                View temp =getActivity().findViewById(R.id.ba);
                temp.setBackgroundDrawable(drawable);
                if (count >= imagearr.length) {
                    count = 0;
                }
            }
        };
    };

    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        super.onCreate(savedInstanceState);
//        imageview = (ImageView) this.getActivity().findViewById(R.id.imageview);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    handler.sendEmptyMessage(0);

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


        final TextView x1,x2,x3,x4,x5,x6,x7,x8,x9,x10;
        final ImageView t1,t2,t3,t4,t5,t6,tj1,tj2,zc1,zc2,zc3,zc4;
        final Button cd,cq,xa,sh;
        final LinearLayout ba;
        final EditText searchbutton;
        final GifImageView yhq;
        x1= (TextView) getActivity().findViewById(R.id.x1);
        x2= (TextView) getActivity().findViewById(R.id.x2);
        x3= (TextView) getActivity().findViewById(R.id.x3);
        x4= (TextView) getActivity().findViewById(R.id.x4);
        x5= (TextView) getActivity().findViewById(R.id.x5);
        x6= (TextView) getActivity().findViewById(R.id.x6);
        x7= (TextView) getActivity().findViewById(R.id.x7);
        x8= (TextView) getActivity().findViewById(R.id.x8);
        x9= (TextView) getActivity().findViewById(R.id.x9);
        x10= (TextView) getActivity().findViewById(R.id.x10);
        yhq= (GifImageView) getActivity().findViewById(R.id.yhq);
        searchbutton= (EditText) getActivity().findViewById(R.id.searchbutton);
        t1 = getActivity().findViewById(R.id.t1);
        t2 = getActivity().findViewById(R.id.t2);
        t3 = getActivity().findViewById(R.id.t3);
        t4 = getActivity().findViewById(R.id.t4);
        t5 = getActivity().findViewById(R.id.t5);
        t6 = getActivity().findViewById(R.id.t6);
        tj1 = getActivity().findViewById(R.id.tj1);
        tj2 = getActivity().findViewById(R.id.tj2);
        zc1 = getActivity().findViewById(R.id.zc1);
        zc2 = getActivity().findViewById(R.id.zc2);
        zc3 = getActivity().findViewById(R.id.zc3);
        zc4 = getActivity().findViewById(R.id.zc4);
        cd = getActivity().findViewById(R.id.cd);
        cq = getActivity().findViewById(R.id.cq);
        xa = getActivity().findViewById(R.id.xa);
        sh = getActivity().findViewById(R.id.sh);

        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Search.class);
                String a = searchbutton.getText().toString();
                intent.putExtra("search",a);
                startActivity(intent);
            }
        });
        yhq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDialog2 myDialog = new MyDialog2(getActivity(), R.style.MyDialog);
                myDialog.setTitle("消息")
                        .setMessage("您确定要签到吗?")
                        .setCancel("取消", dialog -> dialog.dismiss())
                        .setConfirm("签到", dialog -> {
                            SharedPreferences sp =  getActivity().getSharedPreferences("name", MODE_PRIVATE);
                            String b = sp.getString("name", null);
                            SharedPreferences sp1 =  getActivity().getSharedPreferences("allyhq", MODE_PRIVATE);
                            int pd= sp1.getInt("yhq", 0);
                            SharedPreferences sp2 =  getActivity().getSharedPreferences("allyhq", MODE_PRIVATE);
                            SharedPreferences.Editor editor = sp2.edit();
                            int pd1=pd+1;
                            editor.putInt("yhq", pd1);
                            editor.commit();
                            Toast.makeText(getActivity(), "您成功领取一张优惠券", Toast.LENGTH_SHORT).show();
                            dialog.dismiss();

                        })
                        .show();
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods.class);
                intent.putExtra("num",0);
                startActivity(intent);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods.class);
                intent.putExtra("num",1);
                startActivity(intent);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods.class);
                intent.putExtra("num",2);
                startActivity(intent);
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods.class);
                intent.putExtra("num",3);
                startActivity(intent);
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods.class);
                intent.putExtra("num",4);
                startActivity(intent);
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Mygoods.class);
                intent.putExtra("num",5);
                startActivity(intent);
            }
        });



        Fragment banner = new A1();
        //实例化管理器
        FragmentManager fragmentManager1 = getFragmentManager();
        //定义事务
        FragmentTransaction fta1 = fragmentManager1.beginTransaction();
        //添加fragment
        fta1.add(R.id.fag4, banner);
        //提交事务`
        fta1.commit();

        Fragment c1 = new Index_b1();
        //实例化管理器
        FragmentManager fragmentManager = getFragmentManager();
        //定义事务
        FragmentTransaction fta = fragmentManager.beginTransaction();
        //添加fragment
        fta.add(R.id.fag3, c1);
        //提交事务`
        fta.commit();
//        cd.setBackgroundResource(R.drawable.clr_pressed);
//        cq.setBackgroundResource(R.drawable.clr_normal);
//        xa.setBackgroundResource(R.drawable.clr_normal);
//        sh.setBackgroundResource(R.drawable.clr_normal);
        cd.setTextColor(Color.parseColor("#5bad56"));
        cq.setTextColor(Color.parseColor("#4f5555"));
        xa.setTextColor(Color.parseColor("#4f5555"));
        sh.setTextColor(Color.parseColor("#4f5555"));


        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment c1 = new Index_b1();
                //实例化管理器
                FragmentManager fragmentManager = getFragmentManager();
                //定义事务
                FragmentTransaction fta = fragmentManager.beginTransaction();
                //添加fragment
                fta.replace(R.id.fag3, c1);
                //提交事务`
                fta.commit();
                cd.setTextColor(Color.parseColor("#5bad56"));
                cq.setTextColor(Color.parseColor("#4f5555"));
                xa.setTextColor(Color.parseColor("#4f5555"));
                sh.setTextColor(Color.parseColor("#4f5555"));

            }
        });

        cq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment c2 = new Index_b2();
                //实例化管理器
                FragmentManager fragmentManager = getFragmentManager();
                //定义事务
                FragmentTransaction fta = fragmentManager.beginTransaction();
                //添加fragment
                fta.replace(R.id.fag3, c2);
                //提交事务`
                fta.commit();
                cq.setTextColor(Color.parseColor("#5bad56"));
                cd.setTextColor(Color.parseColor("#4f5555"));
                xa.setTextColor(Color.parseColor("#4f5555"));
                sh.setTextColor(Color.parseColor("#4f5555"));
            }
        });
        xa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment c3 = new Index_b2();
                //实例化管理器
                FragmentManager fragmentManager = getFragmentManager();
                //定义事务
                FragmentTransaction fta = fragmentManager.beginTransaction();
                //添加fragment
                fta.replace(R.id.fag3, c3);
                //提交事务`
                fta.commit();
                xa.setTextColor(Color.parseColor("#5bad56"));
                cd.setTextColor(Color.parseColor("#4f5555"));
                cq.setTextColor(Color.parseColor("#4f5555"));
                sh.setTextColor(Color.parseColor("#4f5555"));

            }
        });
        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //实例化fragment
                Fragment c4 = new Index_b2();
                //实例化管理器
                FragmentManager fragmentManager = getFragmentManager();
                //定义事务
                FragmentTransaction fta = fragmentManager.beginTransaction();
                //添加fragment
                fta.replace(R.id.fag3, c4);
                //提交事务`
                fta.commit();
                sh.setTextColor(Color.parseColor("#5bad56"));
                cq.setTextColor(Color.parseColor("#4f5555"));
                cd.setTextColor(Color.parseColor("#4f5555"));
                xa.setTextColor(Color.parseColor("#4f5555"));

            }
        });

        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setClass(getActivity(), Index_a1.class);
//                intent.putExtra("count", 0);
//                startActivity(intent);
                //实例化fragment
                Fragment five=new Type();
                //实例化管理器
                FragmentManager fm=getFragmentManager();
                //定义事务
                FragmentTransaction ft=fm.beginTransaction();
                //将当前的fragment替换为第二个
                ft.replace(R.id.fag1,five);
                //提交事务
                ft.commit();
                


            }
        });

        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Index_a1.class);
                intent.putExtra("count", 0);
                startActivity(intent);
            }
        });

        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Index_a1.class);
                intent.putExtra("count", 0);
                startActivity(intent);
            }
        });

        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Index_a1.class);
                intent.putExtra("count", 0);
                startActivity(intent);
            }
        });

        x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Index_a1.class);
                intent.putExtra("count", 0);
                startActivity(intent);
            }
        });

        x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Index_a1.class);
                intent.putExtra("count", 0);
                startActivity(intent);
            }
        });

        x6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Index_a1.class);
                intent.putExtra("count", 0);
                startActivity(intent);
            }
        });

        x7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Index_a1.class);
                intent.putExtra("count", 0);
                startActivity(intent);
            }
        });

        x7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Index_a1.class);
                intent.putExtra("count", 0);
                startActivity(intent);
            }
        });

        x8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Index_a1.class);
                intent.putExtra("count", 0);
                startActivity(intent);
            }
        });

        x9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Index_a1.class);
                intent.putExtra("count", 0);
                startActivity(intent);
            }
        });

        x10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Index_a1.class);
                intent.putExtra("count", 0);
                startActivity(intent);
            }
        });





    }
}

