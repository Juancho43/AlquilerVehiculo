package Model;

import CostStrategy.IEstrategiaCosto;

public class Vehiculo {

    private String marca;
    private String modelo;
    private double tarifaBase;
    private boolean disponibilidad;
    private IEstrategiaCosto estrategiaCosto;

    public Vehiculo() {

    }

    public Vehiculo(String marca, String modelo, double tarifaBase, boolean disponibilidad, IEstrategiaCosto estrategiaCosto) {
        this.marca = marca;
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
        this.disponibilidad = disponibilidad;
        this.estrategiaCosto = estrategiaCosto;
    }

    public double calcularCosto(int dias) {
        return estrategiaCosto.calcularCosto(dias, tarifaBase);
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
