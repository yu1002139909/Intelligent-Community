package cn.edu.cqvie.ic.activity;

import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import comb.example.yuyu.myandroid.R;

public class ShangJiaFragment extends Fragment {
    private Banner banner;
    private List<String> list = new ArrayList<>();//设置图片
    private List<Integer> list2 = new ArrayList<>();//设置图片
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_shangjia_activty, container, false);
        return view;
    }
}
