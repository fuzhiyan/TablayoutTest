package fuzhiyan.com.bawie.tablayouttest.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import fuzhiyan.com.bawie.tablayouttest.Frag;

/**
 * Created by Administrator on 2017/5/9.
 * time:
 * author:付智焱
 */

public class MyAdapter extends FragmentPagerAdapter {
    private List<String> list=new ArrayList<>();

    public MyAdapter(FragmentManager fm, List<String> list) {
        super(fm);
        this.list = list;
    }

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Frag frag=new Frag();
        return frag;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
