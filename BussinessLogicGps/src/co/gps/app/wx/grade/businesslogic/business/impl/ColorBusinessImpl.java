package co.gps.app.wx.grade.businesslogic.business.impl;

import java.util.List;

import co.gps.app.crosscutting.util.object.UtilObject;
import co.gps.app.wx.crosscutting.exception.GpsException;
import co.gps.app.wx.data.factory.DAOFactory;
import co.gps.app.wx.dto.ColorDTO;
import co.gps.app.wx.grade.businesslogic.business.ColorBusiness;

public class ColorBusinessImpl implements  ColorBusiness {
	
	private DAOFactory daoFactory;
	
	public ColorBusinessImpl() {
		if(UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GpsException.buildTechnicalDataException("It's not possible create a SubjectBusinessImpl when DAoFactory is null");
		}
		
	}

	@Override
	public void create(ColorDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ColorDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ColorDTO> find(ColorDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
 


