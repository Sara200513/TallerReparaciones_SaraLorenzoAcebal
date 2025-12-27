package dao;
import dao.Interface.ClienteDAO;
import dao.Interface.ReparacionDAO;
import dao.Interface.UsuarioDAO;
import dao.Interface.VehiculoDAO;

public interface DAOFactory {
	public  ClienteDAO getClienteDAO();
	public UsuarioDAO getUsuarioDAO();
	public VehiculoDAO getVehiculoDAO();
	public ReparacionDAO getReparacionDAO();
}