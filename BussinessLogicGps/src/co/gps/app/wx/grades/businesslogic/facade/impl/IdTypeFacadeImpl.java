package co.gps.app.wx.grades.businesslogic.facade.impl;

import java.util.List;

import co.gps.app.wx.businesslogic.business.IdTypeBusines;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.IdTypeDTO;
import co.gps.app.wx.grades.businesslogic.bussiness.facade.IdTypeFacade;
import co.gps.app.wx.grades.businesslogicgrades.business.IdTypeBusiness.impl.IdTypeBusinessImpl;

public class IdTypeFacadeImpl implements IdTypeFacade {


	
	
	public void create(IdTypeDTO dto) {
		
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		
		try {
			daoFactory.initTransaction();
		
			IdTypeBusinessImpl idTypeBusines = new IdTypeBusinessImpl();
			((IdTypeBusines) idTypeBusines).create(dto);
			daoFactory.commitTransaction();
		}catch(GpsException exception) {
			daoFactory.rollbackTransaction();
		
			throw exception;
		}
		catch(Exception exception) {
			daoFactory.rollbackTransaction();
		
			var  message  ="There was a problem trying to create the new IdType on create method in IdTypeFacadeImpl";
			throw GpsException.buildTechnicalException(message);
		}finally {
			daoFactory.closeConnection();
		}

		
	}

	@Override
	public void update(IdTypeDTO dto) {
	
		
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		
		try {
			daoFactory.initTransaction();
		
			IdTypeBusinessImpl idTypeBusines = new IdTypeBusinessImpl();
			((IdTypeBusines) idTypeBusines).update(dto);
			
			daoFactory.commitTransaction();
		}catch(GpsException exception) {
			daoFactory.rollbackTransaction();
	
			throw exception;
		}
		catch(Exception exception) {
			daoFactory.rollbackTransaction();
			
			var  message ="There was a problem trying to update the new IdType on create method in IdTypeFacadeImpl";
			throw GpsException.buildTechnicalException(message);
		}finally {
			daoFactory.closeConnection();
		}
		
		
		
	}

	public void delete(int id) {
		
		
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		
		try {
			daoFactory.initTransaction();
		
			IdTypeBusinessImpl idTypeBusines = new IdTypeBusinessImpl();
			((IdTypeBusines) idTypeBusines).delete(id);
			daoFactory.commitTransaction();
		}catch(GpsException exception) {
			daoFactory.rollbackTransaction();

			throw exception;
		}
		catch(Exception exception) {
			daoFactory.rollbackTransaction();

			var  message ="There was a problem trying to delete the new IdType on create method in IdTypeFacadeImpl";
			throw GpsException.buildTechnicalException(message);
		}finally {
			daoFactory.closeConnection();
		}
		
		
	}

	public List<IdTypeDTO> find(IdTypeDTO dto) {
		
		
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		
		try {
			

			IdTypeBusinessImpl idTypeBusines = new IdTypeBusinessImpl();
			return ((IdTypeBusines) idTypeBusines).find(dto);

		}catch(GpsException exception) {
			
	
			throw exception;
		}
		catch(Exception exception) {


			var  message ="There was a problem trying to find the new IdType on create method in IdTypeFacadeImpl";
			throw GpsException.buildTechnicalException(message);
		}finally {
			daoFactory.closeConnection();
		}
		
		
	}
}
