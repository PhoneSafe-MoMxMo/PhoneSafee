package mo.com.phonesafe.bean;

import android.graphics.drawable.Drawable;

/**
 * 作者：MoMxMo on 2015/9/14 18:39
 * 邮箱：xxxx@qq.com
 *
 *
 * 缓存的javaBean数据
 */


public class CacheBean {

    public Drawable icon;
    public String name;
    public String packageName;
    public long cachesize;

    @Override
    public String toString() {
        return "CacheBean{" +
                "icon=" + icon +
                ", name='" + name + '\'' +
                ", packageName='" + packageName + '\'' +
                ", cachesize=" + cachesize +
                '}';
    }
}
