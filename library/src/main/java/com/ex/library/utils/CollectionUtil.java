package com.ex.library.utils;

import android.content.Context;

import java.text.DecimalFormat;
import java.util.Collection;

/**
 * @author jianghuizhong
 * @desc $desc$
 * @time 2018/11/5.
 */

public class CollectionUtil {
    /**
     * 判断集合是否为空
     *
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<? extends Object> collection) {
        boolean isEmpty = true;
        if (collection != null && !collection.isEmpty()) {
            isEmpty = false;
        }
        return isEmpty;
    }

    /**
     * double ==> string 保留一位小数
     *
     * @param value
     * @return
     */
    public static String decimalValueOfOne(double value) {
        DecimalFormat df = new DecimalFormat("0.0");
        return df.format(value);
    }
    /**
     * double ==> string 保留兩位小数
     *
     * @param value
     * @return
     */
    public static String decimalValueOf(double value) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(value);
    }

    /**
     * 去掉小数点
     * @param value
     * @return
     */
    public static String decimalValueOfNo(double value) {
        DecimalFormat df = new DecimalFormat("0");
        return df.format(value);
    }
    //将像素转换为px
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    //将px转换为dp
    public static int px2dp(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    // 两次点击按钮之间的点击间隔不能少于1000毫秒
    private static final int MIN_CLICK_DELAY_TIME = 1000;
    private static long lastClickTime;

    public static boolean isFastClick() {
        boolean flag = false;
        long curClickTime = System.currentTimeMillis();
        if ((curClickTime - lastClickTime) <= MIN_CLICK_DELAY_TIME) {
            flag = true;
        }
        lastClickTime = curClickTime;
        return flag;
    }
}
