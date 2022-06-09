package co.gps.app.wx.data.dao;

import co.gps.app.wx.dto.ColorDTO;

public interface ColorDAO {
	
	void create(ColorDTO color);
	void update(ColorDTO color);
	void delete(int id);
	void find(ColorDTO color);

}
