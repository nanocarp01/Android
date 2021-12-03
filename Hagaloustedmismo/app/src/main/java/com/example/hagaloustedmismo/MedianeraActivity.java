package com.example.hagaloustedmismo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MedianeraActivity extends AppCompatActivity {

    private Spinner spinner,spinner2;
    private EditText editText, editText2, editText4, editText5, editText6;
    private TextView textView5, textView6, textView7, n_lad, mor, cem, are;
    private CheckBox checkBox;
    private Button res, cerrar;
    private Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medianera);

        dialog = new Dialog(this);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        res = (Button) findViewById(R.id.calcular);



        res.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty() && editText.getText().toString().isEmpty() && spinner.getSelectedItemPosition()==0 ) {
                    Toast.makeText(MedianeraActivity.this, "Ingrese Longitud y Altura de Muro", Toast.LENGTH_SHORT).show();

                }else if (spinner.getSelectedItemPosition()==0){
                    Toast.makeText(MedianeraActivity.this, "Seleccione tipo de Ladrillo", Toast.LENGTH_SHORT).show();

                }else if (spinner2.getSelectedItemPosition() == 0) {
                    Toast.makeText(MedianeraActivity.this, "Seleccione posicion de Ladrillo", Toast.LENGTH_SHORT).show();
                }else {
                    MyCustomAlertDialog();
                }

            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBox.isChecked() == true) {
                    spinner.setEnabled(false);
                    editText4.requestFocus();
                    editText4.setHint("0.0");
                    editText4.setText("");
                    editText4.setEnabled(true);
                    editText5.setHint("0.0");
                    editText5.setText("");
                    editText5.setEnabled(true);
                    editText6.setHint("0.0");
                    editText6.setText("");
                    editText6.setEnabled(true);
                    textView5.setVisibility(View.VISIBLE);
                    textView6.setVisibility(View.VISIBLE);
                    textView7.setVisibility(View.VISIBLE);
                } else if (checkBox.isChecked() == false) {
                    spinner.setEnabled(true);
                    spinner.setSelection(0);
                    editText4.setHint("Largo");
                    editText4.setEnabled(false);
                    editText5.setHint("Ancho");
                    editText5.setEnabled(false);
                    editText6.setHint("Alto");
                    editText6.setEnabled(false);
                }
            }
        });

        ArrayAdapter<CharSequence> sAdapter = ArrayAdapter.createFromResource(this, R.array.ladrillo, android.R.layout.simple_spinner_item);
        spinner.setAdapter(sAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        editText4.setText("22");
                        editText4.setEnabled(false);
                        editText5.setText("11");
                        editText5.setEnabled(false);
                        editText6.setText("6");
                        editText6.setEnabled(false);
                        textView5.setVisibility(View.VISIBLE);
                        textView6.setVisibility(View.VISIBLE);
                        textView7.setVisibility(View.VISIBLE);
                        checkBox.setChecked(false);
                        editText2.requestFocus();
                        break;
                    case 2:
                        editText4.setText("23,5");
                        editText4.setEnabled(false);
                        editText5.setText("10");
                        editText5.setEnabled(false);
                        editText6.setText("5");
                        editText6.setEnabled(false);
                        textView5.setVisibility(View.VISIBLE);
                        textView6.setVisibility(View.VISIBLE);
                        textView7.setVisibility(View.VISIBLE);
                        checkBox.setChecked(false);
                        editText2.requestFocus();
                        break;
                    case 3:
                        editText4.setText("33");
                        editText4.setEnabled(false);
                        editText5.setText("18");
                        editText5.setEnabled(false);
                        editText6.setText("12");
                        editText6.setEnabled(false);
                        textView5.setVisibility(View.VISIBLE);
                        textView6.setVisibility(View.VISIBLE);
                        textView7.setVisibility(View.VISIBLE);
                        checkBox.setChecked(false);
                        editText2.requestFocus();
                        break;
                    case 4:
                        editText4.setText("39");
                        editText4.setEnabled(false);
                        editText5.setText("13");
                        editText5.setEnabled(false);
                        editText6.setText("19");
                        editText6.setEnabled(false);
                        textView5.setVisibility(View.VISIBLE);
                        textView6.setVisibility(View.VISIBLE);
                        textView7.setVisibility(View.VISIBLE);
                        checkBox.setChecked(false);
                        editText2.requestFocus();
                        break;
                    default:
                        return;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(this, R.array.posicionL, android.R.layout.simple_spinner_item);
        spinner2.setAdapter(Adapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @SuppressLint("SetTextI18n")
    public void MyCustomAlertDialog() {
        DecimalFormat formato = new DecimalFormat("0.000");

        dialog.setContentView(R.layout.custom_dialog_medi);
        n_lad = (TextView) dialog.findViewById(R.id.n_ladrillos);
        mor = (TextView) dialog.findViewById(R.id.mortero);
        cem = (TextView) dialog.findViewById(R.id.cemento);
        are = (TextView) dialog.findViewById(R.id.arena);
        cerrar= (Button) dialog.findViewById(R.id.cerrar1);


        double a = Double.valueOf(editText.getText().toString());
        double b = Double.valueOf(editText2.getText().toString());


        /** Junta **/
        double Jv = 0.015d;
        double Jh = 0.015d;
        /** Ladrillo Comun 1 **/
        double LC1 = 0.22d;
        double AnC1 = 0.11d;
        double AlC1 = 0.06d;
        /** Ladrillo Comun 2 **/
        double LC2 = 0.235d;
        double AnC2 = 0.10d;
        double AlC2 = 0.05d;
        /** Ladrillo Hueco **/
        double LH = 0.33d;
        double AnH = 0.18d;
        double AlH = 0.12d;
        /** Ladrillo Bloque **/
        double Lb = 0.39d;
        double Anb = 0.13d;
        double Alb = 0.19d;
        /** Calculos **/
        double supM = a * b;
        /** Comun 1 **/
        double com1mtcua = (1 / ((LC1 + Jh) * (AlC1 + Jv)));
        double comun1 = (1 / ((LC1 + Jh) * (AlC1 + Jv))) * (supM);
        double mortero1 = ((1 * (AnC1)) - (com1mtcua * (AlC1 * AnC1 * LC1))) *supM;
        double bolc1 = mortero1 * 7.5d;
        double are1 = mortero1 * 1.03d;
        /** Comun 2 **/
        double com2mtcua = (1 / ((LC2 + Jh) * (AlC2 + Jv)));
        double comun2 = (1 / ((LC2 + Jh) * (AlC2 + Jv))) * (supM);
        double mortero2 = ((1 * (AnC2)) - (com2mtcua * (AlC2 * AnC2 * LC2))) * supM;
        double bolc2 = mortero2 * 7.5d;
        double are2 = mortero2 * 1.03d;
        /** Hueco **/
        double huemtcua = (1 / ((LH + Jh) * (AlH + Jv)));
        double hueco = (1 / ((LH + Jh) * (AlH + Jv))) * (supM);
        double morteroH = ((1 * (AnH)) - (huemtcua * (AlH * AnH * LH))) * supM;
        double bolh = morteroH * 7.5d;
        double areh = morteroH * 1.03d;
        /** Bloque**/
        double blomtcua = (1 / ((Lb + Jh) * (Alb + Jv)));
        double bloque = (1 / ((Lb + Jh) * (Alb + Jv))) * (supM);
        double morteroB = ((1 * (Anb)) - (blomtcua * (Alb * Anb * Lb))) * supM;
        double bolb = morteroB * 7.5d;
        double areb = morteroB * 1.03d;

        /** Condicional posicion canto**/
        if (spinner.getSelectedItemPosition() == 1 && spinner2.getSelectedItemPosition() == 1 ) {
            double com1Canto = (1 / ((LC1 + Jh) * (AnC1 + Jv)));
            double comun1canto = (1 / ((LC1 + Jh) * (AnC1 + Jv))) * (supM);
            double mortero1canto = ((1 * (AlC1)) - (com1Canto * (AlC1 * AnC1 * LC1))) *supM;
            double bolc1canto = mortero1 * 7.5d;
            double are1canto = mortero1 * 1.03d;

            n_lad.setText("Cant de ladrillos: " + formato.format(comun1canto) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(mortero1canto) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolc1canto) + " bls");
            are.setText("Arena: " + formato.format(are1canto) + " m^3");

        } else if (spinner.getSelectedItemPosition() == 2 && spinner2.getSelectedItemPosition() == 1) {
            double com2Canto = (1 / ((LC2 + Jh) * (AnC2 + Jv)));
            double comun2canto= (1 / ((LC2 + Jh) * (AnC2 + Jv))) * (supM);
            double mortero2canto = ((1 * (AlC2)) - (com2Canto * (AlC2 * AnC2 * LC2))) * supM;
            double bolc2canto = mortero2 * 7.5d;
            double are2canto = mortero2 * 1.03d;

            n_lad.setText("Cant de ladrillos: " + formato.format(comun2canto) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(mortero2canto) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolc2canto) + " bls");
            are.setText("Arena: " + formato.format(are2canto) + " m^3");

        } else if (spinner.getSelectedItemPosition() == 3 && spinner2.getSelectedItemPosition() == 1) {
            double huecanto = (1 / ((LH + Jh) * (AnH + Jv)));
            double huecocanto = (1 / ((LH + Jh) * (AnH + Jv))) * (supM);
            double morteroHcanto = ((1 * (AlH)) - (huecanto * (AlH * AnH * LH))) * supM;
            double bolhcanto = morteroH * 7.5d;
            double arehcanto = morteroH * 1.03d;

            n_lad.setText("Cant de ladrillos: " + formato.format(huecocanto) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(morteroHcanto) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolhcanto) + " bls");
            are.setText("Arena: " + formato.format(arehcanto) + " m^3");

        } else if (spinner.getSelectedItemPosition() == 4 && spinner2.getSelectedItemPosition() == 1) {
            double blocanto = (1 / ((Lb + Jh) * (Anb + Jv)));
            double bloquecanto = (1 / ((Lb + Jh) * (Anb + Jv))) * (supM);
            double morteroBcanto = ((1 * (Alb)) - (blocanto * (Alb * Anb * Lb))) * supM;
            double bolbcanto = morteroB * 7.5d;
            double arebcanto = morteroB * 1.03d;

            n_lad.setText("Cant de ladrillos: " + formato.format(bloquecanto) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(morteroBcanto) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolbcanto) + " bls");
            are.setText("Arena: " + formato.format(arebcanto) + " m^3");

        } else if (spinner.getSelectedItemPosition() == 0 && checkBox.isChecked() == true && spinner2.getSelectedItemPosition() == 1) {
            double A = Double.valueOf(editText4.getText().toString());
            double B = Double.valueOf(editText6.getText().toString());
            double C = Double.valueOf(editText5.getText().toString());
            /** Personalizado**/
            double permtcua = (1 / (((A / 100) + Jh) * ((C / 100) + Jv)));
            double person = (1 / (((A / 100) + Jh) * ((C / 100) + Jv))) * (supM);
            double morterop = ((1 * (B / 100)) - (permtcua * (B / 100 * C / 100 * A / 100))) * supM;
            double bolp = morterop * 7.5d;
            double arep = morterop * 1.03d;

            n_lad.setText("Cant de ladrillos: " + formato.format(person) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(morterop) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolp) + " bls");
            are.setText("Arena: " + formato.format(arep) + " m^3");
        }

        /** Condicional posicion soga**/
        if (spinner.getSelectedItemPosition() == 1 && spinner2.getSelectedItemPosition() == 2 ) {
            n_lad.setText("Cant de ladrillos: " + formato.format(comun1) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(mortero1) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolc1) + " bls");
            are.setText("Arena: " + formato.format(are1) + " m^3");

        } else if (spinner.getSelectedItemPosition() == 2 && spinner2.getSelectedItemPosition() == 2) {
            n_lad.setText("Cant de ladrillos: " + formato.format(comun2) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(mortero2) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolc2) + " bls");
            are.setText("Arena: " + formato.format(are2) + " m^3");
        } else if (spinner.getSelectedItemPosition() == 3 && spinner2.getSelectedItemPosition() == 2) {
            n_lad.setText("Cant de ladrillos: " + formato.format(hueco) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(morteroH) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolh) + " bls");
            are.setText("Arena: " + formato.format(areh) + " m^3");
        } else if (spinner.getSelectedItemPosition() == 4 && spinner2.getSelectedItemPosition() == 2) {
            n_lad.setText("Cant de ladrillos: " + formato.format(bloque) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(morteroB) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolb) + " bls");
            are.setText("Arena: " + formato.format(areb) + " m^3");

        } else if (spinner.getSelectedItemPosition() == 0 && checkBox.isChecked() == true && spinner2.getSelectedItemPosition() == 2) {
            double A = Double.valueOf(editText4.getText().toString());
            double B = Double.valueOf(editText6.getText().toString());
            double C = Double.valueOf(editText5.getText().toString());
            /** Personalizado**/
            double permtcua = (1 / (((A / 100) + Jh) * ((B / 100) + Jv)));
            double person = (1 / (((A / 100) + Jh) * ((B / 100) + Jv))) * (supM);
            double morterop = ((1 * (C / 100)) - (permtcua * (B / 100 * C / 100 * A / 100))) * supM;
            double bolp = morterop * 7.5d;
            double arep = morterop * 1.03d;

            n_lad.setText("Cant de ladrillos: " + formato.format(person) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(morterop) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolp) + " bls");
            are.setText("Arena: " + formato.format(arep) + " m^3");
        }

        /** Condicional posicion cabeza**/
        if (spinner.getSelectedItemPosition() == 1 && spinner2.getSelectedItemPosition() == 3 ) {
            double com1Cabeza = (1 / ((AnC1 + Jh) * (AlC1 + Jv)));
            double comun1cabeza = (1 / ((AnC1 + Jh) * (AlC1 + Jv))) * (supM);
            double mortero1cabeza = ((1 * (LC1)) - (com1Cabeza * (AlC1 * AnC1 * LC1))) *supM;
            double bolc1cabeza = mortero1 * 7.5d;
            double are1cabeza = mortero1 * 1.03d;

            n_lad.setText("Cant de ladrillos: " + formato.format(comun1cabeza) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(mortero1cabeza) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolc1cabeza) + " bls");
            are.setText("Arena: " + formato.format(are1cabeza) + " m^3");

        } else if (spinner.getSelectedItemPosition() == 2 && spinner2.getSelectedItemPosition() == 3) {
            double com2Cabeza = (1 / ((AnC2 + Jh) * (AlC2 + Jv)));
            double comun2cabeza= (1 / ((AnC2 + Jh) * (AlC2 + Jv))) * (supM);
            double mortero2cabeza = ((1 * (LC2)) - (com2Cabeza * (AlC2 * AnC2 * LC2))) * supM;
            double bolc2cabeza = mortero2 * 7.5d;
            double are2cabeza = mortero2 * 1.03d;

            n_lad.setText("Cant de ladrillos: " + formato.format(comun2cabeza) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(mortero2cabeza) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolc2cabeza) + " bls");
            are.setText("Arena: " + formato.format(are2cabeza) + " m^3");

        } else if (spinner.getSelectedItemPosition() == 3 && spinner2.getSelectedItemPosition() == 3) {
            double huecabeza = (1 / ((AnH + Jh) * (AlH + Jv)));
            double huecocabeza = (1 / ((AnH + Jh) * (AlH + Jv))) * (supM);
            double morteroHcabeza = ((1 * (LH)) - (huecabeza * (AlH * AnH * LH))) * supM;
            double bolhcabeza = morteroH * 7.5d;
            double arehcabeza = morteroH * 1.03d;

            n_lad.setText("Cant de ladrillos: " + formato.format(huecocabeza) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(morteroHcabeza) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolhcabeza) + " bls");
            are.setText("Arena: " + formato.format(arehcabeza) + " m^3");

        } else if (spinner.getSelectedItemPosition() == 4 && spinner2.getSelectedItemPosition() == 3) {
            double blocabeza = (1 / ((Anb + Jh) * (Alb + Jv)));
            double bloquecabeza = (1 / ((Anb + Jh) * (Alb + Jv))) * (supM);
            double morteroBcabeza = ((1 * (Lb)) - (blocabeza * (Alb * Anb * Lb))) * supM;
            double bolbcabeza = morteroB * 7.5d;
            double arebcabeza = morteroB * 1.03d;

            n_lad.setText("Cant de ladrillos: " + formato.format(bloquecabeza) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(morteroBcabeza) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolbcabeza) + " bls");
            are.setText("Arena: " + formato.format(arebcabeza) + " m^3");

        } else if (spinner.getSelectedItemPosition() == 0 && checkBox.isChecked() == true && spinner2.getSelectedItemPosition() == 3) {
            double A = Double.valueOf(editText4.getText().toString());
            double B = Double.valueOf(editText6.getText().toString());
            double C = Double.valueOf(editText5.getText().toString());

            /** Personalizado**/
            double permtcua = (1 / (((C / 100) + Jh) * ((B / 100) + Jv)));
            double person = (1 / (((C/ 100) + Jh) * ((B / 100) + Jv))) * (supM);
            double morterop = ((1 * (A / 100)) - (permtcua * (B / 100 * C / 100 * A / 100))) * supM;
            double bolp = morterop * 7.5d;
            double arep = morterop * 1.03d;

            n_lad.setText("Cant de ladrillos: " + formato.format(person) + " aprox. s/desp");
            mor.setText("Mortero: " + formato.format(morterop) + " mts^3");
            cem.setText("Cemento: " + formato.format(bolp) + " bls");
            are.setText("Arena: " + formato.format(arep) + " m^3");
        }
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}

