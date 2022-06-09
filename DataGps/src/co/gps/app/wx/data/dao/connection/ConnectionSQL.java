package co.gps.app.wx.data.dao.connection;

import java.sql.Connection;

import co.gps.app.crosscutting.util.sql.UtilConnection;
import co.gps.app.wx.crosscutting.exception.GpsException;

public class ConnectionSQL {
	
	private Connection connection;
	
	protected ConnectionSQL(Connection connection) {
		if(UtilConnection.isClosed(connection)) {
			throw GpsException.buildTechnicalDataException(
					"It's not possible to create the specific DAO because the connection is closed");
		}
		
		setConnection(connection);
		
	}

	protected Connection getConnection() {
		return connection;
	}

	private void setConnection(Connection connection) {
		this.connection = connection;
	}

}
