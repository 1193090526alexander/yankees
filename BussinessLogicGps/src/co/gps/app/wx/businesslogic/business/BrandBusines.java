package co.gps.app.wx.businesslogic.business;

import co.gps.app.wx.dto.BrandDTO;

public interface BrandBusines {
	void create (BrandDTO dto);
	void delete (int id);
	void find (BrandDTO dto);

}
