package com.example.app_horarios_ver_2.Activities.Expreso_UNC;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.app_horarios_ver_2.R;

public class ExpresoUNCActivity extends AppCompatActivity {

    private Spinner spinner_recorrido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expreso_unc);
        spinner_recorrido = (Spinner) findViewById(R.id.spinner_recorrido);

        ArrayAdapter<CharSequence> sAdapter = ArrayAdapter.createFromResource(this, R.array.recorrido, android.R.layout.simple_spinner_item);
        spinner_recorrido.setAdapter(sAdapter);
        spinner_recorrido.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Intent lun_vie_ida = new Intent(ExpresoUNCActivity.this, Lun_Vier_UNC_Ida.class);
                Intent lun_vie_vuelta = new Intent(ExpresoUNCActivity.this, Lun_Vier_UNC_Vuelta.class);
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

                        return;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
