package co.gps.app.wx.data.dao;

import co.gps.app.wx.dto.DeviceDTO;

public interface DeviceDAO {
	
	void create(DeviceDTO device);
	void update(DeviceDTO device);
	void delete(int id);
	void find(DeviceDTO device);

}
