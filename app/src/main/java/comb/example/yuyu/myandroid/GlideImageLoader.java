package comb.example.yuyu.myandroid;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by yuyu on 2017/3/18.
 */
public class GlideImageLoader extends ImageLoader {
    public void displayImage(Context context, Object path, ImageView imageView) {
        //Glide 加载图片用法
        Glide.with(context).load(path).into(imageView);
    }
}