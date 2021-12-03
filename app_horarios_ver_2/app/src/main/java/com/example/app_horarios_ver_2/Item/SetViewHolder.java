package com.example.app_horarios_ver_2.Item;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.app_horarios_ver_2.R;


public class SetViewHolder extends RecyclerView.ViewHolder {

    public TextView hora;

    public SetViewHolder( View itemView) {
        super(itemView);
        hora =(TextView) itemView.findViewById(R.id.textViewName);

    }
}
