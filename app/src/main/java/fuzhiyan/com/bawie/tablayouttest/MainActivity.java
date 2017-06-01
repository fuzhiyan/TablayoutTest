package fuzhiyan.com.bawie.tablayouttest;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import fuzhiyan.com.bawie.tablayouttest.adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager vp;
    private TabLayout tab;
    private List<String> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab= (TabLayout) findViewById(R.id.tab);
        vp= (ViewPager) findViewById(R.id.vp);
        list.add("周二");
        list.add("周三");
        list.add("周四");
        list.add("周五");
        list.add("周六");
        list.add("昨天");
        list.add("今天");
        MyAdapter my=new MyAdapter(getSupportFragmentManager(),list);
        vp.setAdapter(my);
        tab.setupWithViewPager(vp);
        vp.setCurrentItem(6);
    }
}
