package co.gps.app.wx.data.dao.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.dao.DeviceDAO;
import co.gps.app.wx.data.dao.connection.ConnectionSQL;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.DeviceDTO;

public class DevicePostgreSqlDAO extends ConnectionSQL implements DeviceDAO {
	
	private DevicePostgreSqlDAO(Connection connection) {
		super(connection);
	}
	
	public static DeviceDAO build(Connection connection) {
		return new DevicePostgreSqlDAO(connection);
	}

	@Override
	public void create(DeviceDTO device) {
		String sql = "INSERT INTO Dispositivo(reference, vehiculo, estado) VALUES(?,?,?)";
		
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
			preparedStatement.setInt(1, device.getReference());
			preparedStatement.setInt(2, device.getDeviceStatus().getId());
			preparedStatement.setDouble(3, device.getVehicle().getRegisterCode());
		}catch (SQLException exception){
			
			throw GpsException.buildTechnicalDataException("There was a problem trying to create a new studend registry on sql server", exception);
			
		}catch (Exception exception) {
			
			throw GpsException.buildTechnicalDataException("There was an unexpected problem trying to create a new studend registry on sql server", exception);
			
		}
		
	}

	@Override
	public void update(DeviceDTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(DeviceDTO student) {
		// TODO Auto-generated method stub
		
	}

	public static DAOFactory create() {
		// TODO Auto-generated method stub
		return null;
	}

}
