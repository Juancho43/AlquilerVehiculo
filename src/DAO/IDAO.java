package DAO;

import Model.Usuario;

import java.util.List;

public interface IDAO<T> {
    List<T> getAll();
    T getOne(int id);
    T create (T t);
    boolean delete (T t, int id);
    T update(T t, int id);

    Usuario create(Usuario o);

    boolean delete(Usuario o, int id);

    Usuario update(Usuario o, int id);
}
