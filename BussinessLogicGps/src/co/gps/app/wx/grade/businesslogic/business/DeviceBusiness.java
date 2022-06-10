package co.gps.app.wx.grade.businesslogic.business;

import co.gps.app.wx.dto.DeviceDTO;

public interface DeviceBusiness {
	void create(DeviceDTO dto);
	void update(DeviceDTO dto);
	void delete(int id);
	void find(DeviceDTO dto);

}
