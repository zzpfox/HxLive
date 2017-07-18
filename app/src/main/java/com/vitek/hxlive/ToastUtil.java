package com.vitek.hxlive;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * 土司通知工具类
 * Created by javakam on 2016/7/5.
 */
public class ToastUtil {
    private static Toast toast;

    /**
     * context 使用 getApplicationContext() 作为上下文，防止内存泄漏
     *
     * @param context
     * @param text
     */
    public static void shortToast(Context context, String text) {
        if (TextUtils.isEmpty(text)) {
            return;
        }
        if (toast == null) {
            toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        } else {
            toast.setText(text);
        }
        toast.show();
    }

    /**
     * context 使用 getApplicationContext() 作为上下文，防止内存泄漏
     *
     * @param context
     * @param text
     */
    public static void longToast(Context context, String text) {
        if (TextUtils.isEmpty(text)) {
            return;
        }
        if (toast == null) {
            toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        } else {
            toast.setText(text);
        }
        toast.show();
    }

}
