package co.gps.app.wx.grades.businesslogic.bussiness.facade.impl;

import java.util.List;

import co.gps.app.wx.businesslogic.business.IdTypeBusines;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.IdTypeDTO;
import co.gps.app.wx.grades.businesslogic.bussiness.facade.IdTypeFacade;
import co.gps.app.wx.grades.businesslogicgrades.business.IdTypeBusiness.impl.IdTypeBusinessImpl;

public class IdTypeFacadeImpl<IdTypeBusiness> implements IdTypeFacade {
	
	private DAOFactory daoFactory = DAOFactory.getDaoFactory();

	public void create(IdTypeDTO dto) throws Exception {

		try {

			daoFactory.initTransaction();
			IdTypeBusinessImpl idTypeBussiness = new IdTypeBusinessImpl();
			((IdTypeBusines) idTypeBussiness).create(dto);

			daoFactory.commitTransaction();

		} catch (GpsException exception) {
			daoFactory.rollbackTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.rollbackTransaction();
			var message = "There was a problem trying to create de new IdType on create method ind IdTypeFacadeImpl ";
			throw GpsException.buildTechnicalException(message);
		}

		finally {

			daoFactory.closeConnection();

		}

	}

	@SuppressWarnings("unchecked")
	public void update(IdTypeDTO dto) throws Exception {

		try {

			daoFactory.initTransaction();
		
			IdTypeBusiness idTypeBussiness = (IdTypeBusiness) new IdTypeBusinessImpl();
			((IdTypeBusines) idTypeBussiness).update(dto);

			daoFactory.commitTransaction();

		} catch (GpsException execption) {
			daoFactory.rollbackTransaction();
			throw execption;
		} catch (Exception exeption) {
			daoFactory.rollbackTransaction();
			var message = "There was a problem trying to uptade the IdType on update method ind IdTypeFacadeImpl ";
			throw GpsException.buildTechnicalException(message);
		}

		finally {

			daoFactory.closeConnection();

		}

	}

	public void delete(int id) throws Exception {

		try {

			daoFactory.initTransaction();
			// Ejecutar el negocio
			@SuppressWarnings("unchecked")
			IdTypeBusiness idTypeBussiness = (IdTypeBusiness) new IdTypeBusinessImpl();
			((IdTypeBusines) idTypeBussiness).delete(id);

			daoFactory.commitTransaction();

		} catch (GpsException execption) {
			daoFactory.rollbackTransaction();
			throw execption;
		} catch (Exception exeption) {
			daoFactory.rollbackTransaction();
			var message = "There was a problem trying to delete IdType on delete method ind IdTypeFacadeImpl ";
			throw GpsException.buildTechnicalException(message);
		}

		finally {

			daoFactory.closeConnection();

		}

	}

	public List<IdTypeDTO> find(IdTypeDTO dto) throws Exception {

		try {

			@SuppressWarnings("unchecked")
			IdTypeBusiness idTypeBussiness = (IdTypeBusiness) new IdTypeBusinessImpl();
			return ((IdTypeBusines) idTypeBussiness).find(dto);

		} catch (GpsException execption) {
			throw execption;
		} catch (Exception exeption) {
			var message = "There was a problem trying to find the IdType on find method in IdTypeFacadeImpl ";
			throw GpsException.buildTechnicalException(message);
		}

		finally {

			daoFactory.closeConnection();

		}

	}

}