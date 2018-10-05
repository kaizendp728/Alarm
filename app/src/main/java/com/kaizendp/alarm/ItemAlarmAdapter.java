package com.kaizendp.alarm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Switch;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ItemAlarmAdapter extends BaseAdapter {
    Context context;
    ArrayList<Alarm> alarmArrayList;

    public ItemAlarmAdapter(Context context, ArrayList<Alarm> alarmArrayList) {
        this.context = context;
        this.alarmArrayList = alarmArrayList;
    }

    @Override
    public int getCount() {
        return alarmArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return alarmArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder{
        private TextView txtTime, txtRepeat;
        private Switch swOnOff;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_alarm_listview, null);
            viewHolder.txtTime = convertView.findViewById(R.id.txtTimeView);
            viewHolder.txtRepeat = convertView.findViewById(R.id.txtRepeat);
            viewHolder.swOnOff = convertView.findViewById(R.id.swOnOff);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
        viewHolder.txtTime.setText(simpleDateFormat.format(alarmArrayList.get(position).getDateTimeAlarm()));
        viewHolder.txtRepeat.setText("Chỉ lặp lại  một lần");
        viewHolder.swOnOff.setChecked(true);
        return convertView;
    }
}
