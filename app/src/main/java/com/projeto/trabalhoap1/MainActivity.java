package com.projeto.trabalhoap1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private double pA, pG;  //precoAlcool, precoGasolina
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.precoAlcool);
        precoGasolina = findViewById(R.id.precoGasolina);
        resultado = findViewById(R.id.resultado);

    }

    public void calcular(View view){


        pA = Double.parseDouble(precoAlcool.getText().toString().replace(",","."));
        pG = Double.parseDouble(precoGasolina.getText().toString().replace(",","."));

        if(pA <= (pG * 0.7)){
            resultado.setText("Alcool está mais viável");
        } else {
            resultado.setText("Gasolina está mais viável");
        }

    }
}
