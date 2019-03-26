package com.example.kolkoikrzyzyk;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class DeviceListAdapter extends ArrayAdapter<BluetoothDevice> {

    private LayoutInflater mLayoutInflater;
    private ArrayList<BluetoothDevice> mDevices;
    private int  mViewResourceId;

    public DeviceListAdapter(Context context, int tvResourceId, ArrayList<BluetoothDevice> devices){
        super(context, tvResourceId,devices);
        this.mDevices = devices;
        mLayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = tvResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mLayoutInflater.inflate(mViewResourceId, null);

        BluetoothDevice device = mDevices.get(position);
        BluetoothDevice device2 = mDevices.get(position);
        if (device != null) {
            TextView deviceName = (TextView) convertView.findViewById(R.id.tvDeviceName);
            TextView deviceAdress = (TextView) convertView.findViewById(R.id.tvDeviceAddress);
            TextView deviceName2 = (TextView) convertView.findViewById(R.id.tvDeviceName2);
            TextView deviceAdress2 = (TextView) convertView.findViewById(R.id.tvDeviceAddress2);

            if (deviceName != null) {
                deviceName.setText(device.getName());
            }
            if (deviceAdress != null) {
                deviceAdress.setText(device.getAddress());
            }
            if (deviceName2 != null) {
               deviceName2.setText(device2.getName());
            }
            if (deviceAdress2 != null) {
               deviceAdress2.setText(device2.getAddress());
            }
        }

        return convertView;
    }

}