package DAO;

import Model.Usuario;

import java.util.ArrayList;
import java.util.List;

public abstract class DAOusuarios implements IDAO{
    private List<Usuario> usuarios = new ArrayList<>();
    @Override
    public List<Usuario> getAll() {
        return usuarios;
    }

    @Override
    public Usuario getOne(int id) {
        return usuarios.get(id);
    }

    @Override
    public Usuario create(Usuario o) {
        return new Usuario(o.getNombre(),o.getMail());
    }

    @Override
    public boolean delete(Usuario o, int id) {
        return false;
    }

    @Override
    public Usuario update(Usuario o, int id) {
        return new Usuario(o.getNombre(),o.getMail());
    }
}
