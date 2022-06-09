package co.gps.app.wx.data.dao;

import java.util.List;

import co.gps.app.wx.dto.VehicleTypeDTO;

public interface VehicleTypeDAO {
	
	void add(VehicleTypeDTO vehicleType);
	void delete(int id);
	List<VehicleTypeDTO> find(VehicleTypeDTO vehicleType);

}
