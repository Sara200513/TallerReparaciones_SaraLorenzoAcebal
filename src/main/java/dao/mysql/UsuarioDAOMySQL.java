package dao.mysql;

import java.util.ArrayList;

public class UsuarioDAOMySQL implements UsuarioDAO {
	boolean login(Strign dni, String password);
	int insert(Usuario u);
	ArrayList<Usuario> findall();
	Usuario findByNombre(String nombre);

}
