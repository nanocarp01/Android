package com.example.app_horarios_ver_2.Adapters;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.app_horarios_ver_2.Item.Item;
import com.example.app_horarios_ver_2.Item.SetViewHolder;
import com.example.app_horarios_ver_2.OnTapListener;
import com.example.app_horarios_ver_2.R;

import java.util.Collections;
import java.util.List;

public class ScheduleAdapter extends RecyclerView.Adapter<SetViewHolder> {

    private Activity activity;
    List<Item> items;
    private OnTapListener onTapListener;

    public ScheduleAdapter(Activity activity, List<Item> items){
        this.activity = activity;
        this.items = Collections.emptyList();
        this.items = items;
    }

    @Override
    public SetViewHolder onCreateViewHolder( ViewGroup parent, int i) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_list_item_1,parent,false);
        return new SetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SetViewHolder holder, @SuppressLint("RecyclerView") final int position) {

        holder.hora.setText(items.get(position).getTime());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onTapListener !=null){
                    onTapListener.OnTapView(position);
                }

            }
        });


    }

    @Override
    public int getItemCount() {

        return items.size();
    }

    public void setOnTapListener(OnTapListener onTapListener){
        this.onTapListener = onTapListener;
    }

}
