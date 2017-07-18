package com.vitek.hxlive;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by javakam on 2017/7/18 0018.
 */
public class PreferencesUtil {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Context context;

    public PreferencesUtil(Context context) {
        this.context = context;
    }

    public PreferencesUtil(Context context, String name) {
        this.context = context;
        this.sharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        this.editor = sharedPreferences.edit();
    }

    public void putInt(String key, int value) {
        editor.putInt(key, value);
        editor.commit();
    }

    public int getInt(String key) {
        return getInt(key, 0);
    }

    public int getInt(String key, int value) {
        return sharedPreferences.getInt(key, value);
    }

    public void deleteInt(String key) {
        editor.remove(key);
        editor.commit();
    }
}
