package fuzhiyan.com.bawie.tablayouttest;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2017/5/31.
 * time:
 * author:付智焱
 */

public class MyApplection extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(false);
    }
}
