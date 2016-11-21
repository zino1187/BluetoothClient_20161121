package com.sds.study.bluetoothclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DeviceItem extends LinearLayout{
    LayoutInflater inflater;
    Device device;

    public DeviceItem(Context context, Device device) {
        super(context);
        this.device=device;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.device_item, this);
        init(device);
    }

    public void init(Device device){
        TextView txt_name=(TextView)this.findViewById(R.id.txt_name);
        TextView txt_address=(TextView)this.findViewById(R.id.txt_address);

        txt_name.setText(device.getName());
        txt_address.setText(device.getAddress());
    }

}





