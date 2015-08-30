package mo.com.phonesafe.preference;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 作者：MoMxMo on 2015/8/30 13:11
 * 邮箱：xxxx@qq.com
 * <p/>
 * 获取一个配置和用户信息的工具类
 */


public class PreferenceUtils {
    private static SharedPreferences mPreferences;

    //设置成单例模式
    private static SharedPreferences getSp(Context context){
        if(mPreferences == null) {
            mPreferences = context.getSharedPreferences("sjws", Context.MODE_PRIVATE);
        }
        return mPreferences;
    }

    /**
     * 设置shared_prefrence的
     *
     * @param context
     * @param key
     * @param value
     * @return
     */
    public static void putBoolean(Context context, String key, boolean value) {
        SharedPreferences sp = getSp(context);
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean(key, value);
        edit.commit();
    }

    /**
     * 获得boolean类型的数据
     *
     * @param context
     * @param key
     * @param deValue
     * @return
     */
    public static boolean getBoolean(Context context, String key, boolean deValue) {
        SharedPreferences sp = getSp(context);
        boolean value = sp.getBoolean(key, deValue);
        return value;

    }

    /**
     * 获得boolean类型的数据,没有时默认值为false
     * @param context
     * @param key
     * @return
     */
    public static boolean getBoolean(Context context, String key) {
        return getBoolean(context,key,false);

    }

    /**
     * 获得String类型的数据,没有时默认值为null
     * @param context
     * @param key
     * @return
     */
    public static String getString(Context context, String key) {
       return   getString(context,key,null);
    }

    /**
     * 获得String类型的数据,没有时默认值为null
     * @param context
     * @param key
     * @return
     */
    public static String getString(Context context, String key,String defValue) {
        SharedPreferences sp = getSp(context);
        String value = sp.getString(key, defValue);
        return value;
    }

}
