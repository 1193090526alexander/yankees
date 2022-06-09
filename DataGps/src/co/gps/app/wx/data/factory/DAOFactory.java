package co.gps.app.wx.data.factory;

import java.sql.Connection;

import co.gps.app.wx.data.dao.UserDAO;
import co.gps.app.wx.data.factory.postgresql.PostgreSqlDAOFactory;

public abstract class DAOFactory {
	
	public static DAOFactory getDaoFactory() {
		return PostgreSqlDAOFactory.create();
	}
	
	protected abstract void openConnection();
	
	protected abstract Connection getConnection();
	
	public abstract void initTransaction();
	
	public abstract void closeConnection();
	
	public abstract void rollbackTransaction();
	
	public abstract void commitTransaction();
	
	public abstract UserDAO getUserDAO();
	

}
