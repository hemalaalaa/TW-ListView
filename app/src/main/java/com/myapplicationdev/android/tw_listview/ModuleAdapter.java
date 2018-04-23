package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter {
    private ArrayList<Module> code;
    private Context context;
    private TextView tvModuleCode;
    private ImageView ivStar;

    public ModuleAdapter(Context context, int resource, ArrayList<Module> objects) {
        super(context,resource,objects);
        code = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowVIew = inflater.inflate(R.layout.row, parent, false);
        tvModuleCode = (TextView) rowVIew.findViewById(R.id.textView);
        ivStar = (ImageView) rowVIew.findViewById(R.id.imageView);
        Module currentCode = code.get(position);
        tvModuleCode.setText(currentCode.getName());

        if (currentCode.isStar()) {
            ivStar.setImageResource(R.drawable.nonprog);
        } else {
            ivStar.setImageResource(R.drawable.prog);
        }
        return rowVIew;
    }
}
