package com.example.app_horarios_ver_2.Fragments.Robert.Vuelta;


import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.app_horarios_ver_2.Adapters.ScheduleAdapter;
import com.example.app_horarios_ver_2.Data_Base.DatabaseHelper;
import com.example.app_horarios_ver_2.Item.Item;
import com.example.app_horarios_ver_2.OnTapListener;
import com.example.app_horarios_ver_2.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CarLucDomFerRobertVuelta extends Fragment {

    private RecyclerView recyclerView;
    private DatabaseHelper databaseHelper;
    private ArrayList<Item> arrayList=new ArrayList<Item>();
    private Cursor cursor;
    private ScheduleAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup =(ViewGroup) inflater.inflate(R.layout.fragment_car_luc_dom_fer_robert_vuelta, container, false);
        recyclerView= (RecyclerView) viewGroup.findViewById(R.id.recycler_CarLucV3);
        arrayList.clear();
        loadDatabase();
        return viewGroup;
    }

    public void loadDatabase(){
        databaseHelper = new DatabaseHelper(getActivity());
        try {
            databaseHelper.checkAndCopyDatabase();
            databaseHelper.openDatabase();
        }catch (SQLException e){
            e.printStackTrace();
        }
        try {
            cursor = databaseHelper.QueryData("select * from RobertDomFerVuelta");
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    do {
                        Item item = new Item();
                        item.setId(cursor.getInt(0));
                        item.setTime(cursor.getString(2));
                        arrayList.add(item);
                    } while (cursor.moveToNext());
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        adapter=new ScheduleAdapter(getActivity(),arrayList);
        adapter.setOnTapListener(new OnTapListener() {
            @Override
            public void OnTapView(int position) {
                Toast.makeText(getContext(),"Click to" + position,Toast.LENGTH_LONG).show();
            }
        });
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

}
