package dao;

import dao.Interface.ClienteDAO;
import dao.Interface.ReparacionDAO;
import dao.Interface.UsuarioDAO;
import dao.Interface.VehiculoDAO;
import dao.mysql.ClienteDAOMySQL;
import dao.mysql.UsuarioDAOMySQL;
import dao.mysql.VehiculoMySQL;

public class MySQLDAOFactory implements DAOFactory {
	public ClienteDAO getClienteDAO() {
		return new ClienteDAOMySQL();
	}
	
	
	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOMySQL();
	}

	@Override
	public VehiculoDAO getVehiculoDAO() {
		return new VehiculoMySQL();
	}

	@Override
	public ReparacionDAO getReparacionDAO() {
		return null;
	}

}
