package comb.example.yuyu.myandroid.activity;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

import comb.example.yuyu.myandroid.R;
import comb.example.yuyu.myandroid.utils.GlideImageLoader;

public class SyFragment extends Fragment {
    private List<String> list  = new ArrayList<String>();
    private List<Integer> list2  = new ArrayList<Integer>();
    private Banner banner;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_activity_sy, container, false);
        banner = (Banner) view.findViewById(R.id.banner);
        initData();
        return view;
    }
    private void initData() {
        list.add("http://203.195.163.251:8080/20170507/0feb9e6ff21e448fbe2aeed2f1a5b732.png");
        list.add("http://203.195.163.251:8080/20170507/cfe03efbc0d140faa89e80754a0d4d46.png");
        list.add("http://192.168.43.109:8080/studentmanage/image/zhiui.jpg");
        list2.add(R.drawable.banner);
        list2.add(R.drawable.zhiui);
        banner.setImageLoader(new GlideImageLoader());
        banner.setIndicatorGravity(BannerConfig.RIGHT);
        banner.setImages(list);
        banner.setDelayTime(3000);
        banner.start();
    }
}
