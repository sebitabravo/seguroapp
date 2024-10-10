package modelo;

import java.io.Serializable;
import java.util.Calendar;

public class Vehiculo implements Serializable {
    String marca;
    String modelo;
    int ano;
    int antiguedad;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void calcularAntiguedad(){
        // Calculamos considerando el año actual y el año del vehiculo
        int anoActual = Calendar.getInstance().get(Calendar.YEAR);
        this.antiguedad = anoActual - this.ano;
        // Si antiguedad es 0 definimos como 1 (vehiculo del año)
        if (this.antiguedad == 0) {
            this.antiguedad = 1;
        }
    }

}
