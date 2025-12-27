package dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.DBConnection;
import entities.Rol;
import entities.Usuario;
import dao.Interface.UsuarioDAO;

public class UsuarioDAOMySQL implements UsuarioDAO {
	private Connection conexion;

	public UsuarioDAOMySQL() {
		conexion = DBConnection.getInstance().getConnection();
	}

	@Override
	public boolean login(String dni, String password) {
		ResultSet resul = null;
		try {
			String sql = "SELECT * FROM usuario WHERE dni = ? AND password = ?;";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, dni);
			pst.setString(2, password);

			resul = pst.executeQuery();
			if (resul.next()) {
				System.out.println("El usuario se ha logueado correctamente");
			} else {
				System.out.println(("El usuaruo no se ha logueado correctamente"));
			}

		} catch (SQLException e) {
			System.out.println("> NOK : " + e.getMessage());
		}
		return false;

	}

	@Override
	public void insert(Usuario u) {
		try {
			String sql = "INSERT INTO usuario (dni, nombre_usuario, password, rol) VALUES(?, ?, ?, ?)";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, u.getDni());
			pst.setString(2, u.getNombreUsuario());
			pst.setString(3, u.getPassword());
			pst.setString(4, u.getRol().toString);

			int resul = pst.executeUpdate();
			System.out.println("Resultado de insercion: " + resul);
		} catch (SQLException e) {
			System.out.println("> NOK : " + e.getMessage());
		}
	}

	@Override
	public ArrayList<Usuario> findall() {
		ArrayList<Usuario> usuarios = new ArrayList<>();
		String sql = "SELECT * FROM usuario";
		try {
			PreparedStatement pst = conexion.prepareStatement(sql);
			ResultDet rs = pst.executeQuery();
			while (rs.next()) {
				Usuario u = new Usuario(
						rs.getString("dni"),
						rs.getString("nombre"),
						rs.getString("password"),
						Raol.valueOf(rs.getString("rol"))
				);
				usuarios.add(u);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	@Override
	public Usuario findByNombre(String nombre) {
		Usaurio usuario = null;
		
		try {
			String sql = "SELET id_usuario, dni, password, rol FROM cliente WHERE nombre_usuario = ?; ";
			PreparedStatement pst = conexion.prepareStatement(sql);

			pst.setString(1, nombre);
			
			try(ResultSet rs = pst.exexuteQuery()){
				if (rs.next()) {
					usuario = new Usuario();
					usuario.setId_usuario(rs.getInt("id_usuario"));
					usuario.setDni(rs.getString("dni"));
					usuario.setNombreUsuario(rs.getString("nombre_usuario"));
					usuario.setPassword(rs.getString("password"));
					usuario.setRol(Rol.valueof(rs.getString("rol")));
					
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void update(Usuario u) {
		try {
			String sql = "UPDATE usuario SET nombre_usuario = ?, password = ?, rol = ? WHERE dni = ?;";
			PreparedStatement pst = conexion.prepareStatement(sql);
			pst.setString(1, u.getNombre_usuario());
			pst.setString(2, u.getPassword());
			pst.setString(3, u.getRol().toString());
			pst.setString(4, u.getDni());
		

			int filas = pst.executeUpdate();
			if (filas > 0)
				System.out.println("Cliente actualizado correctamente");

		} catch (SQLException e) {
			System.out.println(">Nok: " + e.getMessage());

		}
	}

	@Override
	public void delete(String dni) {
		String sqlDelete = "DELETE FROM usuario WHERE dni = ?;";
		try {
			PreparedStatement pst = conexion.prepareStatement(sqlDelete);
			pst.setString(1, dni);

			int filas = pst.executeUpdate();
			if (filas > 0) {
				System.out.println("Persona con id 1 eliminada correctamente");
			} else {
				System.out.println("Persona con id 1 no se ha encontrado en la base de datos");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updatePassword(String password, String nuevaPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Usuario> findByRol(Rol rol) {
		// TODO Auto-generated method stub
		return null;
	}

}
