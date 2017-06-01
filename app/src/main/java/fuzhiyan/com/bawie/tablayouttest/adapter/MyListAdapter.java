package fuzhiyan.com.bawie.tablayouttest.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.xutils.x;

import java.util.List;

import fuzhiyan.com.bawie.tablayouttest.MyBean;
import fuzhiyan.com.bawie.tablayouttest.R;

/**
 * Created by Administrator on 2017/5/31.
 * time:
 * author:付智焱
 */

public class MyListAdapter extends BaseAdapter {
    private Context context;
    private List<MyBean.DataBean.ComicsBean> list;

    public MyListAdapter(Context context, List<MyBean.DataBean.ComicsBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    class ViewHolder{
        private TextView textView1,textView2;
        private ImageView imageView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if(convertView==null){
            vh=new ViewHolder();
            convertView=View.inflate(context, R.layout.list_item,null);
            vh.textView1= (TextView) convertView.findViewById(R.id.itme_text1);
            vh.textView2= (TextView) convertView.findViewById(R.id.item_text3);
            vh.imageView= (ImageView) convertView.findViewById(R.id.item_image);
            convertView.setTag(vh);
        }else{
            vh= (ViewHolder) convertView.getTag();
        }
        vh.textView1.setText(list.get(position).getLabel_text());
        vh.textView2.setText(list.get(position).getTitle());
        x.image().bind(vh.imageView,list.get(position).getTopic().getCover_image_url());
        return convertView;
    }
}
