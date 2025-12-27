package dao.Interface;

import java.util.ArrayList;

import entities.Rol;
import entities.Usuario;

public interface UsuarioDAO {
	
	void update(Usuario u);
	void delete(String dni);
	boolean login(String dni, String password);
	void insert(Usuario u);
	ArrayList<Usuario> findall();
	Usuario findByNombre(String nombre);
	void updatePassword(String password, String nuevaPassword);
	//void findByRol(Rol rol);
	ArrayList<Usuario> findByRol(Rol rol);
}
