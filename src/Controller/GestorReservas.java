package Controller;

import DAO.DAOreservas;
import Model.Reserva;
import Model.Usuario;
import Model.Vehiculo;

public class GestorReservas {
    GestorVehiculos vehiculosController;
    GestorUsuarios usuariosController;
    DAOreservas dao;

    public Reserva CrearReserva(Usuario usuario, Vehiculo vehiculo, int diasReservados){
        return new Reserva(usuario, vehiculo,diasReservados);
    }

}
