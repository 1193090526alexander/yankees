package co.gps.app.wx.businesslogic.business;

import co.gps.app.wx.dto.ColorDTO;


public interface ColorBusines {
	void create (ColorDTO dto);
	void update(ColorDTO dto);
	void delete (int id);
	void find (ColorDTO dto);
}
