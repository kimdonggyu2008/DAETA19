package com.example.daeta19;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class NoticeAdapter extends BaseAdapter {
    private List<NoticeClass> item;

    public NoticeAdapter(List<NoticeClass> item) {
        this.item = item;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int position) {
        return item.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_notice, parent, false);
        TextView notice_Text = convertView.findViewById(R.id.txt_notice);
        TextView date_Text = convertView.findViewById(R.id.txt_date);
        NoticeClass n = item.get(position);
        notice_Text.setText(n.getNotice());
        date_Text.setText(n.getDate());

        return convertView;
    }
}