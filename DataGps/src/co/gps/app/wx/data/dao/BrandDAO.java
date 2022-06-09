package co.gps.app.wx.data.dao;

import co.gps.app.wx.dto.BrandDTO;

public interface BrandDAO {
	
	void create(BrandDTO brand);
	void delete(int id);
	void find(BrandDTO brand);

}
