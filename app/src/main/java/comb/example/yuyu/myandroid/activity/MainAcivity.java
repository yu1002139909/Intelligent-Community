package comb.example.yuyu.myandroid.activity;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

import comb.example.yuyu.myandroid.R;
import comb.example.yuyu.myandroid.utils.GlideImageLoader;
import comb.example.yuyu.myandroid.utils.MyFragemntAdpter;

/**
 * 描述：首页框架
 * 作者：
 * 时间：
 */
public class MainAcivity extends AppCompatActivity implements View.OnClickListener {

    private Banner banner;
    private ViewPager viewPager;
    private List<Fragment> fragmentList = new ArrayList<>();
    private Fragment homeFragment,linFragment,shangjiaFragment,syFragment;
    private List<String> list  = new ArrayList<String>();
    private List<Integer> list2  = new ArrayList<Integer>();
    //初始化Fragment管理对象
    private FragmentManager fm;

    private LinearLayout lyShouye;
    private LinearLayout lyShangjia;
    private LinearLayout lyLinli;
    private LinearLayout lyMe;

    private ImageView ivShouye;
    private ImageView ivShangjia;
    private ImageView ivLinli;
    private ImageView ivMe;

    private TextView tvShouye;
    private TextView tvShangjia;
    private TextView tvLinli;
    private TextView tvMe;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        initView();
        initEvent();
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        fragmentList.add(new SyFragment());
        fragmentList.add(new ShangJiaFragment());
        fragmentList.add(new LinliFragment());
        fragmentList.add(new HomeFragment());
        fm = getSupportFragmentManager();
        MyFragemntAdpter myFragemntAdpter = new MyFragemntAdpter(fm,fragmentList);

        viewPager.setAdapter(myFragemntAdpter);
        viewPager.setCurrentItem(0);
        selectBtn(0);

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

    private void initEvent() {
        ivShouye.setOnClickListener(this);
        ivShangjia.setOnClickListener(this);
        ivLinli.setOnClickListener(this);
        ivMe.setOnClickListener(this);

    }


    private void initView() {
        lyShouye = (LinearLayout)findViewById(R.id.ly_shouye);
        lyShangjia = (LinearLayout)findViewById(R.id.ly_shangjia);
        lyLinli = (LinearLayout)findViewById(R.id.ly_linli);
        lyMe = (LinearLayout)findViewById(R.id.ly_me);

        ivShouye = (ImageView)findViewById(R.id.iv_shouye);
        ivShangjia = (ImageView)findViewById(R.id.iv_shangjia);
        ivLinli = (ImageView)findViewById(R.id.iv_linli);
        ivMe = (ImageView)findViewById(R.id.iv_me);

        tvShouye = (TextView) findViewById(R.id.tv_shouye);
        tvShangjia = (TextView) findViewById(R.id.tv_shangjia);
        tvLinli = (TextView) findViewById(R.id.tv_lingli);
        tvMe = (TextView) findViewById(R.id.tv_me);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.iv_shouye:
                initBtn();
                selectBtn(0);
                viewPager.setCurrentItem(0);
                break;
            case R.id.iv_shangjia:
                initBtn();
                selectBtn(1);
                viewPager.setCurrentItem(1);
                break;
            case R.id.iv_linli:
                initBtn();
                selectBtn(2);
                viewPager.setCurrentItem(2);
                break;
            case R.id.iv_me:
                initBtn();
                selectBtn(3);
                viewPager.setCurrentItem(3);
                break;
        }
    }

    private void initBtn() {
        ivShouye.setImageResource(R.drawable.main_home);
        ivShangjia.setImageResource(R.drawable.main_seller);
        ivLinli.setImageResource(R.drawable.main_friend);
        ivMe.setImageResource(R.drawable.main_personal);

        tvShouye.setTextColor(getResources().getColor(R.color.main_btn));
        tvShangjia.setTextColor(getResources().getColor(R.color.main_btn));
        tvLinli.setTextColor(getResources().getColor(R.color.main_btn));
        tvMe.setTextColor(getResources().getColor(R.color.main_btn));

    }

    private void selectBtn(int i) {
        switch (i) {
            case 0:
                ivShouye.setImageResource(R.drawable.main_home_select);
                tvShouye.setTextColor(getResources().getColor(R.color.main_btn_select));
                break;
            case 1:
                ivShangjia.setImageResource(R.drawable.main_seller_select);
                tvShangjia.setTextColor(getResources().getColor(R.color.main_btn_select));
                break;
            case 2:
                ivLinli.setImageResource(R.drawable.main_friend_select);
                tvLinli.setTextColor(getResources().getColor(R.color.main_btn_select));
                break;
            case 3:
                ivMe.setImageResource(R.drawable.main_personal_select);
                tvMe.setTextColor(getResources().getColor(R.color.main_btn_select));
                break;
        }
    }
}
