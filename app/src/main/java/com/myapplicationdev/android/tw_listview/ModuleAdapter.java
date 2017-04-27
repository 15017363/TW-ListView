package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<String> {

    private Context context;
    private ArrayList<String> AL;
    private TextView tvCourse;
    private ImageView ivCourse;

    public ModuleAdapter(Context context, int resource, ArrayList<String> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        food = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }




}
