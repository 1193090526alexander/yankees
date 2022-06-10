package co.gps.app.wx.grade.businesslogic.business;

import co.gps.app.wx.dto.DeviceStatusDTO;

public interface DeviceStatusBusiness {
	void create(DeviceStatusDTO dto);
	void update(DeviceStatusDTO dto);
	void delete(int id);
	void find(DeviceStatusDTO dto);
}
