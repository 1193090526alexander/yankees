package co.gps.app.wx.data.dao;

import co.gps.app.wx.dto.VehicleStatusDTO;

public interface VehicleStatusDAO {
	
	void create(VehicleStatusDTO vehicleStatus);
	void update(VehicleStatusDTO vehicleStatus);
	void delete(int id);
	void find(VehicleStatusDTO vehicleStatus);

}
