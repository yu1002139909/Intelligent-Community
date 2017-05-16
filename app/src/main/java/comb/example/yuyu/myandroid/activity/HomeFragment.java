package comb.example.yuyu.myandroid.activity;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.transition.Fade;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import comb.example.yuyu.myandroid.R;

public class HomeFragment extends Fragment {
    private ListView listView;//列表
    private SimpleAdapter simpleAdapter;//适配器
    private List<Map<String,Object>> dataList;//列表数据集合
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home, container, false);
        listView  = (ListView)view.findViewById(R.id.lsit_view);
        dataList = new ArrayList<>();
        //设置适配器
        simpleAdapter = new SimpleAdapter( getActivity(),getData(),R.layout.itmllist,new String[]{"pic","name","pic2"}, new int[]{R.id.pic,R.id.name,R.id.pic2});
        listView.setAdapter(simpleAdapter);
        return view;
    }
    public List<? extends Map<String,Object>> getData() {
        int[] img_arr = {R.drawable.document,R.drawable.shop,R.drawable.huodong,R.drawable.location,R.drawable.setting_alt,R.drawable.user_plus,R.drawable.news};
        String [] name_txt = {"我的帖子","商品","活动","收货地址","社区设置","邀请邻里","我的帖子"};
        int[] img_arr2 = {R.drawable.homerigth,R.drawable.homerigth,R.drawable.homerigth,R.drawable.homerigth,R.drawable.homerigth,R.drawable.homerigth,R.drawable.homerigth};
        for(int i = 0; i < 7; i ++)
        {
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("pic", img_arr[i]);
            map.put("name", name_txt[i]);
            map.put("pic2", img_arr2[i]);
            dataList.add(map);
        }
        return dataList;
    }
}
