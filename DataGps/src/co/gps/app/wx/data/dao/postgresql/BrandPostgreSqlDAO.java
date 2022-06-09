package co.gps.app.wx.data.dao.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.dao.BrandDAO;
import co.gps.app.wx.data.dao.connection.ConnectionSQL;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.BrandDTO;

public class BrandPostgreSqlDAO extends ConnectionSQL implements BrandDAO {
	
	private BrandPostgreSqlDAO(Connection connection) {
		super(connection);
	}
	
	public static BrandDAO build(Connection connection) {
		return new BrandPostgreSqlDAO(connection);
	}

	@Override
	public void create(BrandDTO brand) {
		String sql = "INSERT INTO marca(id, name) VALUES(?,?)";
		
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
			preparedStatement.setString(1, brand.getName());
			preparedStatement.setInt(2, brand.getId());
		}catch (SQLException exception){
			
			throw GpsException.buildTechnicalDataException("There was a problem trying to create a new studend registry on sql server", exception);
			
		}catch (Exception exception) {
			
			throw GpsException.buildTechnicalDataException("There was an unexpected problem trying to create a new studend registry on sql server", exception);
			
		}
		
	}

		
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(BrandDTO student) {
		// TODO Auto-generated method stub
		
	}

	public static DAOFactory create() {
		// TODO Auto-generated method stub
		return null;
	}

}
