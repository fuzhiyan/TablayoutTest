package fuzhiyan.com.bawie.tablayouttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xlistview.XListView;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import fuzhiyan.com.bawie.tablayouttest.adapter.MyListAdapter;
import fuzhiyan.com.bawie.tablayouttest.utils.Url;

/**
 * Created by Administrator on 2017/5/9.
 * time:
 * author:付智焱
 */

public class Frag extends Fragment {
    private XListView listView;
    private List<MyBean.DataBean.ComicsBean> list=new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initview();
        return  inflater.inflate(R.layout.fragment,container,false);
    }

    private void initview() {
        listView= (XListView) getActivity().findViewById(R.id.xlv);
        RequestParams params=new RequestParams(Url.url);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Gson gson=new Gson();
                MyBean bean=gson.fromJson(result,MyBean.class);
                list=bean.getData().getComics();
                listView.setAdapter(new MyListAdapter(getActivity(),list));
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

    }
}
