package co.gps.app.wx.grade.businesslogic.business.impl;


import co.gps.app.crosscutting.util.object.UtilObject;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.DeviceDTO;
import co.gps.app.wx.grade.businesslogic.business.DeviceBusiness;

public class DeviceBusinessImpl implements  DeviceBusiness {
	
	private DAOFactory daoFactory;
	
	public DeviceBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GpsException.buildTechnicalDataException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
		}
		
	}

	@Override
	public void create(DeviceDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(DeviceDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(DeviceDTO dto) {
		// TODO Auto-generated method stub
		return;
	}


}
