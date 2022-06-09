package co.gps.app.wx.data.factory.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.gps.app.crosscutting.util.sql.UtilConnection;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.crosscutting.exception.enumeration.ExceptionLocation;
import co.gps.app.wx.data.dao.UserDAO;
import co.gps.app.wx.data.dao.postgresql.UserPostgreSqlDAO;
import co.gps.app.wx.data.factory.DAOFactory;

public class PostgreSqlDAOFactory extends DAOFactory {
	
	private Connection connection;

	private PostgreSqlDAOFactory() {
		try {
			openConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void openConnection() {

		String stringConnection = "jdbc:sqlserver://academic-database-server.database.windows.net:1433;database=academic-db;user=academicDmlUser;password=4c4d3m1cDmlUs3r;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
		try {
			connection = DriverManager.getConnection(stringConnection);

		} catch (SQLException exception) {
			throw GpsException.buildTechnicalException(
					"There was a problem trying to get the connection with SQL server at jdbc:sqlserver://academic-database-server.database.windows.net:1433;database=academic-db;user=academicDmlUser",
					exception, ExceptionLocation.DATA);
		} catch (Exception exception) {
			throw GpsException.buildTechnicalException(
					"An unexpected problem has ocurred while trying to get the connection with SQL server", exception,
					ExceptionLocation.DATA);

		}

	}

	@Override
	protected Connection getConnection() {
		return connection;

	}

	@Override
	public void closeConnection() {
		if (!UtilConnection.isClosed(getConnection())) {
			throw GpsException
					.buildTechnicalException("It's not possible to close a connection because the conection is closed");
		}

		try {
			getConnection().close();

		} catch (SQLException exception) {
			throw GpsException.buildTechnicalDataException(
					"There was a problem trying to close the connection with the SQL Server", exception);
		} catch (Exception exception) {
			throw GpsException.buildTechnicalDataException(
					"An unexpected problem has ocurred while trying to close the connection with the SQL Server",
					exception);

		}

	}

	@Override
	public void rollbackTransaction()  {
		if (UtilConnection.isClosed(connection)) {
			throw GpsException.buildTechnicalException(
					"It's not possible to rollback a connection because the connection is closed");
		}

		try {
			if (getConnection().getAutoCommit()) {
				throw GpsException.buildTechnicalException(
						"It's not possible to rollback a connection because the PostgreSQL is managing the transaction");
			}

			getConnection().rollback();

		} catch (GpsException exception) {
			throw exception;

		} catch (SQLException exception) {
			throw GpsException.buildTechnicalException("There was a problem trying to rollback the transaction",
					exception, ExceptionLocation.DATA);
		} catch (Exception exception) {
			throw GpsException.buildTechnicalException(
					"An unexpected problem has ocurred while trying to rollback the transaction", exception,
					ExceptionLocation.DATA);

		}

	}

	@Override
	public void initTransaction()  {
		if (UtilConnection.isClosed(connection)) {
			throw GpsException.buildTechnicalException(
					"It's not possible to initialize a connection because the conection is already closed");
		}

		try {
			if (!getConnection().getAutoCommit()) {
				throw GpsException.buildTechnicalException(
						"It's not possible to initialize a connection because it is already initialized");
			}
			getConnection().setAutoCommit(false);

		} catch (SQLException exception) {
			throw GpsException.buildTechnicalException("There was a problem trying to initialize the transaction",
					exception, ExceptionLocation.DATA);
		} catch (Exception exception) {
			throw GpsException.buildTechnicalException(
					"An unexpected problem has ocurred while trying to initialize the transaction", exception,
					ExceptionLocation.DATA);

		}

	}

	@Override
	public void commitTransaction()  {
		if (UtilConnection.isClosed(connection)) {
			throw GpsException.buildTechnicalException(
					"It's not possible to commit a connection because the conection is already closed");
		}

		try {

			if (getConnection().getAutoCommit()) {
				throw GpsException.buildTechnicalException(
						"It's not possible to commit a connection because the SQL server is managing the transaction");
			}

			getConnection().commit();

		} catch (GpsException exception) {
			throw exception;

		} catch (SQLException exception) {
			throw GpsException.buildTechnicalException("There was a problem trying to commit the transaction",
					exception, ExceptionLocation.DATA);
		} catch (Exception exception) {
			throw GpsException.buildTechnicalException(
					"An unexpected problem has ocurred while trying to commit the transaction", exception,
					ExceptionLocation.DATA);

		}

	}

	@Override
	public UserDAO getUserDAO() {
		return UserPostgreSqlDAO.build(getConnection());
	}

	public static DAOFactory create() {
		return UserPostgreSqlDAO.create();
	}

}
