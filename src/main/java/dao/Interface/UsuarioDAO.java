package dao.Interface;

import java.util.ArrayList;

import dao.mysql.Strign;
import dao.mysql.Usuario;

public interface UsuarioDAO {
	boolean login(Strign dni, String password);
	int insert(Usuario u);
	ArrayList<Usuario> findall();
	Usuario findByNombre(String nombre);
}
