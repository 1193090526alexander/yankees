package co.gps.app.wx.businesslogic.business;


import co.gps.app.wx.dto.DeviceDTO;


public interface DeviceBusines {
	void create (DeviceDTO dto);
	void update(DeviceDTO dto);
	void delete (int id);
	void find (DeviceDTO dto);
}
