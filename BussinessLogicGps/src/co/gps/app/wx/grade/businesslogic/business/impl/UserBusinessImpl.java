package co.gps.app.wx.grade.businesslogic.business.impl;

import co.gps.app.crosscutting.util.object.UtilObject;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.UserDTO;
import co.gps.app.wx.grade.businesslogic.business.UserBusiness;

public class UserBusinessImpl implements  UserBusiness {
	
	private DAOFactory daoFactory;
	
	public UserBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GpsException.buildTechnicalDataException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
		}
		
	}

	@Override
	public void create(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(UserDTO dto) {
		// TODO Auto-generated method stub
		return;
	}

}
