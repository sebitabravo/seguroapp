package com.example.seguroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import modelo.Vehiculo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // Varibles de objeto para elementos de interfaz
    EditText edtMarca, edtModelo, edtAno;
    Button btnCalcular;
    Vehiculo vehiculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Vinculamos elementos
        vincularElementos();
        habilitarListener();
        instanciarVehiculo();
    }

    private void habilitarListener() {
        // Habilitamos el boton para que sea clickeable (que ejecute onclick)
        btnCalcular.setOnClickListener(this);
    }

    private void instanciarVehiculo() {

        vehiculo = new Vehiculo();
    }

    private void vincularElementos() {

        edtMarca = (EditText) findViewById(R.id.edt_marca);
        edtModelo = (EditText) findViewById(R.id.edt_modelo);
        edtAno = (EditText) findViewById(R.id.edt_ano);
        btnCalcular = (Button) findViewById(R.id.btn_calcular);
    }

    private void capturarValores() {
        // Obtenemos los valores
        String marca = edtMarca.getText().toString();
        String modelo = edtModelo.getText().toString();
        int ano = Integer.parseInt(edtAno.getText().toString());
        // Asociamos los valores al objeto vehiculo
        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setAno(ano);
    }

    @Override
    public void onClick(View view) {
        capturarValores();
        // Definimos el intento, asociamos un objeto y ejecutamos
        Intent intento = new Intent(MainActivity.this,ResultadoActivity.class);
        intento.putExtra("vehiculo", vehiculo);
        startActivity(intento);
    }
}