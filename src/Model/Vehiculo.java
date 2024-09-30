package Model;

public class Vehiculo {

    private String marca;
    private String modelo;
    private double tarifaBase;
    private boolean disponibilidad;

    public Vehiculo() {

    }

    public Vehiculo(String marca, String modelo, double tarifaBase, boolean disponibilidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
        this.disponibilidad = disponibilidad;
    }

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

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
