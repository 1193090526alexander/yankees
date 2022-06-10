package co.gps.app.wx.grade.businesslogic.business.impl;

import co.gps.app.crosscutting.util.object.UtilObject;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.DeviceStatusDTO;
import co.gps.app.wx.grade.businesslogic.business.DeviceStatusBusiness;

public class DeviceStatusBusinessImpl implements  DeviceStatusBusiness {
	
	private DAOFactory daoFactory;
	
	public DeviceStatusBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GpsException.buildTechnicalDataException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
		}
		
	}

	@Override
	public void create(DeviceStatusDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(DeviceStatusDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(DeviceStatusDTO dto) {
		// TODO Auto-generated method stub
		return;
	}


}
