package com.example.interfaz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textoprueba;
    private TextView textoprueba1;
    private TextView textoprueba2;
    private Button colorboton;
    private Spinner selector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoprueba = (TextView) findViewById(R.id.nombre);
        textoprueba1 = (TextView) findViewById(R.id.apellido);
        textoprueba2 = (TextView) findViewById(R.id.Fecha);
        colorboton = (Button) findViewById(R.id.color);
        colorboton.setOnClickListener(this);

        selector = (Spinner) findViewById( R.id.spinner );
        selector.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String opcionSeleccionada = adapterView.getItemAtPosition(i).toString();
                if (opcionSeleccionada.equals("Home")) {
                    textoprueba.setText("Casa");
                } else {
                    textoprueba.setText("Sin datos");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


            public void accionarboton(View v){
        textoprueba.setTextSize(1,30);
        textoprueba1.setTextSize(1,30);
        textoprueba2.setTextSize(1,30);
    }



    public void onClick(View v) {
        switch (v.getId()){
            case R.id.color:
                textoprueba.setTextColor( Color.parseColor("#ff2196f3") );
                textoprueba1.setTextColor( Color.parseColor("#fff44336") );
                textoprueba2.setTextColor( Color.parseColor("#ffff9800") );

    }
}
;})
    ;}

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.color:
                textoprueba.setTextColor(Color.parseColor("#ff2196f3"));
                textoprueba1.setTextColor(Color.parseColor("#fff44336"));
                textoprueba2.setTextColor(Color.parseColor("#ffff9800"));

        }
    }}