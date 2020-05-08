package com.ex.library.utils;

import android.content.Context;
import android.content.SharedPreferences;

/*
 *
 */
public class SharedPreferencesUtils {

    /**
     * 指定xml名称的String存储
     *
     * @param context 存储的上下文
     * @param name    xml名称
     * @param key     存储的key
     * @param value   存储的值
     */
    public static void writeXmlString(Context context, String name, String key, String value) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        SharedPreferences.Editor mSettinsEd = mSettinsSP.edit();
        mSettinsEd.putString(key, value);
        mSettinsEd.commit();
    }

    /**
     * 指定xml名称的String读取
     *
     * @param context 存储的上下文
     * @param name    xml名称
     * @param key     存储的key
     * @return
     */
    public static String readXmlString(Context context, String name, String key) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        SharedPreferences.Editor mSettinsEd = mSettinsSP.edit();
        return mSettinsSP.getString(key, "");
    }


    /**
     * 指定xml名称的String读取
     *
     * @param context 存储的上下文
     * @param name    xml名称
     * @param key     存储的key
     * @return
     */
    public static String readXmlStringIsNull(Context context, String name, String key, String defaulUrl) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        SharedPreferences.Editor mSettinsEd = mSettinsSP.edit();
        return mSettinsSP.getString(key, defaulUrl);
    }


    /**
     * 不指定xml名称的String存储
     *
     * @param context 存储的上下文
     * @param key     存储的key
     * @param value   存储的值
     */
    public static void writeXmlString(Context context, String key, String value) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor mSettinsEd = mSettinsSP.edit();
        mSettinsEd.putString(key, value);
        mSettinsEd.commit();
    }

    /**
     * 不指定xml名称的String读取
     *
     * @param context 存储的上下文
     * @param key     存储的key
     * @return
     */
    public static String readXmlString(Context context, String key) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        return mSettinsSP.getString(key, "");
    }


    /**
     * @param context 存储的上下文
     * @param name    xml名称
     * @param key     存储的key
     * @param value   存储的值
     */
    public static void writeXmlInt(Context context, String name, String key, int value) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        SharedPreferences.Editor mSettinsEd = mSettinsSP.edit();
        mSettinsEd.putInt(key, value);
        mSettinsEd.commit();
    }

    /**
     * @param context
     * @param name    xml名称
     * @param key
     * @return
     */
    public static int readXmlInt(Context context, String name, String key) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(name, Context.MODE_PRIVATE);

        return mSettinsSP.getInt(key, 0);
    }

    /**
     * @param context
     * @param key
     * @param value
     */
    public static void writeXmlInt(Context context, String key, int value) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor mSettinsEd = mSettinsSP.edit();
        mSettinsEd.putInt(key, value);
        mSettinsEd.commit();
    }

    /**
     * @param context
     * @param key
     * @return
     */
    public static int readXmlInt(Context context, String key) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);

        return mSettinsSP.getInt(key, 0);
    }


    /**
     * @param context
     * @param name    xml名称
     * @param key
     * @param value
     */
    public static void writeXmlBoolean(Context context, String name, String key, Boolean value) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        SharedPreferences.Editor mSettinsEd = mSettinsSP.edit();
        mSettinsEd.putBoolean(key, value);
        mSettinsEd.commit();
    }

    /**
     * @param context
     * @param name    xml名称
     * @param key
     * @return
     */
    public static Boolean readXmlBoolean(Context context, String name, String key) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        return mSettinsSP.getBoolean(key, false);
    }


    /**
     * @param context
     * @param key
     * @param value
     */
    public static void writeXmlBoolean(Context context, String key, Boolean value) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        SharedPreferences.Editor mSettinsEd = mSettinsSP.edit();
        mSettinsEd.putBoolean(key, value);
        mSettinsEd.commit();
    }

    /**
     * @param context
     * @param key
     * @return
     */
    public static Boolean readXmlBoolean(Context context, String key) {
        SharedPreferences mSettinsSP = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
        return mSettinsSP.getBoolean(key, false);
    }
    public static void clear(Context context, String key) {
        SharedPreferences preferences = context.getSharedPreferences(key, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.commit();
    }

}
