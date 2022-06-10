package co.gps.app.wx.grade.businesslogic.business.impl;

import java.util.List;

import co.gps.app.crosscutting.util.object.UtilObject;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.BrandDTO;
import co.gps.app.wx.grade.businesslogic.business.BrandBusiness;

public class BrandBusinessImpl implements  BrandBusiness {
	
	private DAOFactory daoFactory;
	
	public BrandBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GpsException.buildTechnicalDataException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
		}
		
	}

	@Override
	public void create(BrandDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BrandDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BrandDTO> find(BrandDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}


