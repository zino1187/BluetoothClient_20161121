package com.sds.study.bluetoothclient;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter{
    Context context;
    ArrayList<Device> list =new ArrayList<Device>();

    public ListAdapter(Context context) {
        this.context=context;
    }

    public int getCount() {
        return list.size();
    }
    public Object getItem(int i) {
        return list.get(i);
    }
    public long getItemId(int i) {
        return 0;
    }
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view=null;
        Device dto =list.get(i);

        if(convertView !=null) {
            /*이미 채원진 아이템이 있는 경우*/
            view=convertView;
            ((DeviceItem)view).init(dto);
        }else {
            /*아무것도 채워지지 않은 경우*/
            view=new DeviceItem(context ,dto);
        }
        return view;
    }
}
