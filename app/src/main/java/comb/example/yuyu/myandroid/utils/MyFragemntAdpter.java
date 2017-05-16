package comb.example.yuyu.myandroid.utils;

import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;

import android.support.v4.app.Fragment;   //注意打包是用support.v4的
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
/**
 * Created by yuyu on 2017/5/14.
 */
public class MyFragemntAdpter extends FragmentPagerAdapter{
    private FragmentManager fragmetnmanager;  //创建FragmentManager
    private List<Fragment> listfragment; //创建一个List<Fragment>
    public MyFragemntAdpter(FragmentManager fm,List<Fragment> list) {
        super(fm);
        this.fragmetnmanager=fm;
        this.listfragment=list;
    }

    @Override
    public Fragment getItem(int arg0) {
        // TODO Auto-generated method stub
        return listfragment.get(arg0); //返回第几个fragment
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return listfragment.size(); //总共有多少个fragment
    }

}
