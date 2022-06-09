package co.gps.app.wx.data.dao.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.dao.ColorDAO;
import co.gps.app.wx.data.dao.connection.ConnectionSQL;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.ColorDTO;

public class ColorPostgreSqlDAO extends ConnectionSQL implements ColorDAO {
	
	private ColorPostgreSqlDAO(Connection connection) {
		super(connection);
	}
	
	public static ColorDAO build(Connection connection) {
		return new ColorPostgreSqlDAO(connection);
	}

	@Override
	public void create(ColorDTO color) {
		String sql = "INSERT INTO color(id,nombre) VALUES(?,?)";
		
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
			preparedStatement.setString(1, color.getName());
			preparedStatement.setInt(2, color.getId());
		}catch (SQLException exception){
			
			throw GpsException.buildTechnicalDataException("There was a problem trying to create a new studend registry on sql server", exception);
			
		}catch (Exception exception) {
			
			throw GpsException.buildTechnicalDataException("There was an unexpected problem trying to create a new studend registry on sql server", exception);
			
		}
		
	}

	@Override
	public void update(ColorDTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(ColorDTO student) {
		// TODO Auto-generated method stub
		
	}

	public static DAOFactory create() {
		// TODO Auto-generated method stub
		return null;
	}

}
