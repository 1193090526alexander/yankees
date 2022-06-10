package co.gps.app.wx.grades.businesslogicgrades.business.IdTypeBusiness.impl;

import java.util.List;

import co.gps.app.crosscutting.util.object.UtilObject;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.IdTypeDTO;
import co.gps.app.wx.grade.businesslogic.business.IdTypeBusiness;

public class IdTypeBusinessImpl  implements IdTypeBusiness {
	
	private DAOFactory daoFactory;
	
	public IdTypeBusinessImpl() throws Exception {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GpsException.buildTechnicalBusinessLogicException("It's not possible create a SubjectBusinessImpl when DAOFactory is null");
		}
		
	}

	public IdTypeBusinessImpl(DAOFactory daoFactory2) {
		
	}

	@Override
	public void create(IdTypeDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(IdTypeDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IdTypeDTO> find(IdTypeDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
