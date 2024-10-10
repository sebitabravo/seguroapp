package com.example.seguroapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import modelo.Seguro;
import modelo.Vehiculo;

public class ResultadoActivity extends AppCompatActivity {

    // obtenemos objeto clase vehiculo
    Vehiculo vehiculo;
    // Crear un objeto de la clase seguro
    Seguro seguro;
    // Creamos objetos java con elemetos de interfaz
    TextView txvMarca;
    TextView txvAntiguedad;
    TextView txvValorSeguro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        vincularElementos();
        obtenerDatosVehiculo();
        instanciarSeguro();
        mostrarValoresRecibidos();
        }

    private void instanciarSeguro(){
        seguro = new Seguro();
    }

    private void mostrarValoresRecibidos() {
        // Ejecutamos metodo para calcular la antiguedad. El objeto vehiculo almacenara el resultado en su propiedad antiguedad
        vehiculo.calcularAntiguedad();
        // Ejecutamos metodo para calcular el valor del seguro. La propiedad "valorseguro", objeto vehiculo almace el resultado
        seguro.calcularValorSeguro(vehiculo.getAntiguedad());
        txvMarca.setText(vehiculo.getMarca());
        txvAntiguedad.setText(vehiculo.getAntiguedad());
        // Mostramos el valor del seguro
        txvValorSeguro.setText(seguro.getValorSeguro());
    }

    private void vincularElementos() {
        txvMarca = (TextView) findViewById(R.id.txv_marca);
        txvAntiguedad = (TextView) findViewById(R.id.txv_antiguedad);
        txvValorSeguro = (TextView) findViewById(R.id.txv_valor_seguro);
    }

    private void obtenerDatosVehiculo() {
        // Obtenemos vihiculo desde el intento
        vehiculo = (Vehiculo) getIntent().getSerializableExtra("vehiculo");
    }



    ;
    }