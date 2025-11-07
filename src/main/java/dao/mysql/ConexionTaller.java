package dao.mysql;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.MysqlDataSource;

import dwes.maven.mysql.ConexionJDBC;

public class ConexionTaller {
	Connection conexionMySQL = null;
	private ConexionTaller() {
		try {
			MysqlDataSource dataSource = new MysqlDataSource();
			Properties props = Properties();
			
			FileInputStream file = new FileInputStream("src\\main\\resources\\conexion.properties");
			props.load(file);

			dataSource.setUrl(props.getProperty("url"));
			dataSource.setUser(props.getProperty("user"));
			dataSource.setPassword(props.getProperty("password"));
			file.close();
			
			conexionMySQL = dataSource.getConnection();
			System.out.println("Conexión establecida correctamente");
			
		} catch (SQLException | IOException e) {
			System.out.println("Error al conectar con mysql: " + e.getMessage());
	}

}
	
	public static ConexionTaller getInstance() {
		if (instance == null) {
			instance = new ConexionTaller();
		}
		
		return instance;
	}
	
	public Connection getConnection() {
		return instance.conexionMySQL;
	}

}
