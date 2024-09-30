package DAO;

import java.util.List;

public abstract class DAOvehiculos implements IDAO{
    @Override
    public List getAll() {
        return List.of();
    }

    @Override
    public Object getOne(int id) {
        return null;
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
