package co.gps.app.wx.data.dao;

import java.util.List;

import co.gps.app.wx.dto.DeviceStatusDTO;

public interface DeviceStatusDAO {
	
	void create(DeviceStatusDTO deviceStatus);
	void update(DeviceStatusDTO deviceStatus);
	void delete(int id);
	List <DeviceStatusDTO> find(DeviceStatusDTO deviceStatus);

}
