package VehicleFactory;

import Model.Vehiculo;

public interface IFabricaVehiculo {

    Vehiculo CrearVehiculo (String marca, String modelo, double tarifaBase, boolean Disponibilidad);

}
