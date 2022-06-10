package co.gps.app.wx.grade.businesslogic.business;

import java.util.List;

import co.gps.app.wx.dto.BrandDTO;

public interface BrandBusiness {
	void create(BrandDTO dto);
	void update(BrandDTO dto);
	void delete(int id);
	List<BrandDTO> find(BrandDTO dto);
}
