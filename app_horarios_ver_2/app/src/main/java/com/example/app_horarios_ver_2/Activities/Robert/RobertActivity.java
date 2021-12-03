package com.example.app_horarios_ver_2.Activities.Robert;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.example.app_horarios_ver_2.R;

import java.util.List;

public class RobertActivity extends AppCompatActivity {

    private List<String> names;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private Spinner spinner_recorrido, spinner_recorrido2, spinner_recorrido3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.robert_activity);


        spinner_recorrido = (Spinner) findViewById(R.id.spinner_recorrido);
        spinner_recorrido2 = (Spinner) findViewById(R.id.spinner_recorrido2);
        spinner_recorrido3 = (Spinner) findViewById(R.id.spinner_recorrido3);


        ArrayAdapter<CharSequence> sAdapter = ArrayAdapter.createFromResource(this, R.array.recorrido, android.R.layout.simple_spinner_item);
        spinner_recorrido.setAdapter(sAdapter);
        spinner_recorrido.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Intent lun_vie_ida = new Intent(RobertActivity.this, Lun_Vier_Ida.class);
                Intent lun_vie_vuelta = new Intent(RobertActivity.this, Lun_vier_Vuelta.class);
                switch (position) {
                    case 1:
                        startActivity(lun_vie_ida);
                        spinner_recorrido.setSelection(0);
                        break;
                    case 2:
                        startActivity(lun_vie_vuelta);
                        spinner_recorrido.setSelection(0);
                        break;

                    default:

                        return ;
                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_recorrido2.setAdapter(sAdapter);
        spinner_recorrido2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Intent sab_ida = new Intent(RobertActivity.this, Sab_ida.class);
                Intent sab_vuelta = new Intent(RobertActivity.this, Sab_Vuelta.class);
                switch (position) {
                    case 1:
                        startActivity(sab_ida);
                        spinner_recorrido2.setSelection(0);

                        break;
                    case 2:
                        startActivity(sab_vuelta);
                        spinner_recorrido2.setSelection(0);
                        break;
                    default:

                        return ;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_recorrido3.setAdapter(sAdapter);
        spinner_recorrido3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Intent dom_fer_ida = new Intent(RobertActivity.this, Dom_Fer_Ida.class);
                Intent dom_fer_vuelta = new Intent(RobertActivity.this, Dom_Fer_Vuelta.class);
                switch (position) {
                    case 1:
                        startActivity(dom_fer_ida);
                        spinner_recorrido3.setSelection(0);
                        break;
                    case 2:
                        startActivity(dom_fer_vuelta);
                        spinner_recorrido3.setSelection(0);
                        break;
                    default:

                        return ;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}
