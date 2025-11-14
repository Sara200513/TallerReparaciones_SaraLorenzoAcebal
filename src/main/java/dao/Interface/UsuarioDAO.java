package dao.Interface;

import java.util.ArrayList;


import entities.Usuario;
import dao.mysql.*;

public interface UsuarioDAO {
	
	void update(Usuario u);
	void delete(String dni);
	boolean login(String dni, String password);
	void insert(Usuario u);
	ArrayList<Usuario> findall();
	Usuario findByNombre(String nombre);
}
