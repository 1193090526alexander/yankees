package co.gps.app.wx.grade.businesslogic.business.impl;


import co.gps.app.crosscutting.util.object.UtilObject;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.VehicleStatusDTO;
import co.gps.app.wx.grade.businesslogic.business.VehicleStatusBusiness;

public class VehicleStatusBusinessImpl implements  VehicleStatusBusiness {
	
	private DAOFactory daoFactory;
	
	public VehicleStatusBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GpsException.buildTechnicalDataException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
		}
		
	}

	@Override
	public void create(VehicleStatusDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(VehicleStatusDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(VehicleStatusDTO dto) {
		// TODO Auto-generated method stub
		return;
	}

}
