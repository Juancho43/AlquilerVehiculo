package DAO;

import Model.Reserva;

import java.util.ArrayList;
import java.util.List;

public abstract class DAOreservas implements IDAO{
    private List<Reserva> reservas = new ArrayList<>();
    @Override
    public List<Reserva> getAll() {
        return reservas;
    }

    @Override
    public Reserva getOne(int id) {
        return reservas.get(id);
    }

    @Override
    public Object create(Object o) {
        return null;
    }

    @Override
    public boolean delete(Object o, int id) {
        return false;
    }

    @Override
    public Object update(Object o, int id) {
        return null;
    }
}
