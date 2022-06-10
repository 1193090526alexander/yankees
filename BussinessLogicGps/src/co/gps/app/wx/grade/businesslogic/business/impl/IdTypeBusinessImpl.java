package co.gps.app.wx.grade.businesslogic.business.impl;

import java.util.List;

import co.gps.app.crosscutting.util.object.UtilObject;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.IdTypeDTO;
import co.gps.app.wx.grade.businesslogic.business.IdTypeBusiness;

public class IdTypeBusinessImpl implements  IdTypeBusiness {
	
	private DAOFactory daoFactory;
	
	public IdTypeBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GpsException.buildTechnicalDataException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
		}
		
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
