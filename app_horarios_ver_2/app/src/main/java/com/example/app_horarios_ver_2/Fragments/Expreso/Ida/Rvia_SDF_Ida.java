package com.example.app_horarios_ver_2.Fragments.Expreso.Ida;


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
public class Rvia_SDF_Ida extends Fragment {

    private RecyclerView recyclerView;
    private DatabaseHelper databaseHelper;
    private ArrayList<Item> arrayList = new ArrayList<Item>();
    private Cursor cursor;
    private ScheduleAdapter adapter;


    public Rvia_SDF_Ida() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.expreso_rvia__sdf__ida, container, false);

        recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_Rvia_SDF);

        arrayList.clear();
        loadDatabase();
        return viewGroup;
    }

    public void loadDatabase() {
        databaseHelper = new DatabaseHelper(getActivity());

        try {
            databaseHelper.checkAndCopyDatabase();
            databaseHelper.openDatabase();
            cursor = databaseHelper.QueryData("select * from ExSDFIda");

            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    do {
                        Item item = new Item();
                        item.setTime(cursor.getString(1));
                        arrayList.add(item);
                    } while (cursor.moveToNext());

                }

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        adapter = new ScheduleAdapter(getActivity(), arrayList);
        adapter.notifyDataSetChanged();
        adapter.setOnTapListener(new OnTapListener() {
            @Override
            public void OnTapView(int position) {
                Toast.makeText(getContext(), "Click to" + position, Toast.LENGTH_LONG).show();
            }
        });
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

}
