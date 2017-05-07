package comb.example.yuyu.myandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by yuyu on 2017/5/6.
 */
public class Demo  extends AppCompatActivity{
    private Banner banner;
    private ViewPager viewPager;
    private List<View> viewList = new ArrayList<View>();
    private View viewShouye,viewshangjia,viewlinli,viewhome;
    private List<String> list  = new ArrayList<String>();
    private List<Integer> list2  = new ArrayList<Integer>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        banner =  (Banner)findViewById(R.id.banner);
        LayoutInflater inflater = getLayoutInflater();
        viewShouye = inflater.inflate(R.layout.activity_activity_sy,null);
        viewshangjia = inflater.inflate(R.layout.activity_shangjia_activty,null);
        viewlinli = inflater.inflate(R.layout.activity_activity_linli,null);
        viewhome = inflater.inflate(R.layout.activity_home,null);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        viewList.add(viewShouye);
        viewList.add(viewshangjia);
        viewList.add(viewlinli);
        viewList.add(viewhome);
        PagerAdapter pagerAdapter = new PagerAdapter() {
            @Override
            //滑动个数
            public int getCount() {
                return viewList.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }
            //从当期container中删除指定位置（passion）的view
            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
               container.removeView(viewList.get(position));
            }
            //第一：将当前视图添加到container中，第二：返回当前view
            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                container.addView(viewList.get(position));
                return viewList.get(position);
            }
        };
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        initData();
        iniView();
     }

    private void iniView() {
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
