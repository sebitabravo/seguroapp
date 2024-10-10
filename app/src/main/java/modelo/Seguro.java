package modelo;

public class Seguro {
    double valorSeguro;
    double valorUF;
    boolean asegurable;

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getValorUF() {
        return valorUF;
    }

    public void setValorUF(double valorUF) {
        this.valorUF = valorUF;
    }

    public boolean isAsegurable() {
        return asegurable;
    }

    public void setAsegurable(boolean asegurable) {
        this.asegurable = asegurable;
    }

    // El valor del seguro se determina con 0.1 UF por año de antiguedad
    public void calcularValorSeguro(int antiguedad) {
        this.valorUF = 37914;
        this.valorSeguro = (0.1 * valorUF) * antiguedad;
    }
}
