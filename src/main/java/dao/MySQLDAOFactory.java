package dao;

import dao.Interface.ClienteDAO;
import dao.mysql.ClienteDAOMySQL;

public class MySQLDAOFactory implements DAOFactory {
	public ClienteDAO getClienteDAO() {
		return new ClienteDAOMySQL();
	}

}
