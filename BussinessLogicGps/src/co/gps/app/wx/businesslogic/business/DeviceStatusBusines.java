package co.gps.app.wx.businesslogic.business;

import java.util.List;

import co.gps.app.wx.dto.DeviceStatusDTO;

public interface DeviceStatusBusines {
	void create(DeviceStatusDTO dto);
	void update(DeviceStatusDTO dto);
	void delete(int id);
	List<DeviceStatusDTO> find(DeviceStatusDTO dto);
}
