package com.example.proyecto005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private EditText et1, et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv1 = (TextView) findViewById(R.id.tv1);

        spinner1 = (Spinner) findViewById(R.id.spinner);
        String [] opciones = {"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);
    }

    public void operar (View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String seleccion = spinner1.getSelectedItem().toString();
        if(seleccion.equals("sumar")) {
            int suma = nro1 + nro2;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if (seleccion.equals("restar")) {
            int resta = nro1 - nro2;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }else if (seleccion.equals("multiplicar")) {
            int multiplicacion = nro1 * nro2;
            String resultado = String.valueOf(multiplicacion);
            tv1.setText(resultado);
        }else if (seleccion.equals("dividir")) {
            int division = nro1 / nro2;
            String resultado = String.valueOf(division);
            tv1.setText(resultado);
        }
    }
}