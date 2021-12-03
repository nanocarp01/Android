package com.example.app_horarios_ver_2.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.app_horarios_ver_2.Activities.Expreso.ExpresoActivity;
import com.example.app_horarios_ver_2.Activities.Expreso_UNC.ExpresoUNCActivity;
import com.example.app_horarios_ver_2.Activities.Robert.RobertActivity;
import com.example.app_horarios_ver_2.Activities.SM_UNC.SMUNCActivity;
import com.example.app_horarios_ver_2.Adapters.MyAdapter;
import com.example.app_horarios_ver_2.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> names;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        names = this.getAllNames();

        mRecyclerView = findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new MyAdapter(names, R.layout.simple_list_item_1, new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(String name, int position) {
                Intent intentRobert = new Intent(MainActivity.this, RobertActivity.class);
                Intent intentExpreso = new Intent(MainActivity.this, ExpresoActivity.class);
                Intent intentExpresoUNC = new Intent(MainActivity.this, ExpresoUNCActivity.class);
                Intent intentsmUNC = new Intent(MainActivity.this, SMUNCActivity.class);
                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "Directo", Toast.LENGTH_SHORT).show();
                        startActivity(intentRobert);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Expreso - Barriales", Toast.LENGTH_SHORT).show();
                        startActivity(intentExpreso);
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Expreso - UNC", Toast.LENGTH_SHORT).show();
                        startActivity(intentExpresoUNC);
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Directo - UNC", Toast.LENGTH_SHORT).show();
                        startActivity(intentsmUNC);
                        break;
                }

            }
        });

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    private List<String> getAllNames() {
        return new ArrayList<String>() {{
            add("Directo - Calle Robert");
            add("Expreso - Barriales");
            add("Expreso - C. Chimba - UNC");
            add("Directo - San Martin - UNC");
        }};
    }
}
