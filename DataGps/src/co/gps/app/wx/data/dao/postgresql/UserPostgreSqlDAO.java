package co.gps.app.wx.data.dao.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.dao.UserDAO;
import co.gps.app.wx.data.dao.connection.ConnectionSQL;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.UserDTO;

public class UserPostgreSqlDAO extends ConnectionSQL implements UserDAO {
	
	private UserPostgreSqlDAO(Connection connection) {
		super(connection);
	}
	
	public static UserDAO build(Connection connection) {
		return new UserPostgreSqlDAO(connection);
	}

	@Override
	public void create(UserDTO user) {
		String sql = "INSERT INTO cliente(document, idType, name, firstName, phoneNumber) VALUES(?,?,?,?,?)";
		
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
			preparedStatement.setString(1, user.getDocument());
			preparedStatement.setInt(2, user.getIdType().getId());
		}catch (SQLException exception){
			
			throw GpsException.buildTechnicalDataException("There was a problem trying to create a new user registry on PostgreSQL", exception);
			
		}catch (Exception exception) {
			
			throw GpsException.buildTechnicalDataException("There was an unexpected problem trying to create a new user registry on postgreSQL", exception);
			
		}
		
	}

	@Override
	public void update(UserDTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(UserDTO student) {
		// TODO Auto-generated method stub
		
	}

	public static DAOFactory create() {
		// TODO Auto-generated method stub
		return null;
	}

}
