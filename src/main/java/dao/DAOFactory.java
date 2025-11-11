package dao;
import dao.Interface.ClienteDAO;
import dao.mysql.ClienteDAOMySQL;

public interface DAOFactory {
	public static ClienteDAO getClienteDAO();