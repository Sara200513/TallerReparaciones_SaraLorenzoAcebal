package dao.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.DBConnection;

import entities.Usuario;
import dao.Interface.UsuarioDAO;

public class UsuarioDAOMySQL implements UsuarioDAO {
	private Connection conexion;
	
	public UsuarioDAOMySQL() {
		conexion = DBConnection.getInstance().getConnection();
	}

	@Override
	public boolean login(String dni, String password) {
		Usuario usuario = null;
		ResultSet res = null;
		
	
		
		
		;
	}

	@Override
	public int insert(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Usuario> findall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Usuario u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String dni) {
		// TODO Auto-generated method stub
		
	}
	
	

}
