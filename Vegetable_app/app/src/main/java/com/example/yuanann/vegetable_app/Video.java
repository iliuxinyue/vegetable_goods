package com.example.yuanann.vegetable_app;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yuanann.vegetable_app.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by Yuanann on 2020-11-6.
 */

public class Video extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.video,container,false);
        return view;
    }
    //创建播放视频的控件对象
    private CustomVideoView videoview;
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        super.onCreate(savedInstanceState);
        //加载视频资源控件
        videoview = (CustomVideoView) getActivity().findViewById(R.id.videoview);
        //设置播放加载路径
        videoview.setVideoURI(Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.myfood1));
        //播放
        videoview.start();
        //循环播放
        videoview.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                videoview.start();
            }
        });
    }

    //返回重启加载
//    @Override
//    public void onRestart() {
//        initView();
//        super.onRestart();
//    }

    @Override
    //防止锁屏或者切出的时候，音乐在播放
    public void onStop() {
        videoview.stopPlayback();
        super.onStop();
    }
}




