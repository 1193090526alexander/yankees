package co.gps.app.wx.grade.businesslogic.business;

import java.util.List;

import co.gps.app.wx.dto.ColorDTO;

public interface ColorBusiness {
	void create(ColorDTO dto);
	void update(ColorDTO dto);
	void delete(int id);
	List<ColorDTO> find(ColorDTO dto);
}
