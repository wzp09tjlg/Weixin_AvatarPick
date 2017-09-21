package com.wuzp.weixin_pickavatar.widget;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.wuzp.weixin_pickavatar.HApplication;
import com.wuzp.weixin_pickavatar.R;

public class Msg {
    private static Msg mMsg;
    private static Toast mToast;

    private Msg(){}

    public static Msg getInstance(){
        if(mMsg == null){
            mMsg = new Msg();
        }
        return mMsg;
    }

    // 系统默认显示位置
    public void show(String text) {
        if (TextUtils.isEmpty(text)) return;
        if(Looper.myLooper() == Looper.getMainLooper()){
            if (mToast == null) {
                LayoutInflater inflate = (LayoutInflater)
                        HApplication.gContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View v = inflate.inflate(R.layout.toast_self_layout,null);
            Animation animation = AnimationUtils.loadAnimation(HApplication.gContext.getApplicationContext(),R.anim.anim_toast);
            v.startAnimation(animation);
                TextView tv = (TextView)v.findViewById(R.id.text_msg);
                tv.setText(text);
                mToast = new Toast(HApplication.gContext);
                mToast.setDuration(Toast.LENGTH_SHORT);
                mToast.setView(v);
            } else {
                mToast.cancel();
                mToast = null;
                LayoutInflater inflate = (LayoutInflater)
                        HApplication.gContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View v = inflate.inflate(R.layout.toast_self_layout,null);
            Animation animation = AnimationUtils.loadAnimation(HApplication.gContext.getApplicationContext(),R.anim.anim_toast);
            v.startAnimation(animation);
                TextView tv = (TextView)v.findViewById(R.id.text_msg);
                tv.setText(text);
                mToast = new Toast(HApplication.gContext);
                mToast.setDuration(Toast.LENGTH_SHORT);
                mToast.setView(v);
            }
            mToast.show();
        }else{
        }
    }

    //置顶方位
    public void show(String text,int gravity){
        if (TextUtils.isEmpty(text)) return;
        if(Looper.myLooper() == Looper.getMainLooper()){
            if (mToast == null) {
                LayoutInflater inflate = (LayoutInflater)
                        HApplication.gContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View v = inflate.inflate(R.layout.toast_self_layout,null);
            Animation animation = AnimationUtils.loadAnimation(HApplication.gContext.getApplicationContext(),R.anim.anim_toast);
            v.startAnimation(animation);
                TextView tv = (TextView)v.findViewById(R.id.text_msg);
                tv.setText(text);
                mToast = new Toast(HApplication.gContext);
                mToast.setGravity(gravity,0,0);
                mToast.setDuration(Toast.LENGTH_SHORT);
                mToast.setView(v);
            } else {
                mToast.cancel();
                mToast = null;
                LayoutInflater inflate = (LayoutInflater)
                        HApplication.gContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View v = inflate.inflate(R.layout.toast_self_layout,null);
            Animation animation = AnimationUtils.loadAnimation(HApplication.gContext.getApplicationContext(),R.anim.anim_toast);
            v.startAnimation(animation);
                TextView tv = (TextView)v.findViewById(R.id.text_msg);
                tv.setText(text);
                mToast = new Toast(HApplication.gContext);
                mToast.setDuration(Toast.LENGTH_SHORT);
                mToast.setGravity(gravity,0,0);
                mToast.setView(v);
            }
            mToast.show();
        }else{
        }
    }

    //指定方位和偏移量
    public void show(String text,int gravity,int x,int y){
        if (TextUtils.isEmpty(text)) return;
        if(Looper.myLooper() == Looper.getMainLooper()){
            if (mToast == null) {
                LayoutInflater inflate = (LayoutInflater)
                        HApplication.gContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View v = inflate.inflate(R.layout.toast_self_layout,null);
            Animation animation = AnimationUtils.loadAnimation(HApplication.gContext.getApplicationContext(),R.anim.anim_toast);
            v.startAnimation(animation);
                TextView tv = (TextView)v.findViewById(R.id.text_msg);
                tv.setText(text);
                mToast = new Toast(HApplication.gContext);
                mToast.setGravity(gravity,x,y);
                mToast.setDuration(Toast.LENGTH_SHORT);
                mToast.setView(v);
            } else {
                mToast.cancel();
                mToast = null;
                LayoutInflater inflate = (LayoutInflater)
                        HApplication.gContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View v = inflate.inflate(R.layout.toast_self_layout,null);
            Animation animation = AnimationUtils.loadAnimation(HApplication.gContext.getApplicationContext(),R.anim.anim_toast);
            v.startAnimation(animation);
                TextView tv = (TextView)v.findViewById(R.id.text_msg);
                tv.setText(text);
                mToast = new Toast(HApplication.gContext);
                mToast.setGravity(gravity,x,y);
                mToast.setDuration(Toast.LENGTH_SHORT);
                mToast.setView(v);
            }
            mToast.show();
        }else{
        }
    }
}
