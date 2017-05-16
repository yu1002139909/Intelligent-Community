package comb.example.yuyu.myandroid.activity;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

import comb.example.yuyu.myandroid.R;
import comb.example.yuyu.myandroid.utils.GlideImageLoader;
import comb.example.yuyu.myandroid.utils.MyFragemntAdpter;

/**
 * Created by yuyu on 2017/5/6.
 */
public class MainAcivity extends AppCompatActivity{
    private Banner banner;
    private ViewPager viewPager;
    private List<Fragment> fragmentList = new ArrayList<>();
    private Fragment homeFragment,linFragment,shangjiaFragment,syFragment;
    private List<String> list  = new ArrayList<String>();
    private List<Integer> list2  = new ArrayList<Integer>();
    //初始化Fragment管理对象
    private FragmentManager fm;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        fragmentList.add(new SyFragment());
        fragmentList.add(new ShangJiaFragment());
        fragmentList.add(new LinliFragment());
        fragmentList.add(new HomeFragment());
        fm = getSupportFragmentManager();
        MyFragemntAdpter myFragemntAdpter = new MyFragemntAdpter(fm,fragmentList);

        viewPager.setAdapter(myFragemntAdpter);
        viewPager.setCurrentItem(0);
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
     }
}
