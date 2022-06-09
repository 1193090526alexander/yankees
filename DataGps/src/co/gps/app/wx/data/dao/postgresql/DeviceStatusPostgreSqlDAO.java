package co.gps.app.wx.data.dao.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.dao.DeviceStatusDAO;
import co.gps.app.wx.data.dao.connection.ConnectionSQL;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.DeviceStatusDTO;

public class DeviceStatusPostgreSqlDAO extends ConnectionSQL implements DeviceStatusDAO {
	
	private DeviceStatusPostgreSqlDAO(Connection connection) {
		super(connection);
	}
	
	public static DeviceStatusDAO build(Connection connection) {
		return new DeviceStatusPostgreSqlDAO(connection);
	}

	@Override
	public void create(DeviceStatusDTO deviceStatus) {
		String sql = "INSERT INTO Stundent(idNumber, idType, name, email) VALUES(?,?,?,?)";
		
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
			preparedStatement.setString(1, deviceStatus.getName());
			preparedStatement.setInt(2, deviceStatus.getId());
			preparedStatement.setString(3, deviceStatus.getDescription());
		}catch (SQLException exception){
			
			throw GpsException.buildTechnicalDataException("There was a problem trying to create a new studend registry on sql server", exception);
			
		}catch (Exception exception) {
			
			throw GpsException.buildTechnicalDataException("There was an unexpected problem trying to create a new studend registry on sql server", exception);
			
		}
		
	}

	@Override
	public void update(DeviceStatusDTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DeviceStatusDTO> find(DeviceStatusDTO deviceStatus) {
		return null;
		// TODO Auto-generated method stub
		
	}

	public static DAOFactory create() {
		// TODO Auto-generated method stub
		return null;
	}

}
