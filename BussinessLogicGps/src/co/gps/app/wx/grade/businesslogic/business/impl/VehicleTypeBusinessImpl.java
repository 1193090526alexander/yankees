package co.gps.app.wx.grade.businesslogic.business.impl;

import java.util.List;

import co.gps.app.crosscutting.util.object.UtilObject;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.VehicleTypeDTO;
import co.gps.app.wx.grade.businesslogic.business.VehicleTypeBusiness;

public class VehicleTypeBusinessImpl implements  VehicleTypeBusiness {
	
	private DAOFactory daoFactory;
	
	public VehicleTypeBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GpsException.buildTechnicalDataException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
		}
		
	}

	@Override
	public void create(VehicleTypeDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(VehicleTypeDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<VehicleTypeDTO> find(VehicleTypeDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
